File.open(ARGV[0]).each_line do |line|
   line.strip!
   next if line.empty?

   if line.to_i % 2 == 0 then
     puts 1
   else
     puts 0
   end
end
