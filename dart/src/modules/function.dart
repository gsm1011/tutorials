class Functions {
  static int factorial(int x) {
    if (x <= 0) return 1;
    return x * factorial(x - 1);
  }
  static void test() {
    print('-- TEST -- FUNCTIONS --');
    var x = 5;
    print('The factorial of $x is ${factorial(x)}');
    print(lambdaFunc());
  }

  // lambda function
  static String lambdaFunc() => 'This is a lambda function.';
}
