package kmh

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
annotation class State(
  val scope: Scope
)