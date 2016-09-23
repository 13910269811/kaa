/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BasicUserNotification extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BasicUserNotification\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"notificationBody\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"userNotificationParam\",\"type\":\"int\"}]}");
  private java.lang.String notificationBody;
  private int userNotificationParam;
  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public BasicUserNotification() {
  }

  /**
   * All-args constructor.
   */
  public BasicUserNotification(java.lang.String notificationBody, java.lang.Integer userNotificationParam) {
    this.notificationBody = notificationBody;
    this.userNotificationParam = userNotificationParam;
  }

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /** Creates a new BasicUserNotification RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.BasicUserNotification.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.BasicUserNotification.Builder();
  }

  /** Creates a new BasicUserNotification RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.BasicUserNotification.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.BasicUserNotification.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.BasicUserNotification.Builder(other);
  }

  /** Creates a new BasicUserNotification RecordBuilder by copying an existing BasicUserNotification instance */
  public static org.kaaproject.kaa.common.endpoint.gen.BasicUserNotification.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.BasicUserNotification other) {
    return new org.kaaproject.kaa.common.endpoint.gen.BasicUserNotification.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return notificationBody;
      case 1:
        return userNotificationParam;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        notificationBody = (java.lang.String) value$;
        break;
      case 1:
        userNotificationParam = (java.lang.Integer) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'notificationBody' field.
   */
  public java.lang.String getNotificationBody() {
    return notificationBody;
  }

  /**
   * Sets the value of the 'notificationBody' field.
   * @param value the value to set.
   */
  public void setNotificationBody(java.lang.String value) {
    this.notificationBody = value;
  }

  /**
   * Gets the value of the 'userNotificationParam' field.
   */
  public java.lang.Integer getUserNotificationParam() {
    return userNotificationParam;
  }

  /**
   * Sets the value of the 'userNotificationParam' field.
   * @param value the value to set.
   */
  public void setUserNotificationParam(java.lang.Integer value) {
    this.userNotificationParam = value;
  }

  /**
   * RecordBuilder for BasicUserNotification instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BasicUserNotification>
      implements org.apache.avro.data.RecordBuilder<BasicUserNotification> {

    private java.lang.String notificationBody;
    private int userNotificationParam;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.BasicUserNotification.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.BasicUserNotification.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.notificationBody)) {
        this.notificationBody = data().deepCopy(fields()[0].schema(), other.notificationBody);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userNotificationParam)) {
        this.userNotificationParam = data().deepCopy(fields()[1].schema(), other.userNotificationParam);
        fieldSetFlags()[1] = true;
      }
    }

    /** Creates a Builder by copying an existing BasicUserNotification instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.BasicUserNotification other) {
      super(org.kaaproject.kaa.common.endpoint.gen.BasicUserNotification.SCHEMA$);
      if (isValidValue(fields()[0], other.notificationBody)) {
        this.notificationBody = data().deepCopy(fields()[0].schema(), other.notificationBody);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userNotificationParam)) {
        this.userNotificationParam = data().deepCopy(fields()[1].schema(), other.userNotificationParam);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'notificationBody' field */
    public java.lang.String getNotificationBody() {
      return notificationBody;
    }

    /** Sets the value of the 'notificationBody' field */
    public org.kaaproject.kaa.common.endpoint.gen.BasicUserNotification.Builder setNotificationBody(java.lang.String value) {
      validate(fields()[0], value);
      this.notificationBody = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'notificationBody' field has been set */
    public boolean hasNotificationBody() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'notificationBody' field */
    public org.kaaproject.kaa.common.endpoint.gen.BasicUserNotification.Builder clearNotificationBody() {
      notificationBody = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'userNotificationParam' field */
    public java.lang.Integer getUserNotificationParam() {
      return userNotificationParam;
    }

    /** Sets the value of the 'userNotificationParam' field */
    public org.kaaproject.kaa.common.endpoint.gen.BasicUserNotification.Builder setUserNotificationParam(int value) {
      validate(fields()[1], value);
      this.userNotificationParam = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'userNotificationParam' field has been set */
    public boolean hasUserNotificationParam() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'userNotificationParam' field */
    public org.kaaproject.kaa.common.endpoint.gen.BasicUserNotification.Builder clearUserNotificationParam() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public BasicUserNotification build() {
      try {
        BasicUserNotification record = new BasicUserNotification();
        record.notificationBody = fieldSetFlags()[0] ? this.notificationBody : (java.lang.String) defaultValue(fields()[0]);
        record.userNotificationParam = fieldSetFlags()[1] ? this.userNotificationParam : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
