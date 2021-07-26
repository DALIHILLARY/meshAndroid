// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: device.proto
package ug.hix.hixnet2.models

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.WireField
import com.squareup.wire.internal.redactElements
import com.squareup.wire.internal.sanitize
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Nothing
import kotlin.String
import kotlin.collections.List
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

class ListPFileName(
  @field:WireField(
    tag = 1,
    adapter = "ug.hix.hixnet2.models.PFileName#ADAPTER",
    label = WireField.Label.REPEATED
  )
  val data: List<PFileName> = emptyList(),
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val type: String = "",
  unknownFields: ByteString = ByteString.EMPTY
) : Message<ListPFileName, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing = throw AssertionError()

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ListPFileName) return false
    return unknownFields == other.unknownFields
        && data == other.data
        && type == other.type
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + data.hashCode()
      result = result * 37 + type.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (data.isNotEmpty()) result += """data=$data"""
    result += """type=${sanitize(type)}"""
    return result.joinToString(prefix = "ListPFileName{", separator = ", ", postfix = "}")
  }

  fun copy(
    data: List<PFileName> = this.data,
    type: String = this.type,
    unknownFields: ByteString = this.unknownFields
  ): ListPFileName = ListPFileName(data, type, unknownFields)

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<ListPFileName> = object : ProtoAdapter<ListPFileName>(
      FieldEncoding.LENGTH_DELIMITED, 
      ListPFileName::class, 
      "type.googleapis.com/ug.hix.hixnet2.models.ListPFileName"
    ) {
      override fun encodedSize(value: ListPFileName): Int = 
        PFileName.ADAPTER.asRepeated().encodedSizeWithTag(1, value.data) +
        ProtoAdapter.STRING.encodedSizeWithTag(2, value.type) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: ListPFileName) {
        PFileName.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.data)
        if (value.type != "") ProtoAdapter.STRING.encodeWithTag(writer, 2, value.type)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): ListPFileName {
        val data = mutableListOf<PFileName>()
        var type: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> data.add(PFileName.ADAPTER.decode(reader))
            2 -> type = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return ListPFileName(
          data = data,
          type = type,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: ListPFileName): ListPFileName = value.copy(
        data = value.data.redactElements(PFileName.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
