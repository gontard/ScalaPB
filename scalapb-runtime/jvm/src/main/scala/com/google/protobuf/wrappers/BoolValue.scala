// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.wrappers

import scala.collection.JavaConversions._

@SerialVersionUID(0L)
final case class BoolValue(
    value: Boolean = false
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[BoolValue] with com.trueaccord.lenses.Updatable[BoolValue] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (value != false) { __size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, value) }
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
        if (__v != false) {
          output.writeBool(1, __v)
        }
      };
    }
    def mergeFrom(__input: com.google.protobuf.CodedInputStream): com.google.protobuf.wrappers.BoolValue = {
      var __value = this.value
      var _done__ = false
      while (!_done__) {
        val _tag__ = __input.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __value = __input.readBool()
          case tag => __input.skipField(tag)
        }
      }
      com.google.protobuf.wrappers.BoolValue(
          value = __value
      )
    }
    def withValue(__v: Boolean): BoolValue = copy(value = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = value
          if (__t != false) __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.wrappers.BoolValue
}

object BoolValue extends com.trueaccord.scalapb.GeneratedMessageCompanion[BoolValue] with com.trueaccord.scalapb.JavaProtoSupport[BoolValue, com.google.protobuf.BoolValue] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[BoolValue] with com.trueaccord.scalapb.JavaProtoSupport[BoolValue, com.google.protobuf.BoolValue] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.wrappers.BoolValue): com.google.protobuf.BoolValue = {
    val javaPbOut = com.google.protobuf.BoolValue.newBuilder
    javaPbOut.setValue(scalaPbSource.value)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.BoolValue): com.google.protobuf.wrappers.BoolValue = com.google.protobuf.wrappers.BoolValue(
    value = javaPbSource.getValue.booleanValue
  )
  def fromFieldsMap(__fieldsMap: Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.wrappers.BoolValue = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.wrappers.BoolValue(
      __fieldsMap.getOrElse(__fields.get(0), false).asInstanceOf[Boolean]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = GoogleProtobufWrappersProto.descriptor.getMessageTypes.get(6)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.wrappers.BoolValue(
  )
  implicit class BoolValueLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, BoolValue]) extends com.trueaccord.lenses.ObjectLens[UpperPB, BoolValue](_l) {
    def value: com.trueaccord.lenses.Lens[UpperPB, Boolean] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val VALUE_FIELD_NUMBER = 1
}
