File.open(ARGV[0]).each_line do |line|
   line.strip!
   next if line.empty?

   #find the f(n) solution
   def fib(n)
     if n <= 1
       return n
     else
       return fib(n-1) + fib(n-2)
     end
   end
puts fib(line.to_i)

end
