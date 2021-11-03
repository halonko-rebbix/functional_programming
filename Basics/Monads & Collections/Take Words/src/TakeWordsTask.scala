import scala.annotation.tailrec

object TakeWordsTask {
  val lineSeparatorString = "\n"
  val seqq: List[String] = List()
  def takeWords(seq: Seq[String]): Seq[String] = {
    def slave(sequen: Seq[String], new_seq: Seq[String], indx: Int): Seq[String]={
      if ((sequen(indx+1) == lineSeparatorString) | (indx+1 == sequen.length)) {
        val new_lst = new_seq :+ sequen(indx)
        return new_lst
      }
      else {
//        println("here")
//        val new_lst = new_seq :+ sequen(indx)
        slave(sequen, new_seq, indx+1)
      }
    }
    slave(seq, seqq, 0)
  }
}
