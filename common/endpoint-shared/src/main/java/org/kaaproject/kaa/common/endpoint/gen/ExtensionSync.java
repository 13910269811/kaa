/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ExtensionSync extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ExtensionSync\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"extensionId\",\"type\":\"int\"},{\"name\":\"payload\",\"type\":\"bytes\"}]}");
  private int extensionId;
  private java.nio.ByteBuffer payload;
  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public ExtensionSync() {
  }

  /**
   * All-args constructor.
   */
  public ExtensionSync(java.lang.Integer extensionId, java.nio.ByteBuffer payload) {
    this.extensionId = extensionId;
    this.payload = payload;
  }

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /** Creates a new ExtensionSync RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.ExtensionSync.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.ExtensionSync.Builder();
  }

  /** Creates a new ExtensionSync RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.ExtensionSync.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.ExtensionSync.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.ExtensionSync.Builder(other);
  }

  /** Creates a new ExtensionSync RecordBuilder by copying an existing ExtensionSync instance */
  public static org.kaaproject.kaa.common.endpoint.gen.ExtensionSync.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.ExtensionSync other) {
    return new org.kaaproject.kaa.common.endpoint.gen.ExtensionSync.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return extensionId;
      case 1:
        return payload;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        extensionId = (java.lang.Integer) value$;
        break;
      case 1:
        payload = (java.nio.ByteBuffer) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'extensionId' field.
   */
  public java.lang.Integer getExtensionId() {
    return extensionId;
  }

  /**
   * Sets the value of the 'extensionId' field.
   * @param value the value to set.
   */
  public void setExtensionId(java.lang.Integer value) {
    this.extensionId = value;
  }

  /**
   * Gets the value of the 'payload' field.
   */
  public java.nio.ByteBuffer getPayload() {
    return payload;
  }

  /**
   * Sets the value of the 'payload' field.
   * @param value the value to set.
   */
  public void setPayload(java.nio.ByteBuffer value) {
    this.payload = value;
  }

  /**
   * RecordBuilder for ExtensionSync instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ExtensionSync>
      implements org.apache.avro.data.RecordBuilder<ExtensionSync> {

    private int extensionId;
    private java.nio.ByteBuffer payload;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.ExtensionSync.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.ExtensionSync.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.extensionId)) {
        this.extensionId = data().deepCopy(fields()[0].schema(), other.extensionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.payload)) {
        this.payload = data().deepCopy(fields()[1].schema(), other.payload);
        fieldSetFlags()[1] = true;
      }
    }

    /** Creates a Builder by copying an existing ExtensionSync instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.ExtensionSync other) {
      super(org.kaaproject.kaa.common.endpoint.gen.ExtensionSync.SCHEMA$);
      if (isValidValue(fields()[0], other.extensionId)) {
        this.extensionId = data().deepCopy(fields()[0].schema(), other.extensionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.payload)) {
        this.payload = data().deepCopy(fields()[1].schema(), other.payload);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'extensionId' field */
    public java.lang.Integer getExtensionId() {
      return extensionId;
    }

    /** Sets the value of the 'extensionId' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtensionSync.Builder setExtensionId(int value) {
      validate(fields()[0], value);
      this.extensionId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'extensionId' field has been set */
    public boolean hasExtensionId() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'extensionId' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtensionSync.Builder clearExtensionId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'payload' field */
    public java.nio.ByteBuffer getPayload() {
      return payload;
    }

    /** Sets the value of the 'payload' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtensionSync.Builder setPayload(java.nio.ByteBuffer value) {
      validate(fields()[1], value);
      this.payload = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'payload' field has been set */
    public boolean hasPayload() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'payload' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtensionSync.Builder clearPayload() {
      payload = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public ExtensionSync build() {
      try {
        ExtensionSync record = new ExtensionSync();
        record.extensionId = fieldSetFlags()[0] ? this.extensionId : (java.lang.Integer) defaultValue(fields()[0]);
        record.payload = fieldSetFlags()[1] ? this.payload : (java.nio.ByteBuffer) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
