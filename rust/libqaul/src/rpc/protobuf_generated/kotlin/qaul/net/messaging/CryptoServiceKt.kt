//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: services/messaging/messaging.proto

package qaul.net.messaging;

@kotlin.jvm.JvmName("-initializecryptoService")
inline fun cryptoService(block: qaul.net.messaging.CryptoServiceKt.Dsl.() -> kotlin.Unit): qaul.net.messaging.MessagingOuterClass.CryptoService =
  qaul.net.messaging.CryptoServiceKt.Dsl._create(qaul.net.messaging.MessagingOuterClass.CryptoService.newBuilder()).apply { block() }._build()
object CryptoServiceKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.net.messaging.MessagingOuterClass.CryptoService.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.net.messaging.MessagingOuterClass.CryptoService.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.net.messaging.MessagingOuterClass.CryptoService = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.net.messaging.MessagingOuterClass.CryptoService.copy(block: qaul.net.messaging.CryptoServiceKt.Dsl.() -> kotlin.Unit): qaul.net.messaging.MessagingOuterClass.CryptoService =
  qaul.net.messaging.CryptoServiceKt.Dsl._create(this.toBuilder()).apply { block() }._build()

