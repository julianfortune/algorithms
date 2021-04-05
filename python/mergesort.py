
def mergesort(elements):
    if len(elements) < 2:
        return elements

    output = []
    middle = len(elements) // 2
    left, right = mergesort(elements[:middle]), mergesort(elements[middle:])
    leftPointer, rightPointer = 0, 0

    while leftPointer < len(left) and rightPointer < len(right):
        if left[leftPointer] < right[rightPointer]:
            output.append(left[leftPointer])
            leftPointer += 1
        else:
            output.append(right[rightPointer])
            rightPointer += 1

    # Catch any leftovers
    output += left[leftPointer:]
    output += right[rightPointer:]

    return output

print(mergesort([1,2]))