#!/usr/bin/ruby -w

class Three
  class Dummy
  end

  def operators
    puts (0...10) === 5
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
  end
end

obj = Three.new
obj.operators
    
