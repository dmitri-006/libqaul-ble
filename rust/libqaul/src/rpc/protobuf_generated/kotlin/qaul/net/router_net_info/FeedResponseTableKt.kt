//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: router/router_net_info.proto

package qaul.net.router_net_info;

@kotlin.jvm.JvmName("-initializefeedResponseTable")
inline fun feedResponseTable(block: qaul.net.router_net_info.FeedResponseTableKt.Dsl.() -> kotlin.Unit): qaul.net.router_net_info.RouterNetInfo.FeedResponseTable =
  qaul.net.router_net_info.FeedResponseTableKt.Dsl._create(qaul.net.router_net_info.RouterNetInfo.FeedResponseTable.newBuilder()).apply { block() }._build()
object FeedResponseTableKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.net.router_net_info.RouterNetInfo.FeedResponseTable.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.net.router_net_info.RouterNetInfo.FeedResponseTable.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.net.router_net_info.RouterNetInfo.FeedResponseTable = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class MessagesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * feed messages
     * </pre>
     *
     * <code>repeated .qaul.net.router_net_info.FeedMessage messages = 1;</code>
     */
     val messages: com.google.protobuf.kotlin.DslList<qaul.net.router_net_info.RouterNetInfo.FeedMessage, MessagesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getMessagesList()
      )
    /**
     * <pre>
     * feed messages
     * </pre>
     *
     * <code>repeated .qaul.net.router_net_info.FeedMessage messages = 1;</code>
     * @param value The messages to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addMessages")
    fun com.google.protobuf.kotlin.DslList<qaul.net.router_net_info.RouterNetInfo.FeedMessage, MessagesProxy>.add(value: qaul.net.router_net_info.RouterNetInfo.FeedMessage) {
      _builder.addMessages(value)
    }
    /**
     * <pre>
     * feed messages
     * </pre>
     *
     * <code>repeated .qaul.net.router_net_info.FeedMessage messages = 1;</code>
     * @param value The messages to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignMessages")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<qaul.net.router_net_info.RouterNetInfo.FeedMessage, MessagesProxy>.plusAssign(value: qaul.net.router_net_info.RouterNetInfo.FeedMessage) {
      add(value)
    }
    /**
     * <pre>
     * feed messages
     * </pre>
     *
     * <code>repeated .qaul.net.router_net_info.FeedMessage messages = 1;</code>
     * @param values The messages to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllMessages")
    fun com.google.protobuf.kotlin.DslList<qaul.net.router_net_info.RouterNetInfo.FeedMessage, MessagesProxy>.addAll(values: kotlin.collections.Iterable<qaul.net.router_net_info.RouterNetInfo.FeedMessage>) {
      _builder.addAllMessages(values)
    }
    /**
     * <pre>
     * feed messages
     * </pre>
     *
     * <code>repeated .qaul.net.router_net_info.FeedMessage messages = 1;</code>
     * @param values The messages to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllMessages")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<qaul.net.router_net_info.RouterNetInfo.FeedMessage, MessagesProxy>.plusAssign(values: kotlin.collections.Iterable<qaul.net.router_net_info.RouterNetInfo.FeedMessage>) {
      addAll(values)
    }
    /**
     * <pre>
     * feed messages
     * </pre>
     *
     * <code>repeated .qaul.net.router_net_info.FeedMessage messages = 1;</code>
     * @param index The index to set the value at.
     * @param value The messages to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setMessages")
    operator fun com.google.protobuf.kotlin.DslList<qaul.net.router_net_info.RouterNetInfo.FeedMessage, MessagesProxy>.set(index: kotlin.Int, value: qaul.net.router_net_info.RouterNetInfo.FeedMessage) {
      _builder.setMessages(index, value)
    }
    /**
     * <pre>
     * feed messages
     * </pre>
     *
     * <code>repeated .qaul.net.router_net_info.FeedMessage messages = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearMessages")
    fun com.google.protobuf.kotlin.DslList<qaul.net.router_net_info.RouterNetInfo.FeedMessage, MessagesProxy>.clear() {
      _builder.clearMessages()
    }

  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.net.router_net_info.RouterNetInfo.FeedResponseTable.copy(block: qaul.net.router_net_info.FeedResponseTableKt.Dsl.() -> kotlin.Unit): qaul.net.router_net_info.RouterNetInfo.FeedResponseTable =
  qaul.net.router_net_info.FeedResponseTableKt.Dsl._create(this.toBuilder()).apply { block() }._build()

