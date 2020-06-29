import 'dart:collection';

class Collections {
  static void test() {
    // list
    var l = [10, 20, 33, 56];
    print('The value of list is: ${l}');

    List<int> ll = [1,2,23];
    // ll.add('value');// can't add as this list only hold integers.

    // set
    var s = new Set();
    s.add(10);
    s.add(20);
    s.forEach((element) {
      print('Element in set: ${element}');
    });

    // maps
    var m = <String, int>{};
    m['a'] = 10;
    m['b'] = 20;
    m.forEach((key, value) {
      print('Value of map {$key, $value}');
    });

    // queue
    var q = new Queue();
    q.addAll([10, 20, 30]);
    print('The value of queue is: ${q}');
    // using iterator.
    var i = q.iterator;
    while(i.moveNext()) {
      print(i.current);
    }
  }
}