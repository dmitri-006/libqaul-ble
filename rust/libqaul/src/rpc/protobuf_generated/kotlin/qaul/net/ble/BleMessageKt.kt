//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: connections/ble/ble_net.proto

package qaul.net.ble;

@kotlin.jvm.JvmName("-initializebleMessage")
inline fun bleMessage(block: qaul.net.ble.BleMessageKt.Dsl.() -> kotlin.Unit): qaul.net.ble.BleNet.BleMessage =
  qaul.net.ble.BleMessageKt.Dsl._create(qaul.net.ble.BleNet.BleMessage.newBuilder()).apply { block() }._build()
object BleMessageKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.net.ble.BleNet.BleMessage.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.net.ble.BleNet.BleMessage.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.net.ble.BleNet.BleMessage = _builder.build()

    /**
     * <pre>
     * info message
     * </pre>
     *
     * <code>bytes info = 1;</code>
     */
    var info: com.google.protobuf.ByteString
      @JvmName("getInfo")
      get() = _builder.getInfo()
      @JvmName("setInfo")
      set(value) {
        _builder.setInfo(value)
      }
    /**
     * <pre>
     * info message
     * </pre>
     *
     * <code>bytes info = 1;</code>
     */
    fun clearInfo() {
      _builder.clearInfo()
    }
    /**
     * <pre>
     * info message
     * </pre>
     *
     * <code>bytes info = 1;</code>
     * @return Whether the info field is set.
     */
    fun hasInfo(): kotlin.Boolean {
      return _builder.hasInfo()
    }

    /**
     * <pre>
     * feed message
     * </pre>
     *
     * <code>bytes feed = 2;</code>
     */
    var feed: com.google.protobuf.ByteString
      @JvmName("getFeed")
      get() = _builder.getFeed()
      @JvmName("setFeed")
      set(value) {
        _builder.setFeed(value)
      }
    /**
     * <pre>
     * feed message
     * </pre>
     *
     * <code>bytes feed = 2;</code>
     */
    fun clearFeed() {
      _builder.clearFeed()
    }
    /**
     * <pre>
     * feed message
     * </pre>
     *
     * <code>bytes feed = 2;</code>
     * @return Whether the feed field is set.
     */
    fun hasFeed(): kotlin.Boolean {
      return _builder.hasFeed()
    }

    /**
     * <pre>
     * messaging message
     * </pre>
     *
     * <code>bytes messaging = 3;</code>
     */
    var messaging: com.google.protobuf.ByteString
      @JvmName("getMessaging")
      get() = _builder.getMessaging()
      @JvmName("setMessaging")
      set(value) {
        _builder.setMessaging(value)
      }
    /**
     * <pre>
     * messaging message
     * </pre>
     *
     * <code>bytes messaging = 3;</code>
     */
    fun clearMessaging() {
      _builder.clearMessaging()
    }
    /**
     * <pre>
     * messaging message
     * </pre>
     *
     * <code>bytes messaging = 3;</code>
     * @return Whether the messaging field is set.
     */
    fun hasMessaging(): kotlin.Boolean {
      return _builder.hasMessaging()
    }

    /**
     * <pre>
     * identification request
     * </pre>
     *
     * <code>.qaul.net.ble.Identification identification = 4;</code>
     */
    var identification: qaul.net.ble.BleNet.Identification
      @JvmName("getIdentification")
      get() = _builder.getIdentification()
      @JvmName("setIdentification")
      set(value) {
        _builder.setIdentification(value)
      }
    /**
     * <pre>
     * identification request
     * </pre>
     *
     * <code>.qaul.net.ble.Identification identification = 4;</code>
     */
    fun clearIdentification() {
      _builder.clearIdentification()
    }
    /**
     * <pre>
     * identification request
     * </pre>
     *
     * <code>.qaul.net.ble.Identification identification = 4;</code>
     * @return Whether the identification field is set.
     */
    fun hasIdentification(): kotlin.Boolean {
      return _builder.hasIdentification()
    }
    val messageCase: qaul.net.ble.BleNet.BleMessage.MessageCase
      @JvmName("getMessageCase")
      get() = _builder.getMessageCase()

    fun clearMessage() {
      _builder.clearMessage()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.net.ble.BleNet.BleMessage.copy(block: qaul.net.ble.BleMessageKt.Dsl.() -> kotlin.Unit): qaul.net.ble.BleNet.BleMessage =
  qaul.net.ble.BleMessageKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val qaul.net.ble.BleNet.BleMessageOrBuilder.identificationOrNull: qaul.net.ble.BleNet.Identification?
  get() = if (hasIdentification()) getIdentification() else null

