package kmh.runtime

import kmh.BenchmarkTimeUnit
import kmh.Mode
import kotlin.reflect.KClass

abstract class ExecutionContext(
  val warmupIterations: Int,
  val iterations: Int,
  val iterationTime: Int,
  val iterationTimeUnit: BenchmarkTimeUnit,
  val mode: Mode,
  val outputTimeUnit: BenchmarkTimeUnit
) {
  abstract fun <T: Any> getState(clz: KClass<T>): T
}