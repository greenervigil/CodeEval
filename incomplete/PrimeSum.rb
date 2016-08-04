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

def isPrime(number)
  if number % 2 == 0 then
    return false
  else
    return true
  end
end
