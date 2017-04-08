#Print all odd numbers from 1 - 99:
#!/usr/bin/perl -w
for ($n=1; $n<=100; $n++) {
  if ($n % 2 == 1){
    print "$n\n";
  }
}
