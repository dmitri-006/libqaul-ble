//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: services/group/group_net.proto

package qaul.net.group;

@kotlin.jvm.JvmName("-initializegroupContainer")
inline fun groupContainer(block: qaul.net.group.GroupContainerKt.Dsl.() -> kotlin.Unit): qaul.net.group.GroupNet.GroupContainer =
  qaul.net.group.GroupContainerKt.Dsl._create(qaul.net.group.GroupNet.GroupContainer.newBuilder()).apply { block() }._build()
object GroupContainerKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.net.group.GroupNet.GroupContainer.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.net.group.GroupNet.GroupContainer.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.net.group.GroupNet.GroupContainer = _builder.build()

    /**
     * <pre>
     * group invite
     * </pre>
     *
     * <code>.qaul.net.group.InviteMember invite_member = 1;</code>
     */
    var inviteMember: qaul.net.group.GroupNet.InviteMember
      @JvmName("getInviteMember")
      get() = _builder.getInviteMember()
      @JvmName("setInviteMember")
      set(value) {
        _builder.setInviteMember(value)
      }
    /**
     * <pre>
     * group invite
     * </pre>
     *
     * <code>.qaul.net.group.InviteMember invite_member = 1;</code>
     */
    fun clearInviteMember() {
      _builder.clearInviteMember()
    }
    /**
     * <pre>
     * group invite
     * </pre>
     *
     * <code>.qaul.net.group.InviteMember invite_member = 1;</code>
     * @return Whether the inviteMember field is set.
     */
    fun hasInviteMember(): kotlin.Boolean {
      return _builder.hasInviteMember()
    }

    /**
     * <pre>
     * reply invite
     * </pre>
     *
     * <code>.qaul.net.group.ReplyInvite reply_invite = 2;</code>
     */
    var replyInvite: qaul.net.group.GroupNet.ReplyInvite
      @JvmName("getReplyInvite")
      get() = _builder.getReplyInvite()
      @JvmName("setReplyInvite")
      set(value) {
        _builder.setReplyInvite(value)
      }
    /**
     * <pre>
     * reply invite
     * </pre>
     *
     * <code>.qaul.net.group.ReplyInvite reply_invite = 2;</code>
     */
    fun clearReplyInvite() {
      _builder.clearReplyInvite()
    }
    /**
     * <pre>
     * reply invite
     * </pre>
     *
     * <code>.qaul.net.group.ReplyInvite reply_invite = 2;</code>
     * @return Whether the replyInvite field is set.
     */
    fun hasReplyInvite(): kotlin.Boolean {
      return _builder.hasReplyInvite()
    }

    /**
     * <pre>
     * group status update
     * </pre>
     *
     * <code>.qaul.net.group.GroupInfo group_info = 3;</code>
     */
    var groupInfo: qaul.net.group.GroupNet.GroupInfo
      @JvmName("getGroupInfo")
      get() = _builder.getGroupInfo()
      @JvmName("setGroupInfo")
      set(value) {
        _builder.setGroupInfo(value)
      }
    /**
     * <pre>
     * group status update
     * </pre>
     *
     * <code>.qaul.net.group.GroupInfo group_info = 3;</code>
     */
    fun clearGroupInfo() {
      _builder.clearGroupInfo()
    }
    /**
     * <pre>
     * group status update
     * </pre>
     *
     * <code>.qaul.net.group.GroupInfo group_info = 3;</code>
     * @return Whether the groupInfo field is set.
     */
    fun hasGroupInfo(): kotlin.Boolean {
      return _builder.hasGroupInfo()
    }

    /**
     * <pre>
     * member removed
     * </pre>
     *
     * <code>.qaul.net.group.RemovedMember removed = 4;</code>
     */
    var removed: qaul.net.group.GroupNet.RemovedMember
      @JvmName("getRemoved")
      get() = _builder.getRemoved()
      @JvmName("setRemoved")
      set(value) {
        _builder.setRemoved(value)
      }
    /**
     * <pre>
     * member removed
     * </pre>
     *
     * <code>.qaul.net.group.RemovedMember removed = 4;</code>
     */
    fun clearRemoved() {
      _builder.clearRemoved()
    }
    /**
     * <pre>
     * member removed
     * </pre>
     *
     * <code>.qaul.net.group.RemovedMember removed = 4;</code>
     * @return Whether the removed field is set.
     */
    fun hasRemoved(): kotlin.Boolean {
      return _builder.hasRemoved()
    }
    val messageCase: qaul.net.group.GroupNet.GroupContainer.MessageCase
      @JvmName("getMessageCase")
      get() = _builder.getMessageCase()

    fun clearMessage() {
      _builder.clearMessage()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.net.group.GroupNet.GroupContainer.copy(block: qaul.net.group.GroupContainerKt.Dsl.() -> kotlin.Unit): qaul.net.group.GroupNet.GroupContainer =
  qaul.net.group.GroupContainerKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val qaul.net.group.GroupNet.GroupContainerOrBuilder.inviteMemberOrNull: qaul.net.group.GroupNet.InviteMember?
  get() = if (hasInviteMember()) getInviteMember() else null

val qaul.net.group.GroupNet.GroupContainerOrBuilder.replyInviteOrNull: qaul.net.group.GroupNet.ReplyInvite?
  get() = if (hasReplyInvite()) getReplyInvite() else null

val qaul.net.group.GroupNet.GroupContainerOrBuilder.groupInfoOrNull: qaul.net.group.GroupNet.GroupInfo?
  get() = if (hasGroupInfo()) getGroupInfo() else null

val qaul.net.group.GroupNet.GroupContainerOrBuilder.removedOrNull: qaul.net.group.GroupNet.RemovedMember?
  get() = if (hasRemoved()) getRemoved() else null
