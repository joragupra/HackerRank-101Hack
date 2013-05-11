package similarPair

object Solution {
  
  val params = readLine.split(" ").toList map(_.toInt)
  val n = params head
  val T = params.tail head
  val tree = for (i <- 1 to n-1) yield readLine.split(" ").toList.map(_.toInt)
  
  def main(args: Array[String]) {
    println(similarPairs(ancestors(relations(tree.toList))))
  }
  
  /**
   * Map from child to parent
   */
  def relations(tree: List[List[Int]]): Map[Int, Int] = tree match {
    case List() => Map()
    case rel::restTree => relations(restTree) + (rel(1) -> rel(0))
  }
  
  /**
   * Map from node to the list of all its ancestors
   */
  def ancestors(relations: Map[Int, Int]): Map[Int, List[Int]] = {
    def ancestors0(ancestor: Option[Int], acc: List[Int]): List[Int] = ancestor match {
      case None => acc
      case Some(node) => {
        ancestors0(relations.get(node), node::acc)
      }
    }
    {for (i <- 1 to n) yield (i, ancestors0(relations.get(i), List()))}.toMap
  }
  
  /**
   * Counts all nodes and ancestors with difference <= T
   */
  def similarPairs(ancestors: Map[Int, List[Int]]): Int = {
    {
      for {
	      i <- 1 to n
	      ancestor <- ancestors(i)
	      if (Math.abs(ancestor-i)<=T)
	    } yield 1
    }.sum
  }
    
}