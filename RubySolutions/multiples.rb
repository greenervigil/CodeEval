File.open(ARGV[0]).each_line do |line|
   line.strip!
   next if line.empty?

   lineSplit = line.split(",")
   x = lineSplit[0].to_i
   n = lineSplit[1].to_i


   def smallestMultiple(target, start)
     sum = 0

     (1..target).each do |i|
        sum = start * i
        if (sum >= target)
          break
        end
     end
     puts "#{sum}"
   end

   smallestMultiple(x, n)
end
