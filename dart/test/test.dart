import 'dart:math';

import 'package:test/test.dart';

void main() {
  test('Simple test', () {
    expect('abc', equals('abc'));
  });

  test('Testing math funcs', () {
    var expected = 10;
    var actual = 2 * 5;
    expect(actual, expected);
  });

  // complex test.
  test('Test advanced features', () {
    // AsyncOps.test();
    expect(10, equals(10)); 
  });

    group('String functions -', () {
    test('trim() test', () {
      var str = 'hello   ';
      expect(str.trim(), 'hello');
    });
    test('substring() test', () {
      var str = 'hello world';
      expect(str.substring(0, 5), 'hello');
    });
  });
}
