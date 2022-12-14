//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: router/users.proto

package qaul.rpc.users;

@kotlin.jvm.JvmName("-initializeuserEntry")
inline fun userEntry(block: qaul.rpc.users.UserEntryKt.Dsl.() -> kotlin.Unit): qaul.rpc.users.UsersOuterClass.UserEntry =
  qaul.rpc.users.UserEntryKt.Dsl._create(qaul.rpc.users.UsersOuterClass.UserEntry.newBuilder()).apply { block() }._build()
object UserEntryKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.rpc.users.UsersOuterClass.UserEntry.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.rpc.users.UsersOuterClass.UserEntry.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.rpc.users.UsersOuterClass.UserEntry = _builder.build()

    /**
     * <pre>
     * user name
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <pre>
     * user name
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    fun clearName() {
      _builder.clearName()
    }

    /**
     * <pre>
     * user ID (38 Byte PeerID)
     * </pre>
     *
     * <code>bytes id = 2;</code>
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
     * user ID (38 Byte PeerID)
     * </pre>
     *
     * <code>bytes id = 2;</code>
     */
    fun clearId() {
      _builder.clearId()
    }

    /**
     * <pre>
     * direct chat group id
     * this is a predictable 16 bytes UUID
     * </pre>
     *
     * <code>bytes group_id = 3;</code>
     */
    var groupId: com.google.protobuf.ByteString
      @JvmName("getGroupId")
      get() = _builder.getGroupId()
      @JvmName("setGroupId")
      set(value) {
        _builder.setGroupId(value)
      }
    /**
     * <pre>
     * direct chat group id
     * this is a predictable 16 bytes UUID
     * </pre>
     *
     * <code>bytes group_id = 3;</code>
     */
    fun clearGroupId() {
      _builder.clearGroupId()
    }

    /**
     * <pre>
     * base58 string of public key
     * </pre>
     *
     * <code>string key_base58 = 7;</code>
     */
    var keyBase58: kotlin.String
      @JvmName("getKeyBase58")
      get() = _builder.getKeyBase58()
      @JvmName("setKeyBase58")
      set(value) {
        _builder.setKeyBase58(value)
      }
    /**
     * <pre>
     * base58 string of public key
     * </pre>
     *
     * <code>string key_base58 = 7;</code>
     */
    fun clearKeyBase58() {
      _builder.clearKeyBase58()
    }

    /**
     * <pre>
     * reachability of the user: online | reachable | offline
     * </pre>
     *
     * <code>.qaul.rpc.users.Connectivity connectivity = 8;</code>
     */
     var connectivity: qaul.rpc.users.UsersOuterClass.Connectivity
      @JvmName("getConnectivity")
      get() = _builder.getConnectivity()
      @JvmName("setConnectivity")
      set(value) {
        _builder.setConnectivity(value)
      }
    /**
     * <pre>
     * reachability of the user: online | reachable | offline
     * </pre>
     *
     * <code>.qaul.rpc.users.Connectivity connectivity = 8;</code>
     */
    fun clearConnectivity() {
      _builder.clearConnectivity()
    }

    /**
     * <pre>
     * user has been verified
     * </pre>
     *
     * <code>bool verified = 9;</code>
     */
    var verified: kotlin.Boolean
      @JvmName("getVerified")
      get() = _builder.getVerified()
      @JvmName("setVerified")
      set(value) {
        _builder.setVerified(value)
      }
    /**
     * <pre>
     * user has been verified
     * </pre>
     *
     * <code>bool verified = 9;</code>
     */
    fun clearVerified() {
      _builder.clearVerified()
    }

    /**
     * <pre>
     * user is blocked
     * </pre>
     *
     * <code>bool blocked = 10;</code>
     */
    var blocked: kotlin.Boolean
      @JvmName("getBlocked")
      get() = _builder.getBlocked()
      @JvmName("setBlocked")
      set(value) {
        _builder.setBlocked(value)
      }
    /**
     * <pre>
     * user is blocked
     * </pre>
     *
     * <code>bool blocked = 10;</code>
     */
    fun clearBlocked() {
      _builder.clearBlocked()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class ConnectionsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * routing connection entries
     * RoutingTableConnection connections = 11;
     * </pre>
     *
     * <code>repeated .qaul.rpc.users.RoutingTableConnection connections = 11;</code>
     */
     val connections: com.google.protobuf.kotlin.DslList<qaul.rpc.users.UsersOuterClass.RoutingTableConnection, ConnectionsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getConnectionsList()
      )
    /**
     * <pre>
     * routing connection entries
     * RoutingTableConnection connections = 11;
     * </pre>
     *
     * <code>repeated .qaul.rpc.users.RoutingTableConnection connections = 11;</code>
     * @param value The connections to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addConnections")
    fun com.google.protobuf.kotlin.DslList<qaul.rpc.users.UsersOuterClass.RoutingTableConnection, ConnectionsProxy>.add(value: qaul.rpc.users.UsersOuterClass.RoutingTableConnection) {
      _builder.addConnections(value)
    }
    /**
     * <pre>
     * routing connection entries
     * RoutingTableConnection connections = 11;
     * </pre>
     *
     * <code>repeated .qaul.rpc.users.RoutingTableConnection connections = 11;</code>
     * @param value The connections to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignConnections")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<qaul.rpc.users.UsersOuterClass.RoutingTableConnection, ConnectionsProxy>.plusAssign(value: qaul.rpc.users.UsersOuterClass.RoutingTableConnection) {
      add(value)
    }
    /**
     * <pre>
     * routing connection entries
     * RoutingTableConnection connections = 11;
     * </pre>
     *
     * <code>repeated .qaul.rpc.users.RoutingTableConnection connections = 11;</code>
     * @param values The connections to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllConnections")
    fun com.google.protobuf.kotlin.DslList<qaul.rpc.users.UsersOuterClass.RoutingTableConnection, ConnectionsProxy>.addAll(values: kotlin.collections.Iterable<qaul.rpc.users.UsersOuterClass.RoutingTableConnection>) {
      _builder.addAllConnections(values)
    }
    /**
     * <pre>
     * routing connection entries
     * RoutingTableConnection connections = 11;
     * </pre>
     *
     * <code>repeated .qaul.rpc.users.RoutingTableConnection connections = 11;</code>
     * @param values The connections to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllConnections")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<qaul.rpc.users.UsersOuterClass.RoutingTableConnection, ConnectionsProxy>.plusAssign(values: kotlin.collections.Iterable<qaul.rpc.users.UsersOuterClass.RoutingTableConnection>) {
      addAll(values)
    }
    /**
     * <pre>
     * routing connection entries
     * RoutingTableConnection connections = 11;
     * </pre>
     *
     * <code>repeated .qaul.rpc.users.RoutingTableConnection connections = 11;</code>
     * @param index The index to set the value at.
     * @param value The connections to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setConnections")
    operator fun com.google.protobuf.kotlin.DslList<qaul.rpc.users.UsersOuterClass.RoutingTableConnection, ConnectionsProxy>.set(index: kotlin.Int, value: qaul.rpc.users.UsersOuterClass.RoutingTableConnection) {
      _builder.setConnections(index, value)
    }
    /**
     * <pre>
     * routing connection entries
     * RoutingTableConnection connections = 11;
     * </pre>
     *
     * <code>repeated .qaul.rpc.users.RoutingTableConnection connections = 11;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearConnections")
    fun com.google.protobuf.kotlin.DslList<qaul.rpc.users.UsersOuterClass.RoutingTableConnection, ConnectionsProxy>.clear() {
      _builder.clearConnections()
    }

  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.rpc.users.UsersOuterClass.UserEntry.copy(block: qaul.rpc.users.UserEntryKt.Dsl.() -> kotlin.Unit): qaul.rpc.users.UsersOuterClass.UserEntry =
  qaul.rpc.users.UserEntryKt.Dsl._create(this.toBuilder()).apply { block() }._build()

