enum Status {
  none,
  running,
  stopped,
  paused
}

class Enumeration {
  static void test() {
    print('-- TEST -- ENUMBERATION --');
    print(Status.values);
    Status.values.forEach((element) {
      print('value $element, index: ${element.index}');
    });
  }
}