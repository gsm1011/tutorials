library example_lib;
import 'dart:io';
import 'dart:math';
import 'dart:convert';
import 'dart:async';

int myadd(int x, int y) {
  return x + y;
}

class LibraryExample {
  static void test() {
    print('-- TEST -- Libraries --');
    print('The square root of 36 is ${sqrt(36)}');
  }
}