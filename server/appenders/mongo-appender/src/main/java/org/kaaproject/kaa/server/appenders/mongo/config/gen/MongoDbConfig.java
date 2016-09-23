/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.appenders.mongo.config.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class MongoDbConfig extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MongoDbConfig\",\"namespace\":\"org.kaaproject.kaa.server.appenders.mongo.config.gen\",\"fields\":[{\"name\":\"mongoServers\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"MongoDbServer\",\"fields\":[{\"name\":\"host\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Host\",\"weight\":0.75,\"by_default\":\"localhost\"},{\"name\":\"port\",\"type\":\"int\",\"displayName\":\"Port\",\"weight\":0.25,\"by_default\":27017}]}},\"displayName\":\"MongoDB nodes\",\"minRowCount\":1},{\"name\":\"mongoCredentials\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"MongoDBCredential\",\"fields\":[{\"name\":\"user\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"User\",\"weight\":0.5,\"by_default\":\"user\"},{\"name\":\"password\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Password\",\"weight\":0.5,\"by_default\":\"password\"}]}},\"displayName\":\"Authentication credentials\",\"minRowCount\":0},{\"name\":\"dbName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"MongoDB database name\",\"by_default\":\"kaa\"},{\"name\":\"connectionsPerHost\",\"type\":[\"int\",\"null\"],\"displayName\":\"Max connections per host\",\"by_default\":30},{\"name\":\"maxWaitTime\",\"type\":[\"int\",\"null\"],\"displayName\":\"Max wait time (ms)\",\"by_default\":120000},{\"name\":\"connectionTimeout\",\"type\":[\"int\",\"null\"],\"displayName\":\"Connection timeout (ms)\",\"by_default\":5000},{\"name\":\"socketTimeout\",\"type\":[\"int\",\"null\"],\"displayName\":\"Socket timeout (ms)\",\"by_default\":0},{\"name\":\"socketKeepalive\",\"type\":[\"boolean\",\"null\"],\"displayName\":\"Turn on socket keepalive\",\"by_default\":false},{\"name\":\"includeClientProfile\",\"type\":[\"boolean\",\"null\"],\"displayName\":\"Include client profile data\",\"by_default\":false},{\"name\":\"includeServerProfile\",\"type\":[\"boolean\",\"null\"],\"displayName\":\"Include server profile data\",\"by_default\":false}]}");
  private java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbServer> mongoServers;
  private java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDBCredential> mongoCredentials;
  private java.lang.String dbName;
  private java.lang.Integer connectionsPerHost;
  private java.lang.Integer maxWaitTime;
  private java.lang.Integer connectionTimeout;
  private java.lang.Integer socketTimeout;
  private java.lang.Boolean socketKeepalive;
  private java.lang.Boolean includeClientProfile;
  private java.lang.Boolean includeServerProfile;
  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public MongoDbConfig() {
  }

  /**
   * All-args constructor.
   */
  public MongoDbConfig(java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbServer> mongoServers, java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDBCredential> mongoCredentials, java.lang.String dbName, java.lang.Integer connectionsPerHost, java.lang.Integer maxWaitTime, java.lang.Integer connectionTimeout, java.lang.Integer socketTimeout, java.lang.Boolean socketKeepalive, java.lang.Boolean includeClientProfile, java.lang.Boolean includeServerProfile) {
    this.mongoServers = mongoServers;
    this.mongoCredentials = mongoCredentials;
    this.dbName = dbName;
    this.connectionsPerHost = connectionsPerHost;
    this.maxWaitTime = maxWaitTime;
    this.connectionTimeout = connectionTimeout;
    this.socketTimeout = socketTimeout;
    this.socketKeepalive = socketKeepalive;
    this.includeClientProfile = includeClientProfile;
    this.includeServerProfile = includeServerProfile;
  }

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /** Creates a new MongoDbConfig RecordBuilder */
  public static org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder newBuilder() {
    return new org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder();
  }

  /** Creates a new MongoDbConfig RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder newBuilder(org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder other) {
    return new org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder(other);
  }

  /** Creates a new MongoDbConfig RecordBuilder by copying an existing MongoDbConfig instance */
  public static org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder newBuilder(org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig other) {
    return new org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return mongoServers;
      case 1:
        return mongoCredentials;
      case 2:
        return dbName;
      case 3:
        return connectionsPerHost;
      case 4:
        return maxWaitTime;
      case 5:
        return connectionTimeout;
      case 6:
        return socketTimeout;
      case 7:
        return socketKeepalive;
      case 8:
        return includeClientProfile;
      case 9:
        return includeServerProfile;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        mongoServers = (java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbServer>) value$;
        break;
      case 1:
        mongoCredentials = (java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDBCredential>) value$;
        break;
      case 2:
        dbName = (java.lang.String) value$;
        break;
      case 3:
        connectionsPerHost = (java.lang.Integer) value$;
        break;
      case 4:
        maxWaitTime = (java.lang.Integer) value$;
        break;
      case 5:
        connectionTimeout = (java.lang.Integer) value$;
        break;
      case 6:
        socketTimeout = (java.lang.Integer) value$;
        break;
      case 7:
        socketKeepalive = (java.lang.Boolean) value$;
        break;
      case 8:
        includeClientProfile = (java.lang.Boolean) value$;
        break;
      case 9:
        includeServerProfile = (java.lang.Boolean) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'mongoServers' field.
   */
  public java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbServer> getMongoServers() {
    return mongoServers;
  }

  /**
   * Sets the value of the 'mongoServers' field.
   * @param value the value to set.
   */
  public void setMongoServers(java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbServer> value) {
    this.mongoServers = value;
  }

  /**
   * Gets the value of the 'mongoCredentials' field.
   */
  public java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDBCredential> getMongoCredentials() {
    return mongoCredentials;
  }

  /**
   * Sets the value of the 'mongoCredentials' field.
   * @param value the value to set.
   */
  public void setMongoCredentials(java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDBCredential> value) {
    this.mongoCredentials = value;
  }

  /**
   * Gets the value of the 'dbName' field.
   */
  public java.lang.String getDbName() {
    return dbName;
  }

  /**
   * Sets the value of the 'dbName' field.
   * @param value the value to set.
   */
  public void setDbName(java.lang.String value) {
    this.dbName = value;
  }

  /**
   * Gets the value of the 'connectionsPerHost' field.
   */
  public java.lang.Integer getConnectionsPerHost() {
    return connectionsPerHost;
  }

  /**
   * Sets the value of the 'connectionsPerHost' field.
   * @param value the value to set.
   */
  public void setConnectionsPerHost(java.lang.Integer value) {
    this.connectionsPerHost = value;
  }

  /**
   * Gets the value of the 'maxWaitTime' field.
   */
  public java.lang.Integer getMaxWaitTime() {
    return maxWaitTime;
  }

  /**
   * Sets the value of the 'maxWaitTime' field.
   * @param value the value to set.
   */
  public void setMaxWaitTime(java.lang.Integer value) {
    this.maxWaitTime = value;
  }

  /**
   * Gets the value of the 'connectionTimeout' field.
   */
  public java.lang.Integer getConnectionTimeout() {
    return connectionTimeout;
  }

  /**
   * Sets the value of the 'connectionTimeout' field.
   * @param value the value to set.
   */
  public void setConnectionTimeout(java.lang.Integer value) {
    this.connectionTimeout = value;
  }

  /**
   * Gets the value of the 'socketTimeout' field.
   */
  public java.lang.Integer getSocketTimeout() {
    return socketTimeout;
  }

  /**
   * Sets the value of the 'socketTimeout' field.
   * @param value the value to set.
   */
  public void setSocketTimeout(java.lang.Integer value) {
    this.socketTimeout = value;
  }

  /**
   * Gets the value of the 'socketKeepalive' field.
   */
  public java.lang.Boolean getSocketKeepalive() {
    return socketKeepalive;
  }

  /**
   * Sets the value of the 'socketKeepalive' field.
   * @param value the value to set.
   */
  public void setSocketKeepalive(java.lang.Boolean value) {
    this.socketKeepalive = value;
  }

  /**
   * Gets the value of the 'includeClientProfile' field.
   */
  public java.lang.Boolean getIncludeClientProfile() {
    return includeClientProfile;
  }

  /**
   * Sets the value of the 'includeClientProfile' field.
   * @param value the value to set.
   */
  public void setIncludeClientProfile(java.lang.Boolean value) {
    this.includeClientProfile = value;
  }

  /**
   * Gets the value of the 'includeServerProfile' field.
   */
  public java.lang.Boolean getIncludeServerProfile() {
    return includeServerProfile;
  }

  /**
   * Sets the value of the 'includeServerProfile' field.
   * @param value the value to set.
   */
  public void setIncludeServerProfile(java.lang.Boolean value) {
    this.includeServerProfile = value;
  }

  /**
   * RecordBuilder for MongoDbConfig instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MongoDbConfig>
      implements org.apache.avro.data.RecordBuilder<MongoDbConfig> {

    private java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbServer> mongoServers;
    private java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDBCredential> mongoCredentials;
    private java.lang.String dbName;
    private java.lang.Integer connectionsPerHost;
    private java.lang.Integer maxWaitTime;
    private java.lang.Integer connectionTimeout;
    private java.lang.Integer socketTimeout;
    private java.lang.Boolean socketKeepalive;
    private java.lang.Boolean includeClientProfile;
    private java.lang.Boolean includeServerProfile;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.mongoServers)) {
        this.mongoServers = data().deepCopy(fields()[0].schema(), other.mongoServers);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.mongoCredentials)) {
        this.mongoCredentials = data().deepCopy(fields()[1].schema(), other.mongoCredentials);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.dbName)) {
        this.dbName = data().deepCopy(fields()[2].schema(), other.dbName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.connectionsPerHost)) {
        this.connectionsPerHost = data().deepCopy(fields()[3].schema(), other.connectionsPerHost);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.maxWaitTime)) {
        this.maxWaitTime = data().deepCopy(fields()[4].schema(), other.maxWaitTime);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.connectionTimeout)) {
        this.connectionTimeout = data().deepCopy(fields()[5].schema(), other.connectionTimeout);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.socketTimeout)) {
        this.socketTimeout = data().deepCopy(fields()[6].schema(), other.socketTimeout);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.socketKeepalive)) {
        this.socketKeepalive = data().deepCopy(fields()[7].schema(), other.socketKeepalive);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.includeClientProfile)) {
        this.includeClientProfile = data().deepCopy(fields()[8].schema(), other.includeClientProfile);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.includeServerProfile)) {
        this.includeServerProfile = data().deepCopy(fields()[9].schema(), other.includeServerProfile);
        fieldSetFlags()[9] = true;
      }
    }

    /** Creates a Builder by copying an existing MongoDbConfig instance */
    private Builder(org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig other) {
      super(org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.SCHEMA$);
      if (isValidValue(fields()[0], other.mongoServers)) {
        this.mongoServers = data().deepCopy(fields()[0].schema(), other.mongoServers);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.mongoCredentials)) {
        this.mongoCredentials = data().deepCopy(fields()[1].schema(), other.mongoCredentials);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.dbName)) {
        this.dbName = data().deepCopy(fields()[2].schema(), other.dbName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.connectionsPerHost)) {
        this.connectionsPerHost = data().deepCopy(fields()[3].schema(), other.connectionsPerHost);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.maxWaitTime)) {
        this.maxWaitTime = data().deepCopy(fields()[4].schema(), other.maxWaitTime);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.connectionTimeout)) {
        this.connectionTimeout = data().deepCopy(fields()[5].schema(), other.connectionTimeout);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.socketTimeout)) {
        this.socketTimeout = data().deepCopy(fields()[6].schema(), other.socketTimeout);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.socketKeepalive)) {
        this.socketKeepalive = data().deepCopy(fields()[7].schema(), other.socketKeepalive);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.includeClientProfile)) {
        this.includeClientProfile = data().deepCopy(fields()[8].schema(), other.includeClientProfile);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.includeServerProfile)) {
        this.includeServerProfile = data().deepCopy(fields()[9].schema(), other.includeServerProfile);
        fieldSetFlags()[9] = true;
      }
    }

    /** Gets the value of the 'mongoServers' field */
    public java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbServer> getMongoServers() {
      return mongoServers;
    }

    /** Sets the value of the 'mongoServers' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder setMongoServers(java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbServer> value) {
      validate(fields()[0], value);
      this.mongoServers = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'mongoServers' field has been set */
    public boolean hasMongoServers() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'mongoServers' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder clearMongoServers() {
      mongoServers = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'mongoCredentials' field */
    public java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDBCredential> getMongoCredentials() {
      return mongoCredentials;
    }

    /** Sets the value of the 'mongoCredentials' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder setMongoCredentials(java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDBCredential> value) {
      validate(fields()[1], value);
      this.mongoCredentials = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'mongoCredentials' field has been set */
    public boolean hasMongoCredentials() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'mongoCredentials' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder clearMongoCredentials() {
      mongoCredentials = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'dbName' field */
    public java.lang.String getDbName() {
      return dbName;
    }

    /** Sets the value of the 'dbName' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder setDbName(java.lang.String value) {
      validate(fields()[2], value);
      this.dbName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'dbName' field has been set */
    public boolean hasDbName() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'dbName' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder clearDbName() {
      dbName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'connectionsPerHost' field */
    public java.lang.Integer getConnectionsPerHost() {
      return connectionsPerHost;
    }

    /** Sets the value of the 'connectionsPerHost' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder setConnectionsPerHost(java.lang.Integer value) {
      validate(fields()[3], value);
      this.connectionsPerHost = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /** Checks whether the 'connectionsPerHost' field has been set */
    public boolean hasConnectionsPerHost() {
      return fieldSetFlags()[3];
    }

    /** Clears the value of the 'connectionsPerHost' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder clearConnectionsPerHost() {
      connectionsPerHost = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'maxWaitTime' field */
    public java.lang.Integer getMaxWaitTime() {
      return maxWaitTime;
    }

    /** Sets the value of the 'maxWaitTime' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder setMaxWaitTime(java.lang.Integer value) {
      validate(fields()[4], value);
      this.maxWaitTime = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /** Checks whether the 'maxWaitTime' field has been set */
    public boolean hasMaxWaitTime() {
      return fieldSetFlags()[4];
    }

    /** Clears the value of the 'maxWaitTime' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder clearMaxWaitTime() {
      maxWaitTime = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'connectionTimeout' field */
    public java.lang.Integer getConnectionTimeout() {
      return connectionTimeout;
    }

    /** Sets the value of the 'connectionTimeout' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder setConnectionTimeout(java.lang.Integer value) {
      validate(fields()[5], value);
      this.connectionTimeout = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /** Checks whether the 'connectionTimeout' field has been set */
    public boolean hasConnectionTimeout() {
      return fieldSetFlags()[5];
    }

    /** Clears the value of the 'connectionTimeout' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder clearConnectionTimeout() {
      connectionTimeout = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'socketTimeout' field */
    public java.lang.Integer getSocketTimeout() {
      return socketTimeout;
    }

    /** Sets the value of the 'socketTimeout' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder setSocketTimeout(java.lang.Integer value) {
      validate(fields()[6], value);
      this.socketTimeout = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /** Checks whether the 'socketTimeout' field has been set */
    public boolean hasSocketTimeout() {
      return fieldSetFlags()[6];
    }

    /** Clears the value of the 'socketTimeout' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder clearSocketTimeout() {
      socketTimeout = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'socketKeepalive' field */
    public java.lang.Boolean getSocketKeepalive() {
      return socketKeepalive;
    }

    /** Sets the value of the 'socketKeepalive' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder setSocketKeepalive(java.lang.Boolean value) {
      validate(fields()[7], value);
      this.socketKeepalive = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /** Checks whether the 'socketKeepalive' field has been set */
    public boolean hasSocketKeepalive() {
      return fieldSetFlags()[7];
    }

    /** Clears the value of the 'socketKeepalive' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder clearSocketKeepalive() {
      socketKeepalive = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'includeClientProfile' field */
    public java.lang.Boolean getIncludeClientProfile() {
      return includeClientProfile;
    }

    /** Sets the value of the 'includeClientProfile' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder setIncludeClientProfile(java.lang.Boolean value) {
      validate(fields()[8], value);
      this.includeClientProfile = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /** Checks whether the 'includeClientProfile' field has been set */
    public boolean hasIncludeClientProfile() {
      return fieldSetFlags()[8];
    }

    /** Clears the value of the 'includeClientProfile' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder clearIncludeClientProfile() {
      includeClientProfile = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'includeServerProfile' field */
    public java.lang.Boolean getIncludeServerProfile() {
      return includeServerProfile;
    }

    /** Sets the value of the 'includeServerProfile' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder setIncludeServerProfile(java.lang.Boolean value) {
      validate(fields()[9], value);
      this.includeServerProfile = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /** Checks whether the 'includeServerProfile' field has been set */
    public boolean hasIncludeServerProfile() {
      return fieldSetFlags()[9];
    }

    /** Clears the value of the 'includeServerProfile' field */
    public org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbConfig.Builder clearIncludeServerProfile() {
      includeServerProfile = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    public MongoDbConfig build() {
      try {
        MongoDbConfig record = new MongoDbConfig();
        record.mongoServers = fieldSetFlags()[0] ? this.mongoServers : (java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDbServer>) defaultValue(fields()[0]);
        record.mongoCredentials = fieldSetFlags()[1] ? this.mongoCredentials : (java.util.List<org.kaaproject.kaa.server.appenders.mongo.config.gen.MongoDBCredential>) defaultValue(fields()[1]);
        record.dbName = fieldSetFlags()[2] ? this.dbName : (java.lang.String) defaultValue(fields()[2]);
        record.connectionsPerHost = fieldSetFlags()[3] ? this.connectionsPerHost : (java.lang.Integer) defaultValue(fields()[3]);
        record.maxWaitTime = fieldSetFlags()[4] ? this.maxWaitTime : (java.lang.Integer) defaultValue(fields()[4]);
        record.connectionTimeout = fieldSetFlags()[5] ? this.connectionTimeout : (java.lang.Integer) defaultValue(fields()[5]);
        record.socketTimeout = fieldSetFlags()[6] ? this.socketTimeout : (java.lang.Integer) defaultValue(fields()[6]);
        record.socketKeepalive = fieldSetFlags()[7] ? this.socketKeepalive : (java.lang.Boolean) defaultValue(fields()[7]);
        record.includeClientProfile = fieldSetFlags()[8] ? this.includeClientProfile : (java.lang.Boolean) defaultValue(fields()[8]);
        record.includeServerProfile = fieldSetFlags()[9] ? this.includeServerProfile : (java.lang.Boolean) defaultValue(fields()[9]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
