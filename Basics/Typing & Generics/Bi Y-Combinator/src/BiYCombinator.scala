object BiYCombinator {

	def fix[state, n, result](bifnFactoy: ((state, n) => result) => (state, n) => result): (state, n) => result =
		(State, N) => bifnFactoy(fix(bifnFactoy))(State, N)
}