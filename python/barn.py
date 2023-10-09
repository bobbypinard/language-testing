import random

ray = [0] * 10
def thousand():
    for num in range(10):
        ray[num - 1] = random.randint(1, 10)
    return ray

loose_hay = thousand()
