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

class DeviceNode(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val meshID: String = "",
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val multicastAddress: String = "",
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val publicKey: String = "",
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val macAddress: String = "",
  @field:WireField(
    tag = 5,
    adapter = "ug.hix.hixnet2.models.DeviceNode#ADAPTER",
    label = WireField.Label.REPEATED
  )
  val peers: List<DeviceNode> = emptyList(),
  @field:WireField(
    tag = 6,
    adapter = "ug.hix.hixnet2.models.Service#ADAPTER",
    label = WireField.Label.REPEATED
  )
  val services: List<Service> = emptyList(),
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  val Hops: Int = 0,
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  val hasInternetWifi: Boolean = false,
  @field:WireField(
    tag = 9,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val wifi: String = "",
  @field:WireField(
    tag = 10,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val passPhrase: String = "",
  @field:WireField(
    tag = 11,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val version: String = "",
  /**
   * ACTIVE / DISCONNECTED
   */
  @field:WireField(
    tag = 12,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val status: String = "",
  unknownFields: ByteString = ByteString.EMPTY
) : Message<DeviceNode, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing = throw AssertionError()

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is DeviceNode) return false
    return unknownFields == other.unknownFields
        && meshID == other.meshID
        && multicastAddress == other.multicastAddress
        && publicKey == other.publicKey
        && macAddress == other.macAddress
        && peers == other.peers
        && services == other.services
        && Hops == other.Hops
        && hasInternetWifi == other.hasInternetWifi
        && wifi == other.wifi
        && passPhrase == other.passPhrase
        && version == other.version
        && status == other.status
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + meshID.hashCode()
      result = result * 37 + multicastAddress.hashCode()
      result = result * 37 + publicKey.hashCode()
      result = result * 37 + macAddress.hashCode()
      result = result * 37 + peers.hashCode()
      result = result * 37 + services.hashCode()
      result = result * 37 + Hops.hashCode()
      result = result * 37 + hasInternetWifi.hashCode()
      result = result * 37 + wifi.hashCode()
      result = result * 37 + passPhrase.hashCode()
      result = result * 37 + version.hashCode()
      result = result * 37 + status.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """meshID=${sanitize(meshID)}"""
    result += """multicastAddress=${sanitize(multicastAddress)}"""
    result += """publicKey=${sanitize(publicKey)}"""
    result += """macAddress=${sanitize(macAddress)}"""
    if (peers.isNotEmpty()) result += """peers=$peers"""
    if (services.isNotEmpty()) result += """services=$services"""
    result += """Hops=$Hops"""
    result += """hasInternetWifi=$hasInternetWifi"""
    result += """wifi=${sanitize(wifi)}"""
    result += """passPhrase=${sanitize(passPhrase)}"""
    result += """version=${sanitize(version)}"""
    result += """status=${sanitize(status)}"""
    return result.joinToString(prefix = "DeviceNode{", separator = ", ", postfix = "}")
  }

  fun copy(
    meshID: String = this.meshID,
    multicastAddress: String = this.multicastAddress,
    publicKey: String = this.publicKey,
    macAddress: String = this.macAddress,
    peers: List<DeviceNode> = this.peers,
    services: List<Service> = this.services,
    Hops: Int = this.Hops,
    hasInternetWifi: Boolean = this.hasInternetWifi,
    wifi: String = this.wifi,
    passPhrase: String = this.passPhrase,
    version: String = this.version,
    status: String = this.status,
    unknownFields: ByteString = this.unknownFields
  ): DeviceNode = DeviceNode(meshID, multicastAddress, publicKey, macAddress, peers, services, Hops,
      hasInternetWifi, wifi, passPhrase, version, status, unknownFields)

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<DeviceNode> = object : ProtoAdapter<DeviceNode>(
      FieldEncoding.LENGTH_DELIMITED, 
      DeviceNode::class, 
      "type.googleapis.com/ug.hix.hixnet2.models.DeviceNode"
    ) {
      override fun encodedSize(value: DeviceNode): Int = 
        ProtoAdapter.STRING.encodedSizeWithTag(1, value.meshID) +
        ProtoAdapter.STRING.encodedSizeWithTag(2, value.multicastAddress) +
        ProtoAdapter.STRING.encodedSizeWithTag(3, value.publicKey) +
        ProtoAdapter.STRING.encodedSizeWithTag(4, value.macAddress) +
        DeviceNode.ADAPTER.asRepeated().encodedSizeWithTag(5, value.peers) +
        Service.ADAPTER.asRepeated().encodedSizeWithTag(6, value.services) +
        ProtoAdapter.INT32.encodedSizeWithTag(7, value.Hops) +
        ProtoAdapter.BOOL.encodedSizeWithTag(8, value.hasInternetWifi) +
        ProtoAdapter.STRING.encodedSizeWithTag(9, value.wifi) +
        ProtoAdapter.STRING.encodedSizeWithTag(10, value.passPhrase) +
        ProtoAdapter.STRING.encodedSizeWithTag(11, value.version) +
        ProtoAdapter.STRING.encodedSizeWithTag(12, value.status) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: DeviceNode) {
        if (value.meshID != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.meshID)
        if (value.multicastAddress != "") ProtoAdapter.STRING.encodeWithTag(writer, 2,
            value.multicastAddress)
        if (value.publicKey != "") ProtoAdapter.STRING.encodeWithTag(writer, 3, value.publicKey)
        if (value.macAddress != "") ProtoAdapter.STRING.encodeWithTag(writer, 4, value.macAddress)
        DeviceNode.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.peers)
        Service.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.services)
        if (value.Hops != 0) ProtoAdapter.INT32.encodeWithTag(writer, 7, value.Hops)
        if (value.hasInternetWifi != false) ProtoAdapter.BOOL.encodeWithTag(writer, 8,
            value.hasInternetWifi)
        if (value.wifi != "") ProtoAdapter.STRING.encodeWithTag(writer, 9, value.wifi)
        if (value.passPhrase != "") ProtoAdapter.STRING.encodeWithTag(writer, 10, value.passPhrase)
        if (value.version != "") ProtoAdapter.STRING.encodeWithTag(writer, 11, value.version)
        if (value.status != "") ProtoAdapter.STRING.encodeWithTag(writer, 12, value.status)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): DeviceNode {
        var meshID: String = ""
        var multicastAddress: String = ""
        var publicKey: String = ""
        var macAddress: String = ""
        val peers = mutableListOf<DeviceNode>()
        val services = mutableListOf<Service>()
        var Hops: Int = 0
        var hasInternetWifi: Boolean = false
        var wifi: String = ""
        var passPhrase: String = ""
        var version: String = ""
        var status: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> meshID = ProtoAdapter.STRING.decode(reader)
            2 -> multicastAddress = ProtoAdapter.STRING.decode(reader)
            3 -> publicKey = ProtoAdapter.STRING.decode(reader)
            4 -> macAddress = ProtoAdapter.STRING.decode(reader)
            5 -> peers.add(DeviceNode.ADAPTER.decode(reader))
            6 -> services.add(Service.ADAPTER.decode(reader))
            7 -> Hops = ProtoAdapter.INT32.decode(reader)
            8 -> hasInternetWifi = ProtoAdapter.BOOL.decode(reader)
            9 -> wifi = ProtoAdapter.STRING.decode(reader)
            10 -> passPhrase = ProtoAdapter.STRING.decode(reader)
            11 -> version = ProtoAdapter.STRING.decode(reader)
            12 -> status = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return DeviceNode(
          meshID = meshID,
          multicastAddress = multicastAddress,
          publicKey = publicKey,
          macAddress = macAddress,
          peers = peers,
          services = services,
          Hops = Hops,
          hasInternetWifi = hasInternetWifi,
          wifi = wifi,
          passPhrase = passPhrase,
          version = version,
          status = status,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: DeviceNode): DeviceNode = value.copy(
        peers = value.peers.redactElements(DeviceNode.ADAPTER),
        services = value.services.redactElements(Service.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
