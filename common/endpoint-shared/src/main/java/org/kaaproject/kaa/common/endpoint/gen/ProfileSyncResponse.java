/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ProfileSyncResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProfileSyncResponse\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"responseStatus\",\"type\":{\"type\":\"enum\",\"name\":\"SyncResponseStatus\",\"symbols\":[\"NO_DELTA\",\"DELTA\",\"RESYNC\"]}}],\"direction\":\"in\"}");
  private org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus responseStatus;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public ProfileSyncResponse() {
  }

  /**
   * All-args constructor.
   */
  public ProfileSyncResponse(org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus responseStatus) {
    this.responseStatus = responseStatus;
  }

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /** Creates a new ProfileSyncResponse RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse.Builder();
  }

  /** Creates a new ProfileSyncResponse RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse.Builder(other);
  }

  /** Creates a new ProfileSyncResponse RecordBuilder by copying an existing ProfileSyncResponse instance */
  public static org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse other) {
    return new org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return responseStatus;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        responseStatus = (org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'responseStatus' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus getResponseStatus() {
    return responseStatus;
  }

  /**
   * Sets the value of the 'responseStatus' field.
   * @param value the value to set.
   */
  public void setResponseStatus(org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus value) {
    this.responseStatus = value;
  }

  /**
   * RecordBuilder for ProfileSyncResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ProfileSyncResponse>
      implements org.apache.avro.data.RecordBuilder<ProfileSyncResponse> {

    private org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus responseStatus;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.responseStatus)) {
        this.responseStatus = data().deepCopy(fields()[0].schema(), other.responseStatus);
        fieldSetFlags()[0] = true;
      }
    }

    /** Creates a Builder by copying an existing ProfileSyncResponse instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse other) {
      super(org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.responseStatus)) {
        this.responseStatus = data().deepCopy(fields()[0].schema(), other.responseStatus);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'responseStatus' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus getResponseStatus() {
      return responseStatus;
    }

    /** Sets the value of the 'responseStatus' field */
    public org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse.Builder setResponseStatus(org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus value) {
      validate(fields()[0], value);
      this.responseStatus = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'responseStatus' field has been set */
    public boolean hasResponseStatus() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'responseStatus' field */
    public org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse.Builder clearResponseStatus() {
      responseStatus = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public ProfileSyncResponse build() {
      try {
        ProfileSyncResponse record = new ProfileSyncResponse();
        record.responseStatus = fieldSetFlags()[0] ? this.responseStatus : (org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
