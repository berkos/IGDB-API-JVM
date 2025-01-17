// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.LanguageSupportResult}
 */
public final class LanguageSupportResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.LanguageSupportResult)
    LanguageSupportResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LanguageSupportResult.newBuilder() to construct.
  private LanguageSupportResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LanguageSupportResult() {
    languagesupports_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LanguageSupportResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_LanguageSupportResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_LanguageSupportResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.LanguageSupportResult.class, proto.LanguageSupportResult.Builder.class);
  }

  public static final int LANGUAGESUPPORTS_FIELD_NUMBER = 1;
  private java.util.List<proto.LanguageSupport> languagesupports_;
  /**
   * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.LanguageSupport> getLanguagesupportsList() {
    return languagesupports_;
  }
  /**
   * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.LanguageSupportOrBuilder> 
      getLanguagesupportsOrBuilderList() {
    return languagesupports_;
  }
  /**
   * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
   */
  @java.lang.Override
  public int getLanguagesupportsCount() {
    return languagesupports_.size();
  }
  /**
   * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
   */
  @java.lang.Override
  public proto.LanguageSupport getLanguagesupports(int index) {
    return languagesupports_.get(index);
  }
  /**
   * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
   */
  @java.lang.Override
  public proto.LanguageSupportOrBuilder getLanguagesupportsOrBuilder(
      int index) {
    return languagesupports_.get(index);
  }

  public static proto.LanguageSupportResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.LanguageSupportResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.LanguageSupportResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.LanguageSupportResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.LanguageSupportResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.LanguageSupportResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.LanguageSupportResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.LanguageSupportResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.LanguageSupportResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.LanguageSupportResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.LanguageSupportResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.LanguageSupportResult parseFrom(
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
  public static Builder newBuilder(proto.LanguageSupportResult prototype) {
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
   * Protobuf type {@code proto.LanguageSupportResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.LanguageSupportResult)
      proto.LanguageSupportResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_LanguageSupportResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_LanguageSupportResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.LanguageSupportResult.class, proto.LanguageSupportResult.Builder.class);
    }

    // Construct using proto.LanguageSupportResult.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (languagesupportsBuilder_ == null) {
        languagesupports_ = java.util.Collections.emptyList();
      } else {
        languagesupports_ = null;
        languagesupportsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_LanguageSupportResult_descriptor;
    }

    @java.lang.Override
    public proto.LanguageSupportResult getDefaultInstanceForType() {
      return proto.LanguageSupportResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.LanguageSupportResult build() {
      proto.LanguageSupportResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.LanguageSupportResult buildPartial() {
      proto.LanguageSupportResult result = new proto.LanguageSupportResult(this);
      int from_bitField0_ = bitField0_;
      if (languagesupportsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          languagesupports_ = java.util.Collections.unmodifiableList(languagesupports_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.languagesupports_ = languagesupports_;
      } else {
        result.languagesupports_ = languagesupportsBuilder_.build();
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

    private java.util.List<proto.LanguageSupport> languagesupports_ =
      java.util.Collections.emptyList();
    private void ensureLanguagesupportsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        languagesupports_ = new java.util.ArrayList<proto.LanguageSupport>(languagesupports_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.LanguageSupport, proto.LanguageSupport.Builder, proto.LanguageSupportOrBuilder> languagesupportsBuilder_;

    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public java.util.List<proto.LanguageSupport> getLanguagesupportsList() {
      if (languagesupportsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(languagesupports_);
      } else {
        return languagesupportsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public int getLanguagesupportsCount() {
      if (languagesupportsBuilder_ == null) {
        return languagesupports_.size();
      } else {
        return languagesupportsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public proto.LanguageSupport getLanguagesupports(int index) {
      if (languagesupportsBuilder_ == null) {
        return languagesupports_.get(index);
      } else {
        return languagesupportsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public Builder setLanguagesupports(
        int index, proto.LanguageSupport value) {
      if (languagesupportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLanguagesupportsIsMutable();
        languagesupports_.set(index, value);
        onChanged();
      } else {
        languagesupportsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public Builder setLanguagesupports(
        int index, proto.LanguageSupport.Builder builderForValue) {
      if (languagesupportsBuilder_ == null) {
        ensureLanguagesupportsIsMutable();
        languagesupports_.set(index, builderForValue.build());
        onChanged();
      } else {
        languagesupportsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public Builder addLanguagesupports(proto.LanguageSupport value) {
      if (languagesupportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLanguagesupportsIsMutable();
        languagesupports_.add(value);
        onChanged();
      } else {
        languagesupportsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public Builder addLanguagesupports(
        int index, proto.LanguageSupport value) {
      if (languagesupportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLanguagesupportsIsMutable();
        languagesupports_.add(index, value);
        onChanged();
      } else {
        languagesupportsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public Builder addLanguagesupports(
        proto.LanguageSupport.Builder builderForValue) {
      if (languagesupportsBuilder_ == null) {
        ensureLanguagesupportsIsMutable();
        languagesupports_.add(builderForValue.build());
        onChanged();
      } else {
        languagesupportsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public Builder addLanguagesupports(
        int index, proto.LanguageSupport.Builder builderForValue) {
      if (languagesupportsBuilder_ == null) {
        ensureLanguagesupportsIsMutable();
        languagesupports_.add(index, builderForValue.build());
        onChanged();
      } else {
        languagesupportsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public Builder addAllLanguagesupports(
        java.lang.Iterable<? extends proto.LanguageSupport> values) {
      if (languagesupportsBuilder_ == null) {
        ensureLanguagesupportsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, languagesupports_);
        onChanged();
      } else {
        languagesupportsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public Builder clearLanguagesupports() {
      if (languagesupportsBuilder_ == null) {
        languagesupports_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        languagesupportsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public Builder removeLanguagesupports(int index) {
      if (languagesupportsBuilder_ == null) {
        ensureLanguagesupportsIsMutable();
        languagesupports_.remove(index);
        onChanged();
      } else {
        languagesupportsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public proto.LanguageSupport.Builder getLanguagesupportsBuilder(
        int index) {
      return getLanguagesupportsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public proto.LanguageSupportOrBuilder getLanguagesupportsOrBuilder(
        int index) {
      if (languagesupportsBuilder_ == null) {
        return languagesupports_.get(index);  } else {
        return languagesupportsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public java.util.List<? extends proto.LanguageSupportOrBuilder> 
         getLanguagesupportsOrBuilderList() {
      if (languagesupportsBuilder_ != null) {
        return languagesupportsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(languagesupports_);
      }
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public proto.LanguageSupport.Builder addLanguagesupportsBuilder() {
      return getLanguagesupportsFieldBuilder().addBuilder(
          proto.LanguageSupport.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public proto.LanguageSupport.Builder addLanguagesupportsBuilder(
        int index) {
      return getLanguagesupportsFieldBuilder().addBuilder(
          index, proto.LanguageSupport.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.LanguageSupport languagesupports = 1;</code>
     */
    public java.util.List<proto.LanguageSupport.Builder> 
         getLanguagesupportsBuilderList() {
      return getLanguagesupportsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.LanguageSupport, proto.LanguageSupport.Builder, proto.LanguageSupportOrBuilder> 
        getLanguagesupportsFieldBuilder() {
      if (languagesupportsBuilder_ == null) {
        languagesupportsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.LanguageSupport, proto.LanguageSupport.Builder, proto.LanguageSupportOrBuilder>(
                languagesupports_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        languagesupports_ = null;
      }
      return languagesupportsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.LanguageSupportResult)
  }

  // @@protoc_insertion_point(class_scope:proto.LanguageSupportResult)
  private static final proto.LanguageSupportResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.LanguageSupportResult();
  }

  public static proto.LanguageSupportResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LanguageSupportResult>
      PARSER = new com.google.protobuf.AbstractParser<LanguageSupportResult>() {
    @java.lang.Override
    public LanguageSupportResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<LanguageSupportResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LanguageSupportResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.LanguageSupportResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

