File.open(ARGV[0]).each_line do |line|
   line.strip!
   next if line.empty?

   lineSplit = line.split(",")
   x = lineSplit[0].to_i
   n = lineSplit[1].to_i

   while n <= x do
     n += n
   end
   puts "#{n}"
end
