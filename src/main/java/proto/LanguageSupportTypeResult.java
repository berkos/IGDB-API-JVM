// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.LanguageSupportTypeResult}
 */
public final class LanguageSupportTypeResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.LanguageSupportTypeResult)
    LanguageSupportTypeResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LanguageSupportTypeResult.newBuilder() to construct.
  private LanguageSupportTypeResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LanguageSupportTypeResult() {
    languagesupporttypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LanguageSupportTypeResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_LanguageSupportTypeResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_LanguageSupportTypeResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.LanguageSupportTypeResult.class, proto.LanguageSupportTypeResult.Builder.class);
  }

  public static final int LANGUAGESUPPORTTYPES_FIELD_NUMBER = 1;
  private java.util.List<proto.LanguageSupportType> languagesupporttypes_;
  /**
   * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.LanguageSupportType> getLanguagesupporttypesList() {
    return languagesupporttypes_;
  }
  /**
   * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.LanguageSupportTypeOrBuilder> 
      getLanguagesupporttypesOrBuilderList() {
    return languagesupporttypes_;
  }
  /**
   * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
   */
  @java.lang.Override
  public int getLanguagesupporttypesCount() {
    return languagesupporttypes_.size();
  }
  /**
   * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
   */
  @java.lang.Override
  public proto.LanguageSupportType getLanguagesupporttypes(int index) {
    return languagesupporttypes_.get(index);
  }
  /**
   * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
   */
  @java.lang.Override
  public proto.LanguageSupportTypeOrBuilder getLanguagesupporttypesOrBuilder(
      int index) {
    return languagesupporttypes_.get(index);
  }

  public static proto.LanguageSupportTypeResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.LanguageSupportTypeResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.LanguageSupportTypeResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.LanguageSupportTypeResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.LanguageSupportTypeResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.LanguageSupportTypeResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.LanguageSupportTypeResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.LanguageSupportTypeResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.LanguageSupportTypeResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.LanguageSupportTypeResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.LanguageSupportTypeResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.LanguageSupportTypeResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto.LanguageSupportTypeResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.LanguageSupportTypeResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.LanguageSupportTypeResult)
      proto.LanguageSupportTypeResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_LanguageSupportTypeResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_LanguageSupportTypeResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.LanguageSupportTypeResult.class, proto.LanguageSupportTypeResult.Builder.class);
    }

    // Construct using proto.LanguageSupportTypeResult.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (languagesupporttypesBuilder_ == null) {
        languagesupporttypes_ = java.util.Collections.emptyList();
      } else {
        languagesupporttypes_ = null;
        languagesupporttypesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_LanguageSupportTypeResult_descriptor;
    }

    @java.lang.Override
    public proto.LanguageSupportTypeResult getDefaultInstanceForType() {
      return proto.LanguageSupportTypeResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.LanguageSupportTypeResult build() {
      proto.LanguageSupportTypeResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.LanguageSupportTypeResult buildPartial() {
      proto.LanguageSupportTypeResult result = new proto.LanguageSupportTypeResult(this);
      int from_bitField0_ = bitField0_;
      if (languagesupporttypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          languagesupporttypes_ = java.util.Collections.unmodifiableList(languagesupporttypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.languagesupporttypes_ = languagesupporttypes_;
      } else {
        result.languagesupporttypes_ = languagesupporttypesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    private int bitField0_;

    private java.util.List<proto.LanguageSupportType> languagesupporttypes_ =
      java.util.Collections.emptyList();
    private void ensureLanguagesupporttypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        languagesupporttypes_ = new java.util.ArrayList<proto.LanguageSupportType>(languagesupporttypes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.LanguageSupportType, proto.LanguageSupportType.Builder, proto.LanguageSupportTypeOrBuilder> languagesupporttypesBuilder_;

    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public java.util.List<proto.LanguageSupportType> getLanguagesupporttypesList() {
      if (languagesupporttypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(languagesupporttypes_);
      } else {
        return languagesupporttypesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public int getLanguagesupporttypesCount() {
      if (languagesupporttypesBuilder_ == null) {
        return languagesupporttypes_.size();
      } else {
        return languagesupporttypesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public proto.LanguageSupportType getLanguagesupporttypes(int index) {
      if (languagesupporttypesBuilder_ == null) {
        return languagesupporttypes_.get(index);
      } else {
        return languagesupporttypesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public Builder setLanguagesupporttypes(
        int index, proto.LanguageSupportType value) {
      if (languagesupporttypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLanguagesupporttypesIsMutable();
        languagesupporttypes_.set(index, value);
        onChanged();
      } else {
        languagesupporttypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public Builder setLanguagesupporttypes(
        int index, proto.LanguageSupportType.Builder builderForValue) {
      if (languagesupporttypesBuilder_ == null) {
        ensureLanguagesupporttypesIsMutable();
        languagesupporttypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        languagesupporttypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public Builder addLanguagesupporttypes(proto.LanguageSupportType value) {
      if (languagesupporttypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLanguagesupporttypesIsMutable();
        languagesupporttypes_.add(value);
        onChanged();
      } else {
        languagesupporttypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public Builder addLanguagesupporttypes(
        int index, proto.LanguageSupportType value) {
      if (languagesupporttypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLanguagesupporttypesIsMutable();
        languagesupporttypes_.add(index, value);
        onChanged();
      } else {
        languagesupporttypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public Builder addLanguagesupporttypes(
        proto.LanguageSupportType.Builder builderForValue) {
      if (languagesupporttypesBuilder_ == null) {
        ensureLanguagesupporttypesIsMutable();
        languagesupporttypes_.add(builderForValue.build());
        onChanged();
      } else {
        languagesupporttypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public Builder addLanguagesupporttypes(
        int index, proto.LanguageSupportType.Builder builderForValue) {
      if (languagesupporttypesBuilder_ == null) {
        ensureLanguagesupporttypesIsMutable();
        languagesupporttypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        languagesupporttypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public Builder addAllLanguagesupporttypes(
        java.lang.Iterable<? extends proto.LanguageSupportType> values) {
      if (languagesupporttypesBuilder_ == null) {
        ensureLanguagesupporttypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, languagesupporttypes_);
        onChanged();
      } else {
        languagesupporttypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public Builder clearLanguagesupporttypes() {
      if (languagesupporttypesBuilder_ == null) {
        languagesupporttypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        languagesupporttypesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public Builder removeLanguagesupporttypes(int index) {
      if (languagesupporttypesBuilder_ == null) {
        ensureLanguagesupporttypesIsMutable();
        languagesupporttypes_.remove(index);
        onChanged();
      } else {
        languagesupporttypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public proto.LanguageSupportType.Builder getLanguagesupporttypesBuilder(
        int index) {
      return getLanguagesupporttypesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public proto.LanguageSupportTypeOrBuilder getLanguagesupporttypesOrBuilder(
        int index) {
      if (languagesupporttypesBuilder_ == null) {
        return languagesupporttypes_.get(index);  } else {
        return languagesupporttypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public java.util.List<? extends proto.LanguageSupportTypeOrBuilder> 
         getLanguagesupporttypesOrBuilderList() {
      if (languagesupporttypesBuilder_ != null) {
        return languagesupporttypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(languagesupporttypes_);
      }
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public proto.LanguageSupportType.Builder addLanguagesupporttypesBuilder() {
      return getLanguagesupporttypesFieldBuilder().addBuilder(
          proto.LanguageSupportType.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public proto.LanguageSupportType.Builder addLanguagesupporttypesBuilder(
        int index) {
      return getLanguagesupporttypesFieldBuilder().addBuilder(
          index, proto.LanguageSupportType.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.LanguageSupportType languagesupporttypes = 1;</code>
     */
    public java.util.List<proto.LanguageSupportType.Builder> 
         getLanguagesupporttypesBuilderList() {
      return getLanguagesupporttypesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.LanguageSupportType, proto.LanguageSupportType.Builder, proto.LanguageSupportTypeOrBuilder> 
        getLanguagesupporttypesFieldBuilder() {
      if (languagesupporttypesBuilder_ == null) {
        languagesupporttypesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.LanguageSupportType, proto.LanguageSupportType.Builder, proto.LanguageSupportTypeOrBuilder>(
                languagesupporttypes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        languagesupporttypes_ = null;
      }
      return languagesupporttypesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.LanguageSupportTypeResult)
  }

  // @@protoc_insertion_point(class_scope:proto.LanguageSupportTypeResult)
  private static final proto.LanguageSupportTypeResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.LanguageSupportTypeResult();
  }

  public static proto.LanguageSupportTypeResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LanguageSupportTypeResult>
      PARSER = new com.google.protobuf.AbstractParser<LanguageSupportTypeResult>() {
    @java.lang.Override
    public LanguageSupportTypeResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<LanguageSupportTypeResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LanguageSupportTypeResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.LanguageSupportTypeResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

