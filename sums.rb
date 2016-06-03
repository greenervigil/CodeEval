 sum = 0
 File.open(ARGV[0]).each_line do |line|
   line.strip!
   next if line.empty?


   sum += line.to_i

end
puts sum
