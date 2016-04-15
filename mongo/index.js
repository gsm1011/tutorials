var MongoClient = require('mongodb').MongoClient, assert = require('assert');

var url = 'mongodb://localhost:27017/dashboard';
MongoClient.connect(url, function(err, db) {
    assert.equal(null, err);
    console.log("Connected correctly to server.");

    // insert doc.
    insertDoc(db, function(result) {
	console.log(result);
    });

    // update doc.
    updateDoc(db, function(result) {
	console.log(result);
    });

    // delete doc.
    removeDoc(db, function(result) {
	console.log(result); 
	db.close(); 
    });
    
}); 

// insert doc.
var insertDoc = function(db, callback) {
    var collection = db.collection('documents');
    collection.insertMany([{a:1}, {a:2}, {a:3}], function (err, result) {
	assert.equal(err, null);
	assert.equal(3, result.result.n);
	assert.equal(3, result.ops.length);
	console.log("Inserted 3 documents in to the doc collection. ");
	callback(result); 
    });
}

// update doc.
var updateDoc = function (db, callback) {
    var collection = db.collection('documents');

    collection.updateOne({ a: 2}, { $set: {b :1}}, function (err, result) {
	assert.equal(err, null);
	assert.equal(1, result.result.n);
	console.log("Updated the doc with field a equal to 2.");
	callback(result); 
    }); 
}

// remove doc
var removeDoc = function (db, callback) {
    var collection = db.collection('documents');

    collection.deleteOne({a:3}, function (err, result) {
	assert.equal(err, null);
	assert.equal(1, result.result.n);
	console.log("Removed doc with field id a = 3.");
	callback(result);
    }); 
}
