class DataTypes {
  static void test() {
    print('-- TEST -- DATA TYPES --');
    // use var for local variables whose types can be inferred from the value.
    var x = 10;
    final double y = 10.0; // the type can be inferred.
    final z = 'sjfsljfslj;';
    const u = 'abjlcjlcjlsljfjslfjsfsjfl';
    print(x);
    print(y);
    print(z);
    print(u);

    // dynamic data type.
    dynamic m = 'abc';
    print(m);
    m = 10;
    print(m);
    var abc = [1, 2, 3, 45, 5];
    var cde = <String, int>{};
    abc.add(100);
    cde['abc'] = 10;
    print(abc);
    print(cde);

    // parse values.
    print('Parse numbers from string: ${num.parse('100')}');
    var aa = 10;
    print('Number operators: ${aa.hashCode}, ${aa.isFinite}, ${aa.isInfinite}, ${aa.isEven}');
  }
}
