// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.wrappers



@SerialVersionUID(0L)
final case class DoubleValue(
    value: Double = 0.0
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[DoubleValue] with com.trueaccord.lenses.Updatable[DoubleValue] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (value != 0.0) { __size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, value) }
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
        if (__v != 0.0) {
          output.writeDouble(1, __v)
        }
      };
    }
    def mergeFrom(__input: com.google.protobuf.CodedInputStream): com.google.protobuf.wrappers.DoubleValue = {
      var __value = this.value
      var _done__ = false
      while (!_done__) {
        val _tag__ = __input.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 9 =>
            __value = __input.readDouble()
          case tag => __input.skipField(tag)
        }
      }
      com.google.protobuf.wrappers.DoubleValue(
          value = __value
      )
    }
    def withValue(__v: Double): DoubleValue = copy(value = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = value
          if (__t != 0.0) __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.wrappers.DoubleValue
}

object DoubleValue extends com.trueaccord.scalapb.GeneratedMessageCompanion[DoubleValue] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[DoubleValue] = this
  def fromFieldsMap(__fieldsMap: Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.wrappers.DoubleValue = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.wrappers.DoubleValue(
      __fieldsMap.getOrElse(__fields.get(0), 0.0).asInstanceOf[Double]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = GoogleProtobufWrappersProto.descriptor.getMessageTypes.get(0)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.wrappers.DoubleValue(
  )
  implicit class DoubleValueLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, DoubleValue]) extends com.trueaccord.lenses.ObjectLens[UpperPB, DoubleValue](_l) {
    def value: com.trueaccord.lenses.Lens[UpperPB, Double] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val VALUE_FIELD_NUMBER = 1
}
