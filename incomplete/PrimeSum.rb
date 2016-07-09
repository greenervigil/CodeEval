class PrimeSum
  sum = 0
  prime = 0

  for n in 2..10000
    if isPrime(n) then
      sum += n
      prime++
    if prime == 1000 then
      break
  puts "#{sum}"
  end
  end
end
def isPrime(number)
  if number == 2 then
    return true
  end
  for x in 2..number/2
    if number % 2 == 0 then
      return false
    end
  end
  return true
end
end
