def merge(left: List[Int], right: List[Int]): List[Int] = (left, right) match {
    case (ls, List()) => ls // First base case
    case (List(), rs) => rs // Second base case
    case (l :: ls, r :: rs) => if (l <= r) {
            l :: merge(ls, r :: rs)
        } else {
            r :: merge(l :: ls, rs)
        }
}

def mergesort(list: List[Int]): List[Int] = list match {
    case element :: Nil => List(element) // Base case
    case unsorted => {
        val (leftUnsorted, rightUnsorted) = unsorted.splitAt(unsorted.length / 2)
        merge(mergesort(leftUnsorted), mergesort(rightUnsorted))
    }
}

println(mergesort(List(4,8,2,6,3,10,5,7,1,9)))
