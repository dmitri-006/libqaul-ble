//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: rpc/debug.proto

package qaul.rpc.debug;

@kotlin.jvm.JvmName("-initializeheartbeatResponse")
inline fun heartbeatResponse(block: qaul.rpc.debug.HeartbeatResponseKt.Dsl.() -> kotlin.Unit): qaul.rpc.debug.DebugOuterClass.HeartbeatResponse =
  qaul.rpc.debug.HeartbeatResponseKt.Dsl._create(qaul.rpc.debug.DebugOuterClass.HeartbeatResponse.newBuilder()).apply { block() }._build()
object HeartbeatResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.rpc.debug.DebugOuterClass.HeartbeatResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.rpc.debug.DebugOuterClass.HeartbeatResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.rpc.debug.DebugOuterClass.HeartbeatResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.rpc.debug.DebugOuterClass.HeartbeatResponse.copy(block: qaul.rpc.debug.HeartbeatResponseKt.Dsl.() -> kotlin.Unit): qaul.rpc.debug.DebugOuterClass.HeartbeatResponse =
  qaul.rpc.debug.HeartbeatResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

