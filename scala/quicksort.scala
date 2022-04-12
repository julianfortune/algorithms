def quicksort(list: List[Int]): List[Int] = list match {
    case Nil               => Nil
    case element :: Nil    => List(element) // Base case
    case pivot :: unsorted => {
        val lessThan    = unsorted.filter(_ <= pivot)
        val greaterThen = unsorted.filter(_ > pivot)

        quicksort(lessThan) ::: List(pivot) ::: quicksort(greaterThen)
    }
}

println(quicksort(List(4,8,2,6,3,10,5,7,1,9)))