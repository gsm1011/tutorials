import 'dart:isolate';

void foo(var msg) {
  print('This is message you passed in: ${msg}');
}

class Concurrency {
  static void test() {
    print('-- TEST -- Concurrency --');
    Isolate.spawn(foo, 'data1');
    Isolate.spawn(foo, 'sljhfslslfj');
    Isolate.spawn(foo, 'shawn');
    Isolate.spawn(foo, 'leo');

    print('execution from test1.');
    print('execution from test2.');
    print('execution from test3.');
  }
}