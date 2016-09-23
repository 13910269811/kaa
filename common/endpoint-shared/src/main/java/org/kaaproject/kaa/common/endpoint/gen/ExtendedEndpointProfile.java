/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ExtendedEndpointProfile extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ExtendedEndpointProfile\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"simpleField\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"recordField\",\"type\":{\"type\":\"record\",\"name\":\"ExtendedEndpointProfileChild\",\"fields\":[{\"name\":\"otherSimpleField\",\"type\":\"int\"},{\"name\":\"stringField\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"otherMapSimpleField\",\"type\":{\"type\":\"map\",\"values\":\"long\",\"avro.java.string\":\"String\"}}]}},{\"name\":\"arraySimpleField\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"arrayRecordField\",\"type\":{\"type\":\"array\",\"items\":\"ExtendedEndpointProfileChild\"}},{\"name\":\"mapSimpleField\",\"type\":{\"type\":\"map\",\"values\":\"long\",\"avro.java.string\":\"String\"}},{\"name\":\"mapRecordField\",\"type\":{\"type\":\"map\",\"values\":\"ExtendedEndpointProfileChild\",\"avro.java.string\":\"String\"}},{\"name\":\"nullableRecordField\",\"type\":[\"ExtendedEndpointProfileChild\",\"null\"]}]}");
  private java.lang.String simpleField;
  private org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild recordField;
  private java.util.List<java.lang.String> arraySimpleField;
  private java.util.List<org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild> arrayRecordField;
  private java.util.Map<java.lang.String, java.lang.Long> mapSimpleField;
  private java.util.Map<java.lang.String, org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild> mapRecordField;
  private org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild nullableRecordField;
  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public ExtendedEndpointProfile() {
  }

  /**
   * All-args constructor.
   */
  public ExtendedEndpointProfile(java.lang.String simpleField, org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild recordField, java.util.List<java.lang.String> arraySimpleField, java.util.List<org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild> arrayRecordField, java.util.Map<java.lang.String, java.lang.Long> mapSimpleField, java.util.Map<java.lang.String, org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild> mapRecordField, org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild nullableRecordField) {
    this.simpleField = simpleField;
    this.recordField = recordField;
    this.arraySimpleField = arraySimpleField;
    this.arrayRecordField = arrayRecordField;
    this.mapSimpleField = mapSimpleField;
    this.mapRecordField = mapRecordField;
    this.nullableRecordField = nullableRecordField;
  }

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /** Creates a new ExtendedEndpointProfile RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder();
  }

  /** Creates a new ExtendedEndpointProfile RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder(other);
  }

  /** Creates a new ExtendedEndpointProfile RecordBuilder by copying an existing ExtendedEndpointProfile instance */
  public static org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile other) {
    return new org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return simpleField;
      case 1:
        return recordField;
      case 2:
        return arraySimpleField;
      case 3:
        return arrayRecordField;
      case 4:
        return mapSimpleField;
      case 5:
        return mapRecordField;
      case 6:
        return nullableRecordField;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        simpleField = (java.lang.String) value$;
        break;
      case 1:
        recordField = (org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild) value$;
        break;
      case 2:
        arraySimpleField = (java.util.List<java.lang.String>) value$;
        break;
      case 3:
        arrayRecordField = (java.util.List<org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild>) value$;
        break;
      case 4:
        mapSimpleField = (java.util.Map<java.lang.String, java.lang.Long>) value$;
        break;
      case 5:
        mapRecordField = (java.util.Map<java.lang.String, org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild>) value$;
        break;
      case 6:
        nullableRecordField = (org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'simpleField' field.
   */
  public java.lang.String getSimpleField() {
    return simpleField;
  }

  /**
   * Sets the value of the 'simpleField' field.
   * @param value the value to set.
   */
  public void setSimpleField(java.lang.String value) {
    this.simpleField = value;
  }

  /**
   * Gets the value of the 'recordField' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild getRecordField() {
    return recordField;
  }

  /**
   * Sets the value of the 'recordField' field.
   * @param value the value to set.
   */
  public void setRecordField(org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild value) {
    this.recordField = value;
  }

  /**
   * Gets the value of the 'arraySimpleField' field.
   */
  public java.util.List<java.lang.String> getArraySimpleField() {
    return arraySimpleField;
  }

  /**
   * Sets the value of the 'arraySimpleField' field.
   * @param value the value to set.
   */
  public void setArraySimpleField(java.util.List<java.lang.String> value) {
    this.arraySimpleField = value;
  }

  /**
   * Gets the value of the 'arrayRecordField' field.
   */
  public java.util.List<org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild> getArrayRecordField() {
    return arrayRecordField;
  }

  /**
   * Sets the value of the 'arrayRecordField' field.
   * @param value the value to set.
   */
  public void setArrayRecordField(java.util.List<org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild> value) {
    this.arrayRecordField = value;
  }

  /**
   * Gets the value of the 'mapSimpleField' field.
   */
  public java.util.Map<java.lang.String, java.lang.Long> getMapSimpleField() {
    return mapSimpleField;
  }

  /**
   * Sets the value of the 'mapSimpleField' field.
   * @param value the value to set.
   */
  public void setMapSimpleField(java.util.Map<java.lang.String, java.lang.Long> value) {
    this.mapSimpleField = value;
  }

  /**
   * Gets the value of the 'mapRecordField' field.
   */
  public java.util.Map<java.lang.String, org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild> getMapRecordField() {
    return mapRecordField;
  }

  /**
   * Sets the value of the 'mapRecordField' field.
   * @param value the value to set.
   */
  public void setMapRecordField(java.util.Map<java.lang.String, org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild> value) {
    this.mapRecordField = value;
  }

  /**
   * Gets the value of the 'nullableRecordField' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild getNullableRecordField() {
    return nullableRecordField;
  }

  /**
   * Sets the value of the 'nullableRecordField' field.
   * @param value the value to set.
   */
  public void setNullableRecordField(org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild value) {
    this.nullableRecordField = value;
  }

  /**
   * RecordBuilder for ExtendedEndpointProfile instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ExtendedEndpointProfile>
      implements org.apache.avro.data.RecordBuilder<ExtendedEndpointProfile> {

    private java.lang.String simpleField;
    private org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild recordField;
    private java.util.List<java.lang.String> arraySimpleField;
    private java.util.List<org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild> arrayRecordField;
    private java.util.Map<java.lang.String, java.lang.Long> mapSimpleField;
    private java.util.Map<java.lang.String, org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild> mapRecordField;
    private org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild nullableRecordField;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.simpleField)) {
        this.simpleField = data().deepCopy(fields()[0].schema(), other.simpleField);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.recordField)) {
        this.recordField = data().deepCopy(fields()[1].schema(), other.recordField);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.arraySimpleField)) {
        this.arraySimpleField = data().deepCopy(fields()[2].schema(), other.arraySimpleField);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.arrayRecordField)) {
        this.arrayRecordField = data().deepCopy(fields()[3].schema(), other.arrayRecordField);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.mapSimpleField)) {
        this.mapSimpleField = data().deepCopy(fields()[4].schema(), other.mapSimpleField);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.mapRecordField)) {
        this.mapRecordField = data().deepCopy(fields()[5].schema(), other.mapRecordField);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.nullableRecordField)) {
        this.nullableRecordField = data().deepCopy(fields()[6].schema(), other.nullableRecordField);
        fieldSetFlags()[6] = true;
      }
    }

    /** Creates a Builder by copying an existing ExtendedEndpointProfile instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile other) {
      super(org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.SCHEMA$);
      if (isValidValue(fields()[0], other.simpleField)) {
        this.simpleField = data().deepCopy(fields()[0].schema(), other.simpleField);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.recordField)) {
        this.recordField = data().deepCopy(fields()[1].schema(), other.recordField);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.arraySimpleField)) {
        this.arraySimpleField = data().deepCopy(fields()[2].schema(), other.arraySimpleField);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.arrayRecordField)) {
        this.arrayRecordField = data().deepCopy(fields()[3].schema(), other.arrayRecordField);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.mapSimpleField)) {
        this.mapSimpleField = data().deepCopy(fields()[4].schema(), other.mapSimpleField);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.mapRecordField)) {
        this.mapRecordField = data().deepCopy(fields()[5].schema(), other.mapRecordField);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.nullableRecordField)) {
        this.nullableRecordField = data().deepCopy(fields()[6].schema(), other.nullableRecordField);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'simpleField' field */
    public java.lang.String getSimpleField() {
      return simpleField;
    }

    /** Sets the value of the 'simpleField' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder setSimpleField(java.lang.String value) {
      validate(fields()[0], value);
      this.simpleField = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'simpleField' field has been set */
    public boolean hasSimpleField() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'simpleField' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder clearSimpleField() {
      simpleField = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'recordField' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild getRecordField() {
      return recordField;
    }

    /** Sets the value of the 'recordField' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder setRecordField(org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild value) {
      validate(fields()[1], value);
      this.recordField = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'recordField' field has been set */
    public boolean hasRecordField() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'recordField' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder clearRecordField() {
      recordField = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'arraySimpleField' field */
    public java.util.List<java.lang.String> getArraySimpleField() {
      return arraySimpleField;
    }

    /** Sets the value of the 'arraySimpleField' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder setArraySimpleField(java.util.List<java.lang.String> value) {
      validate(fields()[2], value);
      this.arraySimpleField = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'arraySimpleField' field has been set */
    public boolean hasArraySimpleField() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'arraySimpleField' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder clearArraySimpleField() {
      arraySimpleField = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'arrayRecordField' field */
    public java.util.List<org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild> getArrayRecordField() {
      return arrayRecordField;
    }

    /** Sets the value of the 'arrayRecordField' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder setArrayRecordField(java.util.List<org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild> value) {
      validate(fields()[3], value);
      this.arrayRecordField = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /** Checks whether the 'arrayRecordField' field has been set */
    public boolean hasArrayRecordField() {
      return fieldSetFlags()[3];
    }

    /** Clears the value of the 'arrayRecordField' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder clearArrayRecordField() {
      arrayRecordField = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'mapSimpleField' field */
    public java.util.Map<java.lang.String, java.lang.Long> getMapSimpleField() {
      return mapSimpleField;
    }

    /** Sets the value of the 'mapSimpleField' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder setMapSimpleField(java.util.Map<java.lang.String, java.lang.Long> value) {
      validate(fields()[4], value);
      this.mapSimpleField = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /** Checks whether the 'mapSimpleField' field has been set */
    public boolean hasMapSimpleField() {
      return fieldSetFlags()[4];
    }

    /** Clears the value of the 'mapSimpleField' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder clearMapSimpleField() {
      mapSimpleField = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'mapRecordField' field */
    public java.util.Map<java.lang.String, org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild> getMapRecordField() {
      return mapRecordField;
    }

    /** Sets the value of the 'mapRecordField' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder setMapRecordField(java.util.Map<java.lang.String, org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild> value) {
      validate(fields()[5], value);
      this.mapRecordField = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /** Checks whether the 'mapRecordField' field has been set */
    public boolean hasMapRecordField() {
      return fieldSetFlags()[5];
    }

    /** Clears the value of the 'mapRecordField' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder clearMapRecordField() {
      mapRecordField = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'nullableRecordField' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild getNullableRecordField() {
      return nullableRecordField;
    }

    /** Sets the value of the 'nullableRecordField' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder setNullableRecordField(org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild value) {
      validate(fields()[6], value);
      this.nullableRecordField = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /** Checks whether the 'nullableRecordField' field has been set */
    public boolean hasNullableRecordField() {
      return fieldSetFlags()[6];
    }

    /** Clears the value of the 'nullableRecordField' field */
    public org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfile.Builder clearNullableRecordField() {
      nullableRecordField = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public ExtendedEndpointProfile build() {
      try {
        ExtendedEndpointProfile record = new ExtendedEndpointProfile();
        record.simpleField = fieldSetFlags()[0] ? this.simpleField : (java.lang.String) defaultValue(fields()[0]);
        record.recordField = fieldSetFlags()[1] ? this.recordField : (org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild) defaultValue(fields()[1]);
        record.arraySimpleField = fieldSetFlags()[2] ? this.arraySimpleField : (java.util.List<java.lang.String>) defaultValue(fields()[2]);
        record.arrayRecordField = fieldSetFlags()[3] ? this.arrayRecordField : (java.util.List<org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild>) defaultValue(fields()[3]);
        record.mapSimpleField = fieldSetFlags()[4] ? this.mapSimpleField : (java.util.Map<java.lang.String, java.lang.Long>) defaultValue(fields()[4]);
        record.mapRecordField = fieldSetFlags()[5] ? this.mapRecordField : (java.util.Map<java.lang.String, org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild>) defaultValue(fields()[5]);
        record.nullableRecordField = fieldSetFlags()[6] ? this.nullableRecordField : (org.kaaproject.kaa.common.endpoint.gen.ExtendedEndpointProfileChild) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
