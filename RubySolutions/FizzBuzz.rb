#Write a program that prints out the final series of numbers where #those divisible by X, Y and both are replaced by “F” for fizz, “B” #for buzz and “FB” for fizz buzz.
#Your program should accept a file as its first argument. The file #contains multiple separated lines; each line contains 3 numbers that #are space delimited. The first number is the first divider (X), the #second number is the second divider (Y), and the third number is how #far you should count (N). You may assume that the input file is #formatted correctly and the numbers are valid positive integers.

  File.open(ARGV[0]).each_line do |line|
     line.strip!
     next if line.empty?
     line_array = line.split(" ")
     x = line_array[0].to_i
     y = line_array[1].to_i
     n = line_array[2].to_i
     (1..n).each do |i|
       if i % x == 0 && i % y == 0
         print "FB "
       elsif i % x == 0
         print "F "
       elsif i % y == 0
         print "B "
       else
         print "#{i} "
       end
     end
     puts ""
  end
