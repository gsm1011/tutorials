class Operators {
  // test the dart operators.
  static void test() {
    print('-- TEST -- OPERATORS --');
    var abc = 10;
    var x = 10.2;
    print('Test the ~/ operator: ${15 ~/ 12}');
    print('Test operator testing if abc is int: ${abc is int}.');
    print('Test operator testing if a is not string: ${x is! String}.');
    // assign only if var is null.
    var aa = 2;
    aa ??= 10;
    print('Test assign if null: ${aa}');
  }
}
