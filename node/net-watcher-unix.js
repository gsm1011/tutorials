#!/usr/bin/env node --harmony
'use strict';

const fs = require('fs'),
      net = require('net'),
      filename = process.argv[2],
      server = net.createServer(function (con) {
	  console.log('connected.');
	  con.write(JSON.stringify({
	      type: 'watching',
	      file: filename
	  }) + '\n');

	  let watcher = fs.watch(filename, function () {
	      con.write(JSON.stringify({
		  type: 'watching',
		  file: filename,
		  timestamp: Date.now() 
	      }) + '\n');
	  });

	  con.on('close', function () {
	      console.log('disconnected. ');
	      watcher.close(); 
	  });
      });

if (!filename) {
    throw Error ('Please specify the name of the file to watch. '); 
}

server.listen('/tmp/watcher.sock', function () {
    console.log('Listening for connection...'); 
}); 
