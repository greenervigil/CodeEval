
  #first number = x replace with F
  #second number = y replace with B
  #third number = N how far to count
  #pull in a file loop through each line
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
