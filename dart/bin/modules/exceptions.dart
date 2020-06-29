import 'dart:async';

class Exceptions {
  static int a = 0;
  static int b = 10;
  static void test() {
    print('-- TEST -- Exceptions --');
    try {
      throw TimeoutException('timeout');
      // var x = b ~/ a;
      // print(x);
    } 
    on TimeoutException catch (te) {
      print(te.toString());
    }
    on IntegerDivisionByZeroException catch (e) {
      print(e.toString());
    }
    finally {
      print('finally block executed.');
    }
  }
}
