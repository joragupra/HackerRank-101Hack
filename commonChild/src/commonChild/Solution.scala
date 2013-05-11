package commonChild

object Solution {
  
  val a = readLine
  val b = readLine
  
  def main(args: Array[String]) {
    println(commonChild(a.toList, b.toList, 0))
  }
  
  def commonChild(a: List[Char], b: List[Char], currentLongestChildLength: Int): Int = a match {
    case List() => currentLongestChildLength
    case aChar::aRest => {
      b.filter(_==aChar).zipWithIndex.toList match {
        case List() => commonChild(aRest, b, currentLongestChildLength)
        case (bChar, bIndex)::_ => {
          val (_, bRest) = b.splitAt(bIndex+1)
          Math.max(
              commonChild(aRest, bRest, currentLongestChildLength + 1),
              commonChild(aRest, b, currentLongestChildLength))
        }
      }
    }
  }
}