#!/usr/bin/ruby -w

class Five
  def ifElse
    a = 4
    if a > 10 then
      puts "A is a big number."
    elsif a % 2 == 0 && a < 6
      puts "A is a small even number"
    else
      puts "A is something not very interesting."
    end
    puts "A is less than 10" if a < 10
  end

  def unlessElse
    a = 2
    unless a > 10
      puts "A is smaller than 10. "
    else
      puts "A is bigger than 10. "
    end

    puts "A is big." unless a < 5
  end

  def caseWhen
    a = 86
    case a
    when 0 .. 60
      puts "Poor performance."
    when 61 .. 80
      puts "OK performance."
    else
      puts "Excellent performance."
    end
  end

  def whileLoop
    a = 0
    while a < 100 do
      print a, ' '
      a += 1
    end
    puts
    a = 10
    puts "While loop with begin ...... end."
    begin
      a += 1
      print a, " "
    end while a < 100
  end

  def untilLoop
    a = 0
    until a > 10 do
      print a, ' '
      a += 1
    end
    a = 0
    puts "Begin end with the until statement."
    begin
      print a, ' '
      a += 1
    end until a > 10
    puts
  end

  def forLoop
    for i in 0..10 do
      print i, ' '
    end
    puts
  end

  def loopRetry
    for i in (0..10) do
      begin 
        puts i
        if i > 5
          raise 
        end
      rescue
        retry 
      end
    end
  end
end

BEGIN {
  puts "Example of control flow......"
}

obj = Five.new
obj.ifElse
obj.unlessElse
obj.caseWhen
obj.whileLoop
obj.untilLoop
obj.loopRetry
