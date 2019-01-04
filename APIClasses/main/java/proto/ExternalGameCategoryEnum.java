// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf enum {@code proto.ExternalGameCategoryEnum}
 */
public enum ExternalGameCategoryEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EXTERNALGAME_CATEGORY_NULL = 0;</code>
   */
  EXTERNALGAME_CATEGORY_NULL(0),
  /**
   * <code>EXTERNALGAME_STEAM = 1;</code>
   */
  EXTERNALGAME_STEAM(1),
  /**
   * <code>EXTERNALGAME_GOG = 5;</code>
   */
  EXTERNALGAME_GOG(5),
  /**
   * <code>EXTERNALGAME_YOUTUBE = 10;</code>
   */
  EXTERNALGAME_YOUTUBE(10),
  /**
   * <code>EXTERNALGAME_MICROSOFT = 11;</code>
   */
  EXTERNALGAME_MICROSOFT(11),
  /**
   * <code>EXTERNALGAME_APPLE = 13;</code>
   */
  EXTERNALGAME_APPLE(13),
  /**
   * <code>EXTERNALGAME_TWITCH = 14;</code>
   */
  EXTERNALGAME_TWITCH(14),
  /**
   * <code>EXTERNALGAME_ANDROID = 15;</code>
   */
  EXTERNALGAME_ANDROID(15),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>EXTERNALGAME_CATEGORY_NULL = 0;</code>
   */
  public static final int EXTERNALGAME_CATEGORY_NULL_VALUE = 0;
  /**
   * <code>EXTERNALGAME_STEAM = 1;</code>
   */
  public static final int EXTERNALGAME_STEAM_VALUE = 1;
  /**
   * <code>EXTERNALGAME_GOG = 5;</code>
   */
  public static final int EXTERNALGAME_GOG_VALUE = 5;
  /**
   * <code>EXTERNALGAME_YOUTUBE = 10;</code>
   */
  public static final int EXTERNALGAME_YOUTUBE_VALUE = 10;
  /**
   * <code>EXTERNALGAME_MICROSOFT = 11;</code>
   */
  public static final int EXTERNALGAME_MICROSOFT_VALUE = 11;
  /**
   * <code>EXTERNALGAME_APPLE = 13;</code>
   */
  public static final int EXTERNALGAME_APPLE_VALUE = 13;
  /**
   * <code>EXTERNALGAME_TWITCH = 14;</code>
   */
  public static final int EXTERNALGAME_TWITCH_VALUE = 14;
  /**
   * <code>EXTERNALGAME_ANDROID = 15;</code>
   */
  public static final int EXTERNALGAME_ANDROID_VALUE = 15;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ExternalGameCategoryEnum valueOf(int value) {
    return forNumber(value);
  }

  public static ExternalGameCategoryEnum forNumber(int value) {
    switch (value) {
      case 0: return EXTERNALGAME_CATEGORY_NULL;
      case 1: return EXTERNALGAME_STEAM;
      case 5: return EXTERNALGAME_GOG;
      case 10: return EXTERNALGAME_YOUTUBE;
      case 11: return EXTERNALGAME_MICROSOFT;
      case 13: return EXTERNALGAME_APPLE;
      case 14: return EXTERNALGAME_TWITCH;
      case 15: return EXTERNALGAME_ANDROID;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ExternalGameCategoryEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ExternalGameCategoryEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ExternalGameCategoryEnum>() {
          public ExternalGameCategoryEnum findValueByNumber(int number) {
            return ExternalGameCategoryEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return proto.IGDBProtoFile.getDescriptor().getEnumTypes().get(10);
  }

  private static final ExternalGameCategoryEnum[] VALUES = values();

  public static ExternalGameCategoryEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ExternalGameCategoryEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.ExternalGameCategoryEnum)
}
