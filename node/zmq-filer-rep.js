'use strict';

const fs = require('fs'),
      zmq = require('zmq'),
      responder = zmq.socket('rep');

responder.on('message', function (data) {
    let request = JSON.parse(data);

    console.log('Received data to get: ' + request.path);

    fs.readFile(request.path, function (err, content) {
	console.log('Sending data as response....');
	responder.send(JSON.stringify({
	    content: content.toString(),
	    timestamp: Date.now(),
	    pid: process.pid
	}));
    }); 
});

// listen on tcp port 5432.
responder.bind('tcp://*:5433', function (err) {
    console.log('listening for zmq requests....'); 
});

// close the responder.
process.on('SIGINT', function () {
    console.log('Shutting down ......');
    responder.close(); 
}); 
