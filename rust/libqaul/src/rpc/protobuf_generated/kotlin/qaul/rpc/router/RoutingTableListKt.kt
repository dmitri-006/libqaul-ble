//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: router/router.proto

package qaul.rpc.router;

@kotlin.jvm.JvmName("-initializeroutingTableList")
inline fun routingTableList(block: qaul.rpc.router.RoutingTableListKt.Dsl.() -> kotlin.Unit): qaul.rpc.router.RouterOuterClass.RoutingTableList =
  qaul.rpc.router.RoutingTableListKt.Dsl._create(qaul.rpc.router.RouterOuterClass.RoutingTableList.newBuilder()).apply { block() }._build()
object RoutingTableListKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.rpc.router.RouterOuterClass.RoutingTableList.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.rpc.router.RouterOuterClass.RoutingTableList.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.rpc.router.RouterOuterClass.RoutingTableList = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class RoutingTableProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .qaul.rpc.router.RoutingTableEntry routing_table = 1;</code>
     */
     val routingTable: com.google.protobuf.kotlin.DslList<qaul.rpc.router.RouterOuterClass.RoutingTableEntry, RoutingTableProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getRoutingTableList()
      )
    /**
     * <code>repeated .qaul.rpc.router.RoutingTableEntry routing_table = 1;</code>
     * @param value The routingTable to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addRoutingTable")
    fun com.google.protobuf.kotlin.DslList<qaul.rpc.router.RouterOuterClass.RoutingTableEntry, RoutingTableProxy>.add(value: qaul.rpc.router.RouterOuterClass.RoutingTableEntry) {
      _builder.addRoutingTable(value)
    }
    /**
     * <code>repeated .qaul.rpc.router.RoutingTableEntry routing_table = 1;</code>
     * @param value The routingTable to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignRoutingTable")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<qaul.rpc.router.RouterOuterClass.RoutingTableEntry, RoutingTableProxy>.plusAssign(value: qaul.rpc.router.RouterOuterClass.RoutingTableEntry) {
      add(value)
    }
    /**
     * <code>repeated .qaul.rpc.router.RoutingTableEntry routing_table = 1;</code>
     * @param values The routingTable to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllRoutingTable")
    fun com.google.protobuf.kotlin.DslList<qaul.rpc.router.RouterOuterClass.RoutingTableEntry, RoutingTableProxy>.addAll(values: kotlin.collections.Iterable<qaul.rpc.router.RouterOuterClass.RoutingTableEntry>) {
      _builder.addAllRoutingTable(values)
    }
    /**
     * <code>repeated .qaul.rpc.router.RoutingTableEntry routing_table = 1;</code>
     * @param values The routingTable to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllRoutingTable")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<qaul.rpc.router.RouterOuterClass.RoutingTableEntry, RoutingTableProxy>.plusAssign(values: kotlin.collections.Iterable<qaul.rpc.router.RouterOuterClass.RoutingTableEntry>) {
      addAll(values)
    }
    /**
     * <code>repeated .qaul.rpc.router.RoutingTableEntry routing_table = 1;</code>
     * @param index The index to set the value at.
     * @param value The routingTable to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setRoutingTable")
    operator fun com.google.protobuf.kotlin.DslList<qaul.rpc.router.RouterOuterClass.RoutingTableEntry, RoutingTableProxy>.set(index: kotlin.Int, value: qaul.rpc.router.RouterOuterClass.RoutingTableEntry) {
      _builder.setRoutingTable(index, value)
    }
    /**
     * <code>repeated .qaul.rpc.router.RoutingTableEntry routing_table = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearRoutingTable")
    fun com.google.protobuf.kotlin.DslList<qaul.rpc.router.RouterOuterClass.RoutingTableEntry, RoutingTableProxy>.clear() {
      _builder.clearRoutingTable()
    }

  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.rpc.router.RouterOuterClass.RoutingTableList.copy(block: qaul.rpc.router.RoutingTableListKt.Dsl.() -> kotlin.Unit): qaul.rpc.router.RouterOuterClass.RoutingTableList =
  qaul.rpc.router.RoutingTableListKt.Dsl._create(this.toBuilder()).apply { block() }._build()

