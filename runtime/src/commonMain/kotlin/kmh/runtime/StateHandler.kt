package kmh.runtime

interface StateHandler<T: Any> {
  fun create(): T
  fun setup(instance: T)
  fun teardown(instance: T)
}