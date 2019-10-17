// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog;

/**
 *
 *
 * <pre>
 * Request message for
 * [UpdateEntry][google.cloud.datacatalog.v1beta1.DataCatalog.UpdateEntry].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.UpdateEntryRequest}
 */
public final class UpdateEntryRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.UpdateEntryRequest)
    UpdateEntryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateEntryRequest.newBuilder() to construct.
  private UpdateEntryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateEntryRequest() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateEntryRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.cloud.datacatalog.Entry.Builder subBuilder = null;
              if (entry_ != null) {
                subBuilder = entry_.toBuilder();
              }
              entry_ =
                  input.readMessage(com.google.cloud.datacatalog.Entry.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entry_);
                entry_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.Datacatalog
        .internal_static_google_cloud_datacatalog_v1beta1_UpdateEntryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.Datacatalog
        .internal_static_google_cloud_datacatalog_v1beta1_UpdateEntryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.UpdateEntryRequest.class,
            com.google.cloud.datacatalog.UpdateEntryRequest.Builder.class);
  }

  public static final int ENTRY_FIELD_NUMBER = 1;
  private com.google.cloud.datacatalog.Entry entry_;
  /**
   *
   *
   * <pre>
   * Required. The updated entry.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public boolean hasEntry() {
    return entry_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The updated entry.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.datacatalog.Entry getEntry() {
    return entry_ == null ? com.google.cloud.datacatalog.Entry.getDefaultInstance() : entry_;
  }
  /**
   *
   *
   * <pre>
   * Required. The updated entry.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.datacatalog.EntryOrBuilder getEntryOrBuilder() {
    return getEntry();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Optional. The fields to update on the entry. If absent or empty, all
   * modifiable fields are updated.
   * Currently only `schema` field in Cloud Pub/Sub topic entries is modifiable.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional. The fields to update on the entry. If absent or empty, all
   * modifiable fields are updated.
   * Currently only `schema` field in Cloud Pub/Sub topic entries is modifiable.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The fields to update on the entry. If absent or empty, all
   * modifiable fields are updated.
   * Currently only `schema` field in Cloud Pub/Sub topic entries is modifiable.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (entry_ != null) {
      output.writeMessage(1, getEntry());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entry_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getEntry());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.datacatalog.UpdateEntryRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.UpdateEntryRequest other =
        (com.google.cloud.datacatalog.UpdateEntryRequest) obj;

    if (hasEntry() != other.hasEntry()) return false;
    if (hasEntry()) {
      if (!getEntry().equals(other.getEntry())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasEntry()) {
      hash = (37 * hash) + ENTRY_FIELD_NUMBER;
      hash = (53 * hash) + getEntry().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.UpdateEntryRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.UpdateEntryRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.UpdateEntryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.UpdateEntryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.UpdateEntryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.UpdateEntryRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.UpdateEntryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.UpdateEntryRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.UpdateEntryRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.UpdateEntryRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.UpdateEntryRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.UpdateEntryRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.datacatalog.UpdateEntryRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for
   * [UpdateEntry][google.cloud.datacatalog.v1beta1.DataCatalog.UpdateEntry].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.UpdateEntryRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.UpdateEntryRequest)
      com.google.cloud.datacatalog.UpdateEntryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_UpdateEntryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_UpdateEntryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.UpdateEntryRequest.class,
              com.google.cloud.datacatalog.UpdateEntryRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.UpdateEntryRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (entryBuilder_ == null) {
        entry_ = null;
      } else {
        entry_ = null;
        entryBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_UpdateEntryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.UpdateEntryRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.UpdateEntryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.UpdateEntryRequest build() {
      com.google.cloud.datacatalog.UpdateEntryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.UpdateEntryRequest buildPartial() {
      com.google.cloud.datacatalog.UpdateEntryRequest result =
          new com.google.cloud.datacatalog.UpdateEntryRequest(this);
      if (entryBuilder_ == null) {
        result.entry_ = entry_;
      } else {
        result.entry_ = entryBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datacatalog.UpdateEntryRequest) {
        return mergeFrom((com.google.cloud.datacatalog.UpdateEntryRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.UpdateEntryRequest other) {
      if (other == com.google.cloud.datacatalog.UpdateEntryRequest.getDefaultInstance())
        return this;
      if (other.hasEntry()) {
        mergeEntry(other.getEntry());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.datacatalog.UpdateEntryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datacatalog.UpdateEntryRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.datacatalog.Entry entry_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.Entry,
            com.google.cloud.datacatalog.Entry.Builder,
            com.google.cloud.datacatalog.EntryOrBuilder>
        entryBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The updated entry.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public boolean hasEntry() {
      return entryBuilder_ != null || entry_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated entry.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.Entry getEntry() {
      if (entryBuilder_ == null) {
        return entry_ == null ? com.google.cloud.datacatalog.Entry.getDefaultInstance() : entry_;
      } else {
        return entryBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The updated entry.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntry(com.google.cloud.datacatalog.Entry value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entry_ = value;
        onChanged();
      } else {
        entryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated entry.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntry(com.google.cloud.datacatalog.Entry.Builder builderForValue) {
      if (entryBuilder_ == null) {
        entry_ = builderForValue.build();
        onChanged();
      } else {
        entryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated entry.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEntry(com.google.cloud.datacatalog.Entry value) {
      if (entryBuilder_ == null) {
        if (entry_ != null) {
          entry_ =
              com.google.cloud.datacatalog.Entry.newBuilder(entry_).mergeFrom(value).buildPartial();
        } else {
          entry_ = value;
        }
        onChanged();
      } else {
        entryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated entry.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEntry() {
      if (entryBuilder_ == null) {
        entry_ = null;
        onChanged();
      } else {
        entry_ = null;
        entryBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated entry.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.Entry.Builder getEntryBuilder() {

      onChanged();
      return getEntryFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The updated entry.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.EntryOrBuilder getEntryOrBuilder() {
      if (entryBuilder_ != null) {
        return entryBuilder_.getMessageOrBuilder();
      } else {
        return entry_ == null ? com.google.cloud.datacatalog.Entry.getDefaultInstance() : entry_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The updated entry.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.Entry,
            com.google.cloud.datacatalog.Entry.Builder,
            com.google.cloud.datacatalog.EntryOrBuilder>
        getEntryFieldBuilder() {
      if (entryBuilder_ == null) {
        entryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.Entry,
                com.google.cloud.datacatalog.Entry.Builder,
                com.google.cloud.datacatalog.EntryOrBuilder>(
                getEntry(), getParentForChildren(), isClean());
        entry_ = null;
      }
      return entryBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. The fields to update on the entry. If absent or empty, all
     * modifiable fields are updated.
     * Currently only `schema` field in Cloud Pub/Sub topic entries is modifiable.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Optional. The fields to update on the entry. If absent or empty, all
     * modifiable fields are updated.
     * Currently only `schema` field in Cloud Pub/Sub topic entries is modifiable.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The fields to update on the entry. If absent or empty, all
     * modifiable fields are updated.
     * Currently only `schema` field in Cloud Pub/Sub topic entries is modifiable.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The fields to update on the entry. If absent or empty, all
     * modifiable fields are updated.
     * Currently only `schema` field in Cloud Pub/Sub topic entries is modifiable.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The fields to update on the entry. If absent or empty, all
     * modifiable fields are updated.
     * Currently only `schema` field in Cloud Pub/Sub topic entries is modifiable.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The fields to update on the entry. If absent or empty, all
     * modifiable fields are updated.
     * Currently only `schema` field in Cloud Pub/Sub topic entries is modifiable.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The fields to update on the entry. If absent or empty, all
     * modifiable fields are updated.
     * Currently only `schema` field in Cloud Pub/Sub topic entries is modifiable.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. The fields to update on the entry. If absent or empty, all
     * modifiable fields are updated.
     * Currently only `schema` field in Cloud Pub/Sub topic entries is modifiable.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The fields to update on the entry. If absent or empty, all
     * modifiable fields are updated.
     * Currently only `schema` field in Cloud Pub/Sub topic entries is modifiable.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.UpdateEntryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.UpdateEntryRequest)
  private static final com.google.cloud.datacatalog.UpdateEntryRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.UpdateEntryRequest();
  }

  public static com.google.cloud.datacatalog.UpdateEntryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEntryRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateEntryRequest>() {
        @java.lang.Override
        public UpdateEntryRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateEntryRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateEntryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEntryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.UpdateEntryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
