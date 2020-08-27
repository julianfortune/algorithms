case class Move(fromPeg: Int, toPeg: Int)

def moveDisks(count: Int, source: Int, destination: Int, temporary: Int): List[Move] = count match {
    case 0 => List() // Base Case
    case _ => {
        // Move all but the bottom disk out of the way (source -> temporary)
        val moveCoveringDisks    = moveDisks(count - 1, source, temporary, destination)
        // Move the disk in question
        val moveBottomDisk       = Move(source, destination)
        // Move all but the bottom disc back on top on the final peg (source -> temporary)
        val replaceCoveringDisks = moveDisks(count - 1, temporary, destination, source)

        moveCoveringDisks ++ List(moveBottomDisk) ++ replaceCoveringDisks
    }
}

println(moveDisks(2, 0, 2, 1)) // *pikachu* Is this python?

// TODO: draw pictures of the board ...
