
typedef Operations = int Function(int x, int y);

int add(int x, y) {
  return x + y;
}
int subtract(int x, y) {
  return x - y;
}
int multiply(int x, y) {
  return x * y;
}
int divide(int x, y) {
  return (x / y).floor();
}
class TypeDefs {
  static void test() {
    print('-- TEST -- Typedefs --');
    Operations ops = add;
    print(ops(10, 20));
    ops = divide;
    print(ops(35, 2));
  }
}