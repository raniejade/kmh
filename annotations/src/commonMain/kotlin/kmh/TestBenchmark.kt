package kmh

@OutputTimeUnit(BenchmarkTimeUnit.MILLISECONDS)
@Measurement(time = 1, timeUnit = BenchmarkTimeUnit.SECONDS)
@BenchmarkMode(Mode.THROUGHPUT)
class TestBenchmark {

  @State(Scope.BENCHMARK)
  class BenchmarkState {
    var i: Int = 0

    @Setup
    fun setup() {
      i = 1
    }

    @Teardown
    fun teardown() {
      i = 0
    }
  }

  @Benchmark
  fun foo(state: BenchmarkState) {

  }
}