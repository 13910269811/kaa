/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package org.kaaproject.kaa.server.common.thrift.gen.operations;


/**
 * Enum defines cluster entity type
 */
public enum ThriftClusterEntityType implements org.apache.thrift.TEnum {
  ENDPOINT(1);

  private final int value;

  private ThriftClusterEntityType(int value) {
    this.value = value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ThriftClusterEntityType findByValue(int value) {
    switch (value) {
      case 1:
        return ENDPOINT;
      default:
        return null;
    }
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }
}
