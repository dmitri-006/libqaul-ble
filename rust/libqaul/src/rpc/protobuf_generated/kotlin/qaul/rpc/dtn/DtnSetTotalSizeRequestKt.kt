//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: services/dtn/dtn_rpc.proto

package qaul.rpc.dtn;

@kotlin.jvm.JvmName("-initializedtnSetTotalSizeRequest")
inline fun dtnSetTotalSizeRequest(block: qaul.rpc.dtn.DtnSetTotalSizeRequestKt.Dsl.() -> kotlin.Unit): qaul.rpc.dtn.DtnRpc.DtnSetTotalSizeRequest =
  qaul.rpc.dtn.DtnSetTotalSizeRequestKt.Dsl._create(qaul.rpc.dtn.DtnRpc.DtnSetTotalSizeRequest.newBuilder()).apply { block() }._build()
object DtnSetTotalSizeRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.rpc.dtn.DtnRpc.DtnSetTotalSizeRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.rpc.dtn.DtnRpc.DtnSetTotalSizeRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.rpc.dtn.DtnRpc.DtnSetTotalSizeRequest = _builder.build()

    /**
     * <pre>
     * total_size
     * </pre>
     *
     * <code>uint32 total_size = 1;</code>
     */
    var totalSize: kotlin.Int
      @JvmName("getTotalSize")
      get() = _builder.getTotalSize()
      @JvmName("setTotalSize")
      set(value) {
        _builder.setTotalSize(value)
      }
    /**
     * <pre>
     * total_size
     * </pre>
     *
     * <code>uint32 total_size = 1;</code>
     */
    fun clearTotalSize() {
      _builder.clearTotalSize()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.rpc.dtn.DtnRpc.DtnSetTotalSizeRequest.copy(block: qaul.rpc.dtn.DtnSetTotalSizeRequestKt.Dsl.() -> kotlin.Unit): qaul.rpc.dtn.DtnRpc.DtnSetTotalSizeRequest =
  qaul.rpc.dtn.DtnSetTotalSizeRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

