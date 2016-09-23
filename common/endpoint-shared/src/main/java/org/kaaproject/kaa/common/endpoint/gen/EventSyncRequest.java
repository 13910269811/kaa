/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EventSyncRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EventSyncRequest\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"eventSequenceNumberRequest\",\"type\":[{\"type\":\"record\",\"name\":\"EventSequenceNumberRequest\",\"fields\":[],\"direction\":\"out\"},\"null\"]},{\"name\":\"eventListenersRequests\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"EventListenersRequest\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"eventClassFQNs\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}],\"direction\":\"out\"}},\"null\"]},{\"name\":\"events\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Event\",\"fields\":[{\"name\":\"seqNum\",\"type\":\"int\"},{\"name\":\"eventClassFQN\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"eventData\",\"type\":\"bytes\"},{\"name\":\"source\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"target\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]}]}},\"null\"]}],\"direction\":\"out\"}");
  private org.kaaproject.kaa.common.endpoint.gen.EventSequenceNumberRequest eventSequenceNumberRequest;
  private java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventListenersRequest> eventListenersRequests;
  private java.util.List<org.kaaproject.kaa.common.endpoint.gen.Event> events;
  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public EventSyncRequest() {
  }

  /**
   * All-args constructor.
   */
  public EventSyncRequest(org.kaaproject.kaa.common.endpoint.gen.EventSequenceNumberRequest eventSequenceNumberRequest, java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventListenersRequest> eventListenersRequests, java.util.List<org.kaaproject.kaa.common.endpoint.gen.Event> events) {
    this.eventSequenceNumberRequest = eventSequenceNumberRequest;
    this.eventListenersRequests = eventListenersRequests;
    this.events = events;
  }

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /** Creates a new EventSyncRequest RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest.Builder();
  }

  /** Creates a new EventSyncRequest RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest.Builder(other);
  }

  /** Creates a new EventSyncRequest RecordBuilder by copying an existing EventSyncRequest instance */
  public static org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest other) {
    return new org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return eventSequenceNumberRequest;
      case 1:
        return eventListenersRequests;
      case 2:
        return events;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        eventSequenceNumberRequest = (org.kaaproject.kaa.common.endpoint.gen.EventSequenceNumberRequest) value$;
        break;
      case 1:
        eventListenersRequests = (java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventListenersRequest>) value$;
        break;
      case 2:
        events = (java.util.List<org.kaaproject.kaa.common.endpoint.gen.Event>) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'eventSequenceNumberRequest' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.EventSequenceNumberRequest getEventSequenceNumberRequest() {
    return eventSequenceNumberRequest;
  }

  /**
   * Sets the value of the 'eventSequenceNumberRequest' field.
   * @param value the value to set.
   */
  public void setEventSequenceNumberRequest(org.kaaproject.kaa.common.endpoint.gen.EventSequenceNumberRequest value) {
    this.eventSequenceNumberRequest = value;
  }

  /**
   * Gets the value of the 'eventListenersRequests' field.
   */
  public java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventListenersRequest> getEventListenersRequests() {
    return eventListenersRequests;
  }

  /**
   * Sets the value of the 'eventListenersRequests' field.
   * @param value the value to set.
   */
  public void setEventListenersRequests(java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventListenersRequest> value) {
    this.eventListenersRequests = value;
  }

  /**
   * Gets the value of the 'events' field.
   */
  public java.util.List<org.kaaproject.kaa.common.endpoint.gen.Event> getEvents() {
    return events;
  }

  /**
   * Sets the value of the 'events' field.
   * @param value the value to set.
   */
  public void setEvents(java.util.List<org.kaaproject.kaa.common.endpoint.gen.Event> value) {
    this.events = value;
  }

  /**
   * RecordBuilder for EventSyncRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EventSyncRequest>
      implements org.apache.avro.data.RecordBuilder<EventSyncRequest> {

    private org.kaaproject.kaa.common.endpoint.gen.EventSequenceNumberRequest eventSequenceNumberRequest;
    private java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventListenersRequest> eventListenersRequests;
    private java.util.List<org.kaaproject.kaa.common.endpoint.gen.Event> events;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.eventSequenceNumberRequest)) {
        this.eventSequenceNumberRequest = data().deepCopy(fields()[0].schema(), other.eventSequenceNumberRequest);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.eventListenersRequests)) {
        this.eventListenersRequests = data().deepCopy(fields()[1].schema(), other.eventListenersRequests);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.events)) {
        this.events = data().deepCopy(fields()[2].schema(), other.events);
        fieldSetFlags()[2] = true;
      }
    }

    /** Creates a Builder by copying an existing EventSyncRequest instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest other) {
      super(org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest.SCHEMA$);
      if (isValidValue(fields()[0], other.eventSequenceNumberRequest)) {
        this.eventSequenceNumberRequest = data().deepCopy(fields()[0].schema(), other.eventSequenceNumberRequest);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.eventListenersRequests)) {
        this.eventListenersRequests = data().deepCopy(fields()[1].schema(), other.eventListenersRequests);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.events)) {
        this.events = data().deepCopy(fields()[2].schema(), other.events);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'eventSequenceNumberRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.EventSequenceNumberRequest getEventSequenceNumberRequest() {
      return eventSequenceNumberRequest;
    }

    /** Sets the value of the 'eventSequenceNumberRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest.Builder setEventSequenceNumberRequest(org.kaaproject.kaa.common.endpoint.gen.EventSequenceNumberRequest value) {
      validate(fields()[0], value);
      this.eventSequenceNumberRequest = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'eventSequenceNumberRequest' field has been set */
    public boolean hasEventSequenceNumberRequest() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'eventSequenceNumberRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest.Builder clearEventSequenceNumberRequest() {
      eventSequenceNumberRequest = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'eventListenersRequests' field */
    public java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventListenersRequest> getEventListenersRequests() {
      return eventListenersRequests;
    }

    /** Sets the value of the 'eventListenersRequests' field */
    public org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest.Builder setEventListenersRequests(java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventListenersRequest> value) {
      validate(fields()[1], value);
      this.eventListenersRequests = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'eventListenersRequests' field has been set */
    public boolean hasEventListenersRequests() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'eventListenersRequests' field */
    public org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest.Builder clearEventListenersRequests() {
      eventListenersRequests = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'events' field */
    public java.util.List<org.kaaproject.kaa.common.endpoint.gen.Event> getEvents() {
      return events;
    }

    /** Sets the value of the 'events' field */
    public org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest.Builder setEvents(java.util.List<org.kaaproject.kaa.common.endpoint.gen.Event> value) {
      validate(fields()[2], value);
      this.events = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'events' field has been set */
    public boolean hasEvents() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'events' field */
    public org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest.Builder clearEvents() {
      events = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public EventSyncRequest build() {
      try {
        EventSyncRequest record = new EventSyncRequest();
        record.eventSequenceNumberRequest = fieldSetFlags()[0] ? this.eventSequenceNumberRequest : (org.kaaproject.kaa.common.endpoint.gen.EventSequenceNumberRequest) defaultValue(fields()[0]);
        record.eventListenersRequests = fieldSetFlags()[1] ? this.eventListenersRequests : (java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventListenersRequest>) defaultValue(fields()[1]);
        record.events = fieldSetFlags()[2] ? this.events : (java.util.List<org.kaaproject.kaa.common.endpoint.gen.Event>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
