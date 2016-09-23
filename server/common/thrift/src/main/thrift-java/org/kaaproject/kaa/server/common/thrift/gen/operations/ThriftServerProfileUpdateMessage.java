/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package org.kaaproject.kaa.server.common.thrift.gen.operations;

import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-4-19")
public class ThriftServerProfileUpdateMessage implements org.apache.thrift.TBase<ThriftServerProfileUpdateMessage, ThriftServerProfileUpdateMessage._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftServerProfileUpdateMessage> {
  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftServerProfileUpdateMessage");
  private static final org.apache.thrift.protocol.TField ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("address", org.apache.thrift.protocol.TType.STRUCT, (short) 1);
  private static final org.apache.thrift.protocol.TField ACTOR_CLASSIFIER_FIELD_DESC = new org.apache.thrift.protocol.TField("actorClassifier", org.apache.thrift.protocol.TType.I32, (short) 2);
  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

  static {
    schemes.put(StandardScheme.class, new ThriftServerProfileUpdateMessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftServerProfileUpdateMessageTupleSchemeFactory());
  }

  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("address", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftEntityAddress.class)));
    tmpMap.put(_Fields.ACTOR_CLASSIFIER, new org.apache.thrift.meta_data.FieldMetaData("actorClassifier", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ThriftActorClassifier.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftServerProfileUpdateMessage.class, metaDataMap);
  }

  public ThriftEntityAddress address; // required
  /**
   *
   * @see ThriftActorClassifier
   */
  public ThriftActorClassifier actorClassifier; // required

  public ThriftServerProfileUpdateMessage() {
  }

  public ThriftServerProfileUpdateMessage(
      ThriftEntityAddress address,
      ThriftActorClassifier actorClassifier) {
    this();
    this.address = address;
    this.actorClassifier = actorClassifier;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftServerProfileUpdateMessage(ThriftServerProfileUpdateMessage other) {
    if (other.isSetAddress()) {
      this.address = new ThriftEntityAddress(other.address);
    }
    if (other.isSetActorClassifier()) {
      this.actorClassifier = other.actorClassifier;
    }
  }

  public ThriftServerProfileUpdateMessage deepCopy() {
    return new ThriftServerProfileUpdateMessage(this);
  }

  @Override
  public void clear() {
    this.address = null;
    this.actorClassifier = null;
  }

  public ThriftEntityAddress getAddress() {
    return this.address;
  }

  public ThriftServerProfileUpdateMessage setAddress(ThriftEntityAddress address) {
    this.address = address;
    return this;
  }

  public void unsetAddress() {
    this.address = null;
  }

  /** Returns true if field address is set (has been assigned a value) and false otherwise */
  public boolean isSetAddress() {
    return this.address != null;
  }

  public void setAddressIsSet(boolean value) {
    if (!value) {
      this.address = null;
    }
  }

  /**
   *
   * @see ThriftActorClassifier
   */
  public ThriftActorClassifier getActorClassifier() {
    return this.actorClassifier;
  }

  /**
   *
   * @see ThriftActorClassifier
   */
  public ThriftServerProfileUpdateMessage setActorClassifier(ThriftActorClassifier actorClassifier) {
    this.actorClassifier = actorClassifier;
    return this;
  }

  public void unsetActorClassifier() {
    this.actorClassifier = null;
  }

  /** Returns true if field actorClassifier is set (has been assigned a value) and false otherwise */
  public boolean isSetActorClassifier() {
    return this.actorClassifier != null;
  }

  public void setActorClassifierIsSet(boolean value) {
    if (!value) {
      this.actorClassifier = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
      case ADDRESS:
        if (value == null) {
          unsetAddress();
        } else {
          setAddress((ThriftEntityAddress) value);
        }
        break;

      case ACTOR_CLASSIFIER:
        if (value == null) {
          unsetActorClassifier();
        } else {
          setActorClassifier((ThriftActorClassifier) value);
        }
        break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
      case ADDRESS:
        return getAddress();

      case ACTOR_CLASSIFIER:
        return getActorClassifier();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
      case ADDRESS:
        return isSetAddress();
      case ACTOR_CLASSIFIER:
        return isSetActorClassifier();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftServerProfileUpdateMessage)
      return this.equals((ThriftServerProfileUpdateMessage) that);
    return false;
  }

  public boolean equals(ThriftServerProfileUpdateMessage that) {
    if (that == null)
      return false;

    boolean this_present_address = true && this.isSetAddress();
    boolean that_present_address = true && that.isSetAddress();
    if (this_present_address || that_present_address) {
      if (!(this_present_address && that_present_address))
        return false;
      if (!this.address.equals(that.address))
        return false;
    }

    boolean this_present_actorClassifier = true && this.isSetActorClassifier();
    boolean that_present_actorClassifier = true && that.isSetActorClassifier();
    if (this_present_actorClassifier || that_present_actorClassifier) {
      if (!(this_present_actorClassifier && that_present_actorClassifier))
        return false;
      if (!this.actorClassifier.equals(that.actorClassifier))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_address = true && (isSetAddress());
    list.add(present_address);
    if (present_address)
      list.add(address);

    boolean present_actorClassifier = true && (isSetActorClassifier());
    list.add(present_actorClassifier);
    if (present_actorClassifier)
      list.add(actorClassifier.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(ThriftServerProfileUpdateMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAddress()).compareTo(other.isSetAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.address, other.address);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetActorClassifier()).compareTo(other.isSetActorClassifier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActorClassifier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.actorClassifier, other.actorClassifier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftServerProfileUpdateMessage(");
    boolean first = true;

    sb.append("address:");
    if (this.address == null) {
      sb.append("null");
    } else {
      sb.append(this.address);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("actorClassifier:");
    if (this.actorClassifier == null) {
      sb.append("null");
    } else {
      sb.append(this.actorClassifier);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (address != null) {
      address.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ADDRESS((short) 1, "address"),
    /**
     *
     * @see ThriftActorClassifier
     */
    ACTOR_CLASSIFIER((short) 2, "actorClassifier");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch (fieldId) {
        case 1: // ADDRESS
          return ADDRESS;
        case 2: // ACTOR_CLASSIFIER
          return ACTOR_CLASSIFIER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null)
        throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  private static class ThriftServerProfileUpdateMessageStandardSchemeFactory implements SchemeFactory {
    public ThriftServerProfileUpdateMessageStandardScheme getScheme() {
      return new ThriftServerProfileUpdateMessageStandardScheme();
    }
  }

  private static class ThriftServerProfileUpdateMessageStandardScheme extends StandardScheme<ThriftServerProfileUpdateMessage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftServerProfileUpdateMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true) {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.address = new ThriftEntityAddress();
              struct.address.read(iprot);
              struct.setAddressIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACTOR_CLASSIFIER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.actorClassifier = org.kaaproject.kaa.server.common.thrift.gen.operations.ThriftActorClassifier.findByValue(iprot.readI32());
              struct.setActorClassifierIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftServerProfileUpdateMessage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.address != null) {
        oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
        struct.address.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.actorClassifier != null) {
        oprot.writeFieldBegin(ACTOR_CLASSIFIER_FIELD_DESC);
        oprot.writeI32(struct.actorClassifier.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftServerProfileUpdateMessageTupleSchemeFactory implements SchemeFactory {
    public ThriftServerProfileUpdateMessageTupleScheme getScheme() {
      return new ThriftServerProfileUpdateMessageTupleScheme();
    }
  }

  private static class ThriftServerProfileUpdateMessageTupleScheme extends TupleScheme<ThriftServerProfileUpdateMessage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftServerProfileUpdateMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAddress()) {
        optionals.set(0);
      }
      if (struct.isSetActorClassifier()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAddress()) {
        struct.address.write(oprot);
      }
      if (struct.isSetActorClassifier()) {
        oprot.writeI32(struct.actorClassifier.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftServerProfileUpdateMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.address = new ThriftEntityAddress();
        struct.address.read(iprot);
        struct.setAddressIsSet(true);
      }
      if (incoming.get(1)) {
        struct.actorClassifier = org.kaaproject.kaa.server.common.thrift.gen.operations.ThriftActorClassifier.findByValue(iprot.readI32());
        struct.setActorClassifierIsSet(true);
      }
    }
  }

}

