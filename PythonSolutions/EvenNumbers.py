import sys

with open(sys.argv[1], 'r') as test_cases:
    for test in test_cases:
        # ignore test if it is an empty line
        # 'test' represents the test case, do something with it
        if (int(test) % 2 == 0):
            print("1")
        else:
            print("0")
