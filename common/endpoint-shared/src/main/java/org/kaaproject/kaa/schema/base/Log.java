/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.schema.base;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Log extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Log\",\"namespace\":\"org.kaaproject.kaa.schema.base\",\"fields\":[]}");

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /** Creates a new Log RecordBuilder */
  public static org.kaaproject.kaa.schema.base.Log.Builder newBuilder() {
    return new org.kaaproject.kaa.schema.base.Log.Builder();
  }

  /** Creates a new Log RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.schema.base.Log.Builder newBuilder(org.kaaproject.kaa.schema.base.Log.Builder other) {
    return new org.kaaproject.kaa.schema.base.Log.Builder(other);
  }

  /** Creates a new Log RecordBuilder by copying an existing Log instance */
  public static org.kaaproject.kaa.schema.base.Log.Builder newBuilder(org.kaaproject.kaa.schema.base.Log other) {
    return new org.kaaproject.kaa.schema.base.Log.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * RecordBuilder for Log instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Log>
      implements org.apache.avro.data.RecordBuilder<Log> {


    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.schema.base.Log.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.schema.base.Log.Builder other) {
      super(other);
    }

    /** Creates a Builder by copying an existing Log instance */
    private Builder(org.kaaproject.kaa.schema.base.Log other) {
      super(org.kaaproject.kaa.schema.base.Log.SCHEMA$);
    }

    @Override
    public Log build() {
      try {
        Log record = new Log();
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
