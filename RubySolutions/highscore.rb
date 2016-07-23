#The first argument is a path to a file. Each line includes a test case #with a table. Table rows are separated by pipes '|'. All table rows #contain scores for each category, so all lines are of an equal length.

#You need to print the highest score for each category.

File.open(ARGV[0]).each_line do |line|
   line.strip!
   next if line.empty?
   newArray = []
   highScore = []
   max = 0
   #create 2D array from input
   lineArray = line.split(" | ")
   lineArray.each do |x|
     arr = x.split(" ").map(&:to_i)
     puts arr.length
     newArray.push(arr)
   end
   puts "#{newArray}"
   for x in 0..newArray[x].length
     for i in 0..newArray[x][i].length
     end
   end
   puts "#{highScore}"
end
