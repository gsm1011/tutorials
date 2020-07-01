import '../src/algos/buddy_string.dart';
import 'package:test/test.dart';

void main() {
  var _bs = new BuddyString();

  test('Test buddy strings', () {
    expect(_bs.isBuddyString('a', 'b'), false);
    expect(_bs.isBuddyString('ab', 'ab'), false);
    expect(_bs.isBuddyString('ab', 'ba'), true);
    expect(_bs.isBuddyString('', 'b'), false);
    expect(_bs.isBuddyString(null, 'b'), false);
    expect(_bs.isBuddyString('aaa', 'bbbbb'), false);
    expect(_bs.isBuddyString('ababa', 'abaab'), true);
    expect(_bs.isBuddyString('13232131', '1313133423'), false);
    expect(_bs.isBuddyString('aaaaaaba', 'aaaaaaab'), true);
    expect(_bs.isBuddyString('aaaaaaba', 'aaaaaac'), false);
    expect(_bs.isBuddyString('abaaaaba', 'aaaabba'), false);
    expect(_bs.isBuddyString('abcc', 'cbcac'), false);
    expect(_bs.isBuddyString('aaaaaaaaaaaaaab', 'baaaaaaaaaaaaaa'), true);
  });
}