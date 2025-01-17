// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.MultiQueryResultArray}
 */
public final class MultiQueryResultArray extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.MultiQueryResultArray)
    MultiQueryResultArrayOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiQueryResultArray.newBuilder() to construct.
  private MultiQueryResultArray(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiQueryResultArray() {
    result_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiQueryResultArray();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_MultiQueryResultArray_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_MultiQueryResultArray_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.MultiQueryResultArray.class, proto.MultiQueryResultArray.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private java.util.List<proto.MultiQueryResult> result_;
  /**
   * <code>repeated .proto.MultiQueryResult result = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.MultiQueryResult> getResultList() {
    return result_;
  }
  /**
   * <code>repeated .proto.MultiQueryResult result = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.MultiQueryResultOrBuilder> 
      getResultOrBuilderList() {
    return result_;
  }
  /**
   * <code>repeated .proto.MultiQueryResult result = 1;</code>
   */
  @java.lang.Override
  public int getResultCount() {
    return result_.size();
  }
  /**
   * <code>repeated .proto.MultiQueryResult result = 1;</code>
   */
  @java.lang.Override
  public proto.MultiQueryResult getResult(int index) {
    return result_.get(index);
  }
  /**
   * <code>repeated .proto.MultiQueryResult result = 1;</code>
   */
  @java.lang.Override
  public proto.MultiQueryResultOrBuilder getResultOrBuilder(
      int index) {
    return result_.get(index);
  }

  public static proto.MultiQueryResultArray parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.MultiQueryResultArray parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.MultiQueryResultArray parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.MultiQueryResultArray parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.MultiQueryResultArray parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.MultiQueryResultArray parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.MultiQueryResultArray parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.MultiQueryResultArray parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.MultiQueryResultArray parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.MultiQueryResultArray parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.MultiQueryResultArray parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.MultiQueryResultArray parseFrom(
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
  public static Builder newBuilder(proto.MultiQueryResultArray prototype) {
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
   * Protobuf type {@code proto.MultiQueryResultArray}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.MultiQueryResultArray)
      proto.MultiQueryResultArrayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_MultiQueryResultArray_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_MultiQueryResultArray_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.MultiQueryResultArray.class, proto.MultiQueryResultArray.Builder.class);
    }

    // Construct using proto.MultiQueryResultArray.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resultBuilder_ == null) {
        result_ = java.util.Collections.emptyList();
      } else {
        result_ = null;
        resultBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_MultiQueryResultArray_descriptor;
    }

    @java.lang.Override
    public proto.MultiQueryResultArray getDefaultInstanceForType() {
      return proto.MultiQueryResultArray.getDefaultInstance();
    }

    @java.lang.Override
    public proto.MultiQueryResultArray build() {
      proto.MultiQueryResultArray result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.MultiQueryResultArray buildPartial() {
      proto.MultiQueryResultArray result = new proto.MultiQueryResultArray(this);
      int from_bitField0_ = bitField0_;
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          result_ = java.util.Collections.unmodifiableList(result_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
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

    private java.util.List<proto.MultiQueryResult> result_ =
      java.util.Collections.emptyList();
    private void ensureResultIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        result_ = new java.util.ArrayList<proto.MultiQueryResult>(result_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.MultiQueryResult, proto.MultiQueryResult.Builder, proto.MultiQueryResultOrBuilder> resultBuilder_;

    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public java.util.List<proto.MultiQueryResult> getResultList() {
      if (resultBuilder_ == null) {
        return java.util.Collections.unmodifiableList(result_);
      } else {
        return resultBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public int getResultCount() {
      if (resultBuilder_ == null) {
        return result_.size();
      } else {
        return resultBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public proto.MultiQueryResult getResult(int index) {
      if (resultBuilder_ == null) {
        return result_.get(index);
      } else {
        return resultBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public Builder setResult(
        int index, proto.MultiQueryResult value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultIsMutable();
        result_.set(index, value);
        onChanged();
      } else {
        resultBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public Builder setResult(
        int index, proto.MultiQueryResult.Builder builderForValue) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        result_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public Builder addResult(proto.MultiQueryResult value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultIsMutable();
        result_.add(value);
        onChanged();
      } else {
        resultBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public Builder addResult(
        int index, proto.MultiQueryResult value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultIsMutable();
        result_.add(index, value);
        onChanged();
      } else {
        resultBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public Builder addResult(
        proto.MultiQueryResult.Builder builderForValue) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        result_.add(builderForValue.build());
        onChanged();
      } else {
        resultBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public Builder addResult(
        int index, proto.MultiQueryResult.Builder builderForValue) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        result_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public Builder addAllResult(
        java.lang.Iterable<? extends proto.MultiQueryResult> values) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, result_);
        onChanged();
      } else {
        resultBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public Builder removeResult(int index) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        result_.remove(index);
        onChanged();
      } else {
        resultBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public proto.MultiQueryResult.Builder getResultBuilder(
        int index) {
      return getResultFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public proto.MultiQueryResultOrBuilder getResultOrBuilder(
        int index) {
      if (resultBuilder_ == null) {
        return result_.get(index);  } else {
        return resultBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public java.util.List<? extends proto.MultiQueryResultOrBuilder> 
         getResultOrBuilderList() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(result_);
      }
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public proto.MultiQueryResult.Builder addResultBuilder() {
      return getResultFieldBuilder().addBuilder(
          proto.MultiQueryResult.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public proto.MultiQueryResult.Builder addResultBuilder(
        int index) {
      return getResultFieldBuilder().addBuilder(
          index, proto.MultiQueryResult.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.MultiQueryResult result = 1;</code>
     */
    public java.util.List<proto.MultiQueryResult.Builder> 
         getResultBuilderList() {
      return getResultFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.MultiQueryResult, proto.MultiQueryResult.Builder, proto.MultiQueryResultOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.MultiQueryResult, proto.MultiQueryResult.Builder, proto.MultiQueryResultOrBuilder>(
                result_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.MultiQueryResultArray)
  }

  // @@protoc_insertion_point(class_scope:proto.MultiQueryResultArray)
  private static final proto.MultiQueryResultArray DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.MultiQueryResultArray();
  }

  public static proto.MultiQueryResultArray getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiQueryResultArray>
      PARSER = new com.google.protobuf.AbstractParser<MultiQueryResultArray>() {
    @java.lang.Override
    public MultiQueryResultArray parsePartialFrom(
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

  public static com.google.protobuf.Parser<MultiQueryResultArray> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiQueryResultArray> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.MultiQueryResultArray getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

