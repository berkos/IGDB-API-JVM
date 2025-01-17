// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.InvolvedCompany}
 */
public final class InvolvedCompany extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.InvolvedCompany)
    InvolvedCompanyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InvolvedCompany.newBuilder() to construct.
  private InvolvedCompany(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InvolvedCompany() {
    checksum_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InvolvedCompany();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_InvolvedCompany_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_InvolvedCompany_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.InvolvedCompany.class, proto.InvolvedCompany.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>uint64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int COMPANY_FIELD_NUMBER = 2;
  private proto.Company company_;
  /**
   * <code>.proto.Company company = 2;</code>
   * @return Whether the company field is set.
   */
  @java.lang.Override
  public boolean hasCompany() {
    return company_ != null;
  }
  /**
   * <code>.proto.Company company = 2;</code>
   * @return The company.
   */
  @java.lang.Override
  public proto.Company getCompany() {
    return company_ == null ? proto.Company.getDefaultInstance() : company_;
  }
  /**
   * <code>.proto.Company company = 2;</code>
   */
  @java.lang.Override
  public proto.CompanyOrBuilder getCompanyOrBuilder() {
    return getCompany();
  }

  public static final int CREATED_AT_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp createdAt_;
  /**
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   * @return Whether the createdAt field is set.
   */
  @java.lang.Override
  public boolean hasCreatedAt() {
    return createdAt_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   * @return The createdAt.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreatedAt() {
    return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
  }
  /**
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder() {
    return getCreatedAt();
  }

  public static final int DEVELOPER_FIELD_NUMBER = 4;
  private boolean developer_;
  /**
   * <code>bool developer = 4;</code>
   * @return The developer.
   */
  @java.lang.Override
  public boolean getDeveloper() {
    return developer_;
  }

  public static final int GAME_FIELD_NUMBER = 5;
  private proto.Game game_;
  /**
   * <code>.proto.Game game = 5;</code>
   * @return Whether the game field is set.
   */
  @java.lang.Override
  public boolean hasGame() {
    return game_ != null;
  }
  /**
   * <code>.proto.Game game = 5;</code>
   * @return The game.
   */
  @java.lang.Override
  public proto.Game getGame() {
    return game_ == null ? proto.Game.getDefaultInstance() : game_;
  }
  /**
   * <code>.proto.Game game = 5;</code>
   */
  @java.lang.Override
  public proto.GameOrBuilder getGameOrBuilder() {
    return getGame();
  }

  public static final int PORTING_FIELD_NUMBER = 6;
  private boolean porting_;
  /**
   * <code>bool porting = 6;</code>
   * @return The porting.
   */
  @java.lang.Override
  public boolean getPorting() {
    return porting_;
  }

  public static final int PUBLISHER_FIELD_NUMBER = 7;
  private boolean publisher_;
  /**
   * <code>bool publisher = 7;</code>
   * @return The publisher.
   */
  @java.lang.Override
  public boolean getPublisher() {
    return publisher_;
  }

  public static final int SUPPORTING_FIELD_NUMBER = 8;
  private boolean supporting_;
  /**
   * <code>bool supporting = 8;</code>
   * @return The supporting.
   */
  @java.lang.Override
  public boolean getSupporting() {
    return supporting_;
  }

  public static final int UPDATED_AT_FIELD_NUMBER = 9;
  private com.google.protobuf.Timestamp updatedAt_;
  /**
   * <code>.google.protobuf.Timestamp updated_at = 9;</code>
   * @return Whether the updatedAt field is set.
   */
  @java.lang.Override
  public boolean hasUpdatedAt() {
    return updatedAt_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp updated_at = 9;</code>
   * @return The updatedAt.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdatedAt() {
    return updatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
  }
  /**
   * <code>.google.protobuf.Timestamp updated_at = 9;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder() {
    return getUpdatedAt();
  }

  public static final int CHECKSUM_FIELD_NUMBER = 10;
  private volatile java.lang.Object checksum_;
  /**
   * <code>string checksum = 10;</code>
   * @return The checksum.
   */
  @java.lang.Override
  public java.lang.String getChecksum() {
    java.lang.Object ref = checksum_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      checksum_ = s;
      return s;
    }
  }
  /**
   * <code>string checksum = 10;</code>
   * @return The bytes for checksum.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChecksumBytes() {
    java.lang.Object ref = checksum_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      checksum_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static proto.InvolvedCompany parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.InvolvedCompany parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.InvolvedCompany parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.InvolvedCompany parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.InvolvedCompany parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.InvolvedCompany parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.InvolvedCompany parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.InvolvedCompany parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.InvolvedCompany parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.InvolvedCompany parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.InvolvedCompany parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.InvolvedCompany parseFrom(
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
  public static Builder newBuilder(proto.InvolvedCompany prototype) {
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
   * Protobuf type {@code proto.InvolvedCompany}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.InvolvedCompany)
      proto.InvolvedCompanyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_InvolvedCompany_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_InvolvedCompany_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.InvolvedCompany.class, proto.InvolvedCompany.Builder.class);
    }

    // Construct using proto.InvolvedCompany.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      if (companyBuilder_ == null) {
        company_ = null;
      } else {
        company_ = null;
        companyBuilder_ = null;
      }
      if (createdAtBuilder_ == null) {
        createdAt_ = null;
      } else {
        createdAt_ = null;
        createdAtBuilder_ = null;
      }
      developer_ = false;

      if (gameBuilder_ == null) {
        game_ = null;
      } else {
        game_ = null;
        gameBuilder_ = null;
      }
      porting_ = false;

      publisher_ = false;

      supporting_ = false;

      if (updatedAtBuilder_ == null) {
        updatedAt_ = null;
      } else {
        updatedAt_ = null;
        updatedAtBuilder_ = null;
      }
      checksum_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_InvolvedCompany_descriptor;
    }

    @java.lang.Override
    public proto.InvolvedCompany getDefaultInstanceForType() {
      return proto.InvolvedCompany.getDefaultInstance();
    }

    @java.lang.Override
    public proto.InvolvedCompany build() {
      proto.InvolvedCompany result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.InvolvedCompany buildPartial() {
      proto.InvolvedCompany result = new proto.InvolvedCompany(this);
      result.id_ = id_;
      if (companyBuilder_ == null) {
        result.company_ = company_;
      } else {
        result.company_ = companyBuilder_.build();
      }
      if (createdAtBuilder_ == null) {
        result.createdAt_ = createdAt_;
      } else {
        result.createdAt_ = createdAtBuilder_.build();
      }
      result.developer_ = developer_;
      if (gameBuilder_ == null) {
        result.game_ = game_;
      } else {
        result.game_ = gameBuilder_.build();
      }
      result.porting_ = porting_;
      result.publisher_ = publisher_;
      result.supporting_ = supporting_;
      if (updatedAtBuilder_ == null) {
        result.updatedAt_ = updatedAt_;
      } else {
        result.updatedAt_ = updatedAtBuilder_.build();
      }
      result.checksum_ = checksum_;
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

    private long id_ ;
    /**
     * <code>uint64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>uint64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private proto.Company company_;
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Company, proto.Company.Builder, proto.CompanyOrBuilder> companyBuilder_;
    /**
     * <code>.proto.Company company = 2;</code>
     * @return Whether the company field is set.
     */
    public boolean hasCompany() {
      return companyBuilder_ != null || company_ != null;
    }
    /**
     * <code>.proto.Company company = 2;</code>
     * @return The company.
     */
    public proto.Company getCompany() {
      if (companyBuilder_ == null) {
        return company_ == null ? proto.Company.getDefaultInstance() : company_;
      } else {
        return companyBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.Company company = 2;</code>
     */
    public Builder setCompany(proto.Company value) {
      if (companyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        company_ = value;
        onChanged();
      } else {
        companyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto.Company company = 2;</code>
     */
    public Builder setCompany(
        proto.Company.Builder builderForValue) {
      if (companyBuilder_ == null) {
        company_ = builderForValue.build();
        onChanged();
      } else {
        companyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto.Company company = 2;</code>
     */
    public Builder mergeCompany(proto.Company value) {
      if (companyBuilder_ == null) {
        if (company_ != null) {
          company_ =
            proto.Company.newBuilder(company_).mergeFrom(value).buildPartial();
        } else {
          company_ = value;
        }
        onChanged();
      } else {
        companyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto.Company company = 2;</code>
     */
    public Builder clearCompany() {
      if (companyBuilder_ == null) {
        company_ = null;
        onChanged();
      } else {
        company_ = null;
        companyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto.Company company = 2;</code>
     */
    public proto.Company.Builder getCompanyBuilder() {
      
      onChanged();
      return getCompanyFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.Company company = 2;</code>
     */
    public proto.CompanyOrBuilder getCompanyOrBuilder() {
      if (companyBuilder_ != null) {
        return companyBuilder_.getMessageOrBuilder();
      } else {
        return company_ == null ?
            proto.Company.getDefaultInstance() : company_;
      }
    }
    /**
     * <code>.proto.Company company = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Company, proto.Company.Builder, proto.CompanyOrBuilder> 
        getCompanyFieldBuilder() {
      if (companyBuilder_ == null) {
        companyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            proto.Company, proto.Company.Builder, proto.CompanyOrBuilder>(
                getCompany(),
                getParentForChildren(),
                isClean());
        company_ = null;
      }
      return companyBuilder_;
    }

    private com.google.protobuf.Timestamp createdAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createdAtBuilder_;
    /**
     * <code>.google.protobuf.Timestamp created_at = 3;</code>
     * @return Whether the createdAt field is set.
     */
    public boolean hasCreatedAt() {
      return createdAtBuilder_ != null || createdAt_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 3;</code>
     * @return The createdAt.
     */
    public com.google.protobuf.Timestamp getCreatedAt() {
      if (createdAtBuilder_ == null) {
        return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
      } else {
        return createdAtBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 3;</code>
     */
    public Builder setCreatedAt(com.google.protobuf.Timestamp value) {
      if (createdAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createdAt_ = value;
        onChanged();
      } else {
        createdAtBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 3;</code>
     */
    public Builder setCreatedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createdAtBuilder_ == null) {
        createdAt_ = builderForValue.build();
        onChanged();
      } else {
        createdAtBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 3;</code>
     */
    public Builder mergeCreatedAt(com.google.protobuf.Timestamp value) {
      if (createdAtBuilder_ == null) {
        if (createdAt_ != null) {
          createdAt_ =
            com.google.protobuf.Timestamp.newBuilder(createdAt_).mergeFrom(value).buildPartial();
        } else {
          createdAt_ = value;
        }
        onChanged();
      } else {
        createdAtBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 3;</code>
     */
    public Builder clearCreatedAt() {
      if (createdAtBuilder_ == null) {
        createdAt_ = null;
        onChanged();
      } else {
        createdAt_ = null;
        createdAtBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreatedAtBuilder() {
      
      onChanged();
      return getCreatedAtFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder() {
      if (createdAtBuilder_ != null) {
        return createdAtBuilder_.getMessageOrBuilder();
      } else {
        return createdAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreatedAtFieldBuilder() {
      if (createdAtBuilder_ == null) {
        createdAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreatedAt(),
                getParentForChildren(),
                isClean());
        createdAt_ = null;
      }
      return createdAtBuilder_;
    }

    private boolean developer_ ;
    /**
     * <code>bool developer = 4;</code>
     * @return The developer.
     */
    @java.lang.Override
    public boolean getDeveloper() {
      return developer_;
    }
    /**
     * <code>bool developer = 4;</code>
     * @param value The developer to set.
     * @return This builder for chaining.
     */
    public Builder setDeveloper(boolean value) {
      
      developer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool developer = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeveloper() {
      
      developer_ = false;
      onChanged();
      return this;
    }

    private proto.Game game_;
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Game, proto.Game.Builder, proto.GameOrBuilder> gameBuilder_;
    /**
     * <code>.proto.Game game = 5;</code>
     * @return Whether the game field is set.
     */
    public boolean hasGame() {
      return gameBuilder_ != null || game_ != null;
    }
    /**
     * <code>.proto.Game game = 5;</code>
     * @return The game.
     */
    public proto.Game getGame() {
      if (gameBuilder_ == null) {
        return game_ == null ? proto.Game.getDefaultInstance() : game_;
      } else {
        return gameBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.Game game = 5;</code>
     */
    public Builder setGame(proto.Game value) {
      if (gameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        game_ = value;
        onChanged();
      } else {
        gameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto.Game game = 5;</code>
     */
    public Builder setGame(
        proto.Game.Builder builderForValue) {
      if (gameBuilder_ == null) {
        game_ = builderForValue.build();
        onChanged();
      } else {
        gameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto.Game game = 5;</code>
     */
    public Builder mergeGame(proto.Game value) {
      if (gameBuilder_ == null) {
        if (game_ != null) {
          game_ =
            proto.Game.newBuilder(game_).mergeFrom(value).buildPartial();
        } else {
          game_ = value;
        }
        onChanged();
      } else {
        gameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto.Game game = 5;</code>
     */
    public Builder clearGame() {
      if (gameBuilder_ == null) {
        game_ = null;
        onChanged();
      } else {
        game_ = null;
        gameBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto.Game game = 5;</code>
     */
    public proto.Game.Builder getGameBuilder() {
      
      onChanged();
      return getGameFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.Game game = 5;</code>
     */
    public proto.GameOrBuilder getGameOrBuilder() {
      if (gameBuilder_ != null) {
        return gameBuilder_.getMessageOrBuilder();
      } else {
        return game_ == null ?
            proto.Game.getDefaultInstance() : game_;
      }
    }
    /**
     * <code>.proto.Game game = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Game, proto.Game.Builder, proto.GameOrBuilder> 
        getGameFieldBuilder() {
      if (gameBuilder_ == null) {
        gameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            proto.Game, proto.Game.Builder, proto.GameOrBuilder>(
                getGame(),
                getParentForChildren(),
                isClean());
        game_ = null;
      }
      return gameBuilder_;
    }

    private boolean porting_ ;
    /**
     * <code>bool porting = 6;</code>
     * @return The porting.
     */
    @java.lang.Override
    public boolean getPorting() {
      return porting_;
    }
    /**
     * <code>bool porting = 6;</code>
     * @param value The porting to set.
     * @return This builder for chaining.
     */
    public Builder setPorting(boolean value) {
      
      porting_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool porting = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPorting() {
      
      porting_ = false;
      onChanged();
      return this;
    }

    private boolean publisher_ ;
    /**
     * <code>bool publisher = 7;</code>
     * @return The publisher.
     */
    @java.lang.Override
    public boolean getPublisher() {
      return publisher_;
    }
    /**
     * <code>bool publisher = 7;</code>
     * @param value The publisher to set.
     * @return This builder for chaining.
     */
    public Builder setPublisher(boolean value) {
      
      publisher_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool publisher = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearPublisher() {
      
      publisher_ = false;
      onChanged();
      return this;
    }

    private boolean supporting_ ;
    /**
     * <code>bool supporting = 8;</code>
     * @return The supporting.
     */
    @java.lang.Override
    public boolean getSupporting() {
      return supporting_;
    }
    /**
     * <code>bool supporting = 8;</code>
     * @param value The supporting to set.
     * @return This builder for chaining.
     */
    public Builder setSupporting(boolean value) {
      
      supporting_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool supporting = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearSupporting() {
      
      supporting_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp updatedAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> updatedAtBuilder_;
    /**
     * <code>.google.protobuf.Timestamp updated_at = 9;</code>
     * @return Whether the updatedAt field is set.
     */
    public boolean hasUpdatedAt() {
      return updatedAtBuilder_ != null || updatedAt_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 9;</code>
     * @return The updatedAt.
     */
    public com.google.protobuf.Timestamp getUpdatedAt() {
      if (updatedAtBuilder_ == null) {
        return updatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
      } else {
        return updatedAtBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 9;</code>
     */
    public Builder setUpdatedAt(com.google.protobuf.Timestamp value) {
      if (updatedAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updatedAt_ = value;
        onChanged();
      } else {
        updatedAtBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 9;</code>
     */
    public Builder setUpdatedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updatedAtBuilder_ == null) {
        updatedAt_ = builderForValue.build();
        onChanged();
      } else {
        updatedAtBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 9;</code>
     */
    public Builder mergeUpdatedAt(com.google.protobuf.Timestamp value) {
      if (updatedAtBuilder_ == null) {
        if (updatedAt_ != null) {
          updatedAt_ =
            com.google.protobuf.Timestamp.newBuilder(updatedAt_).mergeFrom(value).buildPartial();
        } else {
          updatedAt_ = value;
        }
        onChanged();
      } else {
        updatedAtBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 9;</code>
     */
    public Builder clearUpdatedAt() {
      if (updatedAtBuilder_ == null) {
        updatedAt_ = null;
        onChanged();
      } else {
        updatedAt_ = null;
        updatedAtBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 9;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdatedAtBuilder() {
      
      onChanged();
      return getUpdatedAtFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 9;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder() {
      if (updatedAtBuilder_ != null) {
        return updatedAtBuilder_.getMessageOrBuilder();
      } else {
        return updatedAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 9;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getUpdatedAtFieldBuilder() {
      if (updatedAtBuilder_ == null) {
        updatedAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getUpdatedAt(),
                getParentForChildren(),
                isClean());
        updatedAt_ = null;
      }
      return updatedAtBuilder_;
    }

    private java.lang.Object checksum_ = "";
    /**
     * <code>string checksum = 10;</code>
     * @return The checksum.
     */
    public java.lang.String getChecksum() {
      java.lang.Object ref = checksum_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        checksum_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string checksum = 10;</code>
     * @return The bytes for checksum.
     */
    public com.google.protobuf.ByteString
        getChecksumBytes() {
      java.lang.Object ref = checksum_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        checksum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string checksum = 10;</code>
     * @param value The checksum to set.
     * @return This builder for chaining.
     */
    public Builder setChecksum(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      checksum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string checksum = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearChecksum() {
      
      checksum_ = getDefaultInstance().getChecksum();
      onChanged();
      return this;
    }
    /**
     * <code>string checksum = 10;</code>
     * @param value The bytes for checksum to set.
     * @return This builder for chaining.
     */
    public Builder setChecksumBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      checksum_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:proto.InvolvedCompany)
  }

  // @@protoc_insertion_point(class_scope:proto.InvolvedCompany)
  private static final proto.InvolvedCompany DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.InvolvedCompany();
  }

  public static proto.InvolvedCompany getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InvolvedCompany>
      PARSER = new com.google.protobuf.AbstractParser<InvolvedCompany>() {
    @java.lang.Override
    public InvolvedCompany parsePartialFrom(
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

  public static com.google.protobuf.Parser<InvolvedCompany> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InvolvedCompany> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.InvolvedCompany getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

