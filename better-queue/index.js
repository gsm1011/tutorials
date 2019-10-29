var Queue = require('better-queue');

var q = new Queue(function (task, cb) {

  // process the task.
  console.log('processing task: ' + task.id);
  throw "failed";
  setTimeout(function () {
    console.log('Processed task: ' + task.id);
    cb(null, task);
  }, 2000);

  // call back function.
  // cb(null, task);
}, {
  autoResume: true,
  failTaskOnProcessException: true,
  maxRetries: 3,
  id: 'id'
});

var queued = 0;

q.on('task_finish', function (taskId, result, stats) {
  queued--;
  console.log('jobs in queue: ' + queued);
  console.log('Call back function for : ' + taskId);
});
q.on('task_failed', function (taskId, err, stats) {
  console.log('task failed : ' + taskId);
});

q.on('task_queued', function () {
  console.log('Current task count: ' + queued);
  queued++;
  if (queued >= 2) {
    q.resume();
  }
})

q.push({id:'abc', a: 1, b: 3});
q.push({id:'cde', a: 1, b: 3});
q.push({id: '235354'});
for (var i = 0; i < 100; i++) {
  q.push({id: i, data: 'abcdeafsfj'});
}
