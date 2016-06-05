// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.wrappers

import scala.collection.JavaConversions._

@SerialVersionUID(0L)
final case class BytesValue(
    value: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[BytesValue] with com.trueaccord.lenses.Updatable[BytesValue] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (value != com.google.protobuf.ByteString.EMPTY) { __size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, value) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(output: com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = value
        if (__v != com.google.protobuf.ByteString.EMPTY) {
          output.writeBytes(1, __v)
        }
      };
    }
    def mergeFrom(__input: com.google.protobuf.CodedInputStream): com.google.protobuf.wrappers.BytesValue = {
      var __value = this.value
      var _done__ = false
      while (!_done__) {
        val _tag__ = __input.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __value = __input.readBytes()
          case tag => __input.skipField(tag)
        }
      }
      com.google.protobuf.wrappers.BytesValue(
          value = __value
      )
    }
    def withValue(__v: com.google.protobuf.ByteString): BytesValue = copy(value = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = value
          if (__t != com.google.protobuf.ByteString.EMPTY) __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.wrappers.BytesValue
}

object BytesValue extends com.trueaccord.scalapb.GeneratedMessageCompanion[BytesValue] with com.trueaccord.scalapb.JavaProtoSupport[BytesValue, com.google.protobuf.BytesValue] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[BytesValue] with com.trueaccord.scalapb.JavaProtoSupport[BytesValue, com.google.protobuf.BytesValue] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.wrappers.BytesValue): com.google.protobuf.BytesValue = {
    val javaPbOut = com.google.protobuf.BytesValue.newBuilder
    javaPbOut.setValue(scalaPbSource.value)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.BytesValue): com.google.protobuf.wrappers.BytesValue = com.google.protobuf.wrappers.BytesValue(
    value = javaPbSource.getValue
  )
  def fromFieldsMap(__fieldsMap: Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.wrappers.BytesValue = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.wrappers.BytesValue(
      __fieldsMap.getOrElse(__fields.get(0), com.google.protobuf.ByteString.EMPTY).asInstanceOf[com.google.protobuf.ByteString]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = GoogleProtobufWrappersProto.descriptor.getMessageTypes.get(8)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.wrappers.BytesValue(
  )
  implicit class BytesValueLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, BytesValue]) extends com.trueaccord.lenses.ObjectLens[UpperPB, BytesValue](_l) {
    def value: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.ByteString] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val VALUE_FIELD_NUMBER = 1
}
