package kmh.runtime

abstract class ThroughputBenchmarkHandler : BenchmarkHandler {
  override fun execute(context: ExecutionContext) {
    TODO("Not yet implemented")
  }

  // implemented by the compiler plugin.
  // this method will invoke the benchmark method with the required arguments
  protected abstract fun doExecute()
}