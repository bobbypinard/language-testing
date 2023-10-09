from barn import loose_hay

def bubble():
    for num in range(len(loose_hay)):
        for straw in range(len(loose_hay)):
            if straw + 1 < len(loose_hay):
                if loose_hay[straw] > loose_hay[straw + 1]:
                    tmp = loose_hay[straw]
                    loose_hay[straw] = loose_hay[straw +1]
                    loose_hay[straw + 1] = tmp
    return loose_hay
haystack = bubble()
