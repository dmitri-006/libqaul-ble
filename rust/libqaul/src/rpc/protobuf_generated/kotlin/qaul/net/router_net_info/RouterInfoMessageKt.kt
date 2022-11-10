//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: router/router_net_info.proto

package qaul.net.router_net_info;

@kotlin.jvm.JvmName("-initializerouterInfoMessage")
inline fun routerInfoMessage(block: qaul.net.router_net_info.RouterInfoMessageKt.Dsl.() -> kotlin.Unit): qaul.net.router_net_info.RouterNetInfo.RouterInfoMessage =
  qaul.net.router_net_info.RouterInfoMessageKt.Dsl._create(qaul.net.router_net_info.RouterNetInfo.RouterInfoMessage.newBuilder()).apply { block() }._build()
object RouterInfoMessageKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.net.router_net_info.RouterNetInfo.RouterInfoMessage.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.net.router_net_info.RouterNetInfo.RouterInfoMessage.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.net.router_net_info.RouterNetInfo.RouterInfoMessage = _builder.build()

    /**
     * <pre>
     * node id
     * </pre>
     *
     * <code>bytes node = 1;</code>
     */
    var node: com.google.protobuf.ByteString
      @JvmName("getNode")
      get() = _builder.getNode()
      @JvmName("setNode")
      set(value) {
        _builder.setNode(value)
      }
    /**
     * <pre>
     * node id
     * </pre>
     *
     * <code>bytes node = 1;</code>
     */
    fun clearNode() {
      _builder.clearNode()
    }

    /**
     * <pre>
     * Routing information table
     * </pre>
     *
     * <code>.qaul.net.router_net_info.RoutingInfoTable routes = 2;</code>
     */
    var routes: qaul.net.router_net_info.RouterNetInfo.RoutingInfoTable
      @JvmName("getRoutes")
      get() = _builder.getRoutes()
      @JvmName("setRoutes")
      set(value) {
        _builder.setRoutes(value)
      }
    /**
     * <pre>
     * Routing information table
     * </pre>
     *
     * <code>.qaul.net.router_net_info.RoutingInfoTable routes = 2;</code>
     */
    fun clearRoutes() {
      _builder.clearRoutes()
    }
    /**
     * <pre>
     * Routing information table
     * </pre>
     *
     * <code>.qaul.net.router_net_info.RoutingInfoTable routes = 2;</code>
     * @return Whether the routes field is set.
     */
    fun hasRoutes(): kotlin.Boolean {
      return _builder.hasRoutes()
    }

    /**
     * <pre>
     * Latest Feed ids table
     * </pre>
     *
     * <code>.qaul.net.router_net_info.FeedIdsTable feeds = 4;</code>
     */
    var feeds: qaul.net.router_net_info.RouterNetInfo.FeedIdsTable
      @JvmName("getFeeds")
      get() = _builder.getFeeds()
      @JvmName("setFeeds")
      set(value) {
        _builder.setFeeds(value)
      }
    /**
     * <pre>
     * Latest Feed ids table
     * </pre>
     *
     * <code>.qaul.net.router_net_info.FeedIdsTable feeds = 4;</code>
     */
    fun clearFeeds() {
      _builder.clearFeeds()
    }
    /**
     * <pre>
     * Latest Feed ids table
     * </pre>
     *
     * <code>.qaul.net.router_net_info.FeedIdsTable feeds = 4;</code>
     * @return Whether the feeds field is set.
     */
    fun hasFeeds(): kotlin.Boolean {
      return _builder.hasFeeds()
    }

    /**
     * <pre>
     * timestamp
     * </pre>
     *
     * <code>uint64 timestamp = 5;</code>
     */
    var timestamp: kotlin.Long
      @JvmName("getTimestamp")
      get() = _builder.getTimestamp()
      @JvmName("setTimestamp")
      set(value) {
        _builder.setTimestamp(value)
      }
    /**
     * <pre>
     * timestamp
     * </pre>
     *
     * <code>uint64 timestamp = 5;</code>
     */
    fun clearTimestamp() {
      _builder.clearTimestamp()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.net.router_net_info.RouterNetInfo.RouterInfoMessage.copy(block: qaul.net.router_net_info.RouterInfoMessageKt.Dsl.() -> kotlin.Unit): qaul.net.router_net_info.RouterNetInfo.RouterInfoMessage =
  qaul.net.router_net_info.RouterInfoMessageKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val qaul.net.router_net_info.RouterNetInfo.RouterInfoMessageOrBuilder.routesOrNull: qaul.net.router_net_info.RouterNetInfo.RoutingInfoTable?
  get() = if (hasRoutes()) getRoutes() else null

val qaul.net.router_net_info.RouterNetInfo.RouterInfoMessageOrBuilder.feedsOrNull: qaul.net.router_net_info.RouterNetInfo.FeedIdsTable?
  get() = if (hasFeeds()) getFeeds() else null
