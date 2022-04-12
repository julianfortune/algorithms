def quickselect(list: List[Int], k: Int): Option[Int] = list match {
    case pivot :: unsorted => {
        val left  = unsorted.filter(_ <= pivot)
        val pivotPosition = left.length + 1

        if (k <= left.length) {
            quickselect(left, k)
        } else if (k == pivotPosition) {
            Some(pivot)
        } else {
            val right = unsorted.filter(_ > pivot)
            quickselect(right, k - pivotPosition)
        }
    }
    case _ => None
}

println(quickselect(List(4,8,2,6,3,10,5,7,1,9), 4))