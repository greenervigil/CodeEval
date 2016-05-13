class Fib
  attr_reader :line

  #check if file exists
  puts "File exists!" if File.exist?(ARGV[0])
  fileObj = File.open(ARGV[0]).each_line do |line|
    while (line = fileObj.gets)
      fib(line)
    end
  end
  #find the f(n) solution
  def fib(n)
    if n <= 1
      return n
    else
      return fib(n-1) + fib(n-2)
    end
  end
end
