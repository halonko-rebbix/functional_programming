object PrimeCheckerTask {

	def isPrime(n: Long, a: Int = 2): Boolean = {
		if (n == a) true
		else if (n % a == 0) false
		else isPrime(n, a + 1)
	}

}