#!/usr/bin/ruby -w

$global_var = 100
class First
  @@class_variable = 0
  def initialize(a, b, c)
    @a = a
    @b = b
    @c = c
    @@class_variable += 1
    $global_var = 100
  end

  def printAll
    puts "A is: #@a"
    puts "B is: #@b"
    puts "C is: #@c"
    puts "Global variable value is: #$global_var."
  end

  def getCount
    puts "Total objects for the class is: #@@class_variable."
  end
end

obj = First.new(1,2,3)
obj1 = First.new(3,4,5)
obj.printAll
obj1.printAll
puts "global variable now is: #$global_var."
obj.getCount
