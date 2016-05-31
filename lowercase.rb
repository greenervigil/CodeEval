File.open(ARGV[0]).each_line do |line|
   line.strip!
   next if line.empty?

   puts line.downcase
end
