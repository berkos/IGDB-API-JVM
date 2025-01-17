// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.PlatformWebsiteResult}
 */
public final class PlatformWebsiteResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.PlatformWebsiteResult)
    PlatformWebsiteResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformWebsiteResult.newBuilder() to construct.
  private PlatformWebsiteResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformWebsiteResult() {
    platformwebsites_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformWebsiteResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_PlatformWebsiteResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_PlatformWebsiteResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.PlatformWebsiteResult.class, proto.PlatformWebsiteResult.Builder.class);
  }

  public static final int PLATFORMWEBSITES_FIELD_NUMBER = 1;
  private java.util.List<proto.PlatformWebsite> platformwebsites_;
  /**
   * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.PlatformWebsite> getPlatformwebsitesList() {
    return platformwebsites_;
  }
  /**
   * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.PlatformWebsiteOrBuilder> 
      getPlatformwebsitesOrBuilderList() {
    return platformwebsites_;
  }
  /**
   * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
   */
  @java.lang.Override
  public int getPlatformwebsitesCount() {
    return platformwebsites_.size();
  }
  /**
   * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
   */
  @java.lang.Override
  public proto.PlatformWebsite getPlatformwebsites(int index) {
    return platformwebsites_.get(index);
  }
  /**
   * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
   */
  @java.lang.Override
  public proto.PlatformWebsiteOrBuilder getPlatformwebsitesOrBuilder(
      int index) {
    return platformwebsites_.get(index);
  }

  public static proto.PlatformWebsiteResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PlatformWebsiteResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PlatformWebsiteResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PlatformWebsiteResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PlatformWebsiteResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PlatformWebsiteResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PlatformWebsiteResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.PlatformWebsiteResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.PlatformWebsiteResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.PlatformWebsiteResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.PlatformWebsiteResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.PlatformWebsiteResult parseFrom(
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
  public static Builder newBuilder(proto.PlatformWebsiteResult prototype) {
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
   * Protobuf type {@code proto.PlatformWebsiteResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.PlatformWebsiteResult)
      proto.PlatformWebsiteResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_PlatformWebsiteResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_PlatformWebsiteResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.PlatformWebsiteResult.class, proto.PlatformWebsiteResult.Builder.class);
    }

    // Construct using proto.PlatformWebsiteResult.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (platformwebsitesBuilder_ == null) {
        platformwebsites_ = java.util.Collections.emptyList();
      } else {
        platformwebsites_ = null;
        platformwebsitesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_PlatformWebsiteResult_descriptor;
    }

    @java.lang.Override
    public proto.PlatformWebsiteResult getDefaultInstanceForType() {
      return proto.PlatformWebsiteResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.PlatformWebsiteResult build() {
      proto.PlatformWebsiteResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.PlatformWebsiteResult buildPartial() {
      proto.PlatformWebsiteResult result = new proto.PlatformWebsiteResult(this);
      int from_bitField0_ = bitField0_;
      if (platformwebsitesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          platformwebsites_ = java.util.Collections.unmodifiableList(platformwebsites_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.platformwebsites_ = platformwebsites_;
      } else {
        result.platformwebsites_ = platformwebsitesBuilder_.build();
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

    private java.util.List<proto.PlatformWebsite> platformwebsites_ =
      java.util.Collections.emptyList();
    private void ensurePlatformwebsitesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        platformwebsites_ = new java.util.ArrayList<proto.PlatformWebsite>(platformwebsites_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.PlatformWebsite, proto.PlatformWebsite.Builder, proto.PlatformWebsiteOrBuilder> platformwebsitesBuilder_;

    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public java.util.List<proto.PlatformWebsite> getPlatformwebsitesList() {
      if (platformwebsitesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(platformwebsites_);
      } else {
        return platformwebsitesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public int getPlatformwebsitesCount() {
      if (platformwebsitesBuilder_ == null) {
        return platformwebsites_.size();
      } else {
        return platformwebsitesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public proto.PlatformWebsite getPlatformwebsites(int index) {
      if (platformwebsitesBuilder_ == null) {
        return platformwebsites_.get(index);
      } else {
        return platformwebsitesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public Builder setPlatformwebsites(
        int index, proto.PlatformWebsite value) {
      if (platformwebsitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlatformwebsitesIsMutable();
        platformwebsites_.set(index, value);
        onChanged();
      } else {
        platformwebsitesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public Builder setPlatformwebsites(
        int index, proto.PlatformWebsite.Builder builderForValue) {
      if (platformwebsitesBuilder_ == null) {
        ensurePlatformwebsitesIsMutable();
        platformwebsites_.set(index, builderForValue.build());
        onChanged();
      } else {
        platformwebsitesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public Builder addPlatformwebsites(proto.PlatformWebsite value) {
      if (platformwebsitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlatformwebsitesIsMutable();
        platformwebsites_.add(value);
        onChanged();
      } else {
        platformwebsitesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public Builder addPlatformwebsites(
        int index, proto.PlatformWebsite value) {
      if (platformwebsitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlatformwebsitesIsMutable();
        platformwebsites_.add(index, value);
        onChanged();
      } else {
        platformwebsitesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public Builder addPlatformwebsites(
        proto.PlatformWebsite.Builder builderForValue) {
      if (platformwebsitesBuilder_ == null) {
        ensurePlatformwebsitesIsMutable();
        platformwebsites_.add(builderForValue.build());
        onChanged();
      } else {
        platformwebsitesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public Builder addPlatformwebsites(
        int index, proto.PlatformWebsite.Builder builderForValue) {
      if (platformwebsitesBuilder_ == null) {
        ensurePlatformwebsitesIsMutable();
        platformwebsites_.add(index, builderForValue.build());
        onChanged();
      } else {
        platformwebsitesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public Builder addAllPlatformwebsites(
        java.lang.Iterable<? extends proto.PlatformWebsite> values) {
      if (platformwebsitesBuilder_ == null) {
        ensurePlatformwebsitesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, platformwebsites_);
        onChanged();
      } else {
        platformwebsitesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public Builder clearPlatformwebsites() {
      if (platformwebsitesBuilder_ == null) {
        platformwebsites_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        platformwebsitesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public Builder removePlatformwebsites(int index) {
      if (platformwebsitesBuilder_ == null) {
        ensurePlatformwebsitesIsMutable();
        platformwebsites_.remove(index);
        onChanged();
      } else {
        platformwebsitesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public proto.PlatformWebsite.Builder getPlatformwebsitesBuilder(
        int index) {
      return getPlatformwebsitesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public proto.PlatformWebsiteOrBuilder getPlatformwebsitesOrBuilder(
        int index) {
      if (platformwebsitesBuilder_ == null) {
        return platformwebsites_.get(index);  } else {
        return platformwebsitesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public java.util.List<? extends proto.PlatformWebsiteOrBuilder> 
         getPlatformwebsitesOrBuilderList() {
      if (platformwebsitesBuilder_ != null) {
        return platformwebsitesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(platformwebsites_);
      }
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public proto.PlatformWebsite.Builder addPlatformwebsitesBuilder() {
      return getPlatformwebsitesFieldBuilder().addBuilder(
          proto.PlatformWebsite.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public proto.PlatformWebsite.Builder addPlatformwebsitesBuilder(
        int index) {
      return getPlatformwebsitesFieldBuilder().addBuilder(
          index, proto.PlatformWebsite.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.PlatformWebsite platformwebsites = 1;</code>
     */
    public java.util.List<proto.PlatformWebsite.Builder> 
         getPlatformwebsitesBuilderList() {
      return getPlatformwebsitesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.PlatformWebsite, proto.PlatformWebsite.Builder, proto.PlatformWebsiteOrBuilder> 
        getPlatformwebsitesFieldBuilder() {
      if (platformwebsitesBuilder_ == null) {
        platformwebsitesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.PlatformWebsite, proto.PlatformWebsite.Builder, proto.PlatformWebsiteOrBuilder>(
                platformwebsites_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        platformwebsites_ = null;
      }
      return platformwebsitesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.PlatformWebsiteResult)
  }

  // @@protoc_insertion_point(class_scope:proto.PlatformWebsiteResult)
  private static final proto.PlatformWebsiteResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.PlatformWebsiteResult();
  }

  public static proto.PlatformWebsiteResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformWebsiteResult>
      PARSER = new com.google.protobuf.AbstractParser<PlatformWebsiteResult>() {
    @java.lang.Override
    public PlatformWebsiteResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlatformWebsiteResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformWebsiteResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.PlatformWebsiteResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

