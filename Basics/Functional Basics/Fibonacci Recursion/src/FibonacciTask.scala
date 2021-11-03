object FibonacciTask {
	def fibonacci(n: Int): Int = n match {
		case 0 => 0
		case 1 => 1
		case _ => fibonacci(n-2) + fibonacci(n-1)
	}
	def fibonacciImpl(): Int => Int = {
		fibonacci
	}

}