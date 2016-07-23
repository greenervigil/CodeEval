#The Fibonacci series is defined as: F(0) = 0; F(1) = 1;
#F(n) = F(n–1) + F(n–2) when n>1. Given an integer n≥0,
#print out the F(n).

#The first argument will be a path to a filename containing integer #numbers, one per line.

#Print to stdout, the fibonacci number, F(n).
#File.open(ARGV[0]).each_line do |line|
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
