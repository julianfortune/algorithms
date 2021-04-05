
def permutate(elements):
    if len(elements) == 1: return elements
    permutations = []
    for index, element in enumerate(elements):
        for suffix in permutate(elements[:index] + elements[index+1:]):
            permutations.append(element + suffix)

    return permutations

counter = {}
for permutation in permutate(list('(())')):
    word = '(' + "".join(permutation) + ')'
    if word not in counter:
        counter[word] = 0
    counter[word] += 1

print(counter)