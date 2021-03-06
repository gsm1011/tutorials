#!/usr/bin/env node --harmony
'use strict';

const net = require('net'),
      ldj = require('./ldj.js'),
      netClient = net.connect({port: 5555}),
      ldjClient = ldj.connect(netClient);

ldjClient.on('message', function (message) {
    if (message.type == 'watching') {
	console.log('Now watching: ' + message.file); 
    } else if (message.type == 'changed') {
	let date = new Date(message.timestamp);
	console.log('File ' + message.file + ' changed at ' + date); 
    } else {
	throw Error('Message type not recognized: ' + message.type); 
    }
}); 
