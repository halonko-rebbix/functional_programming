object PurityTask {

  case class Integer(var value: Int) { }

  def isPure(incrementFn: Integer => Integer): Boolean = {
    check1(incrementFn) && check2(incrementFn)
  }

  def check1(incrementFn: Integer => Integer): Boolean = {
    val integer1 = Integer(1)
    val integer2 = incrementFn(integer1)
    val integer3 = incrementFn(integer1)

    (integer1.value + 1) == integer2.value && (integer1.value + 1) == integer3.value
  }

  def check2(incrementFn: Integer => Integer): Boolean = {
    val integer1 = Integer(1)
    val integer2 = incrementFn(integer1)
    val integer3 = incrementFn(integer2)

    (integer1.value + 1) == integer2.value && (integer2.value + 1) == integer3.value

  }
}