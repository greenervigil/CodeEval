File.open(ARGV[0]).each_line do |line|
   line.strip!
   next if line.empty?

   sum = 0
   digits = line.split("")
   digits.each do |x|
     sum += x.to_i
   end
   puts sum
end
