//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: services/dtn/dtn_rpc.proto

package qaul.rpc.dtn;

@kotlin.jvm.JvmName("-initializedtnConfigRequest")
inline fun dtnConfigRequest(block: qaul.rpc.dtn.DtnConfigRequestKt.Dsl.() -> kotlin.Unit): qaul.rpc.dtn.DtnRpc.DtnConfigRequest =
  qaul.rpc.dtn.DtnConfigRequestKt.Dsl._create(qaul.rpc.dtn.DtnRpc.DtnConfigRequest.newBuilder()).apply { block() }._build()
object DtnConfigRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.rpc.dtn.DtnRpc.DtnConfigRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.rpc.dtn.DtnRpc.DtnConfigRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.rpc.dtn.DtnRpc.DtnConfigRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.rpc.dtn.DtnRpc.DtnConfigRequest.copy(block: qaul.rpc.dtn.DtnConfigRequestKt.Dsl.() -> kotlin.Unit): qaul.rpc.dtn.DtnRpc.DtnConfigRequest =
  qaul.rpc.dtn.DtnConfigRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

