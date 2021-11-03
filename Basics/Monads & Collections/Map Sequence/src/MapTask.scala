object MapTask {
  def mapping(input: Seq[String]): Seq[Int] = {

    def is_num(elem: String): Boolean = {
      elem.matches("^\\d+$")
    }
    input.filter(elem => is_num(elem)).map(_.toInt)
  }
}