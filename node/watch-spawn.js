'use strict';

const fs = require('fs'),
      spawn = require('child_process').spawn,
      filename = process.argv[2];

if (!filename) {
    throw Error('Please specify the name of the file to watch. '); 
}

fs.watch(filename, function() {
    let ls = spawn('ls', ['-lh', filename]);
    ls.stdout.pipe(process.stdout); 
});

console.log('Start watching file ' + filename); 
