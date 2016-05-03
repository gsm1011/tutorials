#!/usr/bin/env node --harmony
'use strict';

const fs = require('fs'),
      stream = fs.createReadStream(process.argv[2]);

stream.on('data', function (d) {
    process.stdout.write(d); 
});

stream.on('error', function (err) {
    process.stderr.write('ERROR: ' + err.message + '\n'); 
}); 
