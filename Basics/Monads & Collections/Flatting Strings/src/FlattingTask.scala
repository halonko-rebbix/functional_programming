import scala.::
import scala.collection.immutable.Nil.:::

object FlattingTask {

  def flattingStrings(strings: Seq[String]): Seq[Char] = {
    val lst: List[Char] = List()

    def flatten(strs: Seq[String], lists: List[Char], indx: Int): List[Char] = {
      if (indx == strs.length) lists
      else {
        flatten(strs, List.concat(lists, strs(indx).toList), indx + 1)
      }
    }
    flatten(strings, lst, 0)
  }
  }