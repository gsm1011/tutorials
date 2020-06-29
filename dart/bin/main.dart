import 'dart:async';

import 'modules/libraries.dart' as examplelib;
import 'modules/basic.dart';
import 'modules/datatypes.dart';
import 'modules/flowcontrol.dart';
import 'modules/operators.dart';
import 'modules/enum.dart';
import 'modules/function.dart';
import 'modules/classes.dart';
import 'modules/collections.dart';
import 'modules/exceptions.dart';
import 'modules/typedefs.dart';
import 'modules/async.dart';
import 'modules/concurrency.dart';

void main(List<String> arguments) {
  Concurrency.test();

  // AsyncOps.test();

  print(examplelib.myadd(10, 200));
  examplelib.LibraryExample.test();
  TypeDefs.test();
  try {
    Exceptions.test();
  } on TimeoutException catch (e) {
    print(e.toString());
  }

  HelloWorld.test();
  DataTypes.test();
  FlowControl.test();
  Operators.test();
  Enumeration.test();
  Functions.test();
  TestClass.test();
  Collections.test();
}
