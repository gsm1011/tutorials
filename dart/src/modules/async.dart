import 'dart:io';
import 'dart:async';

class AsyncOps {
  static void test() {
    print('-- TEST -- Async --');
    print('Please enter your name: ');
    var name = stdin.readLineSync();

    print('Hello ${name}');

    // read from file and save it.
    var file = File(Directory.current.path + '/../assets/data.txt');
    var f = file.readAsString();
    f.then((value) => print(value));
    print('Done async test module.');
    stdout.write('whatever with no newline.');
  }
}