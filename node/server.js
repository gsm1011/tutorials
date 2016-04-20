var express    = require('express');
var fs         = require('fs');
var app        = express();
var bodyParser = require('body-parser');
var morgan     = require('morgan'); // Used for request logging. 

// get data from POST request.
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());
app.use(morgan('combined')); 

var port = process.env.PORT | 8088;

var router = express.Router();

router.get('/', function (request, response) {
    response.json({ message: 'hello node REST api. ...' });
});

router.get('/status/overview', function (request, response) {
    var pfoStatus = JSON.parse(fs.readFileSync('./pfo.todo.json', 'utf8'));
    var pondingStatus = JSON.parse(fs.readFileSync('./status.json.ponding', 'utf8'));
    var zonesStatus = JSON.parse(fs.readFileSync('./status.json.zones', 'utf8'));
    var blockingStatus = JSON.parse(fs.readFileSync('./status.json.blocking', 'utf8'));
    var automapStatus = JSON.parse(fs.readFileSync('./status.json.automap', 'utf8'));

    // get the automap status. 
    var amSuccess = 0;
    var amError = 0;
    var amIncompleteData = 0;
    var amToRun = 0;
    var amOther = 0;
    
    for (var amStatus of automapStatus) {
	if (amStatus.status == 'Done') amSuccess += 1;
	else if (amStatus.status == 'Failed') amError += 1;
	else if (amStatus.status == 'Incomplete data') amIncompleteData += 1;
	else if (amStatus.status == 'To run') amToRun += 1; 
	else amOther += 1; 
    }
    
    // All the status for the model. 
    var res = {
	pfo: [
	    {
		key: 'toRun',
		value: pfoStatus.length
	    }
	],
	ponding: [
	    {
		key: 'success',
		value: Object.keys(pondingStatus.success).length
	    },
	    {
		key: 'error',
		value: Object.keys(pondingStatus.error).length
	    }
	],
	zones: [
	    {
		key: 'success',
		value: zonesStatus.complete.length
	    },
	    {
		key: 'error',
		value: zonesStatus.errors == null ? 0 : zonesStatus.errors.length
	    }
	],
	blocking: [
	    {
		key: 'success',
		value: blockingStatus.complete.length
	    },
	    {
		key: 'error',
		value: blockingStatus.errors == null ? 0 : blockingStatus.errors.length
	    }
	],
	automap: [
	    {
		key: 'success',
		value: amSuccess
	    },
	    {
		key: 'error',
		value: amError
	    },
	    {
		key: 'incompleteData',
		value: amIncompleteData
	    },
	    {
		key: 'toRun',
		value: amToRun
	    },
	    {
		key: 'other',
		value: amOther
	    }
	]
    }
    response.json(res); 
});

router.get('/status/pfo', function (request, response) {
    var pfoData = JSON.parse(fs.readFileSync('./pfo.todo.json', 'utf8'));
    response.json(pfoData); 
}); 

router.get('/status/ponding', function (request, response) {
    // sync read. 
    var data = JSON.parse(fs.readFileSync('./status.json.ponding', 'utf8'));
    
    // convert the data into array format.
    var success = data.success;
    var error = data.error;
    var statusArray = [];
    
    for(var key in success) {
	var s = {
	    id: key,
	    status: 'success',
	    runLog: success[key]
	}
	statusArray.push(s); 
    }

    for (var key in error) {
	var s = {
	    id: key,
	    status: 'error',
	    runLog: error[key]
	}
	statusArray.push(s); 
    }
    // console.log(statusArray);
    response.json(statusArray);
});

router.get('/status/zones', function (request, response) {
    var data = JSON.parse(fs.readFileSync('./status.json.zones', 'utf8'));
    response.json(data); 
});

router.get('/status/blocking', function (request, response) {
    var data = JSON.parse(fs.readFileSync('./status.json.blocking', 'utf8'));
    response.json(data); 
});

router.get('/status/automap', function (request, response) {
    var data = JSON.parse(fs.readFileSync('./status.json.automap', 'utf8'));
    response.json(data); 
}); 

// register api.
app.use('/api', router);

var appHost = '10.56.82.171';
var appHost = 'localhost'; 
app.listen(port, appHost); 
console.log('Nodejs REST api is running on port ' + port); 
