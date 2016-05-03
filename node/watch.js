const fs = require('fs');
fs.watch('test.txt', function () {
    console.log('file test.txt changed.'); 
});

console.log('Start watching file test.txt.');
