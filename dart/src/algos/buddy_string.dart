class BuddyString {

  bool isBuddyString(String a, String b) {
    if (null == a || null == b || (a.length != b.length) || a.length == 1) {
      return false;
    }

    var d1 = -1, d2 = -1; // store the index of diff chars.
    for (var i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        if (d1 < 0) {
          d1 = i;
        } else if (d2 < 0) {
          d2 = i;
        } else {
          return false;
        }
      }
    }

    // print(a[d1] + ' - ' + b[d1] + ' - ' + a[d2] + ' - ' + b[d2]);

    if (d1 >= 0 && d2 >= 0 && a[d1] == b[d2] && a[d2] == b[d1]) {
      return true;
    } else {
      return false;
    }
  }
}