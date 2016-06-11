File.open(ARGV[0]).each_line do |line|
   line.strip!
   next if line.empty?

   line_array = line.split " "
   print line_array.reverse.join(" ")
   puts ""
end
