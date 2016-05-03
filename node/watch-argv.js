const fs = require('fs'),
      filename = process.argv[2];

if (!filename) {
    throw Error('Please specify the name of the file to watch....'); 
}

fs.watch(filename, function () {
    console.log('File ' + filename + ' changed.....'); 
});

console.log('Start watching file ' + filename);
