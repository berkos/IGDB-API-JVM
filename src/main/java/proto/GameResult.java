// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.GameResult}
 */
public final class GameResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.GameResult)
    GameResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GameResult.newBuilder() to construct.
  private GameResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GameResult() {
    games_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GameResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_GameResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_GameResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.GameResult.class, proto.GameResult.Builder.class);
  }

  public static final int GAMES_FIELD_NUMBER = 1;
  private java.util.List<proto.Game> games_;
  /**
   * <code>repeated .proto.Game games = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.Game> getGamesList() {
    return games_;
  }
  /**
   * <code>repeated .proto.Game games = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.GameOrBuilder> 
      getGamesOrBuilderList() {
    return games_;
  }
  /**
   * <code>repeated .proto.Game games = 1;</code>
   */
  @java.lang.Override
  public int getGamesCount() {
    return games_.size();
  }
  /**
   * <code>repeated .proto.Game games = 1;</code>
   */
  @java.lang.Override
  public proto.Game getGames(int index) {
    return games_.get(index);
  }
  /**
   * <code>repeated .proto.Game games = 1;</code>
   */
  @java.lang.Override
  public proto.GameOrBuilder getGamesOrBuilder(
      int index) {
    return games_.get(index);
  }

  public static proto.GameResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GameResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GameResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GameResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GameResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GameResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GameResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.GameResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.GameResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.GameResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.GameResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.GameResult parseFrom(
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
  public static Builder newBuilder(proto.GameResult prototype) {
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
   * Protobuf type {@code proto.GameResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.GameResult)
      proto.GameResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_GameResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_GameResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.GameResult.class, proto.GameResult.Builder.class);
    }

    // Construct using proto.GameResult.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (gamesBuilder_ == null) {
        games_ = java.util.Collections.emptyList();
      } else {
        games_ = null;
        gamesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_GameResult_descriptor;
    }

    @java.lang.Override
    public proto.GameResult getDefaultInstanceForType() {
      return proto.GameResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.GameResult build() {
      proto.GameResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.GameResult buildPartial() {
      proto.GameResult result = new proto.GameResult(this);
      int from_bitField0_ = bitField0_;
      if (gamesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          games_ = java.util.Collections.unmodifiableList(games_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.games_ = games_;
      } else {
        result.games_ = gamesBuilder_.build();
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

    private java.util.List<proto.Game> games_ =
      java.util.Collections.emptyList();
    private void ensureGamesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        games_ = new java.util.ArrayList<proto.Game>(games_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Game, proto.Game.Builder, proto.GameOrBuilder> gamesBuilder_;

    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public java.util.List<proto.Game> getGamesList() {
      if (gamesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(games_);
      } else {
        return gamesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public int getGamesCount() {
      if (gamesBuilder_ == null) {
        return games_.size();
      } else {
        return gamesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public proto.Game getGames(int index) {
      if (gamesBuilder_ == null) {
        return games_.get(index);
      } else {
        return gamesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public Builder setGames(
        int index, proto.Game value) {
      if (gamesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGamesIsMutable();
        games_.set(index, value);
        onChanged();
      } else {
        gamesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public Builder setGames(
        int index, proto.Game.Builder builderForValue) {
      if (gamesBuilder_ == null) {
        ensureGamesIsMutable();
        games_.set(index, builderForValue.build());
        onChanged();
      } else {
        gamesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public Builder addGames(proto.Game value) {
      if (gamesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGamesIsMutable();
        games_.add(value);
        onChanged();
      } else {
        gamesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public Builder addGames(
        int index, proto.Game value) {
      if (gamesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGamesIsMutable();
        games_.add(index, value);
        onChanged();
      } else {
        gamesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public Builder addGames(
        proto.Game.Builder builderForValue) {
      if (gamesBuilder_ == null) {
        ensureGamesIsMutable();
        games_.add(builderForValue.build());
        onChanged();
      } else {
        gamesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public Builder addGames(
        int index, proto.Game.Builder builderForValue) {
      if (gamesBuilder_ == null) {
        ensureGamesIsMutable();
        games_.add(index, builderForValue.build());
        onChanged();
      } else {
        gamesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public Builder addAllGames(
        java.lang.Iterable<? extends proto.Game> values) {
      if (gamesBuilder_ == null) {
        ensureGamesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, games_);
        onChanged();
      } else {
        gamesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public Builder clearGames() {
      if (gamesBuilder_ == null) {
        games_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        gamesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public Builder removeGames(int index) {
      if (gamesBuilder_ == null) {
        ensureGamesIsMutable();
        games_.remove(index);
        onChanged();
      } else {
        gamesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public proto.Game.Builder getGamesBuilder(
        int index) {
      return getGamesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public proto.GameOrBuilder getGamesOrBuilder(
        int index) {
      if (gamesBuilder_ == null) {
        return games_.get(index);  } else {
        return gamesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public java.util.List<? extends proto.GameOrBuilder> 
         getGamesOrBuilderList() {
      if (gamesBuilder_ != null) {
        return gamesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(games_);
      }
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public proto.Game.Builder addGamesBuilder() {
      return getGamesFieldBuilder().addBuilder(
          proto.Game.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public proto.Game.Builder addGamesBuilder(
        int index) {
      return getGamesFieldBuilder().addBuilder(
          index, proto.Game.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Game games = 1;</code>
     */
    public java.util.List<proto.Game.Builder> 
         getGamesBuilderList() {
      return getGamesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Game, proto.Game.Builder, proto.GameOrBuilder> 
        getGamesFieldBuilder() {
      if (gamesBuilder_ == null) {
        gamesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.Game, proto.Game.Builder, proto.GameOrBuilder>(
                games_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        games_ = null;
      }
      return gamesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.GameResult)
  }

  // @@protoc_insertion_point(class_scope:proto.GameResult)
  private static final proto.GameResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.GameResult();
  }

  public static proto.GameResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameResult>
      PARSER = new com.google.protobuf.AbstractParser<GameResult>() {
    @java.lang.Override
    public GameResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<GameResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.GameResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

