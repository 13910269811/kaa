/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class UserAttachResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserAttachResponse\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"result\",\"type\":{\"type\":\"enum\",\"name\":\"SyncResponseResultType\",\"symbols\":[\"SUCCESS\",\"FAILURE\",\"PROFILE_RESYNC\",\"REDIRECT\"]}},{\"name\":\"errorCode\",\"type\":[{\"type\":\"enum\",\"name\":\"UserAttachErrorCode\",\"symbols\":[\"NO_VERIFIER_CONFIGURED\",\"TOKEN_INVALID\",\"TOKEN_EXPIRED\",\"INTERNAL_ERROR\",\"CONNECTION_ERROR\",\"REMOTE_ERROR\",\"OTHER\"]},\"null\"]},{\"name\":\"errorReason\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]}],\"direction\":\"in\"}");
  private org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType result;
  private org.kaaproject.kaa.common.endpoint.gen.UserAttachErrorCode errorCode;
  private java.lang.String errorReason;
  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public UserAttachResponse() {
  }

  /**
   * All-args constructor.
   */
  public UserAttachResponse(org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType result, org.kaaproject.kaa.common.endpoint.gen.UserAttachErrorCode errorCode, java.lang.String errorReason) {
    this.result = result;
    this.errorCode = errorCode;
    this.errorReason = errorReason;
  }

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /** Creates a new UserAttachResponse RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse.Builder();
  }

  /** Creates a new UserAttachResponse RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse.Builder(other);
  }

  /** Creates a new UserAttachResponse RecordBuilder by copying an existing UserAttachResponse instance */
  public static org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse other) {
    return new org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return result;
      case 1:
        return errorCode;
      case 2:
        return errorReason;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        result = (org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType) value$;
        break;
      case 1:
        errorCode = (org.kaaproject.kaa.common.endpoint.gen.UserAttachErrorCode) value$;
        break;
      case 2:
        errorReason = (java.lang.String) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'result' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType getResult() {
    return result;
  }

  /**
   * Sets the value of the 'result' field.
   * @param value the value to set.
   */
  public void setResult(org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType value) {
    this.result = value;
  }

  /**
   * Gets the value of the 'errorCode' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.UserAttachErrorCode getErrorCode() {
    return errorCode;
  }

  /**
   * Sets the value of the 'errorCode' field.
   * @param value the value to set.
   */
  public void setErrorCode(org.kaaproject.kaa.common.endpoint.gen.UserAttachErrorCode value) {
    this.errorCode = value;
  }

  /**
   * Gets the value of the 'errorReason' field.
   */
  public java.lang.String getErrorReason() {
    return errorReason;
  }

  /**
   * Sets the value of the 'errorReason' field.
   * @param value the value to set.
   */
  public void setErrorReason(java.lang.String value) {
    this.errorReason = value;
  }

  /**
   * RecordBuilder for UserAttachResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserAttachResponse>
      implements org.apache.avro.data.RecordBuilder<UserAttachResponse> {

    private org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType result;
    private org.kaaproject.kaa.common.endpoint.gen.UserAttachErrorCode errorCode;
    private java.lang.String errorReason;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.result)) {
        this.result = data().deepCopy(fields()[0].schema(), other.result);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.errorCode)) {
        this.errorCode = data().deepCopy(fields()[1].schema(), other.errorCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.errorReason)) {
        this.errorReason = data().deepCopy(fields()[2].schema(), other.errorReason);
        fieldSetFlags()[2] = true;
      }
    }

    /** Creates a Builder by copying an existing UserAttachResponse instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse other) {
      super(org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.result)) {
        this.result = data().deepCopy(fields()[0].schema(), other.result);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.errorCode)) {
        this.errorCode = data().deepCopy(fields()[1].schema(), other.errorCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.errorReason)) {
        this.errorReason = data().deepCopy(fields()[2].schema(), other.errorReason);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'result' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType getResult() {
      return result;
    }

    /** Sets the value of the 'result' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse.Builder setResult(org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType value) {
      validate(fields()[0], value);
      this.result = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'result' field has been set */
    public boolean hasResult() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'result' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse.Builder clearResult() {
      result = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'errorCode' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserAttachErrorCode getErrorCode() {
      return errorCode;
    }

    /** Sets the value of the 'errorCode' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse.Builder setErrorCode(org.kaaproject.kaa.common.endpoint.gen.UserAttachErrorCode value) {
      validate(fields()[1], value);
      this.errorCode = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'errorCode' field has been set */
    public boolean hasErrorCode() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'errorCode' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse.Builder clearErrorCode() {
      errorCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'errorReason' field */
    public java.lang.String getErrorReason() {
      return errorReason;
    }

    /** Sets the value of the 'errorReason' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse.Builder setErrorReason(java.lang.String value) {
      validate(fields()[2], value);
      this.errorReason = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'errorReason' field has been set */
    public boolean hasErrorReason() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'errorReason' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse.Builder clearErrorReason() {
      errorReason = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public UserAttachResponse build() {
      try {
        UserAttachResponse record = new UserAttachResponse();
        record.result = fieldSetFlags()[0] ? this.result : (org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType) defaultValue(fields()[0]);
        record.errorCode = fieldSetFlags()[1] ? this.errorCode : (org.kaaproject.kaa.common.endpoint.gen.UserAttachErrorCode) defaultValue(fields()[1]);
        record.errorReason = fieldSetFlags()[2] ? this.errorReason : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
