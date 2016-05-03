const fs = require('fs');

fs.writeFile('test.txt', 'hello world', function (err) {
    if (err) {
	throw err; 
    }
    console.log('File saved!');
});
