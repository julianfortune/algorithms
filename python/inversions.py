
def mergesort(elements):
    if len(elements) < 2:
        return elements, 0

    middle = len(elements) // 2
    (left, leftInversions), (right, rightInversions) = mergesort(elements[:middle]), mergesort(elements[middle:])
    inversions = leftInversions + rightInversions

    output = []
    leftPointer, rightPointer = 0, 0

    while leftPointer < len(left) and rightPointer < len(right):
        if left[leftPointer] < right[rightPointer]:
            output.append(left[leftPointer])
            leftPointer += 1
        else:
            output.append(right[rightPointer])
            rightPointer += 1
            inversions += len(left) - leftPointer

    # Catch any leftovers
    output += left[leftPointer:]
    output += right[rightPointer:]

    return output, inversions

print(mergesort([4,8,3,5,2,1]))