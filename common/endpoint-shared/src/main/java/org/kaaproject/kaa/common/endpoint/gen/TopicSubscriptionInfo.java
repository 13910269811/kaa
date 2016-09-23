/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TopicSubscriptionInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TopicSubscriptionInfo\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"topicInfo\",\"type\":{\"type\":\"record\",\"name\":\"Topic\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"subscriptionType\",\"type\":{\"type\":\"enum\",\"name\":\"SubscriptionType\",\"symbols\":[\"MANDATORY_SUBSCRIPTION\",\"OPTIONAL_SUBSCRIPTION\"]}}],\"direction\":\"in\"}},{\"name\":\"seqNumber\",\"type\":\"int\"}],\"direction\":\"in\"}");
  private org.kaaproject.kaa.common.endpoint.gen.Topic topicInfo;
  private int seqNumber;
  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public TopicSubscriptionInfo() {
  }

  /**
   * All-args constructor.
   */
  public TopicSubscriptionInfo(org.kaaproject.kaa.common.endpoint.gen.Topic topicInfo, java.lang.Integer seqNumber) {
    this.topicInfo = topicInfo;
    this.seqNumber = seqNumber;
  }

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /** Creates a new TopicSubscriptionInfo RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.TopicSubscriptionInfo.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.TopicSubscriptionInfo.Builder();
  }

  /** Creates a new TopicSubscriptionInfo RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.TopicSubscriptionInfo.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.TopicSubscriptionInfo.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.TopicSubscriptionInfo.Builder(other);
  }

  /** Creates a new TopicSubscriptionInfo RecordBuilder by copying an existing TopicSubscriptionInfo instance */
  public static org.kaaproject.kaa.common.endpoint.gen.TopicSubscriptionInfo.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.TopicSubscriptionInfo other) {
    return new org.kaaproject.kaa.common.endpoint.gen.TopicSubscriptionInfo.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return topicInfo;
      case 1:
        return seqNumber;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        topicInfo = (org.kaaproject.kaa.common.endpoint.gen.Topic) value$;
        break;
      case 1:
        seqNumber = (java.lang.Integer) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'topicInfo' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.Topic getTopicInfo() {
    return topicInfo;
  }

  /**
   * Sets the value of the 'topicInfo' field.
   * @param value the value to set.
   */
  public void setTopicInfo(org.kaaproject.kaa.common.endpoint.gen.Topic value) {
    this.topicInfo = value;
  }

  /**
   * Gets the value of the 'seqNumber' field.
   */
  public java.lang.Integer getSeqNumber() {
    return seqNumber;
  }

  /**
   * Sets the value of the 'seqNumber' field.
   * @param value the value to set.
   */
  public void setSeqNumber(java.lang.Integer value) {
    this.seqNumber = value;
  }

  /**
   * RecordBuilder for TopicSubscriptionInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TopicSubscriptionInfo>
      implements org.apache.avro.data.RecordBuilder<TopicSubscriptionInfo> {

    private org.kaaproject.kaa.common.endpoint.gen.Topic topicInfo;
    private int seqNumber;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.TopicSubscriptionInfo.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.TopicSubscriptionInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.topicInfo)) {
        this.topicInfo = data().deepCopy(fields()[0].schema(), other.topicInfo);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.seqNumber)) {
        this.seqNumber = data().deepCopy(fields()[1].schema(), other.seqNumber);
        fieldSetFlags()[1] = true;
      }
    }

    /** Creates a Builder by copying an existing TopicSubscriptionInfo instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.TopicSubscriptionInfo other) {
      super(org.kaaproject.kaa.common.endpoint.gen.TopicSubscriptionInfo.SCHEMA$);
      if (isValidValue(fields()[0], other.topicInfo)) {
        this.topicInfo = data().deepCopy(fields()[0].schema(), other.topicInfo);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.seqNumber)) {
        this.seqNumber = data().deepCopy(fields()[1].schema(), other.seqNumber);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'topicInfo' field */
    public org.kaaproject.kaa.common.endpoint.gen.Topic getTopicInfo() {
      return topicInfo;
    }

    /** Sets the value of the 'topicInfo' field */
    public org.kaaproject.kaa.common.endpoint.gen.TopicSubscriptionInfo.Builder setTopicInfo(org.kaaproject.kaa.common.endpoint.gen.Topic value) {
      validate(fields()[0], value);
      this.topicInfo = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'topicInfo' field has been set */
    public boolean hasTopicInfo() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'topicInfo' field */
    public org.kaaproject.kaa.common.endpoint.gen.TopicSubscriptionInfo.Builder clearTopicInfo() {
      topicInfo = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'seqNumber' field */
    public java.lang.Integer getSeqNumber() {
      return seqNumber;
    }

    /** Sets the value of the 'seqNumber' field */
    public org.kaaproject.kaa.common.endpoint.gen.TopicSubscriptionInfo.Builder setSeqNumber(int value) {
      validate(fields()[1], value);
      this.seqNumber = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'seqNumber' field has been set */
    public boolean hasSeqNumber() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'seqNumber' field */
    public org.kaaproject.kaa.common.endpoint.gen.TopicSubscriptionInfo.Builder clearSeqNumber() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public TopicSubscriptionInfo build() {
      try {
        TopicSubscriptionInfo record = new TopicSubscriptionInfo();
        record.topicInfo = fieldSetFlags()[0] ? this.topicInfo : (org.kaaproject.kaa.common.endpoint.gen.Topic) defaultValue(fields()[0]);
        record.seqNumber = fieldSetFlags()[1] ? this.seqNumber : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
