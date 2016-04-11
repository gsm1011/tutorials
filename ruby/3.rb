#!/usr/bin/ruby -w
BEGIN {
  puts "Data structure examples......"
}
class Second
  def arrayExample
    puts "Array example---------------"
    arr = ["hello", "world", 123, 'c']
    arr.each do |a|
      puts a
    end
  end

  def mapExample
    puts "Hash map example---------------"
    map = {"one" => 1, "two" => 2, "three" => 3}
    map.each do |key, value|
      print key, " --> ", value, "\n"
    end
  end

  def rangeExample
    puts "Ruby range example ---------------"
    (0..100).each do |n|
      print n, ' '
    end
    puts 
  end
end

sec = Second.new
sec.arrayExample
sec.mapExample
sec.rangeExample
