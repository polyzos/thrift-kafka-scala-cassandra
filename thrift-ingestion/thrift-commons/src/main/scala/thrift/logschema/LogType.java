/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift.logschema;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-03-09")
public enum LogType implements org.apache.thrift.TEnum {
  DEBUG(0),
  INFO(1),
  WARNING(2),
  ERROR(3);

  private final int value;

  private LogType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static LogType findByValue(int value) { 
    switch (value) {
      case 0:
        return DEBUG;
      case 1:
        return INFO;
      case 2:
        return WARNING;
      case 3:
        return ERROR;
      default:
        return null;
    }
  }
}