//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: connections/ble/ble_net.proto

package qaul.net.ble;

@kotlin.jvm.JvmName("-initializenodeIdentification")
inline fun nodeIdentification(block: qaul.net.ble.NodeIdentificationKt.Dsl.() -> kotlin.Unit): qaul.net.ble.BleNet.NodeIdentification =
  qaul.net.ble.NodeIdentificationKt.Dsl._create(qaul.net.ble.BleNet.NodeIdentification.newBuilder()).apply { block() }._build()
object NodeIdentificationKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.net.ble.BleNet.NodeIdentification.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.net.ble.BleNet.NodeIdentification.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.net.ble.BleNet.NodeIdentification = _builder.build()

    /**
     * <pre>
     * Node ID
     * </pre>
     *
     * <code>bytes id = 1;</code>
     */
    var id: com.google.protobuf.ByteString
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <pre>
     * Node ID
     * </pre>
     *
     * <code>bytes id = 1;</code>
     */
    fun clearId() {
      _builder.clearId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.net.ble.BleNet.NodeIdentification.copy(block: qaul.net.ble.NodeIdentificationKt.Dsl.() -> kotlin.Unit): qaul.net.ble.BleNet.NodeIdentification =
  qaul.net.ble.NodeIdentificationKt.Dsl._create(this.toBuilder()).apply { block() }._build()

