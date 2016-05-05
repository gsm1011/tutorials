// Connect to postgres and execute sql query.

var fs = require('fs'); 
var pg = require('pg');
var conStr = 'postgresql://gshum:abc@localhost:5432/velocitysites';

fs.readFileSync('./test.json', function (err, data) {
    console.log(data);
    console.log(err); 
});

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

var query = client.query('SELECT * FROM velocity_boundary;');
query.on('row', function (row) {
    console.log(row); 
});

query.on('end', function () {
    client.end();
    console.log('Client disconnected.'); 
});

// client.query({
//     name: 'insert query',
//     text: 'INSERT INTO velocity_boundary (id, name, field, userid) values ($1, $2, $3, $4)',
//     values: ['fid-22123233', 'test-fid', 'ST LOUIS', 'simon']
// });
