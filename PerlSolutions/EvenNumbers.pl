#Sample code to read in test cases:
open(INFILE, "<", $ARGV[0]) or die("Cannot open file $ARGV[0] for reading: $!");
while(my $line = <INFILE>) {
    next if($line =~ m/^\s$/);  # skip blank lines
    $line =~ s/(^\s|\s*$)//g;   # remove leading and trailing spaces
    if ($line % 2 == 0) {
      print "1\n";
    } else {
      print "0\n";
    }
}
close(INFILE);
