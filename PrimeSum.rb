class PrimeSum
  attr_accessor :sum, :prime

  2.upto(5000) do |num|
    if isPrime(num)
      sum = sum + num
      prime++
    end
    if prime == 1000
    end
    puts "#{sum}"
  end


  def isPrime(number)
    if number == 2
      return true
    else
      return false
    end
  end
end
end
