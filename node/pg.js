// Connect to postgres and execute sql query.

var fs = require('fs'); 
var pg = require('pg');
var conStr = 'postgresql://gshum:abc@localhost:5432/velocitysites';

// fs.readFile('./test.json', function (err, data) {
//     console.log(data);
//     console.log(err); 
// });

// Connect using connection pools.
// pg.connect(conStr, function (err, client, done) {
//     if (err) {
// 	return console.error('Error connecting to the postgres database....', err); 
//     }
//     client.query('SELECT * FROM velocity_boundary', function (err, result) {
// 	done();
// 	// console.log(result);
// 	if (err) {
// 	    return console.error('error running query.', err); 
// 	}
// 	// console.log(result.rows[0].id);
// 	result.rows.forEach(function (row) {
// 	    console.log(row.id + ', ' + row.field); 
// 	}); 
//     }); 
// });

var client = new pg.Client(conStr);
client.connect(); 

//////////////////////////
// querying the database./
//////////////////////////
var query = client.query('SELECT * FROM velocity_boundary;');
query.on('row', function (row) {
    //console.log(row); 
});

///////////////////////////////////////
// read data and load to pg database.//
///////////////////////////////////////
var lineReader = require('readline').createInterface({
    input: require('fs').createReadStream(process.argv[2])
});

lineReader.on('line', function (line) {
    var pfo = JSON.parse(line, 'utf8');
    var features = pfo[0].features[0].properties;

    // fields used to update in the database. 
    var id = pfo[0].features[0].id; 
    var name = features.Name;
    var field = features.Field;
    var pipelinefn = features.PipeLineFn;
    var tags = features.Tags;
    var type = features.Type;
    var userid = features.UserId;
    console.log(id);

    try {
	query = client.query('UPDATE velocity_boundary SET name = ($1), field=($2), pipelinefn=($3),tags=($4),userid=($5),kafka_msg=($6) WHERE id=($7)', [name, field, pipelinefn, tags, userid, line, id]);	
    } catch (e) {
	// console.log('record does not exist, trying to insert......');
	// console.log('inserting into the query....'); 
	query = client.query({
	    name: 'insert query',
	    text: 'INSERT INTO velocity_boundary (id, name, field, pipelinefn, tags, userid, kafka_msg)) values ($1, $2, $3, $4)',
	    values: [id, name, field, pipelinefn, tags, userid, line]
	});
	// console.log('inserted.'); 
    }
}); 


//////////////////////////////////
// insert data into the database./
//////////////////////////////////
// query = client.query({
//     name: 'insert query',
//     text: 'INSERT INTO velocity_boundary (id, name, field, userid) values ($1, $2, $3, $4)',
//     values: ['fid-0022123233', 'test-fid', 'ST LOUIS', 'simon']
// });

query.on('end', function () {
    client.end(); 
    console.log('Client disconnected.'); 
});
