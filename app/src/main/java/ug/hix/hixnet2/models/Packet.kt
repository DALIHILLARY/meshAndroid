// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: device.proto
package ug.hix.hixnet2.models

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.WireField
import com.squareup.wire.internal.sanitize
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Nothing
import kotlin.String
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

class Packet(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val packetID: String = "",
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val toMeshID: String = "",
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val fromMeshID: String = "",
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val originalFromMeshID: String = "",
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  val port: Int = 0,
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  val offset: Int = 0,
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  val timeToLive: Int = 0,
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  val payload: ByteString = ByteString.EMPTY,
  @field:WireField(
    tag = 9,
    adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  val expected: Int = 0,
  @field:WireField(
    tag = 10,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val messageType: String = "",
  unknownFields: ByteString = ByteString.EMPTY
) : Message<Packet, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing = throw AssertionError()

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Packet) return false
    return unknownFields == other.unknownFields
        && packetID == other.packetID
        && toMeshID == other.toMeshID
        && fromMeshID == other.fromMeshID
        && originalFromMeshID == other.originalFromMeshID
        && port == other.port
        && offset == other.offset
        && timeToLive == other.timeToLive
        && payload == other.payload
        && expected == other.expected
        && messageType == other.messageType
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + packetID.hashCode()
      result = result * 37 + toMeshID.hashCode()
      result = result * 37 + fromMeshID.hashCode()
      result = result * 37 + originalFromMeshID.hashCode()
      result = result * 37 + port.hashCode()
      result = result * 37 + offset.hashCode()
      result = result * 37 + timeToLive.hashCode()
      result = result * 37 + payload.hashCode()
      result = result * 37 + expected.hashCode()
      result = result * 37 + messageType.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """packetID=${sanitize(packetID)}"""
    result += """toMeshID=${sanitize(toMeshID)}"""
    result += """fromMeshID=${sanitize(fromMeshID)}"""
    result += """originalFromMeshID=${sanitize(originalFromMeshID)}"""
    result += """port=$port"""
    result += """offset=$offset"""
    result += """timeToLive=$timeToLive"""
    result += """payload=$payload"""
    result += """expected=$expected"""
    result += """messageType=${sanitize(messageType)}"""
    return result.joinToString(prefix = "Packet{", separator = ", ", postfix = "}")
  }

  fun copy(
    packetID: String = this.packetID,
    toMeshID: String = this.toMeshID,
    fromMeshID: String = this.fromMeshID,
    originalFromMeshID: String = this.originalFromMeshID,
    port: Int = this.port,
    offset: Int = this.offset,
    timeToLive: Int = this.timeToLive,
    payload: ByteString = this.payload,
    expected: Int = this.expected,
    messageType: String = this.messageType,
    unknownFields: ByteString = this.unknownFields
  ): Packet = Packet(packetID, toMeshID, fromMeshID, originalFromMeshID, port, offset, timeToLive,
      payload, expected, messageType, unknownFields)

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<Packet> = object : ProtoAdapter<Packet>(
      FieldEncoding.LENGTH_DELIMITED, 
      Packet::class, 
      "type.googleapis.com/ug.hix.hixnet2.models.Packet"
    ) {
      override fun encodedSize(value: Packet): Int = 
        ProtoAdapter.STRING.encodedSizeWithTag(1, value.packetID) +
        ProtoAdapter.STRING.encodedSizeWithTag(2, value.toMeshID) +
        ProtoAdapter.STRING.encodedSizeWithTag(3, value.fromMeshID) +
        ProtoAdapter.STRING.encodedSizeWithTag(4, value.originalFromMeshID) +
        ProtoAdapter.INT32.encodedSizeWithTag(5, value.port) +
        ProtoAdapter.INT32.encodedSizeWithTag(6, value.offset) +
        ProtoAdapter.INT32.encodedSizeWithTag(7, value.timeToLive) +
        ProtoAdapter.BYTES.encodedSizeWithTag(8, value.payload) +
        ProtoAdapter.INT32.encodedSizeWithTag(9, value.expected) +
        ProtoAdapter.STRING.encodedSizeWithTag(10, value.messageType) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: Packet) {
        if (value.packetID != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.packetID)
        if (value.toMeshID != "") ProtoAdapter.STRING.encodeWithTag(writer, 2, value.toMeshID)
        if (value.fromMeshID != "") ProtoAdapter.STRING.encodeWithTag(writer, 3, value.fromMeshID)
        if (value.originalFromMeshID != "") ProtoAdapter.STRING.encodeWithTag(writer, 4,
            value.originalFromMeshID)
        if (value.port != 0) ProtoAdapter.INT32.encodeWithTag(writer, 5, value.port)
        if (value.offset != 0) ProtoAdapter.INT32.encodeWithTag(writer, 6, value.offset)
        if (value.timeToLive != 0) ProtoAdapter.INT32.encodeWithTag(writer, 7, value.timeToLive)
        if (value.payload != ByteString.EMPTY) ProtoAdapter.BYTES.encodeWithTag(writer, 8,
            value.payload)
        if (value.expected != 0) ProtoAdapter.INT32.encodeWithTag(writer, 9, value.expected)
        if (value.messageType != "") ProtoAdapter.STRING.encodeWithTag(writer, 10,
            value.messageType)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): Packet {
        var packetID: String = ""
        var toMeshID: String = ""
        var fromMeshID: String = ""
        var originalFromMeshID: String = ""
        var port: Int = 0
        var offset: Int = 0
        var timeToLive: Int = 0
        var payload: ByteString = ByteString.EMPTY
        var expected: Int = 0
        var messageType: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> packetID = ProtoAdapter.STRING.decode(reader)
            2 -> toMeshID = ProtoAdapter.STRING.decode(reader)
            3 -> fromMeshID = ProtoAdapter.STRING.decode(reader)
            4 -> originalFromMeshID = ProtoAdapter.STRING.decode(reader)
            5 -> port = ProtoAdapter.INT32.decode(reader)
            6 -> offset = ProtoAdapter.INT32.decode(reader)
            7 -> timeToLive = ProtoAdapter.INT32.decode(reader)
            8 -> payload = ProtoAdapter.BYTES.decode(reader)
            9 -> expected = ProtoAdapter.INT32.decode(reader)
            10 -> messageType = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return Packet(
          packetID = packetID,
          toMeshID = toMeshID,
          fromMeshID = fromMeshID,
          originalFromMeshID = originalFromMeshID,
          port = port,
          offset = offset,
          timeToLive = timeToLive,
          payload = payload,
          expected = expected,
          messageType = messageType,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: Packet): Packet = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
