object TailFibonacciTask {
  def fibonacciImpl2(): Int => Int = {
    def fun(n: Int): Int = {
      if (n == 0) 0
      else if (n == 1) 1
      else fibFcn(n - 1, 0, 1)
    }
    def fibFcn(n: Int, acc1: Int, acc2: Int): Int = n match {
      case 0 => acc2
      case _ => fibFcn(n - 1, acc2, acc1 + acc2)
    }

    fun
  }
}

