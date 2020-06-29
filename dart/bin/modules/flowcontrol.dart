class FlowControl {
  static void test() {
    print('-- TEST -- FLOW CONTROL --');
    var abc = [2,3,45,65,7,57,8];
    var cde = <String, int>{};
    cde['abc'] = 0;

    // loops.
    for (var i = 0; i < 10; i++) {
      print(i);
    }

    // iterate over values in array.
    for (var i in abc) {
      print('The value in array is: ${i}');
    }
    abc.forEach((element) {
      print(element);
    });

    // using foreach to iterate over map.
    cde.forEach((key, value) {
      print('Data is: <${key}, ${value}>.');
    });

    var i = 0;
    while (i < 10) {
      i++;
      print(i);
    }

    do {
      print(i--);
    } while (i > 0);
  }
}
