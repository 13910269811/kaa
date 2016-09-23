/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package org.kaaproject.kaa.server.common.thrift.gen.operations;

import org.apache.thrift.EncodingUtils;
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
public class EventClassFamilyVersion implements org.apache.thrift.TBase<EventClassFamilyVersion, EventClassFamilyVersion._Fields>, java.io.Serializable, Cloneable, Comparable<EventClassFamilyVersion> {
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EventClassFamilyVersion");
  private static final org.apache.thrift.protocol.TField ENDPOINT_CLASS_FAMILY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("endpointClassFamilyId", org.apache.thrift.protocol.TType.STRING, (short) 1);
  private static final org.apache.thrift.protocol.TField ENDPOINT_CLASS_FAMILY_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("endpointClassFamilyVersion", org.apache.thrift.protocol.TType.I32, (short) 2);
  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  // isset id assignments
  private static final int __ENDPOINTCLASSFAMILYVERSION_ISSET_ID = 0;

  static {
    schemes.put(StandardScheme.class, new EventClassFamilyVersionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EventClassFamilyVersionTupleSchemeFactory());
  }

  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ENDPOINT_CLASS_FAMILY_ID, new org.apache.thrift.meta_data.FieldMetaData("endpointClassFamilyId", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING, "endpoint_class_family_id")));
    tmpMap.put(_Fields.ENDPOINT_CLASS_FAMILY_VERSION, new org.apache.thrift.meta_data.FieldMetaData("endpointClassFamilyVersion", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32, "Integer")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EventClassFamilyVersion.class, metaDataMap);
  }

  public String endpointClassFamilyId; // required
  public int endpointClassFamilyVersion; // required
  private byte __isset_bitfield = 0;

  public EventClassFamilyVersion() {
  }

  public EventClassFamilyVersion(
      String endpointClassFamilyId,
      int endpointClassFamilyVersion) {
    this();
    this.endpointClassFamilyId = endpointClassFamilyId;
    this.endpointClassFamilyVersion = endpointClassFamilyVersion;
    setEndpointClassFamilyVersionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EventClassFamilyVersion(EventClassFamilyVersion other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetEndpointClassFamilyId()) {
      this.endpointClassFamilyId = other.endpointClassFamilyId;
    }
    this.endpointClassFamilyVersion = other.endpointClassFamilyVersion;
  }

  public EventClassFamilyVersion deepCopy() {
    return new EventClassFamilyVersion(this);
  }

  @Override
  public void clear() {
    this.endpointClassFamilyId = null;
    setEndpointClassFamilyVersionIsSet(false);
    this.endpointClassFamilyVersion = 0;
  }

  public String getEndpointClassFamilyId() {
    return this.endpointClassFamilyId;
  }

  public EventClassFamilyVersion setEndpointClassFamilyId(String endpointClassFamilyId) {
    this.endpointClassFamilyId = endpointClassFamilyId;
    return this;
  }

  public void unsetEndpointClassFamilyId() {
    this.endpointClassFamilyId = null;
  }

  /** Returns true if field endpointClassFamilyId is set (has been assigned a value) and false otherwise */
  public boolean isSetEndpointClassFamilyId() {
    return this.endpointClassFamilyId != null;
  }

  public void setEndpointClassFamilyIdIsSet(boolean value) {
    if (!value) {
      this.endpointClassFamilyId = null;
    }
  }

  public int getEndpointClassFamilyVersion() {
    return this.endpointClassFamilyVersion;
  }

  public EventClassFamilyVersion setEndpointClassFamilyVersion(int endpointClassFamilyVersion) {
    this.endpointClassFamilyVersion = endpointClassFamilyVersion;
    setEndpointClassFamilyVersionIsSet(true);
    return this;
  }

  public void unsetEndpointClassFamilyVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENDPOINTCLASSFAMILYVERSION_ISSET_ID);
  }

  /** Returns true if field endpointClassFamilyVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetEndpointClassFamilyVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __ENDPOINTCLASSFAMILYVERSION_ISSET_ID);
  }

  public void setEndpointClassFamilyVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENDPOINTCLASSFAMILYVERSION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
      case ENDPOINT_CLASS_FAMILY_ID:
        if (value == null) {
          unsetEndpointClassFamilyId();
        } else {
          setEndpointClassFamilyId((String) value);
        }
        break;

      case ENDPOINT_CLASS_FAMILY_VERSION:
        if (value == null) {
          unsetEndpointClassFamilyVersion();
        } else {
          setEndpointClassFamilyVersion((Integer) value);
        }
        break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
      case ENDPOINT_CLASS_FAMILY_ID:
        return getEndpointClassFamilyId();

      case ENDPOINT_CLASS_FAMILY_VERSION:
        return Integer.valueOf(getEndpointClassFamilyVersion());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
      case ENDPOINT_CLASS_FAMILY_ID:
        return isSetEndpointClassFamilyId();
      case ENDPOINT_CLASS_FAMILY_VERSION:
        return isSetEndpointClassFamilyVersion();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EventClassFamilyVersion)
      return this.equals((EventClassFamilyVersion) that);
    return false;
  }

  public boolean equals(EventClassFamilyVersion that) {
    if (that == null)
      return false;

    boolean this_present_endpointClassFamilyId = true && this.isSetEndpointClassFamilyId();
    boolean that_present_endpointClassFamilyId = true && that.isSetEndpointClassFamilyId();
    if (this_present_endpointClassFamilyId || that_present_endpointClassFamilyId) {
      if (!(this_present_endpointClassFamilyId && that_present_endpointClassFamilyId))
        return false;
      if (!this.endpointClassFamilyId.equals(that.endpointClassFamilyId))
        return false;
    }

    boolean this_present_endpointClassFamilyVersion = true;
    boolean that_present_endpointClassFamilyVersion = true;
    if (this_present_endpointClassFamilyVersion || that_present_endpointClassFamilyVersion) {
      if (!(this_present_endpointClassFamilyVersion && that_present_endpointClassFamilyVersion))
        return false;
      if (this.endpointClassFamilyVersion != that.endpointClassFamilyVersion)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_endpointClassFamilyId = true && (isSetEndpointClassFamilyId());
    list.add(present_endpointClassFamilyId);
    if (present_endpointClassFamilyId)
      list.add(endpointClassFamilyId);

    boolean present_endpointClassFamilyVersion = true;
    list.add(present_endpointClassFamilyVersion);
    if (present_endpointClassFamilyVersion)
      list.add(endpointClassFamilyVersion);

    return list.hashCode();
  }

  @Override
  public int compareTo(EventClassFamilyVersion other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEndpointClassFamilyId()).compareTo(other.isSetEndpointClassFamilyId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndpointClassFamilyId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endpointClassFamilyId, other.endpointClassFamilyId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndpointClassFamilyVersion()).compareTo(other.isSetEndpointClassFamilyVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndpointClassFamilyVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endpointClassFamilyVersion, other.endpointClassFamilyVersion);
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
    StringBuilder sb = new StringBuilder("EventClassFamilyVersion(");
    boolean first = true;

    sb.append("endpointClassFamilyId:");
    if (this.endpointClassFamilyId == null) {
      sb.append("null");
    } else {
      sb.append(this.endpointClassFamilyId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endpointClassFamilyVersion:");
    sb.append(this.endpointClassFamilyVersion);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ENDPOINT_CLASS_FAMILY_ID((short) 1, "endpointClassFamilyId"),
    ENDPOINT_CLASS_FAMILY_VERSION((short) 2, "endpointClassFamilyVersion");

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
        case 1: // ENDPOINT_CLASS_FAMILY_ID
          return ENDPOINT_CLASS_FAMILY_ID;
        case 2: // ENDPOINT_CLASS_FAMILY_VERSION
          return ENDPOINT_CLASS_FAMILY_VERSION;
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

  private static class EventClassFamilyVersionStandardSchemeFactory implements SchemeFactory {
    public EventClassFamilyVersionStandardScheme getScheme() {
      return new EventClassFamilyVersionStandardScheme();
    }
  }

  private static class EventClassFamilyVersionStandardScheme extends StandardScheme<EventClassFamilyVersion> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EventClassFamilyVersion struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true) {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // ENDPOINT_CLASS_FAMILY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.endpointClassFamilyId = iprot.readString();
              struct.setEndpointClassFamilyIdIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ENDPOINT_CLASS_FAMILY_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.endpointClassFamilyVersion = iprot.readI32();
              struct.setEndpointClassFamilyVersionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EventClassFamilyVersion struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.endpointClassFamilyId != null) {
        oprot.writeFieldBegin(ENDPOINT_CLASS_FAMILY_ID_FIELD_DESC);
        oprot.writeString(struct.endpointClassFamilyId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ENDPOINT_CLASS_FAMILY_VERSION_FIELD_DESC);
      oprot.writeI32(struct.endpointClassFamilyVersion);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EventClassFamilyVersionTupleSchemeFactory implements SchemeFactory {
    public EventClassFamilyVersionTupleScheme getScheme() {
      return new EventClassFamilyVersionTupleScheme();
    }
  }

  private static class EventClassFamilyVersionTupleScheme extends TupleScheme<EventClassFamilyVersion> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EventClassFamilyVersion struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEndpointClassFamilyId()) {
        optionals.set(0);
      }
      if (struct.isSetEndpointClassFamilyVersion()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetEndpointClassFamilyId()) {
        oprot.writeString(struct.endpointClassFamilyId);
      }
      if (struct.isSetEndpointClassFamilyVersion()) {
        oprot.writeI32(struct.endpointClassFamilyVersion);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EventClassFamilyVersion struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.endpointClassFamilyId = iprot.readString();
        struct.setEndpointClassFamilyIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.endpointClassFamilyVersion = iprot.readI32();
        struct.setEndpointClassFamilyVersionIsSet(true);
      }
    }
  }

}

