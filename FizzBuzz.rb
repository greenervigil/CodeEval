
  #first number = x replace with F
  #second number = y replace with B
  #third number = N how far to count
  #pull in a file loop through each line
  File.open(ARGV[0]).each_line do |line|
     line.strip!
     next if line.empty?

     (1..n).each do |i|
       if i % x == 0 && i % y == 0
         puts "FB"
       elsif i % x == 0
         puts "F"
       elsif i % y == 0
         puts "B"
       else
         puts "#{i}"
       end
     end


  end
