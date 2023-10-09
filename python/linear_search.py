from bubble import haystack 

needle = int(input("Number to find: "))
count = 0

print(haystack)

for straw in haystack:
    count += 1
    if straw == needle:
        print('Found', needle, 'in', count, 'steps')
if needle not in haystack:
    print(needle, "not in range")
