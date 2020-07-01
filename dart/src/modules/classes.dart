class Shape {
  void draw () {}
}

class Eraser {
  void undraw() {}
}

class Circle implements Shape, Eraser {
  @override
  void draw() {
    print('Drawing a circle.');
  }

  @override
  void undraw() {
    print('Erasing the circle now.');
  }
}

class TestClass {
  // fields
  static var circle = Circle();
  int f; 

  // getters and setters.
  int get getF {
    return f;
  }
  set setF(int fv) {
    f = fv;
  }
  // constructors
  TestClass() {
    print('Constructor called.');
    f = 100; // f is equivalent to this.f.
  }

  TestClass.namedConst(String test) {
    print('This is a named constructor $test.');
  }
  // functions / methods.
  static void test() {
    print('-- TEST -- CLASSES and INTERFACES --');
    circle.draw();
    circle.undraw();

    // cascade methods.
    circle
    ..draw()
    ..undraw();
  }
}

// inheritence.
class RedCircle extends Circle {
  String color = 'red';
  @override
  void draw() {
    print('drawing a red circle.');
  }
}
