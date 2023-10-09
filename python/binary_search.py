from bubble import haystack 
import math

needle = int(input("Number to find: "))
count = 0
lo = 0
high = 0

print(haystack)

for count in range(int(math.log(len(haystack)))):
    halfway = haystack[int(len(haystack)/2)]
    alpha = haystack
    print("a", alpha)

    if halfway == needle:
        print('Found', needle, 'in', count, 'steps')
    elif halfway < needle:
        hi

if needle not in haystack:
    print(needle, "not in range")
