#!/usr/bin/ruby -w

$gv = 0
class Three
  class Dummy
  end

  def operators
    puts (0...10) === 5
    puts "Comparing the range difference ----------"
    (1..5).each do |x|
      print x, ' '
    end
    puts
    (1...5).each do |x|
      print x, ' '
    end
    puts 
    a = 1
    b = 1.0
    puts a <=> b
    puts a.eql?b
    puts a.equal?b

    c = Dummy.new
    d = Dummy.new
    e = c
    puts c.eql?d
    puts c.equal?d
    puts c.eql?e
    puts c.equal?e
    a = 3
    a **= 3
    puts a
    puts defined? a
    puts defined? x
    puts defined? b
    puts defined? $gv
  end
end

obj = Three.new
obj.operators
    
