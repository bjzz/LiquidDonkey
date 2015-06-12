/* 
 * The MIT License
 *
 * Copyright 2015 Ahseya.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.horrorho.liquiddonkey.cloud.protobuf;

public final class ChunkServer {
  private ChunkServer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ChunkInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.ChunkInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bytes chunk_checksum = 1;</code>
     */
    boolean hasChunkChecksum();
    /**
     * <code>required bytes chunk_checksum = 1;</code>
     */
    com.google.protobuf.ByteString getChunkChecksum();

    /**
     * <code>optional bytes chunk_encryption_key = 2;</code>
     */
    boolean hasChunkEncryptionKey();
    /**
     * <code>optional bytes chunk_encryption_key = 2;</code>
     */
    com.google.protobuf.ByteString getChunkEncryptionKey();

    /**
     * <code>required uint32 chunk_length = 3;</code>
     */
    boolean hasChunkLength();
    /**
     * <code>required uint32 chunk_length = 3;</code>
     */
    int getChunkLength();
  }
  /**
   * Protobuf type {@code chunkserver.ChunkInfo}
   */
  public static final class ChunkInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.ChunkInfo)
      ChunkInfoOrBuilder {
    // Use ChunkInfo.newBuilder() to construct.
    private ChunkInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ChunkInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ChunkInfo defaultInstance;
    public static ChunkInfo getDefaultInstance() {
      return defaultInstance;
    }

    public ChunkInfo getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ChunkInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              chunkChecksum_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              chunkEncryptionKey_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              chunkLength_ = input.readUInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_ChunkInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_ChunkInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.ChunkInfo.class, ChunkServer.ChunkInfo.Builder.class);
    }

    public static com.google.protobuf.Parser<ChunkInfo> PARSER =
        new com.google.protobuf.AbstractParser<ChunkInfo>() {
      public ChunkInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChunkInfo(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ChunkInfo> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int CHUNK_CHECKSUM_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString chunkChecksum_;
    /**
     * <code>required bytes chunk_checksum = 1;</code>
     */
    public boolean hasChunkChecksum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bytes chunk_checksum = 1;</code>
     */
    public com.google.protobuf.ByteString getChunkChecksum() {
      return chunkChecksum_;
    }

    public static final int CHUNK_ENCRYPTION_KEY_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString chunkEncryptionKey_;
    /**
     * <code>optional bytes chunk_encryption_key = 2;</code>
     */
    public boolean hasChunkEncryptionKey() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bytes chunk_encryption_key = 2;</code>
     */
    public com.google.protobuf.ByteString getChunkEncryptionKey() {
      return chunkEncryptionKey_;
    }

    public static final int CHUNK_LENGTH_FIELD_NUMBER = 3;
    private int chunkLength_;
    /**
     * <code>required uint32 chunk_length = 3;</code>
     */
    public boolean hasChunkLength() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required uint32 chunk_length = 3;</code>
     */
    public int getChunkLength() {
      return chunkLength_;
    }

    private void initFields() {
      chunkChecksum_ = com.google.protobuf.ByteString.EMPTY;
      chunkEncryptionKey_ = com.google.protobuf.ByteString.EMPTY;
      chunkLength_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasChunkChecksum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasChunkLength()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, chunkChecksum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, chunkEncryptionKey_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, chunkLength_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, chunkChecksum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, chunkEncryptionKey_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, chunkLength_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.ChunkInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.ChunkInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.ChunkInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.ChunkInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.ChunkInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.ChunkInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.ChunkInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.ChunkInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.ChunkInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.ChunkInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.ChunkInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.ChunkInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.ChunkInfo)
        ChunkServer.ChunkInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_ChunkInfo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_ChunkInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.ChunkInfo.class, ChunkServer.ChunkInfo.Builder.class);
      }

      // Construct using Chunkserver.ChunkInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        chunkChecksum_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        chunkEncryptionKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        chunkLength_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_ChunkInfo_descriptor;
      }

      public ChunkServer.ChunkInfo getDefaultInstanceForType() {
        return ChunkServer.ChunkInfo.getDefaultInstance();
      }

      public ChunkServer.ChunkInfo build() {
        ChunkServer.ChunkInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.ChunkInfo buildPartial() {
        ChunkServer.ChunkInfo result = new ChunkServer.ChunkInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.chunkChecksum_ = chunkChecksum_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.chunkEncryptionKey_ = chunkEncryptionKey_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.chunkLength_ = chunkLength_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.ChunkInfo) {
          return mergeFrom((ChunkServer.ChunkInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.ChunkInfo other) {
        if (other == ChunkServer.ChunkInfo.getDefaultInstance()) return this;
        if (other.hasChunkChecksum()) {
          setChunkChecksum(other.getChunkChecksum());
        }
        if (other.hasChunkEncryptionKey()) {
          setChunkEncryptionKey(other.getChunkEncryptionKey());
        }
        if (other.hasChunkLength()) {
          setChunkLength(other.getChunkLength());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasChunkChecksum()) {
          
          return false;
        }
        if (!hasChunkLength()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.ChunkInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.ChunkInfo) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString chunkChecksum_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes chunk_checksum = 1;</code>
       */
      public boolean hasChunkChecksum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bytes chunk_checksum = 1;</code>
       */
      public com.google.protobuf.ByteString getChunkChecksum() {
        return chunkChecksum_;
      }
      /**
       * <code>required bytes chunk_checksum = 1;</code>
       */
      public Builder setChunkChecksum(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        chunkChecksum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes chunk_checksum = 1;</code>
       */
      public Builder clearChunkChecksum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        chunkChecksum_ = getDefaultInstance().getChunkChecksum();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString chunkEncryptionKey_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes chunk_encryption_key = 2;</code>
       */
      public boolean hasChunkEncryptionKey() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bytes chunk_encryption_key = 2;</code>
       */
      public com.google.protobuf.ByteString getChunkEncryptionKey() {
        return chunkEncryptionKey_;
      }
      /**
       * <code>optional bytes chunk_encryption_key = 2;</code>
       */
      public Builder setChunkEncryptionKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        chunkEncryptionKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes chunk_encryption_key = 2;</code>
       */
      public Builder clearChunkEncryptionKey() {
        bitField0_ = (bitField0_ & ~0x00000002);
        chunkEncryptionKey_ = getDefaultInstance().getChunkEncryptionKey();
        onChanged();
        return this;
      }

      private int chunkLength_ ;
      /**
       * <code>required uint32 chunk_length = 3;</code>
       */
      public boolean hasChunkLength() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required uint32 chunk_length = 3;</code>
       */
      public int getChunkLength() {
        return chunkLength_;
      }
      /**
       * <code>required uint32 chunk_length = 3;</code>
       */
      public Builder setChunkLength(int value) {
        bitField0_ |= 0x00000004;
        chunkLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 chunk_length = 3;</code>
       */
      public Builder clearChunkLength() {
        bitField0_ = (bitField0_ & ~0x00000004);
        chunkLength_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.ChunkInfo)
    }

    static {
      defaultInstance = new ChunkInfo(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.ChunkInfo)
  }

  public interface NameValuePairOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.NameValuePair)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string name = 1;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>required string value = 2;</code>
     */
    boolean hasValue();
    /**
     * <code>required string value = 2;</code>
     */
    java.lang.String getValue();
    /**
     * <code>required string value = 2;</code>
     */
    com.google.protobuf.ByteString
        getValueBytes();
  }
  /**
   * Protobuf type {@code chunkserver.NameValuePair}
   */
  public static final class NameValuePair extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.NameValuePair)
      NameValuePairOrBuilder {
    // Use NameValuePair.newBuilder() to construct.
    private NameValuePair(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private NameValuePair(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final NameValuePair defaultInstance;
    public static NameValuePair getDefaultInstance() {
      return defaultInstance;
    }

    public NameValuePair getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private NameValuePair(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              name_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              value_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_NameValuePair_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_NameValuePair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.NameValuePair.class, ChunkServer.NameValuePair.Builder.class);
    }

    public static com.google.protobuf.Parser<NameValuePair> PARSER =
        new com.google.protobuf.AbstractParser<NameValuePair>() {
      public NameValuePair parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NameValuePair(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<NameValuePair> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    /**
     * <code>required string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private java.lang.Object value_;
    /**
     * <code>required string value = 2;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string value = 2;</code>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          value_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string value = 2;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      name_ = "";
      value_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasValue()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getValueBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getValueBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.NameValuePair parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.NameValuePair parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.NameValuePair parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.NameValuePair parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.NameValuePair parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.NameValuePair parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.NameValuePair parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.NameValuePair parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.NameValuePair parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.NameValuePair parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.NameValuePair prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.NameValuePair}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.NameValuePair)
        ChunkServer.NameValuePairOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_NameValuePair_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_NameValuePair_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.NameValuePair.class, ChunkServer.NameValuePair.Builder.class);
      }

      // Construct using Chunkserver.NameValuePair.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        value_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_NameValuePair_descriptor;
      }

      public ChunkServer.NameValuePair getDefaultInstanceForType() {
        return ChunkServer.NameValuePair.getDefaultInstance();
      }

      public ChunkServer.NameValuePair build() {
        ChunkServer.NameValuePair result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.NameValuePair buildPartial() {
        ChunkServer.NameValuePair result = new ChunkServer.NameValuePair(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.value_ = value_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.NameValuePair) {
          return mergeFrom((ChunkServer.NameValuePair)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.NameValuePair other) {
        if (other == ChunkServer.NameValuePair.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasValue()) {
          bitField0_ |= 0x00000002;
          value_ = other.value_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasName()) {
          
          return false;
        }
        if (!hasValue()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.NameValuePair parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.NameValuePair) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object value_ = "";
      /**
       * <code>required string value = 2;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string value = 2;</code>
       */
      public java.lang.String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            value_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string value = 2;</code>
       */
      public com.google.protobuf.ByteString
          getValueBytes() {
        java.lang.Object ref = value_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          value_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string value = 2;</code>
       */
      public Builder setValue(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string value = 2;</code>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      /**
       * <code>required string value = 2;</code>
       */
      public Builder setValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.NameValuePair)
    }

    static {
      defaultInstance = new NameValuePair(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.NameValuePair)
  }

  public interface HostInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.HostInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string hostname = 1;</code>
     */
    boolean hasHostname();
    /**
     * <code>required string hostname = 1;</code>
     */
    java.lang.String getHostname();
    /**
     * <code>required string hostname = 1;</code>
     */
    com.google.protobuf.ByteString
        getHostnameBytes();

    /**
     * <code>required uint32 port = 2;</code>
     */
    boolean hasPort();
    /**
     * <code>required uint32 port = 2;</code>
     */
    int getPort();

    /**
     * <code>required string method = 3;</code>
     */
    boolean hasMethod();
    /**
     * <code>required string method = 3;</code>
     */
    java.lang.String getMethod();
    /**
     * <code>required string method = 3;</code>
     */
    com.google.protobuf.ByteString
        getMethodBytes();

    /**
     * <code>required string uri = 4;</code>
     */
    boolean hasUri();
    /**
     * <code>required string uri = 4;</code>
     */
    java.lang.String getUri();
    /**
     * <code>required string uri = 4;</code>
     */
    com.google.protobuf.ByteString
        getUriBytes();

    /**
     * <code>required string transport_protocol = 5;</code>
     */
    boolean hasTransportProtocol();
    /**
     * <code>required string transport_protocol = 5;</code>
     */
    java.lang.String getTransportProtocol();
    /**
     * <code>required string transport_protocol = 5;</code>
     */
    com.google.protobuf.ByteString
        getTransportProtocolBytes();

    /**
     * <code>required string transport_protocol_version = 6;</code>
     */
    boolean hasTransportProtocolVersion();
    /**
     * <code>required string transport_protocol_version = 6;</code>
     */
    java.lang.String getTransportProtocolVersion();
    /**
     * <code>required string transport_protocol_version = 6;</code>
     */
    com.google.protobuf.ByteString
        getTransportProtocolVersionBytes();

    /**
     * <code>required string scheme = 7;</code>
     */
    boolean hasScheme();
    /**
     * <code>required string scheme = 7;</code>
     */
    java.lang.String getScheme();
    /**
     * <code>required string scheme = 7;</code>
     */
    com.google.protobuf.ByteString
        getSchemeBytes();

    /**
     * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
     */
    java.util.List<ChunkServer.NameValuePair> 
        getHeadersList();
    /**
     * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
     */
    ChunkServer.NameValuePair getHeaders(int index);
    /**
     * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
     */
    int getHeadersCount();
    /**
     * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
     */
    java.util.List<? extends ChunkServer.NameValuePairOrBuilder> 
        getHeadersOrBuilderList();
    /**
     * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
     */
    ChunkServer.NameValuePairOrBuilder getHeadersOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code chunkserver.HostInfo}
   */
  public static final class HostInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.HostInfo)
      HostInfoOrBuilder {
    // Use HostInfo.newBuilder() to construct.
    private HostInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private HostInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final HostInfo defaultInstance;
    public static HostInfo getDefaultInstance() {
      return defaultInstance;
    }

    public HostInfo getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private HostInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              hostname_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              port_ = input.readUInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              method_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              uri_ = bs;
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              transportProtocol_ = bs;
              break;
            }
            case 50: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              transportProtocolVersion_ = bs;
              break;
            }
            case 58: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000040;
              scheme_ = bs;
              break;
            }
            case 66: {
              if (!((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                headers_ = new java.util.ArrayList<ChunkServer.NameValuePair>();
                mutable_bitField0_ |= 0x00000080;
              }
              headers_.add(input.readMessage(ChunkServer.NameValuePair.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
          headers_ = java.util.Collections.unmodifiableList(headers_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_HostInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_HostInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.HostInfo.class, ChunkServer.HostInfo.Builder.class);
    }

    public static com.google.protobuf.Parser<HostInfo> PARSER =
        new com.google.protobuf.AbstractParser<HostInfo>() {
      public HostInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HostInfo(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<HostInfo> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int HOSTNAME_FIELD_NUMBER = 1;
    private java.lang.Object hostname_;
    /**
     * <code>required string hostname = 1;</code>
     */
    public boolean hasHostname() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string hostname = 1;</code>
     */
    public java.lang.String getHostname() {
      java.lang.Object ref = hostname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          hostname_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string hostname = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHostnameBytes() {
      java.lang.Object ref = hostname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PORT_FIELD_NUMBER = 2;
    private int port_;
    /**
     * <code>required uint32 port = 2;</code>
     */
    public boolean hasPort() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint32 port = 2;</code>
     */
    public int getPort() {
      return port_;
    }

    public static final int METHOD_FIELD_NUMBER = 3;
    private java.lang.Object method_;
    /**
     * <code>required string method = 3;</code>
     */
    public boolean hasMethod() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string method = 3;</code>
     */
    public java.lang.String getMethod() {
      java.lang.Object ref = method_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          method_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string method = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMethodBytes() {
      java.lang.Object ref = method_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        method_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int URI_FIELD_NUMBER = 4;
    private java.lang.Object uri_;
    /**
     * <code>required string uri = 4;</code>
     */
    public boolean hasUri() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string uri = 4;</code>
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          uri_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string uri = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TRANSPORT_PROTOCOL_FIELD_NUMBER = 5;
    private java.lang.Object transportProtocol_;
    /**
     * <code>required string transport_protocol = 5;</code>
     */
    public boolean hasTransportProtocol() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required string transport_protocol = 5;</code>
     */
    public java.lang.String getTransportProtocol() {
      java.lang.Object ref = transportProtocol_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          transportProtocol_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string transport_protocol = 5;</code>
     */
    public com.google.protobuf.ByteString
        getTransportProtocolBytes() {
      java.lang.Object ref = transportProtocol_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transportProtocol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TRANSPORT_PROTOCOL_VERSION_FIELD_NUMBER = 6;
    private java.lang.Object transportProtocolVersion_;
    /**
     * <code>required string transport_protocol_version = 6;</code>
     */
    public boolean hasTransportProtocolVersion() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required string transport_protocol_version = 6;</code>
     */
    public java.lang.String getTransportProtocolVersion() {
      java.lang.Object ref = transportProtocolVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          transportProtocolVersion_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string transport_protocol_version = 6;</code>
     */
    public com.google.protobuf.ByteString
        getTransportProtocolVersionBytes() {
      java.lang.Object ref = transportProtocolVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transportProtocolVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SCHEME_FIELD_NUMBER = 7;
    private java.lang.Object scheme_;
    /**
     * <code>required string scheme = 7;</code>
     */
    public boolean hasScheme() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>required string scheme = 7;</code>
     */
    public java.lang.String getScheme() {
      java.lang.Object ref = scheme_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          scheme_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string scheme = 7;</code>
     */
    public com.google.protobuf.ByteString
        getSchemeBytes() {
      java.lang.Object ref = scheme_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scheme_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HEADERS_FIELD_NUMBER = 8;
    private java.util.List<ChunkServer.NameValuePair> headers_;
    /**
     * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
     */
    public java.util.List<ChunkServer.NameValuePair> getHeadersList() {
      return headers_;
    }
    /**
     * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
     */
    public java.util.List<? extends ChunkServer.NameValuePairOrBuilder> 
        getHeadersOrBuilderList() {
      return headers_;
    }
    /**
     * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
     */
    public int getHeadersCount() {
      return headers_.size();
    }
    /**
     * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
     */
    public ChunkServer.NameValuePair getHeaders(int index) {
      return headers_.get(index);
    }
    /**
     * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
     */
    public ChunkServer.NameValuePairOrBuilder getHeadersOrBuilder(
        int index) {
      return headers_.get(index);
    }

    private void initFields() {
      hostname_ = "";
      port_ = 0;
      method_ = "";
      uri_ = "";
      transportProtocol_ = "";
      transportProtocolVersion_ = "";
      scheme_ = "";
      headers_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasHostname()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPort()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMethod()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUri()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTransportProtocol()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTransportProtocolVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasScheme()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getHeadersCount(); i++) {
        if (!getHeaders(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getHostnameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, port_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getMethodBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getUriBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getTransportProtocolBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, getTransportProtocolVersionBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(7, getSchemeBytes());
      }
      for (int i = 0; i < headers_.size(); i++) {
        output.writeMessage(8, headers_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getHostnameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, port_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMethodBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getUriBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getTransportProtocolBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, getTransportProtocolVersionBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, getSchemeBytes());
      }
      for (int i = 0; i < headers_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, headers_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.HostInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.HostInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.HostInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.HostInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.HostInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.HostInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.HostInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.HostInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.HostInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.HostInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.HostInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.HostInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.HostInfo)
        ChunkServer.HostInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_HostInfo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_HostInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.HostInfo.class, ChunkServer.HostInfo.Builder.class);
      }

      // Construct using Chunkserver.HostInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getHeadersFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        hostname_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        port_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        method_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        uri_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        transportProtocol_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        transportProtocolVersion_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        scheme_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        if (headersBuilder_ == null) {
          headers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000080);
        } else {
          headersBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_HostInfo_descriptor;
      }

      public ChunkServer.HostInfo getDefaultInstanceForType() {
        return ChunkServer.HostInfo.getDefaultInstance();
      }

      public ChunkServer.HostInfo build() {
        ChunkServer.HostInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.HostInfo buildPartial() {
        ChunkServer.HostInfo result = new ChunkServer.HostInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.hostname_ = hostname_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.port_ = port_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.method_ = method_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.uri_ = uri_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.transportProtocol_ = transportProtocol_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.transportProtocolVersion_ = transportProtocolVersion_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.scheme_ = scheme_;
        if (headersBuilder_ == null) {
          if (((bitField0_ & 0x00000080) == 0x00000080)) {
            headers_ = java.util.Collections.unmodifiableList(headers_);
            bitField0_ = (bitField0_ & ~0x00000080);
          }
          result.headers_ = headers_;
        } else {
          result.headers_ = headersBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.HostInfo) {
          return mergeFrom((ChunkServer.HostInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.HostInfo other) {
        if (other == ChunkServer.HostInfo.getDefaultInstance()) return this;
        if (other.hasHostname()) {
          bitField0_ |= 0x00000001;
          hostname_ = other.hostname_;
          onChanged();
        }
        if (other.hasPort()) {
          setPort(other.getPort());
        }
        if (other.hasMethod()) {
          bitField0_ |= 0x00000004;
          method_ = other.method_;
          onChanged();
        }
        if (other.hasUri()) {
          bitField0_ |= 0x00000008;
          uri_ = other.uri_;
          onChanged();
        }
        if (other.hasTransportProtocol()) {
          bitField0_ |= 0x00000010;
          transportProtocol_ = other.transportProtocol_;
          onChanged();
        }
        if (other.hasTransportProtocolVersion()) {
          bitField0_ |= 0x00000020;
          transportProtocolVersion_ = other.transportProtocolVersion_;
          onChanged();
        }
        if (other.hasScheme()) {
          bitField0_ |= 0x00000040;
          scheme_ = other.scheme_;
          onChanged();
        }
        if (headersBuilder_ == null) {
          if (!other.headers_.isEmpty()) {
            if (headers_.isEmpty()) {
              headers_ = other.headers_;
              bitField0_ = (bitField0_ & ~0x00000080);
            } else {
              ensureHeadersIsMutable();
              headers_.addAll(other.headers_);
            }
            onChanged();
          }
        } else {
          if (!other.headers_.isEmpty()) {
            if (headersBuilder_.isEmpty()) {
              headersBuilder_.dispose();
              headersBuilder_ = null;
              headers_ = other.headers_;
              bitField0_ = (bitField0_ & ~0x00000080);
              headersBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getHeadersFieldBuilder() : null;
            } else {
              headersBuilder_.addAllMessages(other.headers_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasHostname()) {
          
          return false;
        }
        if (!hasPort()) {
          
          return false;
        }
        if (!hasMethod()) {
          
          return false;
        }
        if (!hasUri()) {
          
          return false;
        }
        if (!hasTransportProtocol()) {
          
          return false;
        }
        if (!hasTransportProtocolVersion()) {
          
          return false;
        }
        if (!hasScheme()) {
          
          return false;
        }
        for (int i = 0; i < getHeadersCount(); i++) {
          if (!getHeaders(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.HostInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.HostInfo) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object hostname_ = "";
      /**
       * <code>required string hostname = 1;</code>
       */
      public boolean hasHostname() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string hostname = 1;</code>
       */
      public java.lang.String getHostname() {
        java.lang.Object ref = hostname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            hostname_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string hostname = 1;</code>
       */
      public com.google.protobuf.ByteString
          getHostnameBytes() {
        java.lang.Object ref = hostname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          hostname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string hostname = 1;</code>
       */
      public Builder setHostname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        hostname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string hostname = 1;</code>
       */
      public Builder clearHostname() {
        bitField0_ = (bitField0_ & ~0x00000001);
        hostname_ = getDefaultInstance().getHostname();
        onChanged();
        return this;
      }
      /**
       * <code>required string hostname = 1;</code>
       */
      public Builder setHostnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        hostname_ = value;
        onChanged();
        return this;
      }

      private int port_ ;
      /**
       * <code>required uint32 port = 2;</code>
       */
      public boolean hasPort() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint32 port = 2;</code>
       */
      public int getPort() {
        return port_;
      }
      /**
       * <code>required uint32 port = 2;</code>
       */
      public Builder setPort(int value) {
        bitField0_ |= 0x00000002;
        port_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 port = 2;</code>
       */
      public Builder clearPort() {
        bitField0_ = (bitField0_ & ~0x00000002);
        port_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object method_ = "";
      /**
       * <code>required string method = 3;</code>
       */
      public boolean hasMethod() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string method = 3;</code>
       */
      public java.lang.String getMethod() {
        java.lang.Object ref = method_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            method_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string method = 3;</code>
       */
      public com.google.protobuf.ByteString
          getMethodBytes() {
        java.lang.Object ref = method_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          method_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string method = 3;</code>
       */
      public Builder setMethod(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        method_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string method = 3;</code>
       */
      public Builder clearMethod() {
        bitField0_ = (bitField0_ & ~0x00000004);
        method_ = getDefaultInstance().getMethod();
        onChanged();
        return this;
      }
      /**
       * <code>required string method = 3;</code>
       */
      public Builder setMethodBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        method_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object uri_ = "";
      /**
       * <code>required string uri = 4;</code>
       */
      public boolean hasUri() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string uri = 4;</code>
       */
      public java.lang.String getUri() {
        java.lang.Object ref = uri_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            uri_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string uri = 4;</code>
       */
      public com.google.protobuf.ByteString
          getUriBytes() {
        java.lang.Object ref = uri_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          uri_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string uri = 4;</code>
       */
      public Builder setUri(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        uri_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string uri = 4;</code>
       */
      public Builder clearUri() {
        bitField0_ = (bitField0_ & ~0x00000008);
        uri_ = getDefaultInstance().getUri();
        onChanged();
        return this;
      }
      /**
       * <code>required string uri = 4;</code>
       */
      public Builder setUriBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        uri_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object transportProtocol_ = "";
      /**
       * <code>required string transport_protocol = 5;</code>
       */
      public boolean hasTransportProtocol() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required string transport_protocol = 5;</code>
       */
      public java.lang.String getTransportProtocol() {
        java.lang.Object ref = transportProtocol_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            transportProtocol_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string transport_protocol = 5;</code>
       */
      public com.google.protobuf.ByteString
          getTransportProtocolBytes() {
        java.lang.Object ref = transportProtocol_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          transportProtocol_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string transport_protocol = 5;</code>
       */
      public Builder setTransportProtocol(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        transportProtocol_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string transport_protocol = 5;</code>
       */
      public Builder clearTransportProtocol() {
        bitField0_ = (bitField0_ & ~0x00000010);
        transportProtocol_ = getDefaultInstance().getTransportProtocol();
        onChanged();
        return this;
      }
      /**
       * <code>required string transport_protocol = 5;</code>
       */
      public Builder setTransportProtocolBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        transportProtocol_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object transportProtocolVersion_ = "";
      /**
       * <code>required string transport_protocol_version = 6;</code>
       */
      public boolean hasTransportProtocolVersion() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required string transport_protocol_version = 6;</code>
       */
      public java.lang.String getTransportProtocolVersion() {
        java.lang.Object ref = transportProtocolVersion_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            transportProtocolVersion_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string transport_protocol_version = 6;</code>
       */
      public com.google.protobuf.ByteString
          getTransportProtocolVersionBytes() {
        java.lang.Object ref = transportProtocolVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          transportProtocolVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string transport_protocol_version = 6;</code>
       */
      public Builder setTransportProtocolVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        transportProtocolVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string transport_protocol_version = 6;</code>
       */
      public Builder clearTransportProtocolVersion() {
        bitField0_ = (bitField0_ & ~0x00000020);
        transportProtocolVersion_ = getDefaultInstance().getTransportProtocolVersion();
        onChanged();
        return this;
      }
      /**
       * <code>required string transport_protocol_version = 6;</code>
       */
      public Builder setTransportProtocolVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        transportProtocolVersion_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object scheme_ = "";
      /**
       * <code>required string scheme = 7;</code>
       */
      public boolean hasScheme() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>required string scheme = 7;</code>
       */
      public java.lang.String getScheme() {
        java.lang.Object ref = scheme_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            scheme_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string scheme = 7;</code>
       */
      public com.google.protobuf.ByteString
          getSchemeBytes() {
        java.lang.Object ref = scheme_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          scheme_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string scheme = 7;</code>
       */
      public Builder setScheme(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        scheme_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string scheme = 7;</code>
       */
      public Builder clearScheme() {
        bitField0_ = (bitField0_ & ~0x00000040);
        scheme_ = getDefaultInstance().getScheme();
        onChanged();
        return this;
      }
      /**
       * <code>required string scheme = 7;</code>
       */
      public Builder setSchemeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        scheme_ = value;
        onChanged();
        return this;
      }

      private java.util.List<ChunkServer.NameValuePair> headers_ =
        java.util.Collections.emptyList();
      private void ensureHeadersIsMutable() {
        if (!((bitField0_ & 0x00000080) == 0x00000080)) {
          headers_ = new java.util.ArrayList<ChunkServer.NameValuePair>(headers_);
          bitField0_ |= 0x00000080;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.NameValuePair, ChunkServer.NameValuePair.Builder, ChunkServer.NameValuePairOrBuilder> headersBuilder_;

      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public java.util.List<ChunkServer.NameValuePair> getHeadersList() {
        if (headersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(headers_);
        } else {
          return headersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public int getHeadersCount() {
        if (headersBuilder_ == null) {
          return headers_.size();
        } else {
          return headersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public ChunkServer.NameValuePair getHeaders(int index) {
        if (headersBuilder_ == null) {
          return headers_.get(index);
        } else {
          return headersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public Builder setHeaders(
          int index, ChunkServer.NameValuePair value) {
        if (headersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHeadersIsMutable();
          headers_.set(index, value);
          onChanged();
        } else {
          headersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public Builder setHeaders(
          int index, ChunkServer.NameValuePair.Builder builderForValue) {
        if (headersBuilder_ == null) {
          ensureHeadersIsMutable();
          headers_.set(index, builderForValue.build());
          onChanged();
        } else {
          headersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public Builder addHeaders(ChunkServer.NameValuePair value) {
        if (headersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHeadersIsMutable();
          headers_.add(value);
          onChanged();
        } else {
          headersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public Builder addHeaders(
          int index, ChunkServer.NameValuePair value) {
        if (headersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHeadersIsMutable();
          headers_.add(index, value);
          onChanged();
        } else {
          headersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public Builder addHeaders(
          ChunkServer.NameValuePair.Builder builderForValue) {
        if (headersBuilder_ == null) {
          ensureHeadersIsMutable();
          headers_.add(builderForValue.build());
          onChanged();
        } else {
          headersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public Builder addHeaders(
          int index, ChunkServer.NameValuePair.Builder builderForValue) {
        if (headersBuilder_ == null) {
          ensureHeadersIsMutable();
          headers_.add(index, builderForValue.build());
          onChanged();
        } else {
          headersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public Builder addAllHeaders(
          java.lang.Iterable<? extends ChunkServer.NameValuePair> values) {
        if (headersBuilder_ == null) {
          ensureHeadersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, headers_);
          onChanged();
        } else {
          headersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public Builder clearHeaders() {
        if (headersBuilder_ == null) {
          headers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000080);
          onChanged();
        } else {
          headersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public Builder removeHeaders(int index) {
        if (headersBuilder_ == null) {
          ensureHeadersIsMutable();
          headers_.remove(index);
          onChanged();
        } else {
          headersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public ChunkServer.NameValuePair.Builder getHeadersBuilder(
          int index) {
        return getHeadersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public ChunkServer.NameValuePairOrBuilder getHeadersOrBuilder(
          int index) {
        if (headersBuilder_ == null) {
          return headers_.get(index);  } else {
          return headersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public java.util.List<? extends ChunkServer.NameValuePairOrBuilder> 
           getHeadersOrBuilderList() {
        if (headersBuilder_ != null) {
          return headersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(headers_);
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public ChunkServer.NameValuePair.Builder addHeadersBuilder() {
        return getHeadersFieldBuilder().addBuilder(ChunkServer.NameValuePair.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public ChunkServer.NameValuePair.Builder addHeadersBuilder(
          int index) {
        return getHeadersFieldBuilder().addBuilder(index, ChunkServer.NameValuePair.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.NameValuePair headers = 8;</code>
       */
      public java.util.List<ChunkServer.NameValuePair.Builder> 
           getHeadersBuilderList() {
        return getHeadersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.NameValuePair, ChunkServer.NameValuePair.Builder, ChunkServer.NameValuePairOrBuilder> 
          getHeadersFieldBuilder() {
        if (headersBuilder_ == null) {
          headersBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.NameValuePair, ChunkServer.NameValuePair.Builder, ChunkServer.NameValuePairOrBuilder>(
                  headers_,
                  ((bitField0_ & 0x00000080) == 0x00000080),
                  getParentForChildren(),
                  isClean());
          headers_ = null;
        }
        return headersBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.HostInfo)
    }

    static {
      defaultInstance = new HostInfo(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.HostInfo)
  }

  public interface ErrorResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.ErrorResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string domain = 1;</code>
     */
    boolean hasDomain();
    /**
     * <code>required string domain = 1;</code>
     */
    java.lang.String getDomain();
    /**
     * <code>required string domain = 1;</code>
     */
    com.google.protobuf.ByteString
        getDomainBytes();

    /**
     * <code>required int32 error_code = 2;</code>
     */
    boolean hasErrorCode();
    /**
     * <code>required int32 error_code = 2;</code>
     */
    int getErrorCode();

    /**
     * <code>optional string error_description = 3;</code>
     */
    boolean hasErrorDescription();
    /**
     * <code>optional string error_description = 3;</code>
     */
    java.lang.String getErrorDescription();
    /**
     * <code>optional string error_description = 3;</code>
     */
    com.google.protobuf.ByteString
        getErrorDescriptionBytes();

    /**
     * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
     */
    java.util.List<ChunkServer.ErrorResponse> 
        getUnderlyingErrorsList();
    /**
     * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
     */
    ChunkServer.ErrorResponse getUnderlyingErrors(int index);
    /**
     * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
     */
    int getUnderlyingErrorsCount();
    /**
     * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
     */
    java.util.List<? extends ChunkServer.ErrorResponseOrBuilder> 
        getUnderlyingErrorsOrBuilderList();
    /**
     * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
     */
    ChunkServer.ErrorResponseOrBuilder getUnderlyingErrorsOrBuilder(
        int index);

    /**
     * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
     */
    java.util.List<ChunkServer.NameValuePair> 
        getNameValuePairList();
    /**
     * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
     */
    ChunkServer.NameValuePair getNameValuePair(int index);
    /**
     * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
     */
    int getNameValuePairCount();
    /**
     * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
     */
    java.util.List<? extends ChunkServer.NameValuePairOrBuilder> 
        getNameValuePairOrBuilderList();
    /**
     * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
     */
    ChunkServer.NameValuePairOrBuilder getNameValuePairOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code chunkserver.ErrorResponse}
   */
  public static final class ErrorResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.ErrorResponse)
      ErrorResponseOrBuilder {
    // Use ErrorResponse.newBuilder() to construct.
    private ErrorResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ErrorResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ErrorResponse defaultInstance;
    public static ErrorResponse getDefaultInstance() {
      return defaultInstance;
    }

    public ErrorResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ErrorResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              domain_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              errorCode_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              errorDescription_ = bs;
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                underlyingErrors_ = new java.util.ArrayList<ChunkServer.ErrorResponse>();
                mutable_bitField0_ |= 0x00000008;
              }
              underlyingErrors_.add(input.readMessage(ChunkServer.ErrorResponse.PARSER, extensionRegistry));
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                nameValuePair_ = new java.util.ArrayList<ChunkServer.NameValuePair>();
                mutable_bitField0_ |= 0x00000010;
              }
              nameValuePair_.add(input.readMessage(ChunkServer.NameValuePair.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          underlyingErrors_ = java.util.Collections.unmodifiableList(underlyingErrors_);
        }
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          nameValuePair_ = java.util.Collections.unmodifiableList(nameValuePair_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_ErrorResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_ErrorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.ErrorResponse.class, ChunkServer.ErrorResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<ErrorResponse> PARSER =
        new com.google.protobuf.AbstractParser<ErrorResponse>() {
      public ErrorResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ErrorResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ErrorResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int DOMAIN_FIELD_NUMBER = 1;
    private java.lang.Object domain_;
    /**
     * <code>required string domain = 1;</code>
     */
    public boolean hasDomain() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string domain = 1;</code>
     */
    public java.lang.String getDomain() {
      java.lang.Object ref = domain_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          domain_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string domain = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDomainBytes() {
      java.lang.Object ref = domain_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        domain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ERROR_CODE_FIELD_NUMBER = 2;
    private int errorCode_;
    /**
     * <code>required int32 error_code = 2;</code>
     */
    public boolean hasErrorCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 error_code = 2;</code>
     */
    public int getErrorCode() {
      return errorCode_;
    }

    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 3;
    private java.lang.Object errorDescription_;
    /**
     * <code>optional string error_description = 3;</code>
     */
    public boolean hasErrorDescription() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string error_description = 3;</code>
     */
    public java.lang.String getErrorDescription() {
      java.lang.Object ref = errorDescription_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          errorDescription_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string error_description = 3;</code>
     */
    public com.google.protobuf.ByteString
        getErrorDescriptionBytes() {
      java.lang.Object ref = errorDescription_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UNDERLYING_ERRORS_FIELD_NUMBER = 4;
    private java.util.List<ChunkServer.ErrorResponse> underlyingErrors_;
    /**
     * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
     */
    public java.util.List<ChunkServer.ErrorResponse> getUnderlyingErrorsList() {
      return underlyingErrors_;
    }
    /**
     * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
     */
    public java.util.List<? extends ChunkServer.ErrorResponseOrBuilder> 
        getUnderlyingErrorsOrBuilderList() {
      return underlyingErrors_;
    }
    /**
     * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
     */
    public int getUnderlyingErrorsCount() {
      return underlyingErrors_.size();
    }
    /**
     * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
     */
    public ChunkServer.ErrorResponse getUnderlyingErrors(int index) {
      return underlyingErrors_.get(index);
    }
    /**
     * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
     */
    public ChunkServer.ErrorResponseOrBuilder getUnderlyingErrorsOrBuilder(
        int index) {
      return underlyingErrors_.get(index);
    }

    public static final int NAME_VALUE_PAIR_FIELD_NUMBER = 5;
    private java.util.List<ChunkServer.NameValuePair> nameValuePair_;
    /**
     * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
     */
    public java.util.List<ChunkServer.NameValuePair> getNameValuePairList() {
      return nameValuePair_;
    }
    /**
     * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
     */
    public java.util.List<? extends ChunkServer.NameValuePairOrBuilder> 
        getNameValuePairOrBuilderList() {
      return nameValuePair_;
    }
    /**
     * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
     */
    public int getNameValuePairCount() {
      return nameValuePair_.size();
    }
    /**
     * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
     */
    public ChunkServer.NameValuePair getNameValuePair(int index) {
      return nameValuePair_.get(index);
    }
    /**
     * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
     */
    public ChunkServer.NameValuePairOrBuilder getNameValuePairOrBuilder(
        int index) {
      return nameValuePair_.get(index);
    }

    private void initFields() {
      domain_ = "";
      errorCode_ = 0;
      errorDescription_ = "";
      underlyingErrors_ = java.util.Collections.emptyList();
      nameValuePair_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasDomain()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasErrorCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getUnderlyingErrorsCount(); i++) {
        if (!getUnderlyingErrors(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getNameValuePairCount(); i++) {
        if (!getNameValuePair(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getDomainBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, errorCode_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getErrorDescriptionBytes());
      }
      for (int i = 0; i < underlyingErrors_.size(); i++) {
        output.writeMessage(4, underlyingErrors_.get(i));
      }
      for (int i = 0; i < nameValuePair_.size(); i++) {
        output.writeMessage(5, nameValuePair_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getDomainBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, errorCode_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getErrorDescriptionBytes());
      }
      for (int i = 0; i < underlyingErrors_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, underlyingErrors_.get(i));
      }
      for (int i = 0; i < nameValuePair_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, nameValuePair_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.ErrorResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.ErrorResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.ErrorResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.ErrorResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.ErrorResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.ErrorResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.ErrorResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.ErrorResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.ErrorResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.ErrorResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.ErrorResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.ErrorResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.ErrorResponse)
        ChunkServer.ErrorResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_ErrorResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_ErrorResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.ErrorResponse.class, ChunkServer.ErrorResponse.Builder.class);
      }

      // Construct using Chunkserver.ErrorResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getUnderlyingErrorsFieldBuilder();
          getNameValuePairFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        domain_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        errorCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        errorDescription_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        if (underlyingErrorsBuilder_ == null) {
          underlyingErrors_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          underlyingErrorsBuilder_.clear();
        }
        if (nameValuePairBuilder_ == null) {
          nameValuePair_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          nameValuePairBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_ErrorResponse_descriptor;
      }

      public ChunkServer.ErrorResponse getDefaultInstanceForType() {
        return ChunkServer.ErrorResponse.getDefaultInstance();
      }

      public ChunkServer.ErrorResponse build() {
        ChunkServer.ErrorResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.ErrorResponse buildPartial() {
        ChunkServer.ErrorResponse result = new ChunkServer.ErrorResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.domain_ = domain_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.errorCode_ = errorCode_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.errorDescription_ = errorDescription_;
        if (underlyingErrorsBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            underlyingErrors_ = java.util.Collections.unmodifiableList(underlyingErrors_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.underlyingErrors_ = underlyingErrors_;
        } else {
          result.underlyingErrors_ = underlyingErrorsBuilder_.build();
        }
        if (nameValuePairBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)) {
            nameValuePair_ = java.util.Collections.unmodifiableList(nameValuePair_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.nameValuePair_ = nameValuePair_;
        } else {
          result.nameValuePair_ = nameValuePairBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.ErrorResponse) {
          return mergeFrom((ChunkServer.ErrorResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.ErrorResponse other) {
        if (other == ChunkServer.ErrorResponse.getDefaultInstance()) return this;
        if (other.hasDomain()) {
          bitField0_ |= 0x00000001;
          domain_ = other.domain_;
          onChanged();
        }
        if (other.hasErrorCode()) {
          setErrorCode(other.getErrorCode());
        }
        if (other.hasErrorDescription()) {
          bitField0_ |= 0x00000004;
          errorDescription_ = other.errorDescription_;
          onChanged();
        }
        if (underlyingErrorsBuilder_ == null) {
          if (!other.underlyingErrors_.isEmpty()) {
            if (underlyingErrors_.isEmpty()) {
              underlyingErrors_ = other.underlyingErrors_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureUnderlyingErrorsIsMutable();
              underlyingErrors_.addAll(other.underlyingErrors_);
            }
            onChanged();
          }
        } else {
          if (!other.underlyingErrors_.isEmpty()) {
            if (underlyingErrorsBuilder_.isEmpty()) {
              underlyingErrorsBuilder_.dispose();
              underlyingErrorsBuilder_ = null;
              underlyingErrors_ = other.underlyingErrors_;
              bitField0_ = (bitField0_ & ~0x00000008);
              underlyingErrorsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getUnderlyingErrorsFieldBuilder() : null;
            } else {
              underlyingErrorsBuilder_.addAllMessages(other.underlyingErrors_);
            }
          }
        }
        if (nameValuePairBuilder_ == null) {
          if (!other.nameValuePair_.isEmpty()) {
            if (nameValuePair_.isEmpty()) {
              nameValuePair_ = other.nameValuePair_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureNameValuePairIsMutable();
              nameValuePair_.addAll(other.nameValuePair_);
            }
            onChanged();
          }
        } else {
          if (!other.nameValuePair_.isEmpty()) {
            if (nameValuePairBuilder_.isEmpty()) {
              nameValuePairBuilder_.dispose();
              nameValuePairBuilder_ = null;
              nameValuePair_ = other.nameValuePair_;
              bitField0_ = (bitField0_ & ~0x00000010);
              nameValuePairBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getNameValuePairFieldBuilder() : null;
            } else {
              nameValuePairBuilder_.addAllMessages(other.nameValuePair_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasDomain()) {
          
          return false;
        }
        if (!hasErrorCode()) {
          
          return false;
        }
        for (int i = 0; i < getUnderlyingErrorsCount(); i++) {
          if (!getUnderlyingErrors(i).isInitialized()) {
            
            return false;
          }
        }
        for (int i = 0; i < getNameValuePairCount(); i++) {
          if (!getNameValuePair(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.ErrorResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.ErrorResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object domain_ = "";
      /**
       * <code>required string domain = 1;</code>
       */
      public boolean hasDomain() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string domain = 1;</code>
       */
      public java.lang.String getDomain() {
        java.lang.Object ref = domain_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            domain_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string domain = 1;</code>
       */
      public com.google.protobuf.ByteString
          getDomainBytes() {
        java.lang.Object ref = domain_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          domain_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string domain = 1;</code>
       */
      public Builder setDomain(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        domain_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string domain = 1;</code>
       */
      public Builder clearDomain() {
        bitField0_ = (bitField0_ & ~0x00000001);
        domain_ = getDefaultInstance().getDomain();
        onChanged();
        return this;
      }
      /**
       * <code>required string domain = 1;</code>
       */
      public Builder setDomainBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        domain_ = value;
        onChanged();
        return this;
      }

      private int errorCode_ ;
      /**
       * <code>required int32 error_code = 2;</code>
       */
      public boolean hasErrorCode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 error_code = 2;</code>
       */
      public int getErrorCode() {
        return errorCode_;
      }
      /**
       * <code>required int32 error_code = 2;</code>
       */
      public Builder setErrorCode(int value) {
        bitField0_ |= 0x00000002;
        errorCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 error_code = 2;</code>
       */
      public Builder clearErrorCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        errorCode_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object errorDescription_ = "";
      /**
       * <code>optional string error_description = 3;</code>
       */
      public boolean hasErrorDescription() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string error_description = 3;</code>
       */
      public java.lang.String getErrorDescription() {
        java.lang.Object ref = errorDescription_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            errorDescription_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string error_description = 3;</code>
       */
      public com.google.protobuf.ByteString
          getErrorDescriptionBytes() {
        java.lang.Object ref = errorDescription_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          errorDescription_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string error_description = 3;</code>
       */
      public Builder setErrorDescription(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        errorDescription_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string error_description = 3;</code>
       */
      public Builder clearErrorDescription() {
        bitField0_ = (bitField0_ & ~0x00000004);
        errorDescription_ = getDefaultInstance().getErrorDescription();
        onChanged();
        return this;
      }
      /**
       * <code>optional string error_description = 3;</code>
       */
      public Builder setErrorDescriptionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        errorDescription_ = value;
        onChanged();
        return this;
      }

      private java.util.List<ChunkServer.ErrorResponse> underlyingErrors_ =
        java.util.Collections.emptyList();
      private void ensureUnderlyingErrorsIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          underlyingErrors_ = new java.util.ArrayList<ChunkServer.ErrorResponse>(underlyingErrors_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder> underlyingErrorsBuilder_;

      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public java.util.List<ChunkServer.ErrorResponse> getUnderlyingErrorsList() {
        if (underlyingErrorsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(underlyingErrors_);
        } else {
          return underlyingErrorsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public int getUnderlyingErrorsCount() {
        if (underlyingErrorsBuilder_ == null) {
          return underlyingErrors_.size();
        } else {
          return underlyingErrorsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public ChunkServer.ErrorResponse getUnderlyingErrors(int index) {
        if (underlyingErrorsBuilder_ == null) {
          return underlyingErrors_.get(index);
        } else {
          return underlyingErrorsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public Builder setUnderlyingErrors(
          int index, ChunkServer.ErrorResponse value) {
        if (underlyingErrorsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnderlyingErrorsIsMutable();
          underlyingErrors_.set(index, value);
          onChanged();
        } else {
          underlyingErrorsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public Builder setUnderlyingErrors(
          int index, ChunkServer.ErrorResponse.Builder builderForValue) {
        if (underlyingErrorsBuilder_ == null) {
          ensureUnderlyingErrorsIsMutable();
          underlyingErrors_.set(index, builderForValue.build());
          onChanged();
        } else {
          underlyingErrorsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public Builder addUnderlyingErrors(ChunkServer.ErrorResponse value) {
        if (underlyingErrorsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnderlyingErrorsIsMutable();
          underlyingErrors_.add(value);
          onChanged();
        } else {
          underlyingErrorsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public Builder addUnderlyingErrors(
          int index, ChunkServer.ErrorResponse value) {
        if (underlyingErrorsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnderlyingErrorsIsMutable();
          underlyingErrors_.add(index, value);
          onChanged();
        } else {
          underlyingErrorsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public Builder addUnderlyingErrors(
          ChunkServer.ErrorResponse.Builder builderForValue) {
        if (underlyingErrorsBuilder_ == null) {
          ensureUnderlyingErrorsIsMutable();
          underlyingErrors_.add(builderForValue.build());
          onChanged();
        } else {
          underlyingErrorsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public Builder addUnderlyingErrors(
          int index, ChunkServer.ErrorResponse.Builder builderForValue) {
        if (underlyingErrorsBuilder_ == null) {
          ensureUnderlyingErrorsIsMutable();
          underlyingErrors_.add(index, builderForValue.build());
          onChanged();
        } else {
          underlyingErrorsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public Builder addAllUnderlyingErrors(
          java.lang.Iterable<? extends ChunkServer.ErrorResponse> values) {
        if (underlyingErrorsBuilder_ == null) {
          ensureUnderlyingErrorsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, underlyingErrors_);
          onChanged();
        } else {
          underlyingErrorsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public Builder clearUnderlyingErrors() {
        if (underlyingErrorsBuilder_ == null) {
          underlyingErrors_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          underlyingErrorsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public Builder removeUnderlyingErrors(int index) {
        if (underlyingErrorsBuilder_ == null) {
          ensureUnderlyingErrorsIsMutable();
          underlyingErrors_.remove(index);
          onChanged();
        } else {
          underlyingErrorsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public ChunkServer.ErrorResponse.Builder getUnderlyingErrorsBuilder(
          int index) {
        return getUnderlyingErrorsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public ChunkServer.ErrorResponseOrBuilder getUnderlyingErrorsOrBuilder(
          int index) {
        if (underlyingErrorsBuilder_ == null) {
          return underlyingErrors_.get(index);  } else {
          return underlyingErrorsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public java.util.List<? extends ChunkServer.ErrorResponseOrBuilder> 
           getUnderlyingErrorsOrBuilderList() {
        if (underlyingErrorsBuilder_ != null) {
          return underlyingErrorsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(underlyingErrors_);
        }
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public ChunkServer.ErrorResponse.Builder addUnderlyingErrorsBuilder() {
        return getUnderlyingErrorsFieldBuilder().addBuilder(ChunkServer.ErrorResponse.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public ChunkServer.ErrorResponse.Builder addUnderlyingErrorsBuilder(
          int index) {
        return getUnderlyingErrorsFieldBuilder().addBuilder(index, ChunkServer.ErrorResponse.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.ErrorResponse underlying_errors = 4;</code>
       */
      public java.util.List<ChunkServer.ErrorResponse.Builder> 
           getUnderlyingErrorsBuilderList() {
        return getUnderlyingErrorsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder> 
          getUnderlyingErrorsFieldBuilder() {
        if (underlyingErrorsBuilder_ == null) {
          underlyingErrorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder>(
                  underlyingErrors_,
                  ((bitField0_ & 0x00000008) == 0x00000008),
                  getParentForChildren(),
                  isClean());
          underlyingErrors_ = null;
        }
        return underlyingErrorsBuilder_;
      }

      private java.util.List<ChunkServer.NameValuePair> nameValuePair_ =
        java.util.Collections.emptyList();
      private void ensureNameValuePairIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          nameValuePair_ = new java.util.ArrayList<ChunkServer.NameValuePair>(nameValuePair_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.NameValuePair, ChunkServer.NameValuePair.Builder, ChunkServer.NameValuePairOrBuilder> nameValuePairBuilder_;

      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public java.util.List<ChunkServer.NameValuePair> getNameValuePairList() {
        if (nameValuePairBuilder_ == null) {
          return java.util.Collections.unmodifiableList(nameValuePair_);
        } else {
          return nameValuePairBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public int getNameValuePairCount() {
        if (nameValuePairBuilder_ == null) {
          return nameValuePair_.size();
        } else {
          return nameValuePairBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public ChunkServer.NameValuePair getNameValuePair(int index) {
        if (nameValuePairBuilder_ == null) {
          return nameValuePair_.get(index);
        } else {
          return nameValuePairBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public Builder setNameValuePair(
          int index, ChunkServer.NameValuePair value) {
        if (nameValuePairBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNameValuePairIsMutable();
          nameValuePair_.set(index, value);
          onChanged();
        } else {
          nameValuePairBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public Builder setNameValuePair(
          int index, ChunkServer.NameValuePair.Builder builderForValue) {
        if (nameValuePairBuilder_ == null) {
          ensureNameValuePairIsMutable();
          nameValuePair_.set(index, builderForValue.build());
          onChanged();
        } else {
          nameValuePairBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public Builder addNameValuePair(ChunkServer.NameValuePair value) {
        if (nameValuePairBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNameValuePairIsMutable();
          nameValuePair_.add(value);
          onChanged();
        } else {
          nameValuePairBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public Builder addNameValuePair(
          int index, ChunkServer.NameValuePair value) {
        if (nameValuePairBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNameValuePairIsMutable();
          nameValuePair_.add(index, value);
          onChanged();
        } else {
          nameValuePairBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public Builder addNameValuePair(
          ChunkServer.NameValuePair.Builder builderForValue) {
        if (nameValuePairBuilder_ == null) {
          ensureNameValuePairIsMutable();
          nameValuePair_.add(builderForValue.build());
          onChanged();
        } else {
          nameValuePairBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public Builder addNameValuePair(
          int index, ChunkServer.NameValuePair.Builder builderForValue) {
        if (nameValuePairBuilder_ == null) {
          ensureNameValuePairIsMutable();
          nameValuePair_.add(index, builderForValue.build());
          onChanged();
        } else {
          nameValuePairBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public Builder addAllNameValuePair(
          java.lang.Iterable<? extends ChunkServer.NameValuePair> values) {
        if (nameValuePairBuilder_ == null) {
          ensureNameValuePairIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, nameValuePair_);
          onChanged();
        } else {
          nameValuePairBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public Builder clearNameValuePair() {
        if (nameValuePairBuilder_ == null) {
          nameValuePair_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          nameValuePairBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public Builder removeNameValuePair(int index) {
        if (nameValuePairBuilder_ == null) {
          ensureNameValuePairIsMutable();
          nameValuePair_.remove(index);
          onChanged();
        } else {
          nameValuePairBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public ChunkServer.NameValuePair.Builder getNameValuePairBuilder(
          int index) {
        return getNameValuePairFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public ChunkServer.NameValuePairOrBuilder getNameValuePairOrBuilder(
          int index) {
        if (nameValuePairBuilder_ == null) {
          return nameValuePair_.get(index);  } else {
          return nameValuePairBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public java.util.List<? extends ChunkServer.NameValuePairOrBuilder> 
           getNameValuePairOrBuilderList() {
        if (nameValuePairBuilder_ != null) {
          return nameValuePairBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(nameValuePair_);
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public ChunkServer.NameValuePair.Builder addNameValuePairBuilder() {
        return getNameValuePairFieldBuilder().addBuilder(ChunkServer.NameValuePair.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public ChunkServer.NameValuePair.Builder addNameValuePairBuilder(
          int index) {
        return getNameValuePairFieldBuilder().addBuilder(index, ChunkServer.NameValuePair.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.NameValuePair name_value_pair = 5;</code>
       */
      public java.util.List<ChunkServer.NameValuePair.Builder> 
           getNameValuePairBuilderList() {
        return getNameValuePairFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.NameValuePair, ChunkServer.NameValuePair.Builder, ChunkServer.NameValuePairOrBuilder> 
          getNameValuePairFieldBuilder() {
        if (nameValuePairBuilder_ == null) {
          nameValuePairBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.NameValuePair, ChunkServer.NameValuePair.Builder, ChunkServer.NameValuePairOrBuilder>(
                  nameValuePair_,
                  ((bitField0_ & 0x00000010) == 0x00000010),
                  getParentForChildren(),
                  isClean());
          nameValuePair_ = null;
        }
        return nameValuePairBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.ErrorResponse)
    }

    static {
      defaultInstance = new ErrorResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.ErrorResponse)
  }

  public interface FileErrorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.FileError)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    boolean hasFileChecksum();
    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    com.google.protobuf.ByteString getFileChecksum();

    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    boolean hasErrorResponse();
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    ChunkServer.ErrorResponse getErrorResponse();
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    ChunkServer.ErrorResponseOrBuilder getErrorResponseOrBuilder();
  }
  /**
   * Protobuf type {@code chunkserver.FileError}
   */
  public static final class FileError extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.FileError)
      FileErrorOrBuilder {
    // Use FileError.newBuilder() to construct.
    private FileError(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private FileError(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final FileError defaultInstance;
    public static FileError getDefaultInstance() {
      return defaultInstance;
    }

    public FileError getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private FileError(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              fileChecksum_ = input.readBytes();
              break;
            }
            case 18: {
              ChunkServer.ErrorResponse.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = errorResponse_.toBuilder();
              }
              errorResponse_ = input.readMessage(ChunkServer.ErrorResponse.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(errorResponse_);
                errorResponse_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_FileError_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_FileError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.FileError.class, ChunkServer.FileError.Builder.class);
    }

    public static com.google.protobuf.Parser<FileError> PARSER =
        new com.google.protobuf.AbstractParser<FileError>() {
      public FileError parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileError(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<FileError> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FILE_CHECKSUM_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString fileChecksum_;
    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    public boolean hasFileChecksum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    public com.google.protobuf.ByteString getFileChecksum() {
      return fileChecksum_;
    }

    public static final int ERROR_RESPONSE_FIELD_NUMBER = 2;
    private ChunkServer.ErrorResponse errorResponse_;
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    public boolean hasErrorResponse() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    public ChunkServer.ErrorResponse getErrorResponse() {
      return errorResponse_;
    }
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    public ChunkServer.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
      return errorResponse_;
    }

    private void initFields() {
      fileChecksum_ = com.google.protobuf.ByteString.EMPTY;
      errorResponse_ = ChunkServer.ErrorResponse.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasFileChecksum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasErrorResponse()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getErrorResponse().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, fileChecksum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, errorResponse_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, fileChecksum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, errorResponse_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.FileError parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileError parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileError parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileError parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileError parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileError parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileError parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.FileError parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileError parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileError parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.FileError prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.FileError}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.FileError)
        ChunkServer.FileErrorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_FileError_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_FileError_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.FileError.class, ChunkServer.FileError.Builder.class);
      }

      // Construct using Chunkserver.FileError.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getErrorResponseFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        fileChecksum_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (errorResponseBuilder_ == null) {
          errorResponse_ = ChunkServer.ErrorResponse.getDefaultInstance();
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_FileError_descriptor;
      }

      public ChunkServer.FileError getDefaultInstanceForType() {
        return ChunkServer.FileError.getDefaultInstance();
      }

      public ChunkServer.FileError build() {
        ChunkServer.FileError result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.FileError buildPartial() {
        ChunkServer.FileError result = new ChunkServer.FileError(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.fileChecksum_ = fileChecksum_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (errorResponseBuilder_ == null) {
          result.errorResponse_ = errorResponse_;
        } else {
          result.errorResponse_ = errorResponseBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.FileError) {
          return mergeFrom((ChunkServer.FileError)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.FileError other) {
        if (other == ChunkServer.FileError.getDefaultInstance()) return this;
        if (other.hasFileChecksum()) {
          setFileChecksum(other.getFileChecksum());
        }
        if (other.hasErrorResponse()) {
          mergeErrorResponse(other.getErrorResponse());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasFileChecksum()) {
          
          return false;
        }
        if (!hasErrorResponse()) {
          
          return false;
        }
        if (!getErrorResponse().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.FileError parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.FileError) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString fileChecksum_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public boolean hasFileChecksum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public com.google.protobuf.ByteString getFileChecksum() {
        return fileChecksum_;
      }
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public Builder setFileChecksum(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        fileChecksum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public Builder clearFileChecksum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fileChecksum_ = getDefaultInstance().getFileChecksum();
        onChanged();
        return this;
      }

      private ChunkServer.ErrorResponse errorResponse_ = ChunkServer.ErrorResponse.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder> errorResponseBuilder_;
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public boolean hasErrorResponse() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public ChunkServer.ErrorResponse getErrorResponse() {
        if (errorResponseBuilder_ == null) {
          return errorResponse_;
        } else {
          return errorResponseBuilder_.getMessage();
        }
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public Builder setErrorResponse(ChunkServer.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          errorResponse_ = value;
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public Builder setErrorResponse(
          ChunkServer.ErrorResponse.Builder builderForValue) {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = builderForValue.build();
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public Builder mergeErrorResponse(ChunkServer.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              errorResponse_ != ChunkServer.ErrorResponse.getDefaultInstance()) {
            errorResponse_ =
              ChunkServer.ErrorResponse.newBuilder(errorResponse_).mergeFrom(value).buildPartial();
          } else {
            errorResponse_ = value;
          }
          onChanged();
        } else {
          errorResponseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public Builder clearErrorResponse() {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = ChunkServer.ErrorResponse.getDefaultInstance();
          onChanged();
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public ChunkServer.ErrorResponse.Builder getErrorResponseBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getErrorResponseFieldBuilder().getBuilder();
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public ChunkServer.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
        if (errorResponseBuilder_ != null) {
          return errorResponseBuilder_.getMessageOrBuilder();
        } else {
          return errorResponse_;
        }
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder> 
          getErrorResponseFieldBuilder() {
        if (errorResponseBuilder_ == null) {
          errorResponseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder>(
                  getErrorResponse(),
                  getParentForChildren(),
                  isClean());
          errorResponse_ = null;
        }
        return errorResponseBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.FileError)
    }

    static {
      defaultInstance = new FileError(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.FileError)
  }

  public interface ChunkErrorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.ChunkError)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bytes chunk_checksum = 1;</code>
     */
    boolean hasChunkChecksum();
    /**
     * <code>required bytes chunk_checksum = 1;</code>
     */
    com.google.protobuf.ByteString getChunkChecksum();

    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    boolean hasErrorResponse();
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    ChunkServer.ErrorResponse getErrorResponse();
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    ChunkServer.ErrorResponseOrBuilder getErrorResponseOrBuilder();
  }
  /**
   * Protobuf type {@code chunkserver.ChunkError}
   */
  public static final class ChunkError extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.ChunkError)
      ChunkErrorOrBuilder {
    // Use ChunkError.newBuilder() to construct.
    private ChunkError(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ChunkError(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ChunkError defaultInstance;
    public static ChunkError getDefaultInstance() {
      return defaultInstance;
    }

    public ChunkError getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ChunkError(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              chunkChecksum_ = input.readBytes();
              break;
            }
            case 18: {
              ChunkServer.ErrorResponse.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = errorResponse_.toBuilder();
              }
              errorResponse_ = input.readMessage(ChunkServer.ErrorResponse.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(errorResponse_);
                errorResponse_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_ChunkError_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_ChunkError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.ChunkError.class, ChunkServer.ChunkError.Builder.class);
    }

    public static com.google.protobuf.Parser<ChunkError> PARSER =
        new com.google.protobuf.AbstractParser<ChunkError>() {
      public ChunkError parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChunkError(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ChunkError> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int CHUNK_CHECKSUM_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString chunkChecksum_;
    /**
     * <code>required bytes chunk_checksum = 1;</code>
     */
    public boolean hasChunkChecksum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bytes chunk_checksum = 1;</code>
     */
    public com.google.protobuf.ByteString getChunkChecksum() {
      return chunkChecksum_;
    }

    public static final int ERROR_RESPONSE_FIELD_NUMBER = 2;
    private ChunkServer.ErrorResponse errorResponse_;
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    public boolean hasErrorResponse() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    public ChunkServer.ErrorResponse getErrorResponse() {
      return errorResponse_;
    }
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    public ChunkServer.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
      return errorResponse_;
    }

    private void initFields() {
      chunkChecksum_ = com.google.protobuf.ByteString.EMPTY;
      errorResponse_ = ChunkServer.ErrorResponse.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasChunkChecksum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasErrorResponse()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getErrorResponse().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, chunkChecksum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, errorResponse_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, chunkChecksum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, errorResponse_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.ChunkError parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.ChunkError parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.ChunkError parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.ChunkError parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.ChunkError parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.ChunkError parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.ChunkError parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.ChunkError parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.ChunkError parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.ChunkError parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.ChunkError prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.ChunkError}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.ChunkError)
        ChunkServer.ChunkErrorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_ChunkError_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_ChunkError_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.ChunkError.class, ChunkServer.ChunkError.Builder.class);
      }

      // Construct using Chunkserver.ChunkError.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getErrorResponseFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        chunkChecksum_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (errorResponseBuilder_ == null) {
          errorResponse_ = ChunkServer.ErrorResponse.getDefaultInstance();
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_ChunkError_descriptor;
      }

      public ChunkServer.ChunkError getDefaultInstanceForType() {
        return ChunkServer.ChunkError.getDefaultInstance();
      }

      public ChunkServer.ChunkError build() {
        ChunkServer.ChunkError result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.ChunkError buildPartial() {
        ChunkServer.ChunkError result = new ChunkServer.ChunkError(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.chunkChecksum_ = chunkChecksum_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (errorResponseBuilder_ == null) {
          result.errorResponse_ = errorResponse_;
        } else {
          result.errorResponse_ = errorResponseBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.ChunkError) {
          return mergeFrom((ChunkServer.ChunkError)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.ChunkError other) {
        if (other == ChunkServer.ChunkError.getDefaultInstance()) return this;
        if (other.hasChunkChecksum()) {
          setChunkChecksum(other.getChunkChecksum());
        }
        if (other.hasErrorResponse()) {
          mergeErrorResponse(other.getErrorResponse());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasChunkChecksum()) {
          
          return false;
        }
        if (!hasErrorResponse()) {
          
          return false;
        }
        if (!getErrorResponse().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.ChunkError parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.ChunkError) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString chunkChecksum_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes chunk_checksum = 1;</code>
       */
      public boolean hasChunkChecksum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bytes chunk_checksum = 1;</code>
       */
      public com.google.protobuf.ByteString getChunkChecksum() {
        return chunkChecksum_;
      }
      /**
       * <code>required bytes chunk_checksum = 1;</code>
       */
      public Builder setChunkChecksum(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        chunkChecksum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes chunk_checksum = 1;</code>
       */
      public Builder clearChunkChecksum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        chunkChecksum_ = getDefaultInstance().getChunkChecksum();
        onChanged();
        return this;
      }

      private ChunkServer.ErrorResponse errorResponse_ = ChunkServer.ErrorResponse.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder> errorResponseBuilder_;
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public boolean hasErrorResponse() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public ChunkServer.ErrorResponse getErrorResponse() {
        if (errorResponseBuilder_ == null) {
          return errorResponse_;
        } else {
          return errorResponseBuilder_.getMessage();
        }
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public Builder setErrorResponse(ChunkServer.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          errorResponse_ = value;
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public Builder setErrorResponse(
          ChunkServer.ErrorResponse.Builder builderForValue) {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = builderForValue.build();
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public Builder mergeErrorResponse(ChunkServer.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              errorResponse_ != ChunkServer.ErrorResponse.getDefaultInstance()) {
            errorResponse_ =
              ChunkServer.ErrorResponse.newBuilder(errorResponse_).mergeFrom(value).buildPartial();
          } else {
            errorResponse_ = value;
          }
          onChanged();
        } else {
          errorResponseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public Builder clearErrorResponse() {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = ChunkServer.ErrorResponse.getDefaultInstance();
          onChanged();
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public ChunkServer.ErrorResponse.Builder getErrorResponseBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getErrorResponseFieldBuilder().getBuilder();
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public ChunkServer.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
        if (errorResponseBuilder_ != null) {
          return errorResponseBuilder_.getMessageOrBuilder();
        } else {
          return errorResponse_;
        }
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder> 
          getErrorResponseFieldBuilder() {
        if (errorResponseBuilder_ == null) {
          errorResponseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder>(
                  getErrorResponse(),
                  getParentForChildren(),
                  isClean());
          errorResponse_ = null;
        }
        return errorResponseBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.ChunkError)
    }

    static {
      defaultInstance = new ChunkError(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.ChunkError)
  }

  public interface ChunkErrorIndexOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.ChunkErrorIndex)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bytes chunk_checksum = 1;</code>
     */
    boolean hasChunkChecksum();
    /**
     * <code>required bytes chunk_checksum = 1;</code>
     */
    com.google.protobuf.ByteString getChunkChecksum();

    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    boolean hasErrorResponse();
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    ChunkServer.ErrorResponse getErrorResponse();
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    ChunkServer.ErrorResponseOrBuilder getErrorResponseOrBuilder();

    /**
     * <code>required uint32 chunk_index = 3;</code>
     */
    boolean hasChunkIndex();
    /**
     * <code>required uint32 chunk_index = 3;</code>
     */
    int getChunkIndex();
  }
  /**
   * Protobuf type {@code chunkserver.ChunkErrorIndex}
   */
  public static final class ChunkErrorIndex extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.ChunkErrorIndex)
      ChunkErrorIndexOrBuilder {
    // Use ChunkErrorIndex.newBuilder() to construct.
    private ChunkErrorIndex(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ChunkErrorIndex(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ChunkErrorIndex defaultInstance;
    public static ChunkErrorIndex getDefaultInstance() {
      return defaultInstance;
    }

    public ChunkErrorIndex getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ChunkErrorIndex(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              chunkChecksum_ = input.readBytes();
              break;
            }
            case 18: {
              ChunkServer.ErrorResponse.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = errorResponse_.toBuilder();
              }
              errorResponse_ = input.readMessage(ChunkServer.ErrorResponse.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(errorResponse_);
                errorResponse_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              chunkIndex_ = input.readUInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_ChunkErrorIndex_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_ChunkErrorIndex_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.ChunkErrorIndex.class, ChunkServer.ChunkErrorIndex.Builder.class);
    }

    public static com.google.protobuf.Parser<ChunkErrorIndex> PARSER =
        new com.google.protobuf.AbstractParser<ChunkErrorIndex>() {
      public ChunkErrorIndex parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChunkErrorIndex(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ChunkErrorIndex> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int CHUNK_CHECKSUM_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString chunkChecksum_;
    /**
     * <code>required bytes chunk_checksum = 1;</code>
     */
    public boolean hasChunkChecksum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bytes chunk_checksum = 1;</code>
     */
    public com.google.protobuf.ByteString getChunkChecksum() {
      return chunkChecksum_;
    }

    public static final int ERROR_RESPONSE_FIELD_NUMBER = 2;
    private ChunkServer.ErrorResponse errorResponse_;
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    public boolean hasErrorResponse() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    public ChunkServer.ErrorResponse getErrorResponse() {
      return errorResponse_;
    }
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    public ChunkServer.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
      return errorResponse_;
    }

    public static final int CHUNK_INDEX_FIELD_NUMBER = 3;
    private int chunkIndex_;
    /**
     * <code>required uint32 chunk_index = 3;</code>
     */
    public boolean hasChunkIndex() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required uint32 chunk_index = 3;</code>
     */
    public int getChunkIndex() {
      return chunkIndex_;
    }

    private void initFields() {
      chunkChecksum_ = com.google.protobuf.ByteString.EMPTY;
      errorResponse_ = ChunkServer.ErrorResponse.getDefaultInstance();
      chunkIndex_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasChunkChecksum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasErrorResponse()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasChunkIndex()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getErrorResponse().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, chunkChecksum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, errorResponse_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, chunkIndex_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, chunkChecksum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, errorResponse_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, chunkIndex_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.ChunkErrorIndex parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.ChunkErrorIndex parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.ChunkErrorIndex parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.ChunkErrorIndex parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.ChunkErrorIndex parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.ChunkErrorIndex parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.ChunkErrorIndex parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.ChunkErrorIndex parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.ChunkErrorIndex parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.ChunkErrorIndex parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.ChunkErrorIndex prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.ChunkErrorIndex}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.ChunkErrorIndex)
        ChunkServer.ChunkErrorIndexOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_ChunkErrorIndex_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_ChunkErrorIndex_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.ChunkErrorIndex.class, ChunkServer.ChunkErrorIndex.Builder.class);
      }

      // Construct using Chunkserver.ChunkErrorIndex.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getErrorResponseFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        chunkChecksum_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (errorResponseBuilder_ == null) {
          errorResponse_ = ChunkServer.ErrorResponse.getDefaultInstance();
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        chunkIndex_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_ChunkErrorIndex_descriptor;
      }

      public ChunkServer.ChunkErrorIndex getDefaultInstanceForType() {
        return ChunkServer.ChunkErrorIndex.getDefaultInstance();
      }

      public ChunkServer.ChunkErrorIndex build() {
        ChunkServer.ChunkErrorIndex result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.ChunkErrorIndex buildPartial() {
        ChunkServer.ChunkErrorIndex result = new ChunkServer.ChunkErrorIndex(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.chunkChecksum_ = chunkChecksum_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (errorResponseBuilder_ == null) {
          result.errorResponse_ = errorResponse_;
        } else {
          result.errorResponse_ = errorResponseBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.chunkIndex_ = chunkIndex_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.ChunkErrorIndex) {
          return mergeFrom((ChunkServer.ChunkErrorIndex)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.ChunkErrorIndex other) {
        if (other == ChunkServer.ChunkErrorIndex.getDefaultInstance()) return this;
        if (other.hasChunkChecksum()) {
          setChunkChecksum(other.getChunkChecksum());
        }
        if (other.hasErrorResponse()) {
          mergeErrorResponse(other.getErrorResponse());
        }
        if (other.hasChunkIndex()) {
          setChunkIndex(other.getChunkIndex());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasChunkChecksum()) {
          
          return false;
        }
        if (!hasErrorResponse()) {
          
          return false;
        }
        if (!hasChunkIndex()) {
          
          return false;
        }
        if (!getErrorResponse().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.ChunkErrorIndex parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.ChunkErrorIndex) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString chunkChecksum_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes chunk_checksum = 1;</code>
       */
      public boolean hasChunkChecksum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bytes chunk_checksum = 1;</code>
       */
      public com.google.protobuf.ByteString getChunkChecksum() {
        return chunkChecksum_;
      }
      /**
       * <code>required bytes chunk_checksum = 1;</code>
       */
      public Builder setChunkChecksum(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        chunkChecksum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes chunk_checksum = 1;</code>
       */
      public Builder clearChunkChecksum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        chunkChecksum_ = getDefaultInstance().getChunkChecksum();
        onChanged();
        return this;
      }

      private ChunkServer.ErrorResponse errorResponse_ = ChunkServer.ErrorResponse.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder> errorResponseBuilder_;
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public boolean hasErrorResponse() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public ChunkServer.ErrorResponse getErrorResponse() {
        if (errorResponseBuilder_ == null) {
          return errorResponse_;
        } else {
          return errorResponseBuilder_.getMessage();
        }
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public Builder setErrorResponse(ChunkServer.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          errorResponse_ = value;
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public Builder setErrorResponse(
          ChunkServer.ErrorResponse.Builder builderForValue) {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = builderForValue.build();
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public Builder mergeErrorResponse(ChunkServer.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              errorResponse_ != ChunkServer.ErrorResponse.getDefaultInstance()) {
            errorResponse_ =
              ChunkServer.ErrorResponse.newBuilder(errorResponse_).mergeFrom(value).buildPartial();
          } else {
            errorResponse_ = value;
          }
          onChanged();
        } else {
          errorResponseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public Builder clearErrorResponse() {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = ChunkServer.ErrorResponse.getDefaultInstance();
          onChanged();
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public ChunkServer.ErrorResponse.Builder getErrorResponseBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getErrorResponseFieldBuilder().getBuilder();
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public ChunkServer.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
        if (errorResponseBuilder_ != null) {
          return errorResponseBuilder_.getMessageOrBuilder();
        } else {
          return errorResponse_;
        }
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder> 
          getErrorResponseFieldBuilder() {
        if (errorResponseBuilder_ == null) {
          errorResponseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder>(
                  getErrorResponse(),
                  getParentForChildren(),
                  isClean());
          errorResponse_ = null;
        }
        return errorResponseBuilder_;
      }

      private int chunkIndex_ ;
      /**
       * <code>required uint32 chunk_index = 3;</code>
       */
      public boolean hasChunkIndex() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required uint32 chunk_index = 3;</code>
       */
      public int getChunkIndex() {
        return chunkIndex_;
      }
      /**
       * <code>required uint32 chunk_index = 3;</code>
       */
      public Builder setChunkIndex(int value) {
        bitField0_ |= 0x00000004;
        chunkIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 chunk_index = 3;</code>
       */
      public Builder clearChunkIndex() {
        bitField0_ = (bitField0_ & ~0x00000004);
        chunkIndex_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.ChunkErrorIndex)
    }

    static {
      defaultInstance = new ChunkErrorIndex(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.ChunkErrorIndex)
  }

  public interface FileChunkErrorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.FileChunkError)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    boolean hasFileChecksum();
    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    com.google.protobuf.ByteString getFileChecksum();

    /**
     * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
     */
    java.util.List<ChunkServer.ChunkErrorIndex> 
        getChunkErrorList();
    /**
     * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
     */
    ChunkServer.ChunkErrorIndex getChunkError(int index);
    /**
     * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
     */
    int getChunkErrorCount();
    /**
     * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
     */
    java.util.List<? extends ChunkServer.ChunkErrorIndexOrBuilder> 
        getChunkErrorOrBuilderList();
    /**
     * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
     */
    ChunkServer.ChunkErrorIndexOrBuilder getChunkErrorOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code chunkserver.FileChunkError}
   */
  public static final class FileChunkError extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.FileChunkError)
      FileChunkErrorOrBuilder {
    // Use FileChunkError.newBuilder() to construct.
    private FileChunkError(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private FileChunkError(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final FileChunkError defaultInstance;
    public static FileChunkError getDefaultInstance() {
      return defaultInstance;
    }

    public FileChunkError getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private FileChunkError(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              fileChecksum_ = input.readBytes();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                chunkError_ = new java.util.ArrayList<ChunkServer.ChunkErrorIndex>();
                mutable_bitField0_ |= 0x00000002;
              }
              chunkError_.add(input.readMessage(ChunkServer.ChunkErrorIndex.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          chunkError_ = java.util.Collections.unmodifiableList(chunkError_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_FileChunkError_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_FileChunkError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.FileChunkError.class, ChunkServer.FileChunkError.Builder.class);
    }

    public static com.google.protobuf.Parser<FileChunkError> PARSER =
        new com.google.protobuf.AbstractParser<FileChunkError>() {
      public FileChunkError parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileChunkError(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<FileChunkError> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FILE_CHECKSUM_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString fileChecksum_;
    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    public boolean hasFileChecksum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    public com.google.protobuf.ByteString getFileChecksum() {
      return fileChecksum_;
    }

    public static final int CHUNK_ERROR_FIELD_NUMBER = 2;
    private java.util.List<ChunkServer.ChunkErrorIndex> chunkError_;
    /**
     * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
     */
    public java.util.List<ChunkServer.ChunkErrorIndex> getChunkErrorList() {
      return chunkError_;
    }
    /**
     * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
     */
    public java.util.List<? extends ChunkServer.ChunkErrorIndexOrBuilder> 
        getChunkErrorOrBuilderList() {
      return chunkError_;
    }
    /**
     * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
     */
    public int getChunkErrorCount() {
      return chunkError_.size();
    }
    /**
     * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
     */
    public ChunkServer.ChunkErrorIndex getChunkError(int index) {
      return chunkError_.get(index);
    }
    /**
     * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
     */
    public ChunkServer.ChunkErrorIndexOrBuilder getChunkErrorOrBuilder(
        int index) {
      return chunkError_.get(index);
    }

    private void initFields() {
      fileChecksum_ = com.google.protobuf.ByteString.EMPTY;
      chunkError_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasFileChecksum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getChunkErrorCount(); i++) {
        if (!getChunkError(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, fileChecksum_);
      }
      for (int i = 0; i < chunkError_.size(); i++) {
        output.writeMessage(2, chunkError_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, fileChecksum_);
      }
      for (int i = 0; i < chunkError_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, chunkError_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.FileChunkError parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileChunkError parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileChunkError parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileChunkError parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileChunkError parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileChunkError parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileChunkError parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.FileChunkError parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileChunkError parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileChunkError parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.FileChunkError prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.FileChunkError}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.FileChunkError)
        ChunkServer.FileChunkErrorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_FileChunkError_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_FileChunkError_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.FileChunkError.class, ChunkServer.FileChunkError.Builder.class);
      }

      // Construct using Chunkserver.FileChunkError.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getChunkErrorFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        fileChecksum_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (chunkErrorBuilder_ == null) {
          chunkError_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          chunkErrorBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_FileChunkError_descriptor;
      }

      public ChunkServer.FileChunkError getDefaultInstanceForType() {
        return ChunkServer.FileChunkError.getDefaultInstance();
      }

      public ChunkServer.FileChunkError build() {
        ChunkServer.FileChunkError result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.FileChunkError buildPartial() {
        ChunkServer.FileChunkError result = new ChunkServer.FileChunkError(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.fileChecksum_ = fileChecksum_;
        if (chunkErrorBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            chunkError_ = java.util.Collections.unmodifiableList(chunkError_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.chunkError_ = chunkError_;
        } else {
          result.chunkError_ = chunkErrorBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.FileChunkError) {
          return mergeFrom((ChunkServer.FileChunkError)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.FileChunkError other) {
        if (other == ChunkServer.FileChunkError.getDefaultInstance()) return this;
        if (other.hasFileChecksum()) {
          setFileChecksum(other.getFileChecksum());
        }
        if (chunkErrorBuilder_ == null) {
          if (!other.chunkError_.isEmpty()) {
            if (chunkError_.isEmpty()) {
              chunkError_ = other.chunkError_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureChunkErrorIsMutable();
              chunkError_.addAll(other.chunkError_);
            }
            onChanged();
          }
        } else {
          if (!other.chunkError_.isEmpty()) {
            if (chunkErrorBuilder_.isEmpty()) {
              chunkErrorBuilder_.dispose();
              chunkErrorBuilder_ = null;
              chunkError_ = other.chunkError_;
              bitField0_ = (bitField0_ & ~0x00000002);
              chunkErrorBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getChunkErrorFieldBuilder() : null;
            } else {
              chunkErrorBuilder_.addAllMessages(other.chunkError_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasFileChecksum()) {
          
          return false;
        }
        for (int i = 0; i < getChunkErrorCount(); i++) {
          if (!getChunkError(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.FileChunkError parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.FileChunkError) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString fileChecksum_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public boolean hasFileChecksum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public com.google.protobuf.ByteString getFileChecksum() {
        return fileChecksum_;
      }
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public Builder setFileChecksum(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        fileChecksum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public Builder clearFileChecksum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fileChecksum_ = getDefaultInstance().getFileChecksum();
        onChanged();
        return this;
      }

      private java.util.List<ChunkServer.ChunkErrorIndex> chunkError_ =
        java.util.Collections.emptyList();
      private void ensureChunkErrorIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          chunkError_ = new java.util.ArrayList<ChunkServer.ChunkErrorIndex>(chunkError_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.ChunkErrorIndex, ChunkServer.ChunkErrorIndex.Builder, ChunkServer.ChunkErrorIndexOrBuilder> chunkErrorBuilder_;

      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public java.util.List<ChunkServer.ChunkErrorIndex> getChunkErrorList() {
        if (chunkErrorBuilder_ == null) {
          return java.util.Collections.unmodifiableList(chunkError_);
        } else {
          return chunkErrorBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public int getChunkErrorCount() {
        if (chunkErrorBuilder_ == null) {
          return chunkError_.size();
        } else {
          return chunkErrorBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public ChunkServer.ChunkErrorIndex getChunkError(int index) {
        if (chunkErrorBuilder_ == null) {
          return chunkError_.get(index);
        } else {
          return chunkErrorBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public Builder setChunkError(
          int index, ChunkServer.ChunkErrorIndex value) {
        if (chunkErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunkErrorIsMutable();
          chunkError_.set(index, value);
          onChanged();
        } else {
          chunkErrorBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public Builder setChunkError(
          int index, ChunkServer.ChunkErrorIndex.Builder builderForValue) {
        if (chunkErrorBuilder_ == null) {
          ensureChunkErrorIsMutable();
          chunkError_.set(index, builderForValue.build());
          onChanged();
        } else {
          chunkErrorBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public Builder addChunkError(ChunkServer.ChunkErrorIndex value) {
        if (chunkErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunkErrorIsMutable();
          chunkError_.add(value);
          onChanged();
        } else {
          chunkErrorBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public Builder addChunkError(
          int index, ChunkServer.ChunkErrorIndex value) {
        if (chunkErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunkErrorIsMutable();
          chunkError_.add(index, value);
          onChanged();
        } else {
          chunkErrorBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public Builder addChunkError(
          ChunkServer.ChunkErrorIndex.Builder builderForValue) {
        if (chunkErrorBuilder_ == null) {
          ensureChunkErrorIsMutable();
          chunkError_.add(builderForValue.build());
          onChanged();
        } else {
          chunkErrorBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public Builder addChunkError(
          int index, ChunkServer.ChunkErrorIndex.Builder builderForValue) {
        if (chunkErrorBuilder_ == null) {
          ensureChunkErrorIsMutable();
          chunkError_.add(index, builderForValue.build());
          onChanged();
        } else {
          chunkErrorBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public Builder addAllChunkError(
          java.lang.Iterable<? extends ChunkServer.ChunkErrorIndex> values) {
        if (chunkErrorBuilder_ == null) {
          ensureChunkErrorIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, chunkError_);
          onChanged();
        } else {
          chunkErrorBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public Builder clearChunkError() {
        if (chunkErrorBuilder_ == null) {
          chunkError_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          chunkErrorBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public Builder removeChunkError(int index) {
        if (chunkErrorBuilder_ == null) {
          ensureChunkErrorIsMutable();
          chunkError_.remove(index);
          onChanged();
        } else {
          chunkErrorBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public ChunkServer.ChunkErrorIndex.Builder getChunkErrorBuilder(
          int index) {
        return getChunkErrorFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public ChunkServer.ChunkErrorIndexOrBuilder getChunkErrorOrBuilder(
          int index) {
        if (chunkErrorBuilder_ == null) {
          return chunkError_.get(index);  } else {
          return chunkErrorBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public java.util.List<? extends ChunkServer.ChunkErrorIndexOrBuilder> 
           getChunkErrorOrBuilderList() {
        if (chunkErrorBuilder_ != null) {
          return chunkErrorBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(chunkError_);
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public ChunkServer.ChunkErrorIndex.Builder addChunkErrorBuilder() {
        return getChunkErrorFieldBuilder().addBuilder(ChunkServer.ChunkErrorIndex.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public ChunkServer.ChunkErrorIndex.Builder addChunkErrorBuilder(
          int index) {
        return getChunkErrorFieldBuilder().addBuilder(index, ChunkServer.ChunkErrorIndex.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.ChunkErrorIndex chunk_error = 2;</code>
       */
      public java.util.List<ChunkServer.ChunkErrorIndex.Builder> 
           getChunkErrorBuilderList() {
        return getChunkErrorFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.ChunkErrorIndex, ChunkServer.ChunkErrorIndex.Builder, ChunkServer.ChunkErrorIndexOrBuilder> 
          getChunkErrorFieldBuilder() {
        if (chunkErrorBuilder_ == null) {
          chunkErrorBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.ChunkErrorIndex, ChunkServer.ChunkErrorIndex.Builder, ChunkServer.ChunkErrorIndexOrBuilder>(
                  chunkError_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          chunkError_ = null;
        }
        return chunkErrorBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.FileChunkError)
    }

    static {
      defaultInstance = new FileChunkError(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.FileChunkError)
  }

  public interface StorageContainerErrorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.StorageContainerError)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string storage_container_key = 1;</code>
     */
    boolean hasStorageContainerKey();
    /**
     * <code>required string storage_container_key = 1;</code>
     */
    java.lang.String getStorageContainerKey();
    /**
     * <code>required string storage_container_key = 1;</code>
     */
    com.google.protobuf.ByteString
        getStorageContainerKeyBytes();

    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    boolean hasErrorResponse();
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    ChunkServer.ErrorResponse getErrorResponse();
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    ChunkServer.ErrorResponseOrBuilder getErrorResponseOrBuilder();
  }
  /**
   * Protobuf type {@code chunkserver.StorageContainerError}
   */
  public static final class StorageContainerError extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.StorageContainerError)
      StorageContainerErrorOrBuilder {
    // Use StorageContainerError.newBuilder() to construct.
    private StorageContainerError(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StorageContainerError(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StorageContainerError defaultInstance;
    public static StorageContainerError getDefaultInstance() {
      return defaultInstance;
    }

    public StorageContainerError getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StorageContainerError(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              storageContainerKey_ = bs;
              break;
            }
            case 18: {
              ChunkServer.ErrorResponse.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = errorResponse_.toBuilder();
              }
              errorResponse_ = input.readMessage(ChunkServer.ErrorResponse.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(errorResponse_);
                errorResponse_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_StorageContainerError_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_StorageContainerError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.StorageContainerError.class, ChunkServer.StorageContainerError.Builder.class);
    }

    public static com.google.protobuf.Parser<StorageContainerError> PARSER =
        new com.google.protobuf.AbstractParser<StorageContainerError>() {
      public StorageContainerError parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StorageContainerError(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StorageContainerError> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int STORAGE_CONTAINER_KEY_FIELD_NUMBER = 1;
    private java.lang.Object storageContainerKey_;
    /**
     * <code>required string storage_container_key = 1;</code>
     */
    public boolean hasStorageContainerKey() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string storage_container_key = 1;</code>
     */
    public java.lang.String getStorageContainerKey() {
      java.lang.Object ref = storageContainerKey_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          storageContainerKey_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string storage_container_key = 1;</code>
     */
    public com.google.protobuf.ByteString
        getStorageContainerKeyBytes() {
      java.lang.Object ref = storageContainerKey_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storageContainerKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ERROR_RESPONSE_FIELD_NUMBER = 2;
    private ChunkServer.ErrorResponse errorResponse_;
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    public boolean hasErrorResponse() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    public ChunkServer.ErrorResponse getErrorResponse() {
      return errorResponse_;
    }
    /**
     * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
     */
    public ChunkServer.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
      return errorResponse_;
    }

    private void initFields() {
      storageContainerKey_ = "";
      errorResponse_ = ChunkServer.ErrorResponse.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasStorageContainerKey()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasErrorResponse()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getErrorResponse().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getStorageContainerKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, errorResponse_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getStorageContainerKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, errorResponse_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.StorageContainerError parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.StorageContainerError parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.StorageContainerError parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.StorageContainerError parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.StorageContainerError parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.StorageContainerError parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.StorageContainerError parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.StorageContainerError parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.StorageContainerError parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.StorageContainerError parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.StorageContainerError prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.StorageContainerError}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.StorageContainerError)
        ChunkServer.StorageContainerErrorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_StorageContainerError_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_StorageContainerError_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.StorageContainerError.class, ChunkServer.StorageContainerError.Builder.class);
      }

      // Construct using Chunkserver.StorageContainerError.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getErrorResponseFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        storageContainerKey_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (errorResponseBuilder_ == null) {
          errorResponse_ = ChunkServer.ErrorResponse.getDefaultInstance();
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_StorageContainerError_descriptor;
      }

      public ChunkServer.StorageContainerError getDefaultInstanceForType() {
        return ChunkServer.StorageContainerError.getDefaultInstance();
      }

      public ChunkServer.StorageContainerError build() {
        ChunkServer.StorageContainerError result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.StorageContainerError buildPartial() {
        ChunkServer.StorageContainerError result = new ChunkServer.StorageContainerError(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.storageContainerKey_ = storageContainerKey_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (errorResponseBuilder_ == null) {
          result.errorResponse_ = errorResponse_;
        } else {
          result.errorResponse_ = errorResponseBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.StorageContainerError) {
          return mergeFrom((ChunkServer.StorageContainerError)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.StorageContainerError other) {
        if (other == ChunkServer.StorageContainerError.getDefaultInstance()) return this;
        if (other.hasStorageContainerKey()) {
          bitField0_ |= 0x00000001;
          storageContainerKey_ = other.storageContainerKey_;
          onChanged();
        }
        if (other.hasErrorResponse()) {
          mergeErrorResponse(other.getErrorResponse());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasStorageContainerKey()) {
          
          return false;
        }
        if (!hasErrorResponse()) {
          
          return false;
        }
        if (!getErrorResponse().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.StorageContainerError parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.StorageContainerError) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object storageContainerKey_ = "";
      /**
       * <code>required string storage_container_key = 1;</code>
       */
      public boolean hasStorageContainerKey() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string storage_container_key = 1;</code>
       */
      public java.lang.String getStorageContainerKey() {
        java.lang.Object ref = storageContainerKey_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            storageContainerKey_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string storage_container_key = 1;</code>
       */
      public com.google.protobuf.ByteString
          getStorageContainerKeyBytes() {
        java.lang.Object ref = storageContainerKey_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          storageContainerKey_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string storage_container_key = 1;</code>
       */
      public Builder setStorageContainerKey(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        storageContainerKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string storage_container_key = 1;</code>
       */
      public Builder clearStorageContainerKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        storageContainerKey_ = getDefaultInstance().getStorageContainerKey();
        onChanged();
        return this;
      }
      /**
       * <code>required string storage_container_key = 1;</code>
       */
      public Builder setStorageContainerKeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        storageContainerKey_ = value;
        onChanged();
        return this;
      }

      private ChunkServer.ErrorResponse errorResponse_ = ChunkServer.ErrorResponse.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder> errorResponseBuilder_;
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public boolean hasErrorResponse() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public ChunkServer.ErrorResponse getErrorResponse() {
        if (errorResponseBuilder_ == null) {
          return errorResponse_;
        } else {
          return errorResponseBuilder_.getMessage();
        }
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public Builder setErrorResponse(ChunkServer.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          errorResponse_ = value;
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public Builder setErrorResponse(
          ChunkServer.ErrorResponse.Builder builderForValue) {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = builderForValue.build();
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public Builder mergeErrorResponse(ChunkServer.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              errorResponse_ != ChunkServer.ErrorResponse.getDefaultInstance()) {
            errorResponse_ =
              ChunkServer.ErrorResponse.newBuilder(errorResponse_).mergeFrom(value).buildPartial();
          } else {
            errorResponse_ = value;
          }
          onChanged();
        } else {
          errorResponseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public Builder clearErrorResponse() {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = ChunkServer.ErrorResponse.getDefaultInstance();
          onChanged();
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public ChunkServer.ErrorResponse.Builder getErrorResponseBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getErrorResponseFieldBuilder().getBuilder();
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      public ChunkServer.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
        if (errorResponseBuilder_ != null) {
          return errorResponseBuilder_.getMessageOrBuilder();
        } else {
          return errorResponse_;
        }
      }
      /**
       * <code>required .chunkserver.ErrorResponse error_response = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder> 
          getErrorResponseFieldBuilder() {
        if (errorResponseBuilder_ == null) {
          errorResponseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder>(
                  getErrorResponse(),
                  getParentForChildren(),
                  isClean());
          errorResponse_ = null;
        }
        return errorResponseBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.StorageContainerError)
    }

    static {
      defaultInstance = new StorageContainerError(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.StorageContainerError)
  }

  public interface MethodCompletionInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.MethodCompletionInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string url = 1;</code>
     */
    boolean hasUrl();
    /**
     * <code>required string url = 1;</code>
     */
    java.lang.String getUrl();
    /**
     * <code>required string url = 1;</code>
     */
    com.google.protobuf.ByteString
        getUrlBytes();

    /**
     * <code>required uint32 response_status_code = 2;</code>
     */
    boolean hasResponseStatusCode();
    /**
     * <code>required uint32 response_status_code = 2;</code>
     */
    int getResponseStatusCode();

    /**
     * <code>optional string response_status_line = 3;</code>
     */
    boolean hasResponseStatusLine();
    /**
     * <code>optional string response_status_line = 3;</code>
     */
    java.lang.String getResponseStatusLine();
    /**
     * <code>optional string response_status_line = 3;</code>
     */
    com.google.protobuf.ByteString
        getResponseStatusLineBytes();

    /**
     * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
     */
    java.util.List<ChunkServer.NameValuePair> 
        getVendorResponseHeadersList();
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
     */
    ChunkServer.NameValuePair getVendorResponseHeaders(int index);
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
     */
    int getVendorResponseHeadersCount();
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
     */
    java.util.List<? extends ChunkServer.NameValuePairOrBuilder> 
        getVendorResponseHeadersOrBuilderList();
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
     */
    ChunkServer.NameValuePairOrBuilder getVendorResponseHeadersOrBuilder(
        int index);

    /**
     * <code>optional bytes response_body = 5;</code>
     */
    boolean hasResponseBody();
    /**
     * <code>optional bytes response_body = 5;</code>
     */
    com.google.protobuf.ByteString getResponseBody();

    /**
     * <code>optional .chunkserver.ErrorResponse error = 6;</code>
     */
    boolean hasError();
    /**
     * <code>optional .chunkserver.ErrorResponse error = 6;</code>
     */
    ChunkServer.ErrorResponse getError();
    /**
     * <code>optional .chunkserver.ErrorResponse error = 6;</code>
     */
    ChunkServer.ErrorResponseOrBuilder getErrorOrBuilder();

    /**
     * <code>optional bytes client_computed_md5 = 7;</code>
     */
    boolean hasClientComputedMd5();
    /**
     * <code>optional bytes client_computed_md5 = 7;</code>
     */
    com.google.protobuf.ByteString getClientComputedMd5();

    /**
     * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
     */
    java.util.List<ChunkServer.NameValuePair> 
        getVendorNvPairsList();
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
     */
    ChunkServer.NameValuePair getVendorNvPairs(int index);
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
     */
    int getVendorNvPairsCount();
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
     */
    java.util.List<? extends ChunkServer.NameValuePairOrBuilder> 
        getVendorNvPairsOrBuilderList();
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
     */
    ChunkServer.NameValuePairOrBuilder getVendorNvPairsOrBuilder(
        int index);

    /**
     * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
     */
    java.util.List<ChunkServer.NameValuePair> 
        getClientNvPairsList();
    /**
     * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
     */
    ChunkServer.NameValuePair getClientNvPairs(int index);
    /**
     * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
     */
    int getClientNvPairsCount();
    /**
     * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
     */
    java.util.List<? extends ChunkServer.NameValuePairOrBuilder> 
        getClientNvPairsOrBuilderList();
    /**
     * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
     */
    ChunkServer.NameValuePairOrBuilder getClientNvPairsOrBuilder(
        int index);

    /**
     * <code>required string storage_container_authorization_token = 10;</code>
     */
    boolean hasStorageContainerAuthorizationToken();
    /**
     * <code>required string storage_container_authorization_token = 10;</code>
     */
    java.lang.String getStorageContainerAuthorizationToken();
    /**
     * <code>required string storage_container_authorization_token = 10;</code>
     */
    com.google.protobuf.ByteString
        getStorageContainerAuthorizationTokenBytes();
  }
  /**
   * Protobuf type {@code chunkserver.MethodCompletionInfo}
   */
  public static final class MethodCompletionInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.MethodCompletionInfo)
      MethodCompletionInfoOrBuilder {
    // Use MethodCompletionInfo.newBuilder() to construct.
    private MethodCompletionInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MethodCompletionInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MethodCompletionInfo defaultInstance;
    public static MethodCompletionInfo getDefaultInstance() {
      return defaultInstance;
    }

    public MethodCompletionInfo getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MethodCompletionInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              url_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              responseStatusCode_ = input.readUInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              responseStatusLine_ = bs;
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                vendorResponseHeaders_ = new java.util.ArrayList<ChunkServer.NameValuePair>();
                mutable_bitField0_ |= 0x00000008;
              }
              vendorResponseHeaders_.add(input.readMessage(ChunkServer.NameValuePair.PARSER, extensionRegistry));
              break;
            }
            case 42: {
              bitField0_ |= 0x00000008;
              responseBody_ = input.readBytes();
              break;
            }
            case 50: {
              ChunkServer.ErrorResponse.Builder subBuilder = null;
              if (((bitField0_ & 0x00000010) == 0x00000010)) {
                subBuilder = error_.toBuilder();
              }
              error_ = input.readMessage(ChunkServer.ErrorResponse.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(error_);
                error_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000010;
              break;
            }
            case 58: {
              bitField0_ |= 0x00000020;
              clientComputedMd5_ = input.readBytes();
              break;
            }
            case 66: {
              if (!((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                vendorNvPairs_ = new java.util.ArrayList<ChunkServer.NameValuePair>();
                mutable_bitField0_ |= 0x00000080;
              }
              vendorNvPairs_.add(input.readMessage(ChunkServer.NameValuePair.PARSER, extensionRegistry));
              break;
            }
            case 74: {
              if (!((mutable_bitField0_ & 0x00000100) == 0x00000100)) {
                clientNvPairs_ = new java.util.ArrayList<ChunkServer.NameValuePair>();
                mutable_bitField0_ |= 0x00000100;
              }
              clientNvPairs_.add(input.readMessage(ChunkServer.NameValuePair.PARSER, extensionRegistry));
              break;
            }
            case 82: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000040;
              storageContainerAuthorizationToken_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          vendorResponseHeaders_ = java.util.Collections.unmodifiableList(vendorResponseHeaders_);
        }
        if (((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
          vendorNvPairs_ = java.util.Collections.unmodifiableList(vendorNvPairs_);
        }
        if (((mutable_bitField0_ & 0x00000100) == 0x00000100)) {
          clientNvPairs_ = java.util.Collections.unmodifiableList(clientNvPairs_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_MethodCompletionInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_MethodCompletionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.MethodCompletionInfo.class, ChunkServer.MethodCompletionInfo.Builder.class);
    }

    public static com.google.protobuf.Parser<MethodCompletionInfo> PARSER =
        new com.google.protobuf.AbstractParser<MethodCompletionInfo>() {
      public MethodCompletionInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MethodCompletionInfo(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MethodCompletionInfo> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int URL_FIELD_NUMBER = 1;
    private java.lang.Object url_;
    /**
     * <code>required string url = 1;</code>
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string url = 1;</code>
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          url_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string url = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RESPONSE_STATUS_CODE_FIELD_NUMBER = 2;
    private int responseStatusCode_;
    /**
     * <code>required uint32 response_status_code = 2;</code>
     */
    public boolean hasResponseStatusCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint32 response_status_code = 2;</code>
     */
    public int getResponseStatusCode() {
      return responseStatusCode_;
    }

    public static final int RESPONSE_STATUS_LINE_FIELD_NUMBER = 3;
    private java.lang.Object responseStatusLine_;
    /**
     * <code>optional string response_status_line = 3;</code>
     */
    public boolean hasResponseStatusLine() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string response_status_line = 3;</code>
     */
    public java.lang.String getResponseStatusLine() {
      java.lang.Object ref = responseStatusLine_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          responseStatusLine_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string response_status_line = 3;</code>
     */
    public com.google.protobuf.ByteString
        getResponseStatusLineBytes() {
      java.lang.Object ref = responseStatusLine_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        responseStatusLine_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VENDOR_RESPONSE_HEADERS_FIELD_NUMBER = 4;
    private java.util.List<ChunkServer.NameValuePair> vendorResponseHeaders_;
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
     */
    public java.util.List<ChunkServer.NameValuePair> getVendorResponseHeadersList() {
      return vendorResponseHeaders_;
    }
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
     */
    public java.util.List<? extends ChunkServer.NameValuePairOrBuilder> 
        getVendorResponseHeadersOrBuilderList() {
      return vendorResponseHeaders_;
    }
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
     */
    public int getVendorResponseHeadersCount() {
      return vendorResponseHeaders_.size();
    }
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
     */
    public ChunkServer.NameValuePair getVendorResponseHeaders(int index) {
      return vendorResponseHeaders_.get(index);
    }
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
     */
    public ChunkServer.NameValuePairOrBuilder getVendorResponseHeadersOrBuilder(
        int index) {
      return vendorResponseHeaders_.get(index);
    }

    public static final int RESPONSE_BODY_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString responseBody_;
    /**
     * <code>optional bytes response_body = 5;</code>
     */
    public boolean hasResponseBody() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bytes response_body = 5;</code>
     */
    public com.google.protobuf.ByteString getResponseBody() {
      return responseBody_;
    }

    public static final int ERROR_FIELD_NUMBER = 6;
    private ChunkServer.ErrorResponse error_;
    /**
     * <code>optional .chunkserver.ErrorResponse error = 6;</code>
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional .chunkserver.ErrorResponse error = 6;</code>
     */
    public ChunkServer.ErrorResponse getError() {
      return error_;
    }
    /**
     * <code>optional .chunkserver.ErrorResponse error = 6;</code>
     */
    public ChunkServer.ErrorResponseOrBuilder getErrorOrBuilder() {
      return error_;
    }

    public static final int CLIENT_COMPUTED_MD5_FIELD_NUMBER = 7;
    private com.google.protobuf.ByteString clientComputedMd5_;
    /**
     * <code>optional bytes client_computed_md5 = 7;</code>
     */
    public boolean hasClientComputedMd5() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bytes client_computed_md5 = 7;</code>
     */
    public com.google.protobuf.ByteString getClientComputedMd5() {
      return clientComputedMd5_;
    }

    public static final int VENDOR_NV_PAIRS_FIELD_NUMBER = 8;
    private java.util.List<ChunkServer.NameValuePair> vendorNvPairs_;
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
     */
    public java.util.List<ChunkServer.NameValuePair> getVendorNvPairsList() {
      return vendorNvPairs_;
    }
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
     */
    public java.util.List<? extends ChunkServer.NameValuePairOrBuilder> 
        getVendorNvPairsOrBuilderList() {
      return vendorNvPairs_;
    }
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
     */
    public int getVendorNvPairsCount() {
      return vendorNvPairs_.size();
    }
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
     */
    public ChunkServer.NameValuePair getVendorNvPairs(int index) {
      return vendorNvPairs_.get(index);
    }
    /**
     * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
     */
    public ChunkServer.NameValuePairOrBuilder getVendorNvPairsOrBuilder(
        int index) {
      return vendorNvPairs_.get(index);
    }

    public static final int CLIENT_NV_PAIRS_FIELD_NUMBER = 9;
    private java.util.List<ChunkServer.NameValuePair> clientNvPairs_;
    /**
     * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
     */
    public java.util.List<ChunkServer.NameValuePair> getClientNvPairsList() {
      return clientNvPairs_;
    }
    /**
     * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
     */
    public java.util.List<? extends ChunkServer.NameValuePairOrBuilder> 
        getClientNvPairsOrBuilderList() {
      return clientNvPairs_;
    }
    /**
     * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
     */
    public int getClientNvPairsCount() {
      return clientNvPairs_.size();
    }
    /**
     * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
     */
    public ChunkServer.NameValuePair getClientNvPairs(int index) {
      return clientNvPairs_.get(index);
    }
    /**
     * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
     */
    public ChunkServer.NameValuePairOrBuilder getClientNvPairsOrBuilder(
        int index) {
      return clientNvPairs_.get(index);
    }

    public static final int STORAGE_CONTAINER_AUTHORIZATION_TOKEN_FIELD_NUMBER = 10;
    private java.lang.Object storageContainerAuthorizationToken_;
    /**
     * <code>required string storage_container_authorization_token = 10;</code>
     */
    public boolean hasStorageContainerAuthorizationToken() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>required string storage_container_authorization_token = 10;</code>
     */
    public java.lang.String getStorageContainerAuthorizationToken() {
      java.lang.Object ref = storageContainerAuthorizationToken_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          storageContainerAuthorizationToken_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string storage_container_authorization_token = 10;</code>
     */
    public com.google.protobuf.ByteString
        getStorageContainerAuthorizationTokenBytes() {
      java.lang.Object ref = storageContainerAuthorizationToken_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storageContainerAuthorizationToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      url_ = "";
      responseStatusCode_ = 0;
      responseStatusLine_ = "";
      vendorResponseHeaders_ = java.util.Collections.emptyList();
      responseBody_ = com.google.protobuf.ByteString.EMPTY;
      error_ = ChunkServer.ErrorResponse.getDefaultInstance();
      clientComputedMd5_ = com.google.protobuf.ByteString.EMPTY;
      vendorNvPairs_ = java.util.Collections.emptyList();
      clientNvPairs_ = java.util.Collections.emptyList();
      storageContainerAuthorizationToken_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasUrl()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasResponseStatusCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStorageContainerAuthorizationToken()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getVendorResponseHeadersCount(); i++) {
        if (!getVendorResponseHeaders(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasError()) {
        if (!getError().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getVendorNvPairsCount(); i++) {
        if (!getVendorNvPairs(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getClientNvPairsCount(); i++) {
        if (!getClientNvPairs(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getUrlBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, responseStatusCode_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getResponseStatusLineBytes());
      }
      for (int i = 0; i < vendorResponseHeaders_.size(); i++) {
        output.writeMessage(4, vendorResponseHeaders_.get(i));
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(5, responseBody_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(6, error_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(7, clientComputedMd5_);
      }
      for (int i = 0; i < vendorNvPairs_.size(); i++) {
        output.writeMessage(8, vendorNvPairs_.get(i));
      }
      for (int i = 0; i < clientNvPairs_.size(); i++) {
        output.writeMessage(9, clientNvPairs_.get(i));
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(10, getStorageContainerAuthorizationTokenBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getUrlBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, responseStatusCode_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getResponseStatusLineBytes());
      }
      for (int i = 0; i < vendorResponseHeaders_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, vendorResponseHeaders_.get(i));
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, responseBody_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, error_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, clientComputedMd5_);
      }
      for (int i = 0; i < vendorNvPairs_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, vendorNvPairs_.get(i));
      }
      for (int i = 0; i < clientNvPairs_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, clientNvPairs_.get(i));
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(10, getStorageContainerAuthorizationTokenBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.MethodCompletionInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.MethodCompletionInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.MethodCompletionInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.MethodCompletionInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.MethodCompletionInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.MethodCompletionInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.MethodCompletionInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.MethodCompletionInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.MethodCompletionInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.MethodCompletionInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.MethodCompletionInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.MethodCompletionInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.MethodCompletionInfo)
        ChunkServer.MethodCompletionInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_MethodCompletionInfo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_MethodCompletionInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.MethodCompletionInfo.class, ChunkServer.MethodCompletionInfo.Builder.class);
      }

      // Construct using Chunkserver.MethodCompletionInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getVendorResponseHeadersFieldBuilder();
          getErrorFieldBuilder();
          getVendorNvPairsFieldBuilder();
          getClientNvPairsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        url_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        responseStatusCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        responseStatusLine_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        if (vendorResponseHeadersBuilder_ == null) {
          vendorResponseHeaders_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          vendorResponseHeadersBuilder_.clear();
        }
        responseBody_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        if (errorBuilder_ == null) {
          error_ = ChunkServer.ErrorResponse.getDefaultInstance();
        } else {
          errorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        clientComputedMd5_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000040);
        if (vendorNvPairsBuilder_ == null) {
          vendorNvPairs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000080);
        } else {
          vendorNvPairsBuilder_.clear();
        }
        if (clientNvPairsBuilder_ == null) {
          clientNvPairs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000100);
        } else {
          clientNvPairsBuilder_.clear();
        }
        storageContainerAuthorizationToken_ = "";
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_MethodCompletionInfo_descriptor;
      }

      public ChunkServer.MethodCompletionInfo getDefaultInstanceForType() {
        return ChunkServer.MethodCompletionInfo.getDefaultInstance();
      }

      public ChunkServer.MethodCompletionInfo build() {
        ChunkServer.MethodCompletionInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.MethodCompletionInfo buildPartial() {
        ChunkServer.MethodCompletionInfo result = new ChunkServer.MethodCompletionInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.url_ = url_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.responseStatusCode_ = responseStatusCode_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.responseStatusLine_ = responseStatusLine_;
        if (vendorResponseHeadersBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            vendorResponseHeaders_ = java.util.Collections.unmodifiableList(vendorResponseHeaders_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.vendorResponseHeaders_ = vendorResponseHeaders_;
        } else {
          result.vendorResponseHeaders_ = vendorResponseHeadersBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000008;
        }
        result.responseBody_ = responseBody_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000010;
        }
        if (errorBuilder_ == null) {
          result.error_ = error_;
        } else {
          result.error_ = errorBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000020;
        }
        result.clientComputedMd5_ = clientComputedMd5_;
        if (vendorNvPairsBuilder_ == null) {
          if (((bitField0_ & 0x00000080) == 0x00000080)) {
            vendorNvPairs_ = java.util.Collections.unmodifiableList(vendorNvPairs_);
            bitField0_ = (bitField0_ & ~0x00000080);
          }
          result.vendorNvPairs_ = vendorNvPairs_;
        } else {
          result.vendorNvPairs_ = vendorNvPairsBuilder_.build();
        }
        if (clientNvPairsBuilder_ == null) {
          if (((bitField0_ & 0x00000100) == 0x00000100)) {
            clientNvPairs_ = java.util.Collections.unmodifiableList(clientNvPairs_);
            bitField0_ = (bitField0_ & ~0x00000100);
          }
          result.clientNvPairs_ = clientNvPairs_;
        } else {
          result.clientNvPairs_ = clientNvPairsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000040;
        }
        result.storageContainerAuthorizationToken_ = storageContainerAuthorizationToken_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.MethodCompletionInfo) {
          return mergeFrom((ChunkServer.MethodCompletionInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.MethodCompletionInfo other) {
        if (other == ChunkServer.MethodCompletionInfo.getDefaultInstance()) return this;
        if (other.hasUrl()) {
          bitField0_ |= 0x00000001;
          url_ = other.url_;
          onChanged();
        }
        if (other.hasResponseStatusCode()) {
          setResponseStatusCode(other.getResponseStatusCode());
        }
        if (other.hasResponseStatusLine()) {
          bitField0_ |= 0x00000004;
          responseStatusLine_ = other.responseStatusLine_;
          onChanged();
        }
        if (vendorResponseHeadersBuilder_ == null) {
          if (!other.vendorResponseHeaders_.isEmpty()) {
            if (vendorResponseHeaders_.isEmpty()) {
              vendorResponseHeaders_ = other.vendorResponseHeaders_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureVendorResponseHeadersIsMutable();
              vendorResponseHeaders_.addAll(other.vendorResponseHeaders_);
            }
            onChanged();
          }
        } else {
          if (!other.vendorResponseHeaders_.isEmpty()) {
            if (vendorResponseHeadersBuilder_.isEmpty()) {
              vendorResponseHeadersBuilder_.dispose();
              vendorResponseHeadersBuilder_ = null;
              vendorResponseHeaders_ = other.vendorResponseHeaders_;
              bitField0_ = (bitField0_ & ~0x00000008);
              vendorResponseHeadersBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getVendorResponseHeadersFieldBuilder() : null;
            } else {
              vendorResponseHeadersBuilder_.addAllMessages(other.vendorResponseHeaders_);
            }
          }
        }
        if (other.hasResponseBody()) {
          setResponseBody(other.getResponseBody());
        }
        if (other.hasError()) {
          mergeError(other.getError());
        }
        if (other.hasClientComputedMd5()) {
          setClientComputedMd5(other.getClientComputedMd5());
        }
        if (vendorNvPairsBuilder_ == null) {
          if (!other.vendorNvPairs_.isEmpty()) {
            if (vendorNvPairs_.isEmpty()) {
              vendorNvPairs_ = other.vendorNvPairs_;
              bitField0_ = (bitField0_ & ~0x00000080);
            } else {
              ensureVendorNvPairsIsMutable();
              vendorNvPairs_.addAll(other.vendorNvPairs_);
            }
            onChanged();
          }
        } else {
          if (!other.vendorNvPairs_.isEmpty()) {
            if (vendorNvPairsBuilder_.isEmpty()) {
              vendorNvPairsBuilder_.dispose();
              vendorNvPairsBuilder_ = null;
              vendorNvPairs_ = other.vendorNvPairs_;
              bitField0_ = (bitField0_ & ~0x00000080);
              vendorNvPairsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getVendorNvPairsFieldBuilder() : null;
            } else {
              vendorNvPairsBuilder_.addAllMessages(other.vendorNvPairs_);
            }
          }
        }
        if (clientNvPairsBuilder_ == null) {
          if (!other.clientNvPairs_.isEmpty()) {
            if (clientNvPairs_.isEmpty()) {
              clientNvPairs_ = other.clientNvPairs_;
              bitField0_ = (bitField0_ & ~0x00000100);
            } else {
              ensureClientNvPairsIsMutable();
              clientNvPairs_.addAll(other.clientNvPairs_);
            }
            onChanged();
          }
        } else {
          if (!other.clientNvPairs_.isEmpty()) {
            if (clientNvPairsBuilder_.isEmpty()) {
              clientNvPairsBuilder_.dispose();
              clientNvPairsBuilder_ = null;
              clientNvPairs_ = other.clientNvPairs_;
              bitField0_ = (bitField0_ & ~0x00000100);
              clientNvPairsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getClientNvPairsFieldBuilder() : null;
            } else {
              clientNvPairsBuilder_.addAllMessages(other.clientNvPairs_);
            }
          }
        }
        if (other.hasStorageContainerAuthorizationToken()) {
          bitField0_ |= 0x00000200;
          storageContainerAuthorizationToken_ = other.storageContainerAuthorizationToken_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasUrl()) {
          
          return false;
        }
        if (!hasResponseStatusCode()) {
          
          return false;
        }
        if (!hasStorageContainerAuthorizationToken()) {
          
          return false;
        }
        for (int i = 0; i < getVendorResponseHeadersCount(); i++) {
          if (!getVendorResponseHeaders(i).isInitialized()) {
            
            return false;
          }
        }
        if (hasError()) {
          if (!getError().isInitialized()) {
            
            return false;
          }
        }
        for (int i = 0; i < getVendorNvPairsCount(); i++) {
          if (!getVendorNvPairs(i).isInitialized()) {
            
            return false;
          }
        }
        for (int i = 0; i < getClientNvPairsCount(); i++) {
          if (!getClientNvPairs(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.MethodCompletionInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.MethodCompletionInfo) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object url_ = "";
      /**
       * <code>required string url = 1;</code>
       */
      public boolean hasUrl() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string url = 1;</code>
       */
      public java.lang.String getUrl() {
        java.lang.Object ref = url_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            url_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string url = 1;</code>
       */
      public com.google.protobuf.ByteString
          getUrlBytes() {
        java.lang.Object ref = url_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          url_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string url = 1;</code>
       */
      public Builder setUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        url_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string url = 1;</code>
       */
      public Builder clearUrl() {
        bitField0_ = (bitField0_ & ~0x00000001);
        url_ = getDefaultInstance().getUrl();
        onChanged();
        return this;
      }
      /**
       * <code>required string url = 1;</code>
       */
      public Builder setUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        url_ = value;
        onChanged();
        return this;
      }

      private int responseStatusCode_ ;
      /**
       * <code>required uint32 response_status_code = 2;</code>
       */
      public boolean hasResponseStatusCode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint32 response_status_code = 2;</code>
       */
      public int getResponseStatusCode() {
        return responseStatusCode_;
      }
      /**
       * <code>required uint32 response_status_code = 2;</code>
       */
      public Builder setResponseStatusCode(int value) {
        bitField0_ |= 0x00000002;
        responseStatusCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 response_status_code = 2;</code>
       */
      public Builder clearResponseStatusCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        responseStatusCode_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object responseStatusLine_ = "";
      /**
       * <code>optional string response_status_line = 3;</code>
       */
      public boolean hasResponseStatusLine() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string response_status_line = 3;</code>
       */
      public java.lang.String getResponseStatusLine() {
        java.lang.Object ref = responseStatusLine_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            responseStatusLine_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string response_status_line = 3;</code>
       */
      public com.google.protobuf.ByteString
          getResponseStatusLineBytes() {
        java.lang.Object ref = responseStatusLine_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          responseStatusLine_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string response_status_line = 3;</code>
       */
      public Builder setResponseStatusLine(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        responseStatusLine_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string response_status_line = 3;</code>
       */
      public Builder clearResponseStatusLine() {
        bitField0_ = (bitField0_ & ~0x00000004);
        responseStatusLine_ = getDefaultInstance().getResponseStatusLine();
        onChanged();
        return this;
      }
      /**
       * <code>optional string response_status_line = 3;</code>
       */
      public Builder setResponseStatusLineBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        responseStatusLine_ = value;
        onChanged();
        return this;
      }

      private java.util.List<ChunkServer.NameValuePair> vendorResponseHeaders_ =
        java.util.Collections.emptyList();
      private void ensureVendorResponseHeadersIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          vendorResponseHeaders_ = new java.util.ArrayList<ChunkServer.NameValuePair>(vendorResponseHeaders_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.NameValuePair, ChunkServer.NameValuePair.Builder, ChunkServer.NameValuePairOrBuilder> vendorResponseHeadersBuilder_;

      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public java.util.List<ChunkServer.NameValuePair> getVendorResponseHeadersList() {
        if (vendorResponseHeadersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(vendorResponseHeaders_);
        } else {
          return vendorResponseHeadersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public int getVendorResponseHeadersCount() {
        if (vendorResponseHeadersBuilder_ == null) {
          return vendorResponseHeaders_.size();
        } else {
          return vendorResponseHeadersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public ChunkServer.NameValuePair getVendorResponseHeaders(int index) {
        if (vendorResponseHeadersBuilder_ == null) {
          return vendorResponseHeaders_.get(index);
        } else {
          return vendorResponseHeadersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public Builder setVendorResponseHeaders(
          int index, ChunkServer.NameValuePair value) {
        if (vendorResponseHeadersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVendorResponseHeadersIsMutable();
          vendorResponseHeaders_.set(index, value);
          onChanged();
        } else {
          vendorResponseHeadersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public Builder setVendorResponseHeaders(
          int index, ChunkServer.NameValuePair.Builder builderForValue) {
        if (vendorResponseHeadersBuilder_ == null) {
          ensureVendorResponseHeadersIsMutable();
          vendorResponseHeaders_.set(index, builderForValue.build());
          onChanged();
        } else {
          vendorResponseHeadersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public Builder addVendorResponseHeaders(ChunkServer.NameValuePair value) {
        if (vendorResponseHeadersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVendorResponseHeadersIsMutable();
          vendorResponseHeaders_.add(value);
          onChanged();
        } else {
          vendorResponseHeadersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public Builder addVendorResponseHeaders(
          int index, ChunkServer.NameValuePair value) {
        if (vendorResponseHeadersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVendorResponseHeadersIsMutable();
          vendorResponseHeaders_.add(index, value);
          onChanged();
        } else {
          vendorResponseHeadersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public Builder addVendorResponseHeaders(
          ChunkServer.NameValuePair.Builder builderForValue) {
        if (vendorResponseHeadersBuilder_ == null) {
          ensureVendorResponseHeadersIsMutable();
          vendorResponseHeaders_.add(builderForValue.build());
          onChanged();
        } else {
          vendorResponseHeadersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public Builder addVendorResponseHeaders(
          int index, ChunkServer.NameValuePair.Builder builderForValue) {
        if (vendorResponseHeadersBuilder_ == null) {
          ensureVendorResponseHeadersIsMutable();
          vendorResponseHeaders_.add(index, builderForValue.build());
          onChanged();
        } else {
          vendorResponseHeadersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public Builder addAllVendorResponseHeaders(
          java.lang.Iterable<? extends ChunkServer.NameValuePair> values) {
        if (vendorResponseHeadersBuilder_ == null) {
          ensureVendorResponseHeadersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, vendorResponseHeaders_);
          onChanged();
        } else {
          vendorResponseHeadersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public Builder clearVendorResponseHeaders() {
        if (vendorResponseHeadersBuilder_ == null) {
          vendorResponseHeaders_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          vendorResponseHeadersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public Builder removeVendorResponseHeaders(int index) {
        if (vendorResponseHeadersBuilder_ == null) {
          ensureVendorResponseHeadersIsMutable();
          vendorResponseHeaders_.remove(index);
          onChanged();
        } else {
          vendorResponseHeadersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public ChunkServer.NameValuePair.Builder getVendorResponseHeadersBuilder(
          int index) {
        return getVendorResponseHeadersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public ChunkServer.NameValuePairOrBuilder getVendorResponseHeadersOrBuilder(
          int index) {
        if (vendorResponseHeadersBuilder_ == null) {
          return vendorResponseHeaders_.get(index);  } else {
          return vendorResponseHeadersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public java.util.List<? extends ChunkServer.NameValuePairOrBuilder> 
           getVendorResponseHeadersOrBuilderList() {
        if (vendorResponseHeadersBuilder_ != null) {
          return vendorResponseHeadersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(vendorResponseHeaders_);
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public ChunkServer.NameValuePair.Builder addVendorResponseHeadersBuilder() {
        return getVendorResponseHeadersFieldBuilder().addBuilder(ChunkServer.NameValuePair.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public ChunkServer.NameValuePair.Builder addVendorResponseHeadersBuilder(
          int index) {
        return getVendorResponseHeadersFieldBuilder().addBuilder(index, ChunkServer.NameValuePair.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_response_headers = 4;</code>
       */
      public java.util.List<ChunkServer.NameValuePair.Builder> 
           getVendorResponseHeadersBuilderList() {
        return getVendorResponseHeadersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.NameValuePair, ChunkServer.NameValuePair.Builder, ChunkServer.NameValuePairOrBuilder> 
          getVendorResponseHeadersFieldBuilder() {
        if (vendorResponseHeadersBuilder_ == null) {
          vendorResponseHeadersBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.NameValuePair, ChunkServer.NameValuePair.Builder, ChunkServer.NameValuePairOrBuilder>(
                  vendorResponseHeaders_,
                  ((bitField0_ & 0x00000008) == 0x00000008),
                  getParentForChildren(),
                  isClean());
          vendorResponseHeaders_ = null;
        }
        return vendorResponseHeadersBuilder_;
      }

      private com.google.protobuf.ByteString responseBody_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes response_body = 5;</code>
       */
      public boolean hasResponseBody() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bytes response_body = 5;</code>
       */
      public com.google.protobuf.ByteString getResponseBody() {
        return responseBody_;
      }
      /**
       * <code>optional bytes response_body = 5;</code>
       */
      public Builder setResponseBody(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        responseBody_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes response_body = 5;</code>
       */
      public Builder clearResponseBody() {
        bitField0_ = (bitField0_ & ~0x00000010);
        responseBody_ = getDefaultInstance().getResponseBody();
        onChanged();
        return this;
      }

      private ChunkServer.ErrorResponse error_ = ChunkServer.ErrorResponse.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder> errorBuilder_;
      /**
       * <code>optional .chunkserver.ErrorResponse error = 6;</code>
       */
      public boolean hasError() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional .chunkserver.ErrorResponse error = 6;</code>
       */
      public ChunkServer.ErrorResponse getError() {
        if (errorBuilder_ == null) {
          return error_;
        } else {
          return errorBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .chunkserver.ErrorResponse error = 6;</code>
       */
      public Builder setError(ChunkServer.ErrorResponse value) {
        if (errorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          error_ = value;
          onChanged();
        } else {
          errorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <code>optional .chunkserver.ErrorResponse error = 6;</code>
       */
      public Builder setError(
          ChunkServer.ErrorResponse.Builder builderForValue) {
        if (errorBuilder_ == null) {
          error_ = builderForValue.build();
          onChanged();
        } else {
          errorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <code>optional .chunkserver.ErrorResponse error = 6;</code>
       */
      public Builder mergeError(ChunkServer.ErrorResponse value) {
        if (errorBuilder_ == null) {
          if (((bitField0_ & 0x00000020) == 0x00000020) &&
              error_ != ChunkServer.ErrorResponse.getDefaultInstance()) {
            error_ =
              ChunkServer.ErrorResponse.newBuilder(error_).mergeFrom(value).buildPartial();
          } else {
            error_ = value;
          }
          onChanged();
        } else {
          errorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <code>optional .chunkserver.ErrorResponse error = 6;</code>
       */
      public Builder clearError() {
        if (errorBuilder_ == null) {
          error_ = ChunkServer.ErrorResponse.getDefaultInstance();
          onChanged();
        } else {
          errorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }
      /**
       * <code>optional .chunkserver.ErrorResponse error = 6;</code>
       */
      public ChunkServer.ErrorResponse.Builder getErrorBuilder() {
        bitField0_ |= 0x00000020;
        onChanged();
        return getErrorFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .chunkserver.ErrorResponse error = 6;</code>
       */
      public ChunkServer.ErrorResponseOrBuilder getErrorOrBuilder() {
        if (errorBuilder_ != null) {
          return errorBuilder_.getMessageOrBuilder();
        } else {
          return error_;
        }
      }
      /**
       * <code>optional .chunkserver.ErrorResponse error = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder> 
          getErrorFieldBuilder() {
        if (errorBuilder_ == null) {
          errorBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              ChunkServer.ErrorResponse, ChunkServer.ErrorResponse.Builder, ChunkServer.ErrorResponseOrBuilder>(
                  getError(),
                  getParentForChildren(),
                  isClean());
          error_ = null;
        }
        return errorBuilder_;
      }

      private com.google.protobuf.ByteString clientComputedMd5_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes client_computed_md5 = 7;</code>
       */
      public boolean hasClientComputedMd5() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional bytes client_computed_md5 = 7;</code>
       */
      public com.google.protobuf.ByteString getClientComputedMd5() {
        return clientComputedMd5_;
      }
      /**
       * <code>optional bytes client_computed_md5 = 7;</code>
       */
      public Builder setClientComputedMd5(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        clientComputedMd5_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes client_computed_md5 = 7;</code>
       */
      public Builder clearClientComputedMd5() {
        bitField0_ = (bitField0_ & ~0x00000040);
        clientComputedMd5_ = getDefaultInstance().getClientComputedMd5();
        onChanged();
        return this;
      }

      private java.util.List<ChunkServer.NameValuePair> vendorNvPairs_ =
        java.util.Collections.emptyList();
      private void ensureVendorNvPairsIsMutable() {
        if (!((bitField0_ & 0x00000080) == 0x00000080)) {
          vendorNvPairs_ = new java.util.ArrayList<ChunkServer.NameValuePair>(vendorNvPairs_);
          bitField0_ |= 0x00000080;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.NameValuePair, ChunkServer.NameValuePair.Builder, ChunkServer.NameValuePairOrBuilder> vendorNvPairsBuilder_;

      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public java.util.List<ChunkServer.NameValuePair> getVendorNvPairsList() {
        if (vendorNvPairsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(vendorNvPairs_);
        } else {
          return vendorNvPairsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public int getVendorNvPairsCount() {
        if (vendorNvPairsBuilder_ == null) {
          return vendorNvPairs_.size();
        } else {
          return vendorNvPairsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public ChunkServer.NameValuePair getVendorNvPairs(int index) {
        if (vendorNvPairsBuilder_ == null) {
          return vendorNvPairs_.get(index);
        } else {
          return vendorNvPairsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public Builder setVendorNvPairs(
          int index, ChunkServer.NameValuePair value) {
        if (vendorNvPairsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVendorNvPairsIsMutable();
          vendorNvPairs_.set(index, value);
          onChanged();
        } else {
          vendorNvPairsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public Builder setVendorNvPairs(
          int index, ChunkServer.NameValuePair.Builder builderForValue) {
        if (vendorNvPairsBuilder_ == null) {
          ensureVendorNvPairsIsMutable();
          vendorNvPairs_.set(index, builderForValue.build());
          onChanged();
        } else {
          vendorNvPairsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public Builder addVendorNvPairs(ChunkServer.NameValuePair value) {
        if (vendorNvPairsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVendorNvPairsIsMutable();
          vendorNvPairs_.add(value);
          onChanged();
        } else {
          vendorNvPairsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public Builder addVendorNvPairs(
          int index, ChunkServer.NameValuePair value) {
        if (vendorNvPairsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVendorNvPairsIsMutable();
          vendorNvPairs_.add(index, value);
          onChanged();
        } else {
          vendorNvPairsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public Builder addVendorNvPairs(
          ChunkServer.NameValuePair.Builder builderForValue) {
        if (vendorNvPairsBuilder_ == null) {
          ensureVendorNvPairsIsMutable();
          vendorNvPairs_.add(builderForValue.build());
          onChanged();
        } else {
          vendorNvPairsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public Builder addVendorNvPairs(
          int index, ChunkServer.NameValuePair.Builder builderForValue) {
        if (vendorNvPairsBuilder_ == null) {
          ensureVendorNvPairsIsMutable();
          vendorNvPairs_.add(index, builderForValue.build());
          onChanged();
        } else {
          vendorNvPairsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public Builder addAllVendorNvPairs(
          java.lang.Iterable<? extends ChunkServer.NameValuePair> values) {
        if (vendorNvPairsBuilder_ == null) {
          ensureVendorNvPairsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, vendorNvPairs_);
          onChanged();
        } else {
          vendorNvPairsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public Builder clearVendorNvPairs() {
        if (vendorNvPairsBuilder_ == null) {
          vendorNvPairs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000080);
          onChanged();
        } else {
          vendorNvPairsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public Builder removeVendorNvPairs(int index) {
        if (vendorNvPairsBuilder_ == null) {
          ensureVendorNvPairsIsMutable();
          vendorNvPairs_.remove(index);
          onChanged();
        } else {
          vendorNvPairsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public ChunkServer.NameValuePair.Builder getVendorNvPairsBuilder(
          int index) {
        return getVendorNvPairsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public ChunkServer.NameValuePairOrBuilder getVendorNvPairsOrBuilder(
          int index) {
        if (vendorNvPairsBuilder_ == null) {
          return vendorNvPairs_.get(index);  } else {
          return vendorNvPairsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public java.util.List<? extends ChunkServer.NameValuePairOrBuilder> 
           getVendorNvPairsOrBuilderList() {
        if (vendorNvPairsBuilder_ != null) {
          return vendorNvPairsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(vendorNvPairs_);
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public ChunkServer.NameValuePair.Builder addVendorNvPairsBuilder() {
        return getVendorNvPairsFieldBuilder().addBuilder(ChunkServer.NameValuePair.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public ChunkServer.NameValuePair.Builder addVendorNvPairsBuilder(
          int index) {
        return getVendorNvPairsFieldBuilder().addBuilder(index, ChunkServer.NameValuePair.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.NameValuePair vendor_nv_pairs = 8;</code>
       */
      public java.util.List<ChunkServer.NameValuePair.Builder> 
           getVendorNvPairsBuilderList() {
        return getVendorNvPairsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.NameValuePair, ChunkServer.NameValuePair.Builder, ChunkServer.NameValuePairOrBuilder> 
          getVendorNvPairsFieldBuilder() {
        if (vendorNvPairsBuilder_ == null) {
          vendorNvPairsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.NameValuePair, ChunkServer.NameValuePair.Builder, ChunkServer.NameValuePairOrBuilder>(
                  vendorNvPairs_,
                  ((bitField0_ & 0x00000080) == 0x00000080),
                  getParentForChildren(),
                  isClean());
          vendorNvPairs_ = null;
        }
        return vendorNvPairsBuilder_;
      }

      private java.util.List<ChunkServer.NameValuePair> clientNvPairs_ =
        java.util.Collections.emptyList();
      private void ensureClientNvPairsIsMutable() {
        if (!((bitField0_ & 0x00000100) == 0x00000100)) {
          clientNvPairs_ = new java.util.ArrayList<ChunkServer.NameValuePair>(clientNvPairs_);
          bitField0_ |= 0x00000100;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.NameValuePair, ChunkServer.NameValuePair.Builder, ChunkServer.NameValuePairOrBuilder> clientNvPairsBuilder_;

      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public java.util.List<ChunkServer.NameValuePair> getClientNvPairsList() {
        if (clientNvPairsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(clientNvPairs_);
        } else {
          return clientNvPairsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public int getClientNvPairsCount() {
        if (clientNvPairsBuilder_ == null) {
          return clientNvPairs_.size();
        } else {
          return clientNvPairsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public ChunkServer.NameValuePair getClientNvPairs(int index) {
        if (clientNvPairsBuilder_ == null) {
          return clientNvPairs_.get(index);
        } else {
          return clientNvPairsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public Builder setClientNvPairs(
          int index, ChunkServer.NameValuePair value) {
        if (clientNvPairsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClientNvPairsIsMutable();
          clientNvPairs_.set(index, value);
          onChanged();
        } else {
          clientNvPairsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public Builder setClientNvPairs(
          int index, ChunkServer.NameValuePair.Builder builderForValue) {
        if (clientNvPairsBuilder_ == null) {
          ensureClientNvPairsIsMutable();
          clientNvPairs_.set(index, builderForValue.build());
          onChanged();
        } else {
          clientNvPairsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public Builder addClientNvPairs(ChunkServer.NameValuePair value) {
        if (clientNvPairsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClientNvPairsIsMutable();
          clientNvPairs_.add(value);
          onChanged();
        } else {
          clientNvPairsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public Builder addClientNvPairs(
          int index, ChunkServer.NameValuePair value) {
        if (clientNvPairsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClientNvPairsIsMutable();
          clientNvPairs_.add(index, value);
          onChanged();
        } else {
          clientNvPairsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public Builder addClientNvPairs(
          ChunkServer.NameValuePair.Builder builderForValue) {
        if (clientNvPairsBuilder_ == null) {
          ensureClientNvPairsIsMutable();
          clientNvPairs_.add(builderForValue.build());
          onChanged();
        } else {
          clientNvPairsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public Builder addClientNvPairs(
          int index, ChunkServer.NameValuePair.Builder builderForValue) {
        if (clientNvPairsBuilder_ == null) {
          ensureClientNvPairsIsMutable();
          clientNvPairs_.add(index, builderForValue.build());
          onChanged();
        } else {
          clientNvPairsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public Builder addAllClientNvPairs(
          java.lang.Iterable<? extends ChunkServer.NameValuePair> values) {
        if (clientNvPairsBuilder_ == null) {
          ensureClientNvPairsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, clientNvPairs_);
          onChanged();
        } else {
          clientNvPairsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public Builder clearClientNvPairs() {
        if (clientNvPairsBuilder_ == null) {
          clientNvPairs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000100);
          onChanged();
        } else {
          clientNvPairsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public Builder removeClientNvPairs(int index) {
        if (clientNvPairsBuilder_ == null) {
          ensureClientNvPairsIsMutable();
          clientNvPairs_.remove(index);
          onChanged();
        } else {
          clientNvPairsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public ChunkServer.NameValuePair.Builder getClientNvPairsBuilder(
          int index) {
        return getClientNvPairsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public ChunkServer.NameValuePairOrBuilder getClientNvPairsOrBuilder(
          int index) {
        if (clientNvPairsBuilder_ == null) {
          return clientNvPairs_.get(index);  } else {
          return clientNvPairsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public java.util.List<? extends ChunkServer.NameValuePairOrBuilder> 
           getClientNvPairsOrBuilderList() {
        if (clientNvPairsBuilder_ != null) {
          return clientNvPairsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(clientNvPairs_);
        }
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public ChunkServer.NameValuePair.Builder addClientNvPairsBuilder() {
        return getClientNvPairsFieldBuilder().addBuilder(ChunkServer.NameValuePair.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public ChunkServer.NameValuePair.Builder addClientNvPairsBuilder(
          int index) {
        return getClientNvPairsFieldBuilder().addBuilder(index, ChunkServer.NameValuePair.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.NameValuePair client_nv_pairs = 9;</code>
       */
      public java.util.List<ChunkServer.NameValuePair.Builder> 
           getClientNvPairsBuilderList() {
        return getClientNvPairsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.NameValuePair, ChunkServer.NameValuePair.Builder, ChunkServer.NameValuePairOrBuilder> 
          getClientNvPairsFieldBuilder() {
        if (clientNvPairsBuilder_ == null) {
          clientNvPairsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.NameValuePair, ChunkServer.NameValuePair.Builder, ChunkServer.NameValuePairOrBuilder>(
                  clientNvPairs_,
                  ((bitField0_ & 0x00000100) == 0x00000100),
                  getParentForChildren(),
                  isClean());
          clientNvPairs_ = null;
        }
        return clientNvPairsBuilder_;
      }

      private java.lang.Object storageContainerAuthorizationToken_ = "";
      /**
       * <code>required string storage_container_authorization_token = 10;</code>
       */
      public boolean hasStorageContainerAuthorizationToken() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>required string storage_container_authorization_token = 10;</code>
       */
      public java.lang.String getStorageContainerAuthorizationToken() {
        java.lang.Object ref = storageContainerAuthorizationToken_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            storageContainerAuthorizationToken_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string storage_container_authorization_token = 10;</code>
       */
      public com.google.protobuf.ByteString
          getStorageContainerAuthorizationTokenBytes() {
        java.lang.Object ref = storageContainerAuthorizationToken_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          storageContainerAuthorizationToken_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string storage_container_authorization_token = 10;</code>
       */
      public Builder setStorageContainerAuthorizationToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        storageContainerAuthorizationToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string storage_container_authorization_token = 10;</code>
       */
      public Builder clearStorageContainerAuthorizationToken() {
        bitField0_ = (bitField0_ & ~0x00000200);
        storageContainerAuthorizationToken_ = getDefaultInstance().getStorageContainerAuthorizationToken();
        onChanged();
        return this;
      }
      /**
       * <code>required string storage_container_authorization_token = 10;</code>
       */
      public Builder setStorageContainerAuthorizationTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        storageContainerAuthorizationToken_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.MethodCompletionInfo)
    }

    static {
      defaultInstance = new MethodCompletionInfo(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.MethodCompletionInfo)
  }

  public interface MethodCompletionInfoListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.MethodCompletionInfoList)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
     */
    java.util.List<ChunkServer.MethodCompletionInfo> 
        getMethodCompletionInfoList();
    /**
     * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
     */
    ChunkServer.MethodCompletionInfo getMethodCompletionInfo(int index);
    /**
     * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
     */
    int getMethodCompletionInfoCount();
    /**
     * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
     */
    java.util.List<? extends ChunkServer.MethodCompletionInfoOrBuilder> 
        getMethodCompletionInfoOrBuilderList();
    /**
     * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
     */
    ChunkServer.MethodCompletionInfoOrBuilder getMethodCompletionInfoOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code chunkserver.MethodCompletionInfoList}
   */
  public static final class MethodCompletionInfoList extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.MethodCompletionInfoList)
      MethodCompletionInfoListOrBuilder {
    // Use MethodCompletionInfoList.newBuilder() to construct.
    private MethodCompletionInfoList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MethodCompletionInfoList(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MethodCompletionInfoList defaultInstance;
    public static MethodCompletionInfoList getDefaultInstance() {
      return defaultInstance;
    }

    public MethodCompletionInfoList getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MethodCompletionInfoList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                methodCompletionInfo_ = new java.util.ArrayList<ChunkServer.MethodCompletionInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              methodCompletionInfo_.add(input.readMessage(ChunkServer.MethodCompletionInfo.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          methodCompletionInfo_ = java.util.Collections.unmodifiableList(methodCompletionInfo_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_MethodCompletionInfoList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_MethodCompletionInfoList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.MethodCompletionInfoList.class, ChunkServer.MethodCompletionInfoList.Builder.class);
    }

    public static com.google.protobuf.Parser<MethodCompletionInfoList> PARSER =
        new com.google.protobuf.AbstractParser<MethodCompletionInfoList>() {
      public MethodCompletionInfoList parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MethodCompletionInfoList(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MethodCompletionInfoList> getParserForType() {
      return PARSER;
    }

    public static final int METHOD_COMPLETION_INFO_FIELD_NUMBER = 1;
    private java.util.List<ChunkServer.MethodCompletionInfo> methodCompletionInfo_;
    /**
     * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
     */
    public java.util.List<ChunkServer.MethodCompletionInfo> getMethodCompletionInfoList() {
      return methodCompletionInfo_;
    }
    /**
     * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
     */
    public java.util.List<? extends ChunkServer.MethodCompletionInfoOrBuilder> 
        getMethodCompletionInfoOrBuilderList() {
      return methodCompletionInfo_;
    }
    /**
     * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
     */
    public int getMethodCompletionInfoCount() {
      return methodCompletionInfo_.size();
    }
    /**
     * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
     */
    public ChunkServer.MethodCompletionInfo getMethodCompletionInfo(int index) {
      return methodCompletionInfo_.get(index);
    }
    /**
     * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
     */
    public ChunkServer.MethodCompletionInfoOrBuilder getMethodCompletionInfoOrBuilder(
        int index) {
      return methodCompletionInfo_.get(index);
    }

    private void initFields() {
      methodCompletionInfo_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getMethodCompletionInfoCount(); i++) {
        if (!getMethodCompletionInfo(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < methodCompletionInfo_.size(); i++) {
        output.writeMessage(1, methodCompletionInfo_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < methodCompletionInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, methodCompletionInfo_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.MethodCompletionInfoList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.MethodCompletionInfoList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.MethodCompletionInfoList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.MethodCompletionInfoList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.MethodCompletionInfoList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.MethodCompletionInfoList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.MethodCompletionInfoList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.MethodCompletionInfoList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.MethodCompletionInfoList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.MethodCompletionInfoList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.MethodCompletionInfoList prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.MethodCompletionInfoList}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.MethodCompletionInfoList)
        ChunkServer.MethodCompletionInfoListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_MethodCompletionInfoList_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_MethodCompletionInfoList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.MethodCompletionInfoList.class, ChunkServer.MethodCompletionInfoList.Builder.class);
      }

      // Construct using Chunkserver.MethodCompletionInfoList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getMethodCompletionInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (methodCompletionInfoBuilder_ == null) {
          methodCompletionInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          methodCompletionInfoBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_MethodCompletionInfoList_descriptor;
      }

      public ChunkServer.MethodCompletionInfoList getDefaultInstanceForType() {
        return ChunkServer.MethodCompletionInfoList.getDefaultInstance();
      }

      public ChunkServer.MethodCompletionInfoList build() {
        ChunkServer.MethodCompletionInfoList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.MethodCompletionInfoList buildPartial() {
        ChunkServer.MethodCompletionInfoList result = new ChunkServer.MethodCompletionInfoList(this);
        int from_bitField0_ = bitField0_;
        if (methodCompletionInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            methodCompletionInfo_ = java.util.Collections.unmodifiableList(methodCompletionInfo_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.methodCompletionInfo_ = methodCompletionInfo_;
        } else {
          result.methodCompletionInfo_ = methodCompletionInfoBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.MethodCompletionInfoList) {
          return mergeFrom((ChunkServer.MethodCompletionInfoList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.MethodCompletionInfoList other) {
        if (other == ChunkServer.MethodCompletionInfoList.getDefaultInstance()) return this;
        if (methodCompletionInfoBuilder_ == null) {
          if (!other.methodCompletionInfo_.isEmpty()) {
            if (methodCompletionInfo_.isEmpty()) {
              methodCompletionInfo_ = other.methodCompletionInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMethodCompletionInfoIsMutable();
              methodCompletionInfo_.addAll(other.methodCompletionInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.methodCompletionInfo_.isEmpty()) {
            if (methodCompletionInfoBuilder_.isEmpty()) {
              methodCompletionInfoBuilder_.dispose();
              methodCompletionInfoBuilder_ = null;
              methodCompletionInfo_ = other.methodCompletionInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
              methodCompletionInfoBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getMethodCompletionInfoFieldBuilder() : null;
            } else {
              methodCompletionInfoBuilder_.addAllMessages(other.methodCompletionInfo_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getMethodCompletionInfoCount(); i++) {
          if (!getMethodCompletionInfo(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.MethodCompletionInfoList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.MethodCompletionInfoList) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<ChunkServer.MethodCompletionInfo> methodCompletionInfo_ =
        java.util.Collections.emptyList();
      private void ensureMethodCompletionInfoIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          methodCompletionInfo_ = new java.util.ArrayList<ChunkServer.MethodCompletionInfo>(methodCompletionInfo_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.MethodCompletionInfo, ChunkServer.MethodCompletionInfo.Builder, ChunkServer.MethodCompletionInfoOrBuilder> methodCompletionInfoBuilder_;

      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public java.util.List<ChunkServer.MethodCompletionInfo> getMethodCompletionInfoList() {
        if (methodCompletionInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(methodCompletionInfo_);
        } else {
          return methodCompletionInfoBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public int getMethodCompletionInfoCount() {
        if (methodCompletionInfoBuilder_ == null) {
          return methodCompletionInfo_.size();
        } else {
          return methodCompletionInfoBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public ChunkServer.MethodCompletionInfo getMethodCompletionInfo(int index) {
        if (methodCompletionInfoBuilder_ == null) {
          return methodCompletionInfo_.get(index);
        } else {
          return methodCompletionInfoBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public Builder setMethodCompletionInfo(
          int index, ChunkServer.MethodCompletionInfo value) {
        if (methodCompletionInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMethodCompletionInfoIsMutable();
          methodCompletionInfo_.set(index, value);
          onChanged();
        } else {
          methodCompletionInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public Builder setMethodCompletionInfo(
          int index, ChunkServer.MethodCompletionInfo.Builder builderForValue) {
        if (methodCompletionInfoBuilder_ == null) {
          ensureMethodCompletionInfoIsMutable();
          methodCompletionInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          methodCompletionInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public Builder addMethodCompletionInfo(ChunkServer.MethodCompletionInfo value) {
        if (methodCompletionInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMethodCompletionInfoIsMutable();
          methodCompletionInfo_.add(value);
          onChanged();
        } else {
          methodCompletionInfoBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public Builder addMethodCompletionInfo(
          int index, ChunkServer.MethodCompletionInfo value) {
        if (methodCompletionInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMethodCompletionInfoIsMutable();
          methodCompletionInfo_.add(index, value);
          onChanged();
        } else {
          methodCompletionInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public Builder addMethodCompletionInfo(
          ChunkServer.MethodCompletionInfo.Builder builderForValue) {
        if (methodCompletionInfoBuilder_ == null) {
          ensureMethodCompletionInfoIsMutable();
          methodCompletionInfo_.add(builderForValue.build());
          onChanged();
        } else {
          methodCompletionInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public Builder addMethodCompletionInfo(
          int index, ChunkServer.MethodCompletionInfo.Builder builderForValue) {
        if (methodCompletionInfoBuilder_ == null) {
          ensureMethodCompletionInfoIsMutable();
          methodCompletionInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          methodCompletionInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public Builder addAllMethodCompletionInfo(
          java.lang.Iterable<? extends ChunkServer.MethodCompletionInfo> values) {
        if (methodCompletionInfoBuilder_ == null) {
          ensureMethodCompletionInfoIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, methodCompletionInfo_);
          onChanged();
        } else {
          methodCompletionInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public Builder clearMethodCompletionInfo() {
        if (methodCompletionInfoBuilder_ == null) {
          methodCompletionInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          methodCompletionInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public Builder removeMethodCompletionInfo(int index) {
        if (methodCompletionInfoBuilder_ == null) {
          ensureMethodCompletionInfoIsMutable();
          methodCompletionInfo_.remove(index);
          onChanged();
        } else {
          methodCompletionInfoBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public ChunkServer.MethodCompletionInfo.Builder getMethodCompletionInfoBuilder(
          int index) {
        return getMethodCompletionInfoFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public ChunkServer.MethodCompletionInfoOrBuilder getMethodCompletionInfoOrBuilder(
          int index) {
        if (methodCompletionInfoBuilder_ == null) {
          return methodCompletionInfo_.get(index);  } else {
          return methodCompletionInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public java.util.List<? extends ChunkServer.MethodCompletionInfoOrBuilder> 
           getMethodCompletionInfoOrBuilderList() {
        if (methodCompletionInfoBuilder_ != null) {
          return methodCompletionInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(methodCompletionInfo_);
        }
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public ChunkServer.MethodCompletionInfo.Builder addMethodCompletionInfoBuilder() {
        return getMethodCompletionInfoFieldBuilder().addBuilder(ChunkServer.MethodCompletionInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public ChunkServer.MethodCompletionInfo.Builder addMethodCompletionInfoBuilder(
          int index) {
        return getMethodCompletionInfoFieldBuilder().addBuilder(index, ChunkServer.MethodCompletionInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.MethodCompletionInfo method_completion_info = 1;</code>
       */
      public java.util.List<ChunkServer.MethodCompletionInfo.Builder> 
           getMethodCompletionInfoBuilderList() {
        return getMethodCompletionInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.MethodCompletionInfo, ChunkServer.MethodCompletionInfo.Builder, ChunkServer.MethodCompletionInfoOrBuilder> 
          getMethodCompletionInfoFieldBuilder() {
        if (methodCompletionInfoBuilder_ == null) {
          methodCompletionInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.MethodCompletionInfo, ChunkServer.MethodCompletionInfo.Builder, ChunkServer.MethodCompletionInfoOrBuilder>(
                  methodCompletionInfo_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          methodCompletionInfo_ = null;
        }
        return methodCompletionInfoBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.MethodCompletionInfoList)
    }

    static {
      defaultInstance = new MethodCompletionInfoList(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.MethodCompletionInfoList)
  }

  public interface FileChunkListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.FileChunkList)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    boolean hasFileChecksum();
    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    com.google.protobuf.ByteString getFileChecksum();

    /**
     * <code>required string authorization = 2;</code>
     */
    boolean hasAuthorization();
    /**
     * <code>required string authorization = 2;</code>
     */
    java.lang.String getAuthorization();
    /**
     * <code>required string authorization = 2;</code>
     */
    com.google.protobuf.ByteString
        getAuthorizationBytes();

    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
     */
    java.util.List<ChunkServer.ChunkInfo> 
        getChunkInfoList();
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
     */
    ChunkServer.ChunkInfo getChunkInfo(int index);
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
     */
    int getChunkInfoCount();
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
     */
    java.util.List<? extends ChunkServer.ChunkInfoOrBuilder> 
        getChunkInfoOrBuilderList();
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
     */
    ChunkServer.ChunkInfoOrBuilder getChunkInfoOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code chunkserver.FileChunkList}
   */
  public static final class FileChunkList extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.FileChunkList)
      FileChunkListOrBuilder {
    // Use FileChunkList.newBuilder() to construct.
    private FileChunkList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private FileChunkList(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final FileChunkList defaultInstance;
    public static FileChunkList getDefaultInstance() {
      return defaultInstance;
    }

    public FileChunkList getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private FileChunkList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              fileChecksum_ = input.readBytes();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              authorization_ = bs;
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                chunkInfo_ = new java.util.ArrayList<ChunkServer.ChunkInfo>();
                mutable_bitField0_ |= 0x00000004;
              }
              chunkInfo_.add(input.readMessage(ChunkServer.ChunkInfo.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          chunkInfo_ = java.util.Collections.unmodifiableList(chunkInfo_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_FileChunkList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_FileChunkList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.FileChunkList.class, ChunkServer.FileChunkList.Builder.class);
    }

    public static com.google.protobuf.Parser<FileChunkList> PARSER =
        new com.google.protobuf.AbstractParser<FileChunkList>() {
      public FileChunkList parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileChunkList(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<FileChunkList> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FILE_CHECKSUM_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString fileChecksum_;
    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    public boolean hasFileChecksum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    public com.google.protobuf.ByteString getFileChecksum() {
      return fileChecksum_;
    }

    public static final int AUTHORIZATION_FIELD_NUMBER = 2;
    private java.lang.Object authorization_;
    /**
     * <code>required string authorization = 2;</code>
     */
    public boolean hasAuthorization() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string authorization = 2;</code>
     */
    public java.lang.String getAuthorization() {
      java.lang.Object ref = authorization_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          authorization_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string authorization = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAuthorizationBytes() {
      java.lang.Object ref = authorization_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authorization_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CHUNK_INFO_FIELD_NUMBER = 3;
    private java.util.List<ChunkServer.ChunkInfo> chunkInfo_;
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
     */
    public java.util.List<ChunkServer.ChunkInfo> getChunkInfoList() {
      return chunkInfo_;
    }
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
     */
    public java.util.List<? extends ChunkServer.ChunkInfoOrBuilder> 
        getChunkInfoOrBuilderList() {
      return chunkInfo_;
    }
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
     */
    public int getChunkInfoCount() {
      return chunkInfo_.size();
    }
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
     */
    public ChunkServer.ChunkInfo getChunkInfo(int index) {
      return chunkInfo_.get(index);
    }
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
     */
    public ChunkServer.ChunkInfoOrBuilder getChunkInfoOrBuilder(
        int index) {
      return chunkInfo_.get(index);
    }

    private void initFields() {
      fileChecksum_ = com.google.protobuf.ByteString.EMPTY;
      authorization_ = "";
      chunkInfo_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasFileChecksum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAuthorization()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getChunkInfoCount(); i++) {
        if (!getChunkInfo(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, fileChecksum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getAuthorizationBytes());
      }
      for (int i = 0; i < chunkInfo_.size(); i++) {
        output.writeMessage(3, chunkInfo_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, fileChecksum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getAuthorizationBytes());
      }
      for (int i = 0; i < chunkInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, chunkInfo_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.FileChunkList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileChunkList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileChunkList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileChunkList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileChunkList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileChunkList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileChunkList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.FileChunkList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileChunkList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileChunkList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.FileChunkList prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.FileChunkList}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.FileChunkList)
        ChunkServer.FileChunkListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_FileChunkList_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_FileChunkList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.FileChunkList.class, ChunkServer.FileChunkList.Builder.class);
      }

      // Construct using Chunkserver.FileChunkList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getChunkInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        fileChecksum_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        authorization_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (chunkInfoBuilder_ == null) {
          chunkInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          chunkInfoBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_FileChunkList_descriptor;
      }

      public ChunkServer.FileChunkList getDefaultInstanceForType() {
        return ChunkServer.FileChunkList.getDefaultInstance();
      }

      public ChunkServer.FileChunkList build() {
        ChunkServer.FileChunkList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.FileChunkList buildPartial() {
        ChunkServer.FileChunkList result = new ChunkServer.FileChunkList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.fileChecksum_ = fileChecksum_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.authorization_ = authorization_;
        if (chunkInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            chunkInfo_ = java.util.Collections.unmodifiableList(chunkInfo_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.chunkInfo_ = chunkInfo_;
        } else {
          result.chunkInfo_ = chunkInfoBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.FileChunkList) {
          return mergeFrom((ChunkServer.FileChunkList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.FileChunkList other) {
        if (other == ChunkServer.FileChunkList.getDefaultInstance()) return this;
        if (other.hasFileChecksum()) {
          setFileChecksum(other.getFileChecksum());
        }
        if (other.hasAuthorization()) {
          bitField0_ |= 0x00000002;
          authorization_ = other.authorization_;
          onChanged();
        }
        if (chunkInfoBuilder_ == null) {
          if (!other.chunkInfo_.isEmpty()) {
            if (chunkInfo_.isEmpty()) {
              chunkInfo_ = other.chunkInfo_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureChunkInfoIsMutable();
              chunkInfo_.addAll(other.chunkInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.chunkInfo_.isEmpty()) {
            if (chunkInfoBuilder_.isEmpty()) {
              chunkInfoBuilder_.dispose();
              chunkInfoBuilder_ = null;
              chunkInfo_ = other.chunkInfo_;
              bitField0_ = (bitField0_ & ~0x00000004);
              chunkInfoBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getChunkInfoFieldBuilder() : null;
            } else {
              chunkInfoBuilder_.addAllMessages(other.chunkInfo_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasFileChecksum()) {
          
          return false;
        }
        if (!hasAuthorization()) {
          
          return false;
        }
        for (int i = 0; i < getChunkInfoCount(); i++) {
          if (!getChunkInfo(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.FileChunkList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.FileChunkList) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString fileChecksum_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public boolean hasFileChecksum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public com.google.protobuf.ByteString getFileChecksum() {
        return fileChecksum_;
      }
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public Builder setFileChecksum(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        fileChecksum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public Builder clearFileChecksum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fileChecksum_ = getDefaultInstance().getFileChecksum();
        onChanged();
        return this;
      }

      private java.lang.Object authorization_ = "";
      /**
       * <code>required string authorization = 2;</code>
       */
      public boolean hasAuthorization() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string authorization = 2;</code>
       */
      public java.lang.String getAuthorization() {
        java.lang.Object ref = authorization_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            authorization_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string authorization = 2;</code>
       */
      public com.google.protobuf.ByteString
          getAuthorizationBytes() {
        java.lang.Object ref = authorization_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          authorization_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string authorization = 2;</code>
       */
      public Builder setAuthorization(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        authorization_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string authorization = 2;</code>
       */
      public Builder clearAuthorization() {
        bitField0_ = (bitField0_ & ~0x00000002);
        authorization_ = getDefaultInstance().getAuthorization();
        onChanged();
        return this;
      }
      /**
       * <code>required string authorization = 2;</code>
       */
      public Builder setAuthorizationBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        authorization_ = value;
        onChanged();
        return this;
      }

      private java.util.List<ChunkServer.ChunkInfo> chunkInfo_ =
        java.util.Collections.emptyList();
      private void ensureChunkInfoIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          chunkInfo_ = new java.util.ArrayList<ChunkServer.ChunkInfo>(chunkInfo_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.ChunkInfo, ChunkServer.ChunkInfo.Builder, ChunkServer.ChunkInfoOrBuilder> chunkInfoBuilder_;

      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public java.util.List<ChunkServer.ChunkInfo> getChunkInfoList() {
        if (chunkInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(chunkInfo_);
        } else {
          return chunkInfoBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public int getChunkInfoCount() {
        if (chunkInfoBuilder_ == null) {
          return chunkInfo_.size();
        } else {
          return chunkInfoBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public ChunkServer.ChunkInfo getChunkInfo(int index) {
        if (chunkInfoBuilder_ == null) {
          return chunkInfo_.get(index);
        } else {
          return chunkInfoBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public Builder setChunkInfo(
          int index, ChunkServer.ChunkInfo value) {
        if (chunkInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunkInfoIsMutable();
          chunkInfo_.set(index, value);
          onChanged();
        } else {
          chunkInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public Builder setChunkInfo(
          int index, ChunkServer.ChunkInfo.Builder builderForValue) {
        if (chunkInfoBuilder_ == null) {
          ensureChunkInfoIsMutable();
          chunkInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          chunkInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public Builder addChunkInfo(ChunkServer.ChunkInfo value) {
        if (chunkInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunkInfoIsMutable();
          chunkInfo_.add(value);
          onChanged();
        } else {
          chunkInfoBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public Builder addChunkInfo(
          int index, ChunkServer.ChunkInfo value) {
        if (chunkInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunkInfoIsMutable();
          chunkInfo_.add(index, value);
          onChanged();
        } else {
          chunkInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public Builder addChunkInfo(
          ChunkServer.ChunkInfo.Builder builderForValue) {
        if (chunkInfoBuilder_ == null) {
          ensureChunkInfoIsMutable();
          chunkInfo_.add(builderForValue.build());
          onChanged();
        } else {
          chunkInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public Builder addChunkInfo(
          int index, ChunkServer.ChunkInfo.Builder builderForValue) {
        if (chunkInfoBuilder_ == null) {
          ensureChunkInfoIsMutable();
          chunkInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          chunkInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public Builder addAllChunkInfo(
          java.lang.Iterable<? extends ChunkServer.ChunkInfo> values) {
        if (chunkInfoBuilder_ == null) {
          ensureChunkInfoIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, chunkInfo_);
          onChanged();
        } else {
          chunkInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public Builder clearChunkInfo() {
        if (chunkInfoBuilder_ == null) {
          chunkInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          chunkInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public Builder removeChunkInfo(int index) {
        if (chunkInfoBuilder_ == null) {
          ensureChunkInfoIsMutable();
          chunkInfo_.remove(index);
          onChanged();
        } else {
          chunkInfoBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public ChunkServer.ChunkInfo.Builder getChunkInfoBuilder(
          int index) {
        return getChunkInfoFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public ChunkServer.ChunkInfoOrBuilder getChunkInfoOrBuilder(
          int index) {
        if (chunkInfoBuilder_ == null) {
          return chunkInfo_.get(index);  } else {
          return chunkInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public java.util.List<? extends ChunkServer.ChunkInfoOrBuilder> 
           getChunkInfoOrBuilderList() {
        if (chunkInfoBuilder_ != null) {
          return chunkInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(chunkInfo_);
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public ChunkServer.ChunkInfo.Builder addChunkInfoBuilder() {
        return getChunkInfoFieldBuilder().addBuilder(ChunkServer.ChunkInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public ChunkServer.ChunkInfo.Builder addChunkInfoBuilder(
          int index) {
        return getChunkInfoFieldBuilder().addBuilder(index, ChunkServer.ChunkInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 3;</code>
       */
      public java.util.List<ChunkServer.ChunkInfo.Builder> 
           getChunkInfoBuilderList() {
        return getChunkInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.ChunkInfo, ChunkServer.ChunkInfo.Builder, ChunkServer.ChunkInfoOrBuilder> 
          getChunkInfoFieldBuilder() {
        if (chunkInfoBuilder_ == null) {
          chunkInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.ChunkInfo, ChunkServer.ChunkInfo.Builder, ChunkServer.ChunkInfoOrBuilder>(
                  chunkInfo_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          chunkInfo_ = null;
        }
        return chunkInfoBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.FileChunkList)
    }

    static {
      defaultInstance = new FileChunkList(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.FileChunkList)
  }

  public interface FileChunkListsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.FileChunkLists)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
     */
    java.util.List<ChunkServer.FileChunkList> 
        getFileChunkListList();
    /**
     * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
     */
    ChunkServer.FileChunkList getFileChunkList(int index);
    /**
     * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
     */
    int getFileChunkListCount();
    /**
     * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
     */
    java.util.List<? extends ChunkServer.FileChunkListOrBuilder> 
        getFileChunkListOrBuilderList();
    /**
     * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
     */
    ChunkServer.FileChunkListOrBuilder getFileChunkListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code chunkserver.FileChunkLists}
   */
  public static final class FileChunkLists extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.FileChunkLists)
      FileChunkListsOrBuilder {
    // Use FileChunkLists.newBuilder() to construct.
    private FileChunkLists(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private FileChunkLists(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final FileChunkLists defaultInstance;
    public static FileChunkLists getDefaultInstance() {
      return defaultInstance;
    }

    public FileChunkLists getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private FileChunkLists(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                fileChunkList_ = new java.util.ArrayList<ChunkServer.FileChunkList>();
                mutable_bitField0_ |= 0x00000001;
              }
              fileChunkList_.add(input.readMessage(ChunkServer.FileChunkList.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          fileChunkList_ = java.util.Collections.unmodifiableList(fileChunkList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_FileChunkLists_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_FileChunkLists_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.FileChunkLists.class, ChunkServer.FileChunkLists.Builder.class);
    }

    public static com.google.protobuf.Parser<FileChunkLists> PARSER =
        new com.google.protobuf.AbstractParser<FileChunkLists>() {
      public FileChunkLists parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileChunkLists(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<FileChunkLists> getParserForType() {
      return PARSER;
    }

    public static final int FILE_CHUNK_LIST_FIELD_NUMBER = 1;
    private java.util.List<ChunkServer.FileChunkList> fileChunkList_;
    /**
     * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
     */
    public java.util.List<ChunkServer.FileChunkList> getFileChunkListList() {
      return fileChunkList_;
    }
    /**
     * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
     */
    public java.util.List<? extends ChunkServer.FileChunkListOrBuilder> 
        getFileChunkListOrBuilderList() {
      return fileChunkList_;
    }
    /**
     * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
     */
    public int getFileChunkListCount() {
      return fileChunkList_.size();
    }
    /**
     * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
     */
    public ChunkServer.FileChunkList getFileChunkList(int index) {
      return fileChunkList_.get(index);
    }
    /**
     * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
     */
    public ChunkServer.FileChunkListOrBuilder getFileChunkListOrBuilder(
        int index) {
      return fileChunkList_.get(index);
    }

    private void initFields() {
      fileChunkList_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getFileChunkListCount(); i++) {
        if (!getFileChunkList(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < fileChunkList_.size(); i++) {
        output.writeMessage(1, fileChunkList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < fileChunkList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, fileChunkList_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.FileChunkLists parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileChunkLists parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileChunkLists parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileChunkLists parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileChunkLists parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileChunkLists parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileChunkLists parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.FileChunkLists parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileChunkLists parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileChunkLists parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.FileChunkLists prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.FileChunkLists}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.FileChunkLists)
        ChunkServer.FileChunkListsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_FileChunkLists_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_FileChunkLists_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.FileChunkLists.class, ChunkServer.FileChunkLists.Builder.class);
      }

      // Construct using Chunkserver.FileChunkLists.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getFileChunkListFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (fileChunkListBuilder_ == null) {
          fileChunkList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          fileChunkListBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_FileChunkLists_descriptor;
      }

      public ChunkServer.FileChunkLists getDefaultInstanceForType() {
        return ChunkServer.FileChunkLists.getDefaultInstance();
      }

      public ChunkServer.FileChunkLists build() {
        ChunkServer.FileChunkLists result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.FileChunkLists buildPartial() {
        ChunkServer.FileChunkLists result = new ChunkServer.FileChunkLists(this);
        int from_bitField0_ = bitField0_;
        if (fileChunkListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            fileChunkList_ = java.util.Collections.unmodifiableList(fileChunkList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.fileChunkList_ = fileChunkList_;
        } else {
          result.fileChunkList_ = fileChunkListBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.FileChunkLists) {
          return mergeFrom((ChunkServer.FileChunkLists)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.FileChunkLists other) {
        if (other == ChunkServer.FileChunkLists.getDefaultInstance()) return this;
        if (fileChunkListBuilder_ == null) {
          if (!other.fileChunkList_.isEmpty()) {
            if (fileChunkList_.isEmpty()) {
              fileChunkList_ = other.fileChunkList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureFileChunkListIsMutable();
              fileChunkList_.addAll(other.fileChunkList_);
            }
            onChanged();
          }
        } else {
          if (!other.fileChunkList_.isEmpty()) {
            if (fileChunkListBuilder_.isEmpty()) {
              fileChunkListBuilder_.dispose();
              fileChunkListBuilder_ = null;
              fileChunkList_ = other.fileChunkList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              fileChunkListBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getFileChunkListFieldBuilder() : null;
            } else {
              fileChunkListBuilder_.addAllMessages(other.fileChunkList_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getFileChunkListCount(); i++) {
          if (!getFileChunkList(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.FileChunkLists parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.FileChunkLists) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<ChunkServer.FileChunkList> fileChunkList_ =
        java.util.Collections.emptyList();
      private void ensureFileChunkListIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          fileChunkList_ = new java.util.ArrayList<ChunkServer.FileChunkList>(fileChunkList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.FileChunkList, ChunkServer.FileChunkList.Builder, ChunkServer.FileChunkListOrBuilder> fileChunkListBuilder_;

      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public java.util.List<ChunkServer.FileChunkList> getFileChunkListList() {
        if (fileChunkListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(fileChunkList_);
        } else {
          return fileChunkListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public int getFileChunkListCount() {
        if (fileChunkListBuilder_ == null) {
          return fileChunkList_.size();
        } else {
          return fileChunkListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public ChunkServer.FileChunkList getFileChunkList(int index) {
        if (fileChunkListBuilder_ == null) {
          return fileChunkList_.get(index);
        } else {
          return fileChunkListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public Builder setFileChunkList(
          int index, ChunkServer.FileChunkList value) {
        if (fileChunkListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileChunkListIsMutable();
          fileChunkList_.set(index, value);
          onChanged();
        } else {
          fileChunkListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public Builder setFileChunkList(
          int index, ChunkServer.FileChunkList.Builder builderForValue) {
        if (fileChunkListBuilder_ == null) {
          ensureFileChunkListIsMutable();
          fileChunkList_.set(index, builderForValue.build());
          onChanged();
        } else {
          fileChunkListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public Builder addFileChunkList(ChunkServer.FileChunkList value) {
        if (fileChunkListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileChunkListIsMutable();
          fileChunkList_.add(value);
          onChanged();
        } else {
          fileChunkListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public Builder addFileChunkList(
          int index, ChunkServer.FileChunkList value) {
        if (fileChunkListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileChunkListIsMutable();
          fileChunkList_.add(index, value);
          onChanged();
        } else {
          fileChunkListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public Builder addFileChunkList(
          ChunkServer.FileChunkList.Builder builderForValue) {
        if (fileChunkListBuilder_ == null) {
          ensureFileChunkListIsMutable();
          fileChunkList_.add(builderForValue.build());
          onChanged();
        } else {
          fileChunkListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public Builder addFileChunkList(
          int index, ChunkServer.FileChunkList.Builder builderForValue) {
        if (fileChunkListBuilder_ == null) {
          ensureFileChunkListIsMutable();
          fileChunkList_.add(index, builderForValue.build());
          onChanged();
        } else {
          fileChunkListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public Builder addAllFileChunkList(
          java.lang.Iterable<? extends ChunkServer.FileChunkList> values) {
        if (fileChunkListBuilder_ == null) {
          ensureFileChunkListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, fileChunkList_);
          onChanged();
        } else {
          fileChunkListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public Builder clearFileChunkList() {
        if (fileChunkListBuilder_ == null) {
          fileChunkList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          fileChunkListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public Builder removeFileChunkList(int index) {
        if (fileChunkListBuilder_ == null) {
          ensureFileChunkListIsMutable();
          fileChunkList_.remove(index);
          onChanged();
        } else {
          fileChunkListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public ChunkServer.FileChunkList.Builder getFileChunkListBuilder(
          int index) {
        return getFileChunkListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public ChunkServer.FileChunkListOrBuilder getFileChunkListOrBuilder(
          int index) {
        if (fileChunkListBuilder_ == null) {
          return fileChunkList_.get(index);  } else {
          return fileChunkListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public java.util.List<? extends ChunkServer.FileChunkListOrBuilder> 
           getFileChunkListOrBuilderList() {
        if (fileChunkListBuilder_ != null) {
          return fileChunkListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(fileChunkList_);
        }
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public ChunkServer.FileChunkList.Builder addFileChunkListBuilder() {
        return getFileChunkListFieldBuilder().addBuilder(ChunkServer.FileChunkList.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public ChunkServer.FileChunkList.Builder addFileChunkListBuilder(
          int index) {
        return getFileChunkListFieldBuilder().addBuilder(index, ChunkServer.FileChunkList.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.FileChunkList file_chunk_list = 1;</code>
       */
      public java.util.List<ChunkServer.FileChunkList.Builder> 
           getFileChunkListBuilderList() {
        return getFileChunkListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.FileChunkList, ChunkServer.FileChunkList.Builder, ChunkServer.FileChunkListOrBuilder> 
          getFileChunkListFieldBuilder() {
        if (fileChunkListBuilder_ == null) {
          fileChunkListBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.FileChunkList, ChunkServer.FileChunkList.Builder, ChunkServer.FileChunkListOrBuilder>(
                  fileChunkList_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          fileChunkList_ = null;
        }
        return fileChunkListBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.FileChunkLists)
    }

    static {
      defaultInstance = new FileChunkLists(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.FileChunkLists)
  }

  public interface StorageContainerChunkListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.StorageContainerChunkList)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bytes storage_container_key = 1;</code>
     */
    boolean hasStorageContainerKey();
    /**
     * <code>required bytes storage_container_key = 1;</code>
     */
    com.google.protobuf.ByteString getStorageContainerKey();

    /**
     * <code>required .chunkserver.HostInfo host_info = 2;</code>
     */
    boolean hasHostInfo();
    /**
     * <code>required .chunkserver.HostInfo host_info = 2;</code>
     */
    ChunkServer.HostInfo getHostInfo();
    /**
     * <code>required .chunkserver.HostInfo host_info = 2;</code>
     */
    ChunkServer.HostInfoOrBuilder getHostInfoOrBuilder();

    /**
     * <code>repeated bytes chunk_checksum = 3;</code>
     */
    java.util.List<com.google.protobuf.ByteString> getChunkChecksumList();
    /**
     * <code>repeated bytes chunk_checksum = 3;</code>
     */
    int getChunkChecksumCount();
    /**
     * <code>repeated bytes chunk_checksum = 3;</code>
     */
    com.google.protobuf.ByteString getChunkChecksum(int index);

    /**
     * <code>required string storage_container_authorization_token = 4;</code>
     */
    boolean hasStorageContainerAuthorizationToken();
    /**
     * <code>required string storage_container_authorization_token = 4;</code>
     */
    java.lang.String getStorageContainerAuthorizationToken();
    /**
     * <code>required string storage_container_authorization_token = 4;</code>
     */
    com.google.protobuf.ByteString
        getStorageContainerAuthorizationTokenBytes();
  }
  /**
   * Protobuf type {@code chunkserver.StorageContainerChunkList}
   */
  public static final class StorageContainerChunkList extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.StorageContainerChunkList)
      StorageContainerChunkListOrBuilder {
    // Use StorageContainerChunkList.newBuilder() to construct.
    private StorageContainerChunkList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StorageContainerChunkList(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StorageContainerChunkList defaultInstance;
    public static StorageContainerChunkList getDefaultInstance() {
      return defaultInstance;
    }

    public StorageContainerChunkList getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StorageContainerChunkList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              storageContainerKey_ = input.readBytes();
              break;
            }
            case 18: {
              ChunkServer.HostInfo.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = hostInfo_.toBuilder();
              }
              hostInfo_ = input.readMessage(ChunkServer.HostInfo.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(hostInfo_);
                hostInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                chunkChecksum_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
                mutable_bitField0_ |= 0x00000004;
              }
              chunkChecksum_.add(input.readBytes());
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              storageContainerAuthorizationToken_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          chunkChecksum_ = java.util.Collections.unmodifiableList(chunkChecksum_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_StorageContainerChunkList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_StorageContainerChunkList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.StorageContainerChunkList.class, ChunkServer.StorageContainerChunkList.Builder.class);
    }

    public static com.google.protobuf.Parser<StorageContainerChunkList> PARSER =
        new com.google.protobuf.AbstractParser<StorageContainerChunkList>() {
      public StorageContainerChunkList parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StorageContainerChunkList(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StorageContainerChunkList> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int STORAGE_CONTAINER_KEY_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString storageContainerKey_;
    /**
     * <code>required bytes storage_container_key = 1;</code>
     */
    public boolean hasStorageContainerKey() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bytes storage_container_key = 1;</code>
     */
    public com.google.protobuf.ByteString getStorageContainerKey() {
      return storageContainerKey_;
    }

    public static final int HOST_INFO_FIELD_NUMBER = 2;
    private ChunkServer.HostInfo hostInfo_;
    /**
     * <code>required .chunkserver.HostInfo host_info = 2;</code>
     */
    public boolean hasHostInfo() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .chunkserver.HostInfo host_info = 2;</code>
     */
    public ChunkServer.HostInfo getHostInfo() {
      return hostInfo_;
    }
    /**
     * <code>required .chunkserver.HostInfo host_info = 2;</code>
     */
    public ChunkServer.HostInfoOrBuilder getHostInfoOrBuilder() {
      return hostInfo_;
    }

    public static final int CHUNK_CHECKSUM_FIELD_NUMBER = 3;
    private java.util.List<com.google.protobuf.ByteString> chunkChecksum_;
    /**
     * <code>repeated bytes chunk_checksum = 3;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getChunkChecksumList() {
      return chunkChecksum_;
    }
    /**
     * <code>repeated bytes chunk_checksum = 3;</code>
     */
    public int getChunkChecksumCount() {
      return chunkChecksum_.size();
    }
    /**
     * <code>repeated bytes chunk_checksum = 3;</code>
     */
    public com.google.protobuf.ByteString getChunkChecksum(int index) {
      return chunkChecksum_.get(index);
    }

    public static final int STORAGE_CONTAINER_AUTHORIZATION_TOKEN_FIELD_NUMBER = 4;
    private java.lang.Object storageContainerAuthorizationToken_;
    /**
     * <code>required string storage_container_authorization_token = 4;</code>
     */
    public boolean hasStorageContainerAuthorizationToken() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string storage_container_authorization_token = 4;</code>
     */
    public java.lang.String getStorageContainerAuthorizationToken() {
      java.lang.Object ref = storageContainerAuthorizationToken_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          storageContainerAuthorizationToken_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string storage_container_authorization_token = 4;</code>
     */
    public com.google.protobuf.ByteString
        getStorageContainerAuthorizationTokenBytes() {
      java.lang.Object ref = storageContainerAuthorizationToken_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storageContainerAuthorizationToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      storageContainerKey_ = com.google.protobuf.ByteString.EMPTY;
      hostInfo_ = ChunkServer.HostInfo.getDefaultInstance();
      chunkChecksum_ = java.util.Collections.emptyList();
      storageContainerAuthorizationToken_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasStorageContainerKey()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasHostInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStorageContainerAuthorizationToken()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getHostInfo().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, storageContainerKey_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, hostInfo_);
      }
      for (int i = 0; i < chunkChecksum_.size(); i++) {
        output.writeBytes(3, chunkChecksum_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(4, getStorageContainerAuthorizationTokenBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, storageContainerKey_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, hostInfo_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < chunkChecksum_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(chunkChecksum_.get(i));
        }
        size += dataSize;
        size += 1 * getChunkChecksumList().size();
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getStorageContainerAuthorizationTokenBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.StorageContainerChunkList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.StorageContainerChunkList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.StorageContainerChunkList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.StorageContainerChunkList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.StorageContainerChunkList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.StorageContainerChunkList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.StorageContainerChunkList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.StorageContainerChunkList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.StorageContainerChunkList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.StorageContainerChunkList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.StorageContainerChunkList prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.StorageContainerChunkList}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.StorageContainerChunkList)
        ChunkServer.StorageContainerChunkListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_StorageContainerChunkList_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_StorageContainerChunkList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.StorageContainerChunkList.class, ChunkServer.StorageContainerChunkList.Builder.class);
      }

      // Construct using Chunkserver.StorageContainerChunkList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getHostInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        storageContainerKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (hostInfoBuilder_ == null) {
          hostInfo_ = ChunkServer.HostInfo.getDefaultInstance();
        } else {
          hostInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        chunkChecksum_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        storageContainerAuthorizationToken_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_StorageContainerChunkList_descriptor;
      }

      public ChunkServer.StorageContainerChunkList getDefaultInstanceForType() {
        return ChunkServer.StorageContainerChunkList.getDefaultInstance();
      }

      public ChunkServer.StorageContainerChunkList build() {
        ChunkServer.StorageContainerChunkList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.StorageContainerChunkList buildPartial() {
        ChunkServer.StorageContainerChunkList result = new ChunkServer.StorageContainerChunkList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.storageContainerKey_ = storageContainerKey_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (hostInfoBuilder_ == null) {
          result.hostInfo_ = hostInfo_;
        } else {
          result.hostInfo_ = hostInfoBuilder_.build();
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          chunkChecksum_ = java.util.Collections.unmodifiableList(chunkChecksum_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.chunkChecksum_ = chunkChecksum_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.storageContainerAuthorizationToken_ = storageContainerAuthorizationToken_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.StorageContainerChunkList) {
          return mergeFrom((ChunkServer.StorageContainerChunkList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.StorageContainerChunkList other) {
        if (other == ChunkServer.StorageContainerChunkList.getDefaultInstance()) return this;
        if (other.hasStorageContainerKey()) {
          setStorageContainerKey(other.getStorageContainerKey());
        }
        if (other.hasHostInfo()) {
          mergeHostInfo(other.getHostInfo());
        }
        if (!other.chunkChecksum_.isEmpty()) {
          if (chunkChecksum_.isEmpty()) {
            chunkChecksum_ = other.chunkChecksum_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureChunkChecksumIsMutable();
            chunkChecksum_.addAll(other.chunkChecksum_);
          }
          onChanged();
        }
        if (other.hasStorageContainerAuthorizationToken()) {
          bitField0_ |= 0x00000008;
          storageContainerAuthorizationToken_ = other.storageContainerAuthorizationToken_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasStorageContainerKey()) {
          
          return false;
        }
        if (!hasHostInfo()) {
          
          return false;
        }
        if (!hasStorageContainerAuthorizationToken()) {
          
          return false;
        }
        if (!getHostInfo().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.StorageContainerChunkList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.StorageContainerChunkList) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString storageContainerKey_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes storage_container_key = 1;</code>
       */
      public boolean hasStorageContainerKey() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bytes storage_container_key = 1;</code>
       */
      public com.google.protobuf.ByteString getStorageContainerKey() {
        return storageContainerKey_;
      }
      /**
       * <code>required bytes storage_container_key = 1;</code>
       */
      public Builder setStorageContainerKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        storageContainerKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes storage_container_key = 1;</code>
       */
      public Builder clearStorageContainerKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        storageContainerKey_ = getDefaultInstance().getStorageContainerKey();
        onChanged();
        return this;
      }

      private ChunkServer.HostInfo hostInfo_ = ChunkServer.HostInfo.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          ChunkServer.HostInfo, ChunkServer.HostInfo.Builder, ChunkServer.HostInfoOrBuilder> hostInfoBuilder_;
      /**
       * <code>required .chunkserver.HostInfo host_info = 2;</code>
       */
      public boolean hasHostInfo() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .chunkserver.HostInfo host_info = 2;</code>
       */
      public ChunkServer.HostInfo getHostInfo() {
        if (hostInfoBuilder_ == null) {
          return hostInfo_;
        } else {
          return hostInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>required .chunkserver.HostInfo host_info = 2;</code>
       */
      public Builder setHostInfo(ChunkServer.HostInfo value) {
        if (hostInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hostInfo_ = value;
          onChanged();
        } else {
          hostInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .chunkserver.HostInfo host_info = 2;</code>
       */
      public Builder setHostInfo(
          ChunkServer.HostInfo.Builder builderForValue) {
        if (hostInfoBuilder_ == null) {
          hostInfo_ = builderForValue.build();
          onChanged();
        } else {
          hostInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .chunkserver.HostInfo host_info = 2;</code>
       */
      public Builder mergeHostInfo(ChunkServer.HostInfo value) {
        if (hostInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              hostInfo_ != ChunkServer.HostInfo.getDefaultInstance()) {
            hostInfo_ =
              ChunkServer.HostInfo.newBuilder(hostInfo_).mergeFrom(value).buildPartial();
          } else {
            hostInfo_ = value;
          }
          onChanged();
        } else {
          hostInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .chunkserver.HostInfo host_info = 2;</code>
       */
      public Builder clearHostInfo() {
        if (hostInfoBuilder_ == null) {
          hostInfo_ = ChunkServer.HostInfo.getDefaultInstance();
          onChanged();
        } else {
          hostInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .chunkserver.HostInfo host_info = 2;</code>
       */
      public ChunkServer.HostInfo.Builder getHostInfoBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getHostInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>required .chunkserver.HostInfo host_info = 2;</code>
       */
      public ChunkServer.HostInfoOrBuilder getHostInfoOrBuilder() {
        if (hostInfoBuilder_ != null) {
          return hostInfoBuilder_.getMessageOrBuilder();
        } else {
          return hostInfo_;
        }
      }
      /**
       * <code>required .chunkserver.HostInfo host_info = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          ChunkServer.HostInfo, ChunkServer.HostInfo.Builder, ChunkServer.HostInfoOrBuilder> 
          getHostInfoFieldBuilder() {
        if (hostInfoBuilder_ == null) {
          hostInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              ChunkServer.HostInfo, ChunkServer.HostInfo.Builder, ChunkServer.HostInfoOrBuilder>(
                  getHostInfo(),
                  getParentForChildren(),
                  isClean());
          hostInfo_ = null;
        }
        return hostInfoBuilder_;
      }

      private java.util.List<com.google.protobuf.ByteString> chunkChecksum_ = java.util.Collections.emptyList();
      private void ensureChunkChecksumIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          chunkChecksum_ = new java.util.ArrayList<com.google.protobuf.ByteString>(chunkChecksum_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated bytes chunk_checksum = 3;</code>
       */
      public java.util.List<com.google.protobuf.ByteString>
          getChunkChecksumList() {
        return java.util.Collections.unmodifiableList(chunkChecksum_);
      }
      /**
       * <code>repeated bytes chunk_checksum = 3;</code>
       */
      public int getChunkChecksumCount() {
        return chunkChecksum_.size();
      }
      /**
       * <code>repeated bytes chunk_checksum = 3;</code>
       */
      public com.google.protobuf.ByteString getChunkChecksum(int index) {
        return chunkChecksum_.get(index);
      }
      /**
       * <code>repeated bytes chunk_checksum = 3;</code>
       */
      public Builder setChunkChecksum(
          int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureChunkChecksumIsMutable();
        chunkChecksum_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes chunk_checksum = 3;</code>
       */
      public Builder addChunkChecksum(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureChunkChecksumIsMutable();
        chunkChecksum_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes chunk_checksum = 3;</code>
       */
      public Builder addAllChunkChecksum(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureChunkChecksumIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, chunkChecksum_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes chunk_checksum = 3;</code>
       */
      public Builder clearChunkChecksum() {
        chunkChecksum_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }

      private java.lang.Object storageContainerAuthorizationToken_ = "";
      /**
       * <code>required string storage_container_authorization_token = 4;</code>
       */
      public boolean hasStorageContainerAuthorizationToken() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string storage_container_authorization_token = 4;</code>
       */
      public java.lang.String getStorageContainerAuthorizationToken() {
        java.lang.Object ref = storageContainerAuthorizationToken_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            storageContainerAuthorizationToken_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string storage_container_authorization_token = 4;</code>
       */
      public com.google.protobuf.ByteString
          getStorageContainerAuthorizationTokenBytes() {
        java.lang.Object ref = storageContainerAuthorizationToken_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          storageContainerAuthorizationToken_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string storage_container_authorization_token = 4;</code>
       */
      public Builder setStorageContainerAuthorizationToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        storageContainerAuthorizationToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string storage_container_authorization_token = 4;</code>
       */
      public Builder clearStorageContainerAuthorizationToken() {
        bitField0_ = (bitField0_ & ~0x00000008);
        storageContainerAuthorizationToken_ = getDefaultInstance().getStorageContainerAuthorizationToken();
        onChanged();
        return this;
      }
      /**
       * <code>required string storage_container_authorization_token = 4;</code>
       */
      public Builder setStorageContainerAuthorizationTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        storageContainerAuthorizationToken_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.StorageContainerChunkList)
    }

    static {
      defaultInstance = new StorageContainerChunkList(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.StorageContainerChunkList)
  }

  public interface StorageContainerChunkListsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.StorageContainerChunkLists)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
     */
    java.util.List<ChunkServer.StorageContainerChunkList> 
        getStorageContainerChunkListList();
    /**
     * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
     */
    ChunkServer.StorageContainerChunkList getStorageContainerChunkList(int index);
    /**
     * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
     */
    int getStorageContainerChunkListCount();
    /**
     * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
     */
    java.util.List<? extends ChunkServer.StorageContainerChunkListOrBuilder> 
        getStorageContainerChunkListOrBuilderList();
    /**
     * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
     */
    ChunkServer.StorageContainerChunkListOrBuilder getStorageContainerChunkListOrBuilder(
        int index);

    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    java.util.List<ChunkServer.FileError> 
        getFileErrorList();
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    ChunkServer.FileError getFileError(int index);
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    int getFileErrorCount();
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    java.util.List<? extends ChunkServer.FileErrorOrBuilder> 
        getFileErrorOrBuilderList();
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    ChunkServer.FileErrorOrBuilder getFileErrorOrBuilder(
        int index);

    /**
     * <code>optional uint32 verbosity_level = 3;</code>
     */
    boolean hasVerbosityLevel();
    /**
     * <code>optional uint32 verbosity_level = 3;</code>
     */
    int getVerbosityLevel();
  }
  /**
   * Protobuf type {@code chunkserver.StorageContainerChunkLists}
   */
  public static final class StorageContainerChunkLists extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.StorageContainerChunkLists)
      StorageContainerChunkListsOrBuilder {
    // Use StorageContainerChunkLists.newBuilder() to construct.
    private StorageContainerChunkLists(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StorageContainerChunkLists(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StorageContainerChunkLists defaultInstance;
    public static StorageContainerChunkLists getDefaultInstance() {
      return defaultInstance;
    }

    public StorageContainerChunkLists getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StorageContainerChunkLists(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                storageContainerChunkList_ = new java.util.ArrayList<ChunkServer.StorageContainerChunkList>();
                mutable_bitField0_ |= 0x00000001;
              }
              storageContainerChunkList_.add(input.readMessage(ChunkServer.StorageContainerChunkList.PARSER, extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                fileError_ = new java.util.ArrayList<ChunkServer.FileError>();
                mutable_bitField0_ |= 0x00000002;
              }
              fileError_.add(input.readMessage(ChunkServer.FileError.PARSER, extensionRegistry));
              break;
            }
            case 24: {
              bitField0_ |= 0x00000001;
              verbosityLevel_ = input.readUInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          storageContainerChunkList_ = java.util.Collections.unmodifiableList(storageContainerChunkList_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          fileError_ = java.util.Collections.unmodifiableList(fileError_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_StorageContainerChunkLists_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_StorageContainerChunkLists_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.StorageContainerChunkLists.class, ChunkServer.StorageContainerChunkLists.Builder.class);
    }

    public static com.google.protobuf.Parser<StorageContainerChunkLists> PARSER =
        new com.google.protobuf.AbstractParser<StorageContainerChunkLists>() {
      public StorageContainerChunkLists parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StorageContainerChunkLists(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StorageContainerChunkLists> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int STORAGE_CONTAINER_CHUNK_LIST_FIELD_NUMBER = 1;
    private java.util.List<ChunkServer.StorageContainerChunkList> storageContainerChunkList_;
    /**
     * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
     */
    public java.util.List<ChunkServer.StorageContainerChunkList> getStorageContainerChunkListList() {
      return storageContainerChunkList_;
    }
    /**
     * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
     */
    public java.util.List<? extends ChunkServer.StorageContainerChunkListOrBuilder> 
        getStorageContainerChunkListOrBuilderList() {
      return storageContainerChunkList_;
    }
    /**
     * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
     */
    public int getStorageContainerChunkListCount() {
      return storageContainerChunkList_.size();
    }
    /**
     * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
     */
    public ChunkServer.StorageContainerChunkList getStorageContainerChunkList(int index) {
      return storageContainerChunkList_.get(index);
    }
    /**
     * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
     */
    public ChunkServer.StorageContainerChunkListOrBuilder getStorageContainerChunkListOrBuilder(
        int index) {
      return storageContainerChunkList_.get(index);
    }

    public static final int FILE_ERROR_FIELD_NUMBER = 2;
    private java.util.List<ChunkServer.FileError> fileError_;
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    public java.util.List<ChunkServer.FileError> getFileErrorList() {
      return fileError_;
    }
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    public java.util.List<? extends ChunkServer.FileErrorOrBuilder> 
        getFileErrorOrBuilderList() {
      return fileError_;
    }
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    public int getFileErrorCount() {
      return fileError_.size();
    }
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    public ChunkServer.FileError getFileError(int index) {
      return fileError_.get(index);
    }
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    public ChunkServer.FileErrorOrBuilder getFileErrorOrBuilder(
        int index) {
      return fileError_.get(index);
    }

    public static final int VERBOSITY_LEVEL_FIELD_NUMBER = 3;
    private int verbosityLevel_;
    /**
     * <code>optional uint32 verbosity_level = 3;</code>
     */
    public boolean hasVerbosityLevel() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 verbosity_level = 3;</code>
     */
    public int getVerbosityLevel() {
      return verbosityLevel_;
    }

    private void initFields() {
      storageContainerChunkList_ = java.util.Collections.emptyList();
      fileError_ = java.util.Collections.emptyList();
      verbosityLevel_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getStorageContainerChunkListCount(); i++) {
        if (!getStorageContainerChunkList(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getFileErrorCount(); i++) {
        if (!getFileError(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < storageContainerChunkList_.size(); i++) {
        output.writeMessage(1, storageContainerChunkList_.get(i));
      }
      for (int i = 0; i < fileError_.size(); i++) {
        output.writeMessage(2, fileError_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(3, verbosityLevel_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < storageContainerChunkList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, storageContainerChunkList_.get(i));
      }
      for (int i = 0; i < fileError_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, fileError_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, verbosityLevel_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.StorageContainerChunkLists parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.StorageContainerChunkLists parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.StorageContainerChunkLists parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.StorageContainerChunkLists parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.StorageContainerChunkLists parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.StorageContainerChunkLists parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.StorageContainerChunkLists parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.StorageContainerChunkLists parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.StorageContainerChunkLists parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.StorageContainerChunkLists parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.StorageContainerChunkLists prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.StorageContainerChunkLists}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.StorageContainerChunkLists)
        ChunkServer.StorageContainerChunkListsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_StorageContainerChunkLists_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_StorageContainerChunkLists_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.StorageContainerChunkLists.class, ChunkServer.StorageContainerChunkLists.Builder.class);
      }

      // Construct using Chunkserver.StorageContainerChunkLists.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getStorageContainerChunkListFieldBuilder();
          getFileErrorFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (storageContainerChunkListBuilder_ == null) {
          storageContainerChunkList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          storageContainerChunkListBuilder_.clear();
        }
        if (fileErrorBuilder_ == null) {
          fileError_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          fileErrorBuilder_.clear();
        }
        verbosityLevel_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_StorageContainerChunkLists_descriptor;
      }

      public ChunkServer.StorageContainerChunkLists getDefaultInstanceForType() {
        return ChunkServer.StorageContainerChunkLists.getDefaultInstance();
      }

      public ChunkServer.StorageContainerChunkLists build() {
        ChunkServer.StorageContainerChunkLists result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.StorageContainerChunkLists buildPartial() {
        ChunkServer.StorageContainerChunkLists result = new ChunkServer.StorageContainerChunkLists(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (storageContainerChunkListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            storageContainerChunkList_ = java.util.Collections.unmodifiableList(storageContainerChunkList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.storageContainerChunkList_ = storageContainerChunkList_;
        } else {
          result.storageContainerChunkList_ = storageContainerChunkListBuilder_.build();
        }
        if (fileErrorBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            fileError_ = java.util.Collections.unmodifiableList(fileError_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.fileError_ = fileError_;
        } else {
          result.fileError_ = fileErrorBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000001;
        }
        result.verbosityLevel_ = verbosityLevel_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.StorageContainerChunkLists) {
          return mergeFrom((ChunkServer.StorageContainerChunkLists)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.StorageContainerChunkLists other) {
        if (other == ChunkServer.StorageContainerChunkLists.getDefaultInstance()) return this;
        if (storageContainerChunkListBuilder_ == null) {
          if (!other.storageContainerChunkList_.isEmpty()) {
            if (storageContainerChunkList_.isEmpty()) {
              storageContainerChunkList_ = other.storageContainerChunkList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureStorageContainerChunkListIsMutable();
              storageContainerChunkList_.addAll(other.storageContainerChunkList_);
            }
            onChanged();
          }
        } else {
          if (!other.storageContainerChunkList_.isEmpty()) {
            if (storageContainerChunkListBuilder_.isEmpty()) {
              storageContainerChunkListBuilder_.dispose();
              storageContainerChunkListBuilder_ = null;
              storageContainerChunkList_ = other.storageContainerChunkList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              storageContainerChunkListBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getStorageContainerChunkListFieldBuilder() : null;
            } else {
              storageContainerChunkListBuilder_.addAllMessages(other.storageContainerChunkList_);
            }
          }
        }
        if (fileErrorBuilder_ == null) {
          if (!other.fileError_.isEmpty()) {
            if (fileError_.isEmpty()) {
              fileError_ = other.fileError_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureFileErrorIsMutable();
              fileError_.addAll(other.fileError_);
            }
            onChanged();
          }
        } else {
          if (!other.fileError_.isEmpty()) {
            if (fileErrorBuilder_.isEmpty()) {
              fileErrorBuilder_.dispose();
              fileErrorBuilder_ = null;
              fileError_ = other.fileError_;
              bitField0_ = (bitField0_ & ~0x00000002);
              fileErrorBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getFileErrorFieldBuilder() : null;
            } else {
              fileErrorBuilder_.addAllMessages(other.fileError_);
            }
          }
        }
        if (other.hasVerbosityLevel()) {
          setVerbosityLevel(other.getVerbosityLevel());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getStorageContainerChunkListCount(); i++) {
          if (!getStorageContainerChunkList(i).isInitialized()) {
            
            return false;
          }
        }
        for (int i = 0; i < getFileErrorCount(); i++) {
          if (!getFileError(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.StorageContainerChunkLists parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.StorageContainerChunkLists) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<ChunkServer.StorageContainerChunkList> storageContainerChunkList_ =
        java.util.Collections.emptyList();
      private void ensureStorageContainerChunkListIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          storageContainerChunkList_ = new java.util.ArrayList<ChunkServer.StorageContainerChunkList>(storageContainerChunkList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.StorageContainerChunkList, ChunkServer.StorageContainerChunkList.Builder, ChunkServer.StorageContainerChunkListOrBuilder> storageContainerChunkListBuilder_;

      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public java.util.List<ChunkServer.StorageContainerChunkList> getStorageContainerChunkListList() {
        if (storageContainerChunkListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(storageContainerChunkList_);
        } else {
          return storageContainerChunkListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public int getStorageContainerChunkListCount() {
        if (storageContainerChunkListBuilder_ == null) {
          return storageContainerChunkList_.size();
        } else {
          return storageContainerChunkListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public ChunkServer.StorageContainerChunkList getStorageContainerChunkList(int index) {
        if (storageContainerChunkListBuilder_ == null) {
          return storageContainerChunkList_.get(index);
        } else {
          return storageContainerChunkListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public Builder setStorageContainerChunkList(
          int index, ChunkServer.StorageContainerChunkList value) {
        if (storageContainerChunkListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStorageContainerChunkListIsMutable();
          storageContainerChunkList_.set(index, value);
          onChanged();
        } else {
          storageContainerChunkListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public Builder setStorageContainerChunkList(
          int index, ChunkServer.StorageContainerChunkList.Builder builderForValue) {
        if (storageContainerChunkListBuilder_ == null) {
          ensureStorageContainerChunkListIsMutable();
          storageContainerChunkList_.set(index, builderForValue.build());
          onChanged();
        } else {
          storageContainerChunkListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public Builder addStorageContainerChunkList(ChunkServer.StorageContainerChunkList value) {
        if (storageContainerChunkListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStorageContainerChunkListIsMutable();
          storageContainerChunkList_.add(value);
          onChanged();
        } else {
          storageContainerChunkListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public Builder addStorageContainerChunkList(
          int index, ChunkServer.StorageContainerChunkList value) {
        if (storageContainerChunkListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStorageContainerChunkListIsMutable();
          storageContainerChunkList_.add(index, value);
          onChanged();
        } else {
          storageContainerChunkListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public Builder addStorageContainerChunkList(
          ChunkServer.StorageContainerChunkList.Builder builderForValue) {
        if (storageContainerChunkListBuilder_ == null) {
          ensureStorageContainerChunkListIsMutable();
          storageContainerChunkList_.add(builderForValue.build());
          onChanged();
        } else {
          storageContainerChunkListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public Builder addStorageContainerChunkList(
          int index, ChunkServer.StorageContainerChunkList.Builder builderForValue) {
        if (storageContainerChunkListBuilder_ == null) {
          ensureStorageContainerChunkListIsMutable();
          storageContainerChunkList_.add(index, builderForValue.build());
          onChanged();
        } else {
          storageContainerChunkListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public Builder addAllStorageContainerChunkList(
          java.lang.Iterable<? extends ChunkServer.StorageContainerChunkList> values) {
        if (storageContainerChunkListBuilder_ == null) {
          ensureStorageContainerChunkListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, storageContainerChunkList_);
          onChanged();
        } else {
          storageContainerChunkListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public Builder clearStorageContainerChunkList() {
        if (storageContainerChunkListBuilder_ == null) {
          storageContainerChunkList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          storageContainerChunkListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public Builder removeStorageContainerChunkList(int index) {
        if (storageContainerChunkListBuilder_ == null) {
          ensureStorageContainerChunkListIsMutable();
          storageContainerChunkList_.remove(index);
          onChanged();
        } else {
          storageContainerChunkListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public ChunkServer.StorageContainerChunkList.Builder getStorageContainerChunkListBuilder(
          int index) {
        return getStorageContainerChunkListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public ChunkServer.StorageContainerChunkListOrBuilder getStorageContainerChunkListOrBuilder(
          int index) {
        if (storageContainerChunkListBuilder_ == null) {
          return storageContainerChunkList_.get(index);  } else {
          return storageContainerChunkListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public java.util.List<? extends ChunkServer.StorageContainerChunkListOrBuilder> 
           getStorageContainerChunkListOrBuilderList() {
        if (storageContainerChunkListBuilder_ != null) {
          return storageContainerChunkListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(storageContainerChunkList_);
        }
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public ChunkServer.StorageContainerChunkList.Builder addStorageContainerChunkListBuilder() {
        return getStorageContainerChunkListFieldBuilder().addBuilder(ChunkServer.StorageContainerChunkList.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public ChunkServer.StorageContainerChunkList.Builder addStorageContainerChunkListBuilder(
          int index) {
        return getStorageContainerChunkListFieldBuilder().addBuilder(index, ChunkServer.StorageContainerChunkList.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.StorageContainerChunkList storage_container_chunk_list = 1;</code>
       */
      public java.util.List<ChunkServer.StorageContainerChunkList.Builder> 
           getStorageContainerChunkListBuilderList() {
        return getStorageContainerChunkListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.StorageContainerChunkList, ChunkServer.StorageContainerChunkList.Builder, ChunkServer.StorageContainerChunkListOrBuilder> 
          getStorageContainerChunkListFieldBuilder() {
        if (storageContainerChunkListBuilder_ == null) {
          storageContainerChunkListBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.StorageContainerChunkList, ChunkServer.StorageContainerChunkList.Builder, ChunkServer.StorageContainerChunkListOrBuilder>(
                  storageContainerChunkList_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          storageContainerChunkList_ = null;
        }
        return storageContainerChunkListBuilder_;
      }

      private java.util.List<ChunkServer.FileError> fileError_ =
        java.util.Collections.emptyList();
      private void ensureFileErrorIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          fileError_ = new java.util.ArrayList<ChunkServer.FileError>(fileError_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.FileError, ChunkServer.FileError.Builder, ChunkServer.FileErrorOrBuilder> fileErrorBuilder_;

      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public java.util.List<ChunkServer.FileError> getFileErrorList() {
        if (fileErrorBuilder_ == null) {
          return java.util.Collections.unmodifiableList(fileError_);
        } else {
          return fileErrorBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public int getFileErrorCount() {
        if (fileErrorBuilder_ == null) {
          return fileError_.size();
        } else {
          return fileErrorBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public ChunkServer.FileError getFileError(int index) {
        if (fileErrorBuilder_ == null) {
          return fileError_.get(index);
        } else {
          return fileErrorBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder setFileError(
          int index, ChunkServer.FileError value) {
        if (fileErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileErrorIsMutable();
          fileError_.set(index, value);
          onChanged();
        } else {
          fileErrorBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder setFileError(
          int index, ChunkServer.FileError.Builder builderForValue) {
        if (fileErrorBuilder_ == null) {
          ensureFileErrorIsMutable();
          fileError_.set(index, builderForValue.build());
          onChanged();
        } else {
          fileErrorBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder addFileError(ChunkServer.FileError value) {
        if (fileErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileErrorIsMutable();
          fileError_.add(value);
          onChanged();
        } else {
          fileErrorBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder addFileError(
          int index, ChunkServer.FileError value) {
        if (fileErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileErrorIsMutable();
          fileError_.add(index, value);
          onChanged();
        } else {
          fileErrorBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder addFileError(
          ChunkServer.FileError.Builder builderForValue) {
        if (fileErrorBuilder_ == null) {
          ensureFileErrorIsMutable();
          fileError_.add(builderForValue.build());
          onChanged();
        } else {
          fileErrorBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder addFileError(
          int index, ChunkServer.FileError.Builder builderForValue) {
        if (fileErrorBuilder_ == null) {
          ensureFileErrorIsMutable();
          fileError_.add(index, builderForValue.build());
          onChanged();
        } else {
          fileErrorBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder addAllFileError(
          java.lang.Iterable<? extends ChunkServer.FileError> values) {
        if (fileErrorBuilder_ == null) {
          ensureFileErrorIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, fileError_);
          onChanged();
        } else {
          fileErrorBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder clearFileError() {
        if (fileErrorBuilder_ == null) {
          fileError_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          fileErrorBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder removeFileError(int index) {
        if (fileErrorBuilder_ == null) {
          ensureFileErrorIsMutable();
          fileError_.remove(index);
          onChanged();
        } else {
          fileErrorBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public ChunkServer.FileError.Builder getFileErrorBuilder(
          int index) {
        return getFileErrorFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public ChunkServer.FileErrorOrBuilder getFileErrorOrBuilder(
          int index) {
        if (fileErrorBuilder_ == null) {
          return fileError_.get(index);  } else {
          return fileErrorBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public java.util.List<? extends ChunkServer.FileErrorOrBuilder> 
           getFileErrorOrBuilderList() {
        if (fileErrorBuilder_ != null) {
          return fileErrorBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(fileError_);
        }
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public ChunkServer.FileError.Builder addFileErrorBuilder() {
        return getFileErrorFieldBuilder().addBuilder(ChunkServer.FileError.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public ChunkServer.FileError.Builder addFileErrorBuilder(
          int index) {
        return getFileErrorFieldBuilder().addBuilder(index, ChunkServer.FileError.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public java.util.List<ChunkServer.FileError.Builder> 
           getFileErrorBuilderList() {
        return getFileErrorFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.FileError, ChunkServer.FileError.Builder, ChunkServer.FileErrorOrBuilder> 
          getFileErrorFieldBuilder() {
        if (fileErrorBuilder_ == null) {
          fileErrorBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.FileError, ChunkServer.FileError.Builder, ChunkServer.FileErrorOrBuilder>(
                  fileError_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          fileError_ = null;
        }
        return fileErrorBuilder_;
      }

      private int verbosityLevel_ ;
      /**
       * <code>optional uint32 verbosity_level = 3;</code>
       */
      public boolean hasVerbosityLevel() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint32 verbosity_level = 3;</code>
       */
      public int getVerbosityLevel() {
        return verbosityLevel_;
      }
      /**
       * <code>optional uint32 verbosity_level = 3;</code>
       */
      public Builder setVerbosityLevel(int value) {
        bitField0_ |= 0x00000004;
        verbosityLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 verbosity_level = 3;</code>
       */
      public Builder clearVerbosityLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        verbosityLevel_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.StorageContainerChunkLists)
    }

    static {
      defaultInstance = new StorageContainerChunkLists(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.StorageContainerChunkLists)
  }

  public interface StorageContainerErrorListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.StorageContainerErrorList)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
     */
    java.util.List<ChunkServer.StorageContainerError> 
        getStorageContainerErrorList();
    /**
     * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
     */
    ChunkServer.StorageContainerError getStorageContainerError(int index);
    /**
     * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
     */
    int getStorageContainerErrorCount();
    /**
     * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
     */
    java.util.List<? extends ChunkServer.StorageContainerErrorOrBuilder> 
        getStorageContainerErrorOrBuilderList();
    /**
     * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
     */
    ChunkServer.StorageContainerErrorOrBuilder getStorageContainerErrorOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code chunkserver.StorageContainerErrorList}
   */
  public static final class StorageContainerErrorList extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.StorageContainerErrorList)
      StorageContainerErrorListOrBuilder {
    // Use StorageContainerErrorList.newBuilder() to construct.
    private StorageContainerErrorList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StorageContainerErrorList(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StorageContainerErrorList defaultInstance;
    public static StorageContainerErrorList getDefaultInstance() {
      return defaultInstance;
    }

    public StorageContainerErrorList getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StorageContainerErrorList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                storageContainerError_ = new java.util.ArrayList<ChunkServer.StorageContainerError>();
                mutable_bitField0_ |= 0x00000001;
              }
              storageContainerError_.add(input.readMessage(ChunkServer.StorageContainerError.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          storageContainerError_ = java.util.Collections.unmodifiableList(storageContainerError_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_StorageContainerErrorList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_StorageContainerErrorList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.StorageContainerErrorList.class, ChunkServer.StorageContainerErrorList.Builder.class);
    }

    public static com.google.protobuf.Parser<StorageContainerErrorList> PARSER =
        new com.google.protobuf.AbstractParser<StorageContainerErrorList>() {
      public StorageContainerErrorList parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StorageContainerErrorList(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StorageContainerErrorList> getParserForType() {
      return PARSER;
    }

    public static final int STORAGE_CONTAINER_ERROR_FIELD_NUMBER = 1;
    private java.util.List<ChunkServer.StorageContainerError> storageContainerError_;
    /**
     * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
     */
    public java.util.List<ChunkServer.StorageContainerError> getStorageContainerErrorList() {
      return storageContainerError_;
    }
    /**
     * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
     */
    public java.util.List<? extends ChunkServer.StorageContainerErrorOrBuilder> 
        getStorageContainerErrorOrBuilderList() {
      return storageContainerError_;
    }
    /**
     * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
     */
    public int getStorageContainerErrorCount() {
      return storageContainerError_.size();
    }
    /**
     * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
     */
    public ChunkServer.StorageContainerError getStorageContainerError(int index) {
      return storageContainerError_.get(index);
    }
    /**
     * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
     */
    public ChunkServer.StorageContainerErrorOrBuilder getStorageContainerErrorOrBuilder(
        int index) {
      return storageContainerError_.get(index);
    }

    private void initFields() {
      storageContainerError_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getStorageContainerErrorCount(); i++) {
        if (!getStorageContainerError(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < storageContainerError_.size(); i++) {
        output.writeMessage(1, storageContainerError_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < storageContainerError_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, storageContainerError_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.StorageContainerErrorList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.StorageContainerErrorList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.StorageContainerErrorList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.StorageContainerErrorList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.StorageContainerErrorList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.StorageContainerErrorList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.StorageContainerErrorList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.StorageContainerErrorList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.StorageContainerErrorList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.StorageContainerErrorList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.StorageContainerErrorList prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.StorageContainerErrorList}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.StorageContainerErrorList)
        ChunkServer.StorageContainerErrorListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_StorageContainerErrorList_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_StorageContainerErrorList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.StorageContainerErrorList.class, ChunkServer.StorageContainerErrorList.Builder.class);
      }

      // Construct using Chunkserver.StorageContainerErrorList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getStorageContainerErrorFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (storageContainerErrorBuilder_ == null) {
          storageContainerError_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          storageContainerErrorBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_StorageContainerErrorList_descriptor;
      }

      public ChunkServer.StorageContainerErrorList getDefaultInstanceForType() {
        return ChunkServer.StorageContainerErrorList.getDefaultInstance();
      }

      public ChunkServer.StorageContainerErrorList build() {
        ChunkServer.StorageContainerErrorList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.StorageContainerErrorList buildPartial() {
        ChunkServer.StorageContainerErrorList result = new ChunkServer.StorageContainerErrorList(this);
        int from_bitField0_ = bitField0_;
        if (storageContainerErrorBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            storageContainerError_ = java.util.Collections.unmodifiableList(storageContainerError_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.storageContainerError_ = storageContainerError_;
        } else {
          result.storageContainerError_ = storageContainerErrorBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.StorageContainerErrorList) {
          return mergeFrom((ChunkServer.StorageContainerErrorList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.StorageContainerErrorList other) {
        if (other == ChunkServer.StorageContainerErrorList.getDefaultInstance()) return this;
        if (storageContainerErrorBuilder_ == null) {
          if (!other.storageContainerError_.isEmpty()) {
            if (storageContainerError_.isEmpty()) {
              storageContainerError_ = other.storageContainerError_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureStorageContainerErrorIsMutable();
              storageContainerError_.addAll(other.storageContainerError_);
            }
            onChanged();
          }
        } else {
          if (!other.storageContainerError_.isEmpty()) {
            if (storageContainerErrorBuilder_.isEmpty()) {
              storageContainerErrorBuilder_.dispose();
              storageContainerErrorBuilder_ = null;
              storageContainerError_ = other.storageContainerError_;
              bitField0_ = (bitField0_ & ~0x00000001);
              storageContainerErrorBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getStorageContainerErrorFieldBuilder() : null;
            } else {
              storageContainerErrorBuilder_.addAllMessages(other.storageContainerError_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getStorageContainerErrorCount(); i++) {
          if (!getStorageContainerError(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.StorageContainerErrorList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.StorageContainerErrorList) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<ChunkServer.StorageContainerError> storageContainerError_ =
        java.util.Collections.emptyList();
      private void ensureStorageContainerErrorIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          storageContainerError_ = new java.util.ArrayList<ChunkServer.StorageContainerError>(storageContainerError_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.StorageContainerError, ChunkServer.StorageContainerError.Builder, ChunkServer.StorageContainerErrorOrBuilder> storageContainerErrorBuilder_;

      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public java.util.List<ChunkServer.StorageContainerError> getStorageContainerErrorList() {
        if (storageContainerErrorBuilder_ == null) {
          return java.util.Collections.unmodifiableList(storageContainerError_);
        } else {
          return storageContainerErrorBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public int getStorageContainerErrorCount() {
        if (storageContainerErrorBuilder_ == null) {
          return storageContainerError_.size();
        } else {
          return storageContainerErrorBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public ChunkServer.StorageContainerError getStorageContainerError(int index) {
        if (storageContainerErrorBuilder_ == null) {
          return storageContainerError_.get(index);
        } else {
          return storageContainerErrorBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public Builder setStorageContainerError(
          int index, ChunkServer.StorageContainerError value) {
        if (storageContainerErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStorageContainerErrorIsMutable();
          storageContainerError_.set(index, value);
          onChanged();
        } else {
          storageContainerErrorBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public Builder setStorageContainerError(
          int index, ChunkServer.StorageContainerError.Builder builderForValue) {
        if (storageContainerErrorBuilder_ == null) {
          ensureStorageContainerErrorIsMutable();
          storageContainerError_.set(index, builderForValue.build());
          onChanged();
        } else {
          storageContainerErrorBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public Builder addStorageContainerError(ChunkServer.StorageContainerError value) {
        if (storageContainerErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStorageContainerErrorIsMutable();
          storageContainerError_.add(value);
          onChanged();
        } else {
          storageContainerErrorBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public Builder addStorageContainerError(
          int index, ChunkServer.StorageContainerError value) {
        if (storageContainerErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStorageContainerErrorIsMutable();
          storageContainerError_.add(index, value);
          onChanged();
        } else {
          storageContainerErrorBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public Builder addStorageContainerError(
          ChunkServer.StorageContainerError.Builder builderForValue) {
        if (storageContainerErrorBuilder_ == null) {
          ensureStorageContainerErrorIsMutable();
          storageContainerError_.add(builderForValue.build());
          onChanged();
        } else {
          storageContainerErrorBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public Builder addStorageContainerError(
          int index, ChunkServer.StorageContainerError.Builder builderForValue) {
        if (storageContainerErrorBuilder_ == null) {
          ensureStorageContainerErrorIsMutable();
          storageContainerError_.add(index, builderForValue.build());
          onChanged();
        } else {
          storageContainerErrorBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public Builder addAllStorageContainerError(
          java.lang.Iterable<? extends ChunkServer.StorageContainerError> values) {
        if (storageContainerErrorBuilder_ == null) {
          ensureStorageContainerErrorIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, storageContainerError_);
          onChanged();
        } else {
          storageContainerErrorBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public Builder clearStorageContainerError() {
        if (storageContainerErrorBuilder_ == null) {
          storageContainerError_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          storageContainerErrorBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public Builder removeStorageContainerError(int index) {
        if (storageContainerErrorBuilder_ == null) {
          ensureStorageContainerErrorIsMutable();
          storageContainerError_.remove(index);
          onChanged();
        } else {
          storageContainerErrorBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public ChunkServer.StorageContainerError.Builder getStorageContainerErrorBuilder(
          int index) {
        return getStorageContainerErrorFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public ChunkServer.StorageContainerErrorOrBuilder getStorageContainerErrorOrBuilder(
          int index) {
        if (storageContainerErrorBuilder_ == null) {
          return storageContainerError_.get(index);  } else {
          return storageContainerErrorBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public java.util.List<? extends ChunkServer.StorageContainerErrorOrBuilder> 
           getStorageContainerErrorOrBuilderList() {
        if (storageContainerErrorBuilder_ != null) {
          return storageContainerErrorBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(storageContainerError_);
        }
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public ChunkServer.StorageContainerError.Builder addStorageContainerErrorBuilder() {
        return getStorageContainerErrorFieldBuilder().addBuilder(ChunkServer.StorageContainerError.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public ChunkServer.StorageContainerError.Builder addStorageContainerErrorBuilder(
          int index) {
        return getStorageContainerErrorFieldBuilder().addBuilder(index, ChunkServer.StorageContainerError.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.StorageContainerError storage_container_error = 1;</code>
       */
      public java.util.List<ChunkServer.StorageContainerError.Builder> 
           getStorageContainerErrorBuilderList() {
        return getStorageContainerErrorFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.StorageContainerError, ChunkServer.StorageContainerError.Builder, ChunkServer.StorageContainerErrorOrBuilder> 
          getStorageContainerErrorFieldBuilder() {
        if (storageContainerErrorBuilder_ == null) {
          storageContainerErrorBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.StorageContainerError, ChunkServer.StorageContainerError.Builder, ChunkServer.StorageContainerErrorOrBuilder>(
                  storageContainerError_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          storageContainerError_ = null;
        }
        return storageContainerErrorBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.StorageContainerErrorList)
    }

    static {
      defaultInstance = new StorageContainerErrorList(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.StorageContainerErrorList)
  }

  public interface FileChecksumAuthorizationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.FileChecksumAuthorization)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    boolean hasFileChecksum();
    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    com.google.protobuf.ByteString getFileChecksum();

    /**
     * <code>required string authorization = 2;</code>
     */
    boolean hasAuthorization();
    /**
     * <code>required string authorization = 2;</code>
     */
    java.lang.String getAuthorization();
    /**
     * <code>required string authorization = 2;</code>
     */
    com.google.protobuf.ByteString
        getAuthorizationBytes();

    /**
     * <code>repeated bytes chunk_checksums = 3;</code>
     */
    java.util.List<com.google.protobuf.ByteString> getChunkChecksumsList();
    /**
     * <code>repeated bytes chunk_checksums = 3;</code>
     */
    int getChunkChecksumsCount();
    /**
     * <code>repeated bytes chunk_checksums = 3;</code>
     */
    com.google.protobuf.ByteString getChunkChecksums(int index);
  }
  /**
   * Protobuf type {@code chunkserver.FileChecksumAuthorization}
   */
  public static final class FileChecksumAuthorization extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.FileChecksumAuthorization)
      FileChecksumAuthorizationOrBuilder {
    // Use FileChecksumAuthorization.newBuilder() to construct.
    private FileChecksumAuthorization(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private FileChecksumAuthorization(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final FileChecksumAuthorization defaultInstance;
    public static FileChecksumAuthorization getDefaultInstance() {
      return defaultInstance;
    }

    public FileChecksumAuthorization getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private FileChecksumAuthorization(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              fileChecksum_ = input.readBytes();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              authorization_ = bs;
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                chunkChecksums_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
                mutable_bitField0_ |= 0x00000004;
              }
              chunkChecksums_.add(input.readBytes());
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          chunkChecksums_ = java.util.Collections.unmodifiableList(chunkChecksums_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_FileChecksumAuthorization_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_FileChecksumAuthorization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.FileChecksumAuthorization.class, ChunkServer.FileChecksumAuthorization.Builder.class);
    }

    public static com.google.protobuf.Parser<FileChecksumAuthorization> PARSER =
        new com.google.protobuf.AbstractParser<FileChecksumAuthorization>() {
      public FileChecksumAuthorization parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileChecksumAuthorization(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<FileChecksumAuthorization> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FILE_CHECKSUM_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString fileChecksum_;
    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    public boolean hasFileChecksum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    public com.google.protobuf.ByteString getFileChecksum() {
      return fileChecksum_;
    }

    public static final int AUTHORIZATION_FIELD_NUMBER = 2;
    private java.lang.Object authorization_;
    /**
     * <code>required string authorization = 2;</code>
     */
    public boolean hasAuthorization() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string authorization = 2;</code>
     */
    public java.lang.String getAuthorization() {
      java.lang.Object ref = authorization_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          authorization_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string authorization = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAuthorizationBytes() {
      java.lang.Object ref = authorization_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authorization_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CHUNK_CHECKSUMS_FIELD_NUMBER = 3;
    private java.util.List<com.google.protobuf.ByteString> chunkChecksums_;
    /**
     * <code>repeated bytes chunk_checksums = 3;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getChunkChecksumsList() {
      return chunkChecksums_;
    }
    /**
     * <code>repeated bytes chunk_checksums = 3;</code>
     */
    public int getChunkChecksumsCount() {
      return chunkChecksums_.size();
    }
    /**
     * <code>repeated bytes chunk_checksums = 3;</code>
     */
    public com.google.protobuf.ByteString getChunkChecksums(int index) {
      return chunkChecksums_.get(index);
    }

    private void initFields() {
      fileChecksum_ = com.google.protobuf.ByteString.EMPTY;
      authorization_ = "";
      chunkChecksums_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasFileChecksum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAuthorization()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, fileChecksum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getAuthorizationBytes());
      }
      for (int i = 0; i < chunkChecksums_.size(); i++) {
        output.writeBytes(3, chunkChecksums_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, fileChecksum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getAuthorizationBytes());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < chunkChecksums_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(chunkChecksums_.get(i));
        }
        size += dataSize;
        size += 1 * getChunkChecksumsList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.FileChecksumAuthorization parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileChecksumAuthorization parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileChecksumAuthorization parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileChecksumAuthorization parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileChecksumAuthorization parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileChecksumAuthorization parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileChecksumAuthorization parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.FileChecksumAuthorization parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileChecksumAuthorization parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileChecksumAuthorization parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.FileChecksumAuthorization prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.FileChecksumAuthorization}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.FileChecksumAuthorization)
        ChunkServer.FileChecksumAuthorizationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_FileChecksumAuthorization_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_FileChecksumAuthorization_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.FileChecksumAuthorization.class, ChunkServer.FileChecksumAuthorization.Builder.class);
      }

      // Construct using Chunkserver.FileChecksumAuthorization.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        fileChecksum_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        authorization_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        chunkChecksums_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_FileChecksumAuthorization_descriptor;
      }

      public ChunkServer.FileChecksumAuthorization getDefaultInstanceForType() {
        return ChunkServer.FileChecksumAuthorization.getDefaultInstance();
      }

      public ChunkServer.FileChecksumAuthorization build() {
        ChunkServer.FileChecksumAuthorization result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.FileChecksumAuthorization buildPartial() {
        ChunkServer.FileChecksumAuthorization result = new ChunkServer.FileChecksumAuthorization(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.fileChecksum_ = fileChecksum_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.authorization_ = authorization_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          chunkChecksums_ = java.util.Collections.unmodifiableList(chunkChecksums_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.chunkChecksums_ = chunkChecksums_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.FileChecksumAuthorization) {
          return mergeFrom((ChunkServer.FileChecksumAuthorization)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.FileChecksumAuthorization other) {
        if (other == ChunkServer.FileChecksumAuthorization.getDefaultInstance()) return this;
        if (other.hasFileChecksum()) {
          setFileChecksum(other.getFileChecksum());
        }
        if (other.hasAuthorization()) {
          bitField0_ |= 0x00000002;
          authorization_ = other.authorization_;
          onChanged();
        }
        if (!other.chunkChecksums_.isEmpty()) {
          if (chunkChecksums_.isEmpty()) {
            chunkChecksums_ = other.chunkChecksums_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureChunkChecksumsIsMutable();
            chunkChecksums_.addAll(other.chunkChecksums_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasFileChecksum()) {
          
          return false;
        }
        if (!hasAuthorization()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.FileChecksumAuthorization parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.FileChecksumAuthorization) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString fileChecksum_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public boolean hasFileChecksum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public com.google.protobuf.ByteString getFileChecksum() {
        return fileChecksum_;
      }
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public Builder setFileChecksum(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        fileChecksum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public Builder clearFileChecksum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fileChecksum_ = getDefaultInstance().getFileChecksum();
        onChanged();
        return this;
      }

      private java.lang.Object authorization_ = "";
      /**
       * <code>required string authorization = 2;</code>
       */
      public boolean hasAuthorization() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string authorization = 2;</code>
       */
      public java.lang.String getAuthorization() {
        java.lang.Object ref = authorization_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            authorization_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string authorization = 2;</code>
       */
      public com.google.protobuf.ByteString
          getAuthorizationBytes() {
        java.lang.Object ref = authorization_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          authorization_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string authorization = 2;</code>
       */
      public Builder setAuthorization(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        authorization_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string authorization = 2;</code>
       */
      public Builder clearAuthorization() {
        bitField0_ = (bitField0_ & ~0x00000002);
        authorization_ = getDefaultInstance().getAuthorization();
        onChanged();
        return this;
      }
      /**
       * <code>required string authorization = 2;</code>
       */
      public Builder setAuthorizationBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        authorization_ = value;
        onChanged();
        return this;
      }

      private java.util.List<com.google.protobuf.ByteString> chunkChecksums_ = java.util.Collections.emptyList();
      private void ensureChunkChecksumsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          chunkChecksums_ = new java.util.ArrayList<com.google.protobuf.ByteString>(chunkChecksums_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated bytes chunk_checksums = 3;</code>
       */
      public java.util.List<com.google.protobuf.ByteString>
          getChunkChecksumsList() {
        return java.util.Collections.unmodifiableList(chunkChecksums_);
      }
      /**
       * <code>repeated bytes chunk_checksums = 3;</code>
       */
      public int getChunkChecksumsCount() {
        return chunkChecksums_.size();
      }
      /**
       * <code>repeated bytes chunk_checksums = 3;</code>
       */
      public com.google.protobuf.ByteString getChunkChecksums(int index) {
        return chunkChecksums_.get(index);
      }
      /**
       * <code>repeated bytes chunk_checksums = 3;</code>
       */
      public Builder setChunkChecksums(
          int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureChunkChecksumsIsMutable();
        chunkChecksums_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes chunk_checksums = 3;</code>
       */
      public Builder addChunkChecksums(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureChunkChecksumsIsMutable();
        chunkChecksums_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes chunk_checksums = 3;</code>
       */
      public Builder addAllChunkChecksums(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureChunkChecksumsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, chunkChecksums_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes chunk_checksums = 3;</code>
       */
      public Builder clearChunkChecksums() {
        chunkChecksums_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.FileChecksumAuthorization)
    }

    static {
      defaultInstance = new FileChecksumAuthorization(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.FileChecksumAuthorization)
  }

  public interface FileChecksumAuthorizationListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.FileChecksumAuthorizationList)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
     */
    java.util.List<ChunkServer.FileChecksumAuthorization> 
        getFileChecksumAuthorizationList();
    /**
     * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
     */
    ChunkServer.FileChecksumAuthorization getFileChecksumAuthorization(int index);
    /**
     * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
     */
    int getFileChecksumAuthorizationCount();
    /**
     * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
     */
    java.util.List<? extends ChunkServer.FileChecksumAuthorizationOrBuilder> 
        getFileChecksumAuthorizationOrBuilderList();
    /**
     * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
     */
    ChunkServer.FileChecksumAuthorizationOrBuilder getFileChecksumAuthorizationOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code chunkserver.FileChecksumAuthorizationList}
   */
  public static final class FileChecksumAuthorizationList extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.FileChecksumAuthorizationList)
      FileChecksumAuthorizationListOrBuilder {
    // Use FileChecksumAuthorizationList.newBuilder() to construct.
    private FileChecksumAuthorizationList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private FileChecksumAuthorizationList(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final FileChecksumAuthorizationList defaultInstance;
    public static FileChecksumAuthorizationList getDefaultInstance() {
      return defaultInstance;
    }

    public FileChecksumAuthorizationList getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private FileChecksumAuthorizationList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                fileChecksumAuthorization_ = new java.util.ArrayList<ChunkServer.FileChecksumAuthorization>();
                mutable_bitField0_ |= 0x00000001;
              }
              fileChecksumAuthorization_.add(input.readMessage(ChunkServer.FileChecksumAuthorization.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          fileChecksumAuthorization_ = java.util.Collections.unmodifiableList(fileChecksumAuthorization_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_FileChecksumAuthorizationList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_FileChecksumAuthorizationList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.FileChecksumAuthorizationList.class, ChunkServer.FileChecksumAuthorizationList.Builder.class);
    }

    public static com.google.protobuf.Parser<FileChecksumAuthorizationList> PARSER =
        new com.google.protobuf.AbstractParser<FileChecksumAuthorizationList>() {
      public FileChecksumAuthorizationList parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileChecksumAuthorizationList(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<FileChecksumAuthorizationList> getParserForType() {
      return PARSER;
    }

    public static final int FILE_CHECKSUM_AUTHORIZATION_FIELD_NUMBER = 1;
    private java.util.List<ChunkServer.FileChecksumAuthorization> fileChecksumAuthorization_;
    /**
     * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
     */
    public java.util.List<ChunkServer.FileChecksumAuthorization> getFileChecksumAuthorizationList() {
      return fileChecksumAuthorization_;
    }
    /**
     * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
     */
    public java.util.List<? extends ChunkServer.FileChecksumAuthorizationOrBuilder> 
        getFileChecksumAuthorizationOrBuilderList() {
      return fileChecksumAuthorization_;
    }
    /**
     * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
     */
    public int getFileChecksumAuthorizationCount() {
      return fileChecksumAuthorization_.size();
    }
    /**
     * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
     */
    public ChunkServer.FileChecksumAuthorization getFileChecksumAuthorization(int index) {
      return fileChecksumAuthorization_.get(index);
    }
    /**
     * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
     */
    public ChunkServer.FileChecksumAuthorizationOrBuilder getFileChecksumAuthorizationOrBuilder(
        int index) {
      return fileChecksumAuthorization_.get(index);
    }

    private void initFields() {
      fileChecksumAuthorization_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getFileChecksumAuthorizationCount(); i++) {
        if (!getFileChecksumAuthorization(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < fileChecksumAuthorization_.size(); i++) {
        output.writeMessage(1, fileChecksumAuthorization_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < fileChecksumAuthorization_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, fileChecksumAuthorization_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.FileChecksumAuthorizationList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileChecksumAuthorizationList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileChecksumAuthorizationList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileChecksumAuthorizationList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileChecksumAuthorizationList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileChecksumAuthorizationList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileChecksumAuthorizationList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.FileChecksumAuthorizationList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileChecksumAuthorizationList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileChecksumAuthorizationList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.FileChecksumAuthorizationList prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.FileChecksumAuthorizationList}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.FileChecksumAuthorizationList)
        ChunkServer.FileChecksumAuthorizationListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_FileChecksumAuthorizationList_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_FileChecksumAuthorizationList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.FileChecksumAuthorizationList.class, ChunkServer.FileChecksumAuthorizationList.Builder.class);
      }

      // Construct using Chunkserver.FileChecksumAuthorizationList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getFileChecksumAuthorizationFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (fileChecksumAuthorizationBuilder_ == null) {
          fileChecksumAuthorization_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          fileChecksumAuthorizationBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_FileChecksumAuthorizationList_descriptor;
      }

      public ChunkServer.FileChecksumAuthorizationList getDefaultInstanceForType() {
        return ChunkServer.FileChecksumAuthorizationList.getDefaultInstance();
      }

      public ChunkServer.FileChecksumAuthorizationList build() {
        ChunkServer.FileChecksumAuthorizationList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.FileChecksumAuthorizationList buildPartial() {
        ChunkServer.FileChecksumAuthorizationList result = new ChunkServer.FileChecksumAuthorizationList(this);
        int from_bitField0_ = bitField0_;
        if (fileChecksumAuthorizationBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            fileChecksumAuthorization_ = java.util.Collections.unmodifiableList(fileChecksumAuthorization_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.fileChecksumAuthorization_ = fileChecksumAuthorization_;
        } else {
          result.fileChecksumAuthorization_ = fileChecksumAuthorizationBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.FileChecksumAuthorizationList) {
          return mergeFrom((ChunkServer.FileChecksumAuthorizationList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.FileChecksumAuthorizationList other) {
        if (other == ChunkServer.FileChecksumAuthorizationList.getDefaultInstance()) return this;
        if (fileChecksumAuthorizationBuilder_ == null) {
          if (!other.fileChecksumAuthorization_.isEmpty()) {
            if (fileChecksumAuthorization_.isEmpty()) {
              fileChecksumAuthorization_ = other.fileChecksumAuthorization_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureFileChecksumAuthorizationIsMutable();
              fileChecksumAuthorization_.addAll(other.fileChecksumAuthorization_);
            }
            onChanged();
          }
        } else {
          if (!other.fileChecksumAuthorization_.isEmpty()) {
            if (fileChecksumAuthorizationBuilder_.isEmpty()) {
              fileChecksumAuthorizationBuilder_.dispose();
              fileChecksumAuthorizationBuilder_ = null;
              fileChecksumAuthorization_ = other.fileChecksumAuthorization_;
              bitField0_ = (bitField0_ & ~0x00000001);
              fileChecksumAuthorizationBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getFileChecksumAuthorizationFieldBuilder() : null;
            } else {
              fileChecksumAuthorizationBuilder_.addAllMessages(other.fileChecksumAuthorization_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getFileChecksumAuthorizationCount(); i++) {
          if (!getFileChecksumAuthorization(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.FileChecksumAuthorizationList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.FileChecksumAuthorizationList) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<ChunkServer.FileChecksumAuthorization> fileChecksumAuthorization_ =
        java.util.Collections.emptyList();
      private void ensureFileChecksumAuthorizationIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          fileChecksumAuthorization_ = new java.util.ArrayList<ChunkServer.FileChecksumAuthorization>(fileChecksumAuthorization_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.FileChecksumAuthorization, ChunkServer.FileChecksumAuthorization.Builder, ChunkServer.FileChecksumAuthorizationOrBuilder> fileChecksumAuthorizationBuilder_;

      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public java.util.List<ChunkServer.FileChecksumAuthorization> getFileChecksumAuthorizationList() {
        if (fileChecksumAuthorizationBuilder_ == null) {
          return java.util.Collections.unmodifiableList(fileChecksumAuthorization_);
        } else {
          return fileChecksumAuthorizationBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public int getFileChecksumAuthorizationCount() {
        if (fileChecksumAuthorizationBuilder_ == null) {
          return fileChecksumAuthorization_.size();
        } else {
          return fileChecksumAuthorizationBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public ChunkServer.FileChecksumAuthorization getFileChecksumAuthorization(int index) {
        if (fileChecksumAuthorizationBuilder_ == null) {
          return fileChecksumAuthorization_.get(index);
        } else {
          return fileChecksumAuthorizationBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public Builder setFileChecksumAuthorization(
          int index, ChunkServer.FileChecksumAuthorization value) {
        if (fileChecksumAuthorizationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileChecksumAuthorizationIsMutable();
          fileChecksumAuthorization_.set(index, value);
          onChanged();
        } else {
          fileChecksumAuthorizationBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public Builder setFileChecksumAuthorization(
          int index, ChunkServer.FileChecksumAuthorization.Builder builderForValue) {
        if (fileChecksumAuthorizationBuilder_ == null) {
          ensureFileChecksumAuthorizationIsMutable();
          fileChecksumAuthorization_.set(index, builderForValue.build());
          onChanged();
        } else {
          fileChecksumAuthorizationBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public Builder addFileChecksumAuthorization(ChunkServer.FileChecksumAuthorization value) {
        if (fileChecksumAuthorizationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileChecksumAuthorizationIsMutable();
          fileChecksumAuthorization_.add(value);
          onChanged();
        } else {
          fileChecksumAuthorizationBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public Builder addFileChecksumAuthorization(
          int index, ChunkServer.FileChecksumAuthorization value) {
        if (fileChecksumAuthorizationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileChecksumAuthorizationIsMutable();
          fileChecksumAuthorization_.add(index, value);
          onChanged();
        } else {
          fileChecksumAuthorizationBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public Builder addFileChecksumAuthorization(
          ChunkServer.FileChecksumAuthorization.Builder builderForValue) {
        if (fileChecksumAuthorizationBuilder_ == null) {
          ensureFileChecksumAuthorizationIsMutable();
          fileChecksumAuthorization_.add(builderForValue.build());
          onChanged();
        } else {
          fileChecksumAuthorizationBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public Builder addFileChecksumAuthorization(
          int index, ChunkServer.FileChecksumAuthorization.Builder builderForValue) {
        if (fileChecksumAuthorizationBuilder_ == null) {
          ensureFileChecksumAuthorizationIsMutable();
          fileChecksumAuthorization_.add(index, builderForValue.build());
          onChanged();
        } else {
          fileChecksumAuthorizationBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public Builder addAllFileChecksumAuthorization(
          java.lang.Iterable<? extends ChunkServer.FileChecksumAuthorization> values) {
        if (fileChecksumAuthorizationBuilder_ == null) {
          ensureFileChecksumAuthorizationIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, fileChecksumAuthorization_);
          onChanged();
        } else {
          fileChecksumAuthorizationBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public Builder clearFileChecksumAuthorization() {
        if (fileChecksumAuthorizationBuilder_ == null) {
          fileChecksumAuthorization_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          fileChecksumAuthorizationBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public Builder removeFileChecksumAuthorization(int index) {
        if (fileChecksumAuthorizationBuilder_ == null) {
          ensureFileChecksumAuthorizationIsMutable();
          fileChecksumAuthorization_.remove(index);
          onChanged();
        } else {
          fileChecksumAuthorizationBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public ChunkServer.FileChecksumAuthorization.Builder getFileChecksumAuthorizationBuilder(
          int index) {
        return getFileChecksumAuthorizationFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public ChunkServer.FileChecksumAuthorizationOrBuilder getFileChecksumAuthorizationOrBuilder(
          int index) {
        if (fileChecksumAuthorizationBuilder_ == null) {
          return fileChecksumAuthorization_.get(index);  } else {
          return fileChecksumAuthorizationBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public java.util.List<? extends ChunkServer.FileChecksumAuthorizationOrBuilder> 
           getFileChecksumAuthorizationOrBuilderList() {
        if (fileChecksumAuthorizationBuilder_ != null) {
          return fileChecksumAuthorizationBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(fileChecksumAuthorization_);
        }
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public ChunkServer.FileChecksumAuthorization.Builder addFileChecksumAuthorizationBuilder() {
        return getFileChecksumAuthorizationFieldBuilder().addBuilder(ChunkServer.FileChecksumAuthorization.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public ChunkServer.FileChecksumAuthorization.Builder addFileChecksumAuthorizationBuilder(
          int index) {
        return getFileChecksumAuthorizationFieldBuilder().addBuilder(index, ChunkServer.FileChecksumAuthorization.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.FileChecksumAuthorization file_checksum_authorization = 1;</code>
       */
      public java.util.List<ChunkServer.FileChecksumAuthorization.Builder> 
           getFileChecksumAuthorizationBuilderList() {
        return getFileChecksumAuthorizationFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.FileChecksumAuthorization, ChunkServer.FileChecksumAuthorization.Builder, ChunkServer.FileChecksumAuthorizationOrBuilder> 
          getFileChecksumAuthorizationFieldBuilder() {
        if (fileChecksumAuthorizationBuilder_ == null) {
          fileChecksumAuthorizationBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.FileChecksumAuthorization, ChunkServer.FileChecksumAuthorization.Builder, ChunkServer.FileChecksumAuthorizationOrBuilder>(
                  fileChecksumAuthorization_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          fileChecksumAuthorization_ = null;
        }
        return fileChecksumAuthorizationBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.FileChecksumAuthorizationList)
    }

    static {
      defaultInstance = new FileChecksumAuthorizationList(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.FileChecksumAuthorizationList)
  }

  public interface ChunkReferenceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.ChunkReference)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required uint64 container_index = 1;</code>
     */
    boolean hasContainerIndex();
    /**
     * <code>required uint64 container_index = 1;</code>
     */
    long getContainerIndex();

    /**
     * <code>required uint64 chunk_index = 2;</code>
     */
    boolean hasChunkIndex();
    /**
     * <code>required uint64 chunk_index = 2;</code>
     */
    long getChunkIndex();
  }
  /**
   * Protobuf type {@code chunkserver.ChunkReference}
   */
  public static final class ChunkReference extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.ChunkReference)
      ChunkReferenceOrBuilder {
    // Use ChunkReference.newBuilder() to construct.
    private ChunkReference(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ChunkReference(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ChunkReference defaultInstance;
    public static ChunkReference getDefaultInstance() {
      return defaultInstance;
    }

    public ChunkReference getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ChunkReference(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              containerIndex_ = input.readUInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              chunkIndex_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_ChunkReference_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_ChunkReference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.ChunkReference.class, ChunkServer.ChunkReference.Builder.class);
    }

    public static com.google.protobuf.Parser<ChunkReference> PARSER =
        new com.google.protobuf.AbstractParser<ChunkReference>() {
      public ChunkReference parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChunkReference(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ChunkReference> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int CONTAINER_INDEX_FIELD_NUMBER = 1;
    private long containerIndex_;
    /**
     * <code>required uint64 container_index = 1;</code>
     */
    public boolean hasContainerIndex() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required uint64 container_index = 1;</code>
     */
    public long getContainerIndex() {
      return containerIndex_;
    }

    public static final int CHUNK_INDEX_FIELD_NUMBER = 2;
    private long chunkIndex_;
    /**
     * <code>required uint64 chunk_index = 2;</code>
     */
    public boolean hasChunkIndex() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint64 chunk_index = 2;</code>
     */
    public long getChunkIndex() {
      return chunkIndex_;
    }

    private void initFields() {
      containerIndex_ = 0L;
      chunkIndex_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasContainerIndex()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasChunkIndex()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, containerIndex_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, chunkIndex_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, containerIndex_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, chunkIndex_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.ChunkReference parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.ChunkReference parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.ChunkReference parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.ChunkReference parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.ChunkReference parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.ChunkReference parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.ChunkReference parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.ChunkReference parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.ChunkReference parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.ChunkReference parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.ChunkReference prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.ChunkReference}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.ChunkReference)
        ChunkServer.ChunkReferenceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_ChunkReference_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_ChunkReference_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.ChunkReference.class, ChunkServer.ChunkReference.Builder.class);
      }

      // Construct using Chunkserver.ChunkReference.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        containerIndex_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        chunkIndex_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_ChunkReference_descriptor;
      }

      public ChunkServer.ChunkReference getDefaultInstanceForType() {
        return ChunkServer.ChunkReference.getDefaultInstance();
      }

      public ChunkServer.ChunkReference build() {
        ChunkServer.ChunkReference result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.ChunkReference buildPartial() {
        ChunkServer.ChunkReference result = new ChunkServer.ChunkReference(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.containerIndex_ = containerIndex_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.chunkIndex_ = chunkIndex_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.ChunkReference) {
          return mergeFrom((ChunkServer.ChunkReference)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.ChunkReference other) {
        if (other == ChunkServer.ChunkReference.getDefaultInstance()) return this;
        if (other.hasContainerIndex()) {
          setContainerIndex(other.getContainerIndex());
        }
        if (other.hasChunkIndex()) {
          setChunkIndex(other.getChunkIndex());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasContainerIndex()) {
          
          return false;
        }
        if (!hasChunkIndex()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.ChunkReference parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.ChunkReference) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long containerIndex_ ;
      /**
       * <code>required uint64 container_index = 1;</code>
       */
      public boolean hasContainerIndex() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required uint64 container_index = 1;</code>
       */
      public long getContainerIndex() {
        return containerIndex_;
      }
      /**
       * <code>required uint64 container_index = 1;</code>
       */
      public Builder setContainerIndex(long value) {
        bitField0_ |= 0x00000001;
        containerIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 container_index = 1;</code>
       */
      public Builder clearContainerIndex() {
        bitField0_ = (bitField0_ & ~0x00000001);
        containerIndex_ = 0L;
        onChanged();
        return this;
      }

      private long chunkIndex_ ;
      /**
       * <code>required uint64 chunk_index = 2;</code>
       */
      public boolean hasChunkIndex() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint64 chunk_index = 2;</code>
       */
      public long getChunkIndex() {
        return chunkIndex_;
      }
      /**
       * <code>required uint64 chunk_index = 2;</code>
       */
      public Builder setChunkIndex(long value) {
        bitField0_ |= 0x00000002;
        chunkIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 chunk_index = 2;</code>
       */
      public Builder clearChunkIndex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        chunkIndex_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.ChunkReference)
    }

    static {
      defaultInstance = new ChunkReference(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.ChunkReference)
  }

  public interface FileChecksumChunkReferencesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.FileChecksumChunkReferences)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    boolean hasFileChecksum();
    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    com.google.protobuf.ByteString getFileChecksum();

    /**
     * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
     */
    java.util.List<ChunkServer.ChunkReference> 
        getChunkReferencesList();
    /**
     * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
     */
    ChunkServer.ChunkReference getChunkReferences(int index);
    /**
     * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
     */
    int getChunkReferencesCount();
    /**
     * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
     */
    java.util.List<? extends ChunkServer.ChunkReferenceOrBuilder> 
        getChunkReferencesOrBuilderList();
    /**
     * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
     */
    ChunkServer.ChunkReferenceOrBuilder getChunkReferencesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code chunkserver.FileChecksumChunkReferences}
   */
  public static final class FileChecksumChunkReferences extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.FileChecksumChunkReferences)
      FileChecksumChunkReferencesOrBuilder {
    // Use FileChecksumChunkReferences.newBuilder() to construct.
    private FileChecksumChunkReferences(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private FileChecksumChunkReferences(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final FileChecksumChunkReferences defaultInstance;
    public static FileChecksumChunkReferences getDefaultInstance() {
      return defaultInstance;
    }

    public FileChecksumChunkReferences getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private FileChecksumChunkReferences(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              fileChecksum_ = input.readBytes();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                chunkReferences_ = new java.util.ArrayList<ChunkServer.ChunkReference>();
                mutable_bitField0_ |= 0x00000002;
              }
              chunkReferences_.add(input.readMessage(ChunkServer.ChunkReference.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          chunkReferences_ = java.util.Collections.unmodifiableList(chunkReferences_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_FileChecksumChunkReferences_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_FileChecksumChunkReferences_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.FileChecksumChunkReferences.class, ChunkServer.FileChecksumChunkReferences.Builder.class);
    }

    public static com.google.protobuf.Parser<FileChecksumChunkReferences> PARSER =
        new com.google.protobuf.AbstractParser<FileChecksumChunkReferences>() {
      public FileChecksumChunkReferences parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileChecksumChunkReferences(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<FileChecksumChunkReferences> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FILE_CHECKSUM_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString fileChecksum_;
    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    public boolean hasFileChecksum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bytes file_checksum = 1;</code>
     */
    public com.google.protobuf.ByteString getFileChecksum() {
      return fileChecksum_;
    }

    public static final int CHUNK_REFERENCES_FIELD_NUMBER = 2;
    private java.util.List<ChunkServer.ChunkReference> chunkReferences_;
    /**
     * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
     */
    public java.util.List<ChunkServer.ChunkReference> getChunkReferencesList() {
      return chunkReferences_;
    }
    /**
     * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
     */
    public java.util.List<? extends ChunkServer.ChunkReferenceOrBuilder> 
        getChunkReferencesOrBuilderList() {
      return chunkReferences_;
    }
    /**
     * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
     */
    public int getChunkReferencesCount() {
      return chunkReferences_.size();
    }
    /**
     * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
     */
    public ChunkServer.ChunkReference getChunkReferences(int index) {
      return chunkReferences_.get(index);
    }
    /**
     * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
     */
    public ChunkServer.ChunkReferenceOrBuilder getChunkReferencesOrBuilder(
        int index) {
      return chunkReferences_.get(index);
    }

    private void initFields() {
      fileChecksum_ = com.google.protobuf.ByteString.EMPTY;
      chunkReferences_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasFileChecksum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getChunkReferencesCount(); i++) {
        if (!getChunkReferences(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, fileChecksum_);
      }
      for (int i = 0; i < chunkReferences_.size(); i++) {
        output.writeMessage(2, chunkReferences_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, fileChecksum_);
      }
      for (int i = 0; i < chunkReferences_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, chunkReferences_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.FileChecksumChunkReferences parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileChecksumChunkReferences parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileChecksumChunkReferences parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileChecksumChunkReferences parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileChecksumChunkReferences parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileChecksumChunkReferences parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileChecksumChunkReferences parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.FileChecksumChunkReferences parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileChecksumChunkReferences parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileChecksumChunkReferences parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.FileChecksumChunkReferences prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.FileChecksumChunkReferences}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.FileChecksumChunkReferences)
        ChunkServer.FileChecksumChunkReferencesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_FileChecksumChunkReferences_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_FileChecksumChunkReferences_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.FileChecksumChunkReferences.class, ChunkServer.FileChecksumChunkReferences.Builder.class);
      }

      // Construct using Chunkserver.FileChecksumChunkReferences.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getChunkReferencesFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        fileChecksum_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (chunkReferencesBuilder_ == null) {
          chunkReferences_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          chunkReferencesBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_FileChecksumChunkReferences_descriptor;
      }

      public ChunkServer.FileChecksumChunkReferences getDefaultInstanceForType() {
        return ChunkServer.FileChecksumChunkReferences.getDefaultInstance();
      }

      public ChunkServer.FileChecksumChunkReferences build() {
        ChunkServer.FileChecksumChunkReferences result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.FileChecksumChunkReferences buildPartial() {
        ChunkServer.FileChecksumChunkReferences result = new ChunkServer.FileChecksumChunkReferences(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.fileChecksum_ = fileChecksum_;
        if (chunkReferencesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            chunkReferences_ = java.util.Collections.unmodifiableList(chunkReferences_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.chunkReferences_ = chunkReferences_;
        } else {
          result.chunkReferences_ = chunkReferencesBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.FileChecksumChunkReferences) {
          return mergeFrom((ChunkServer.FileChecksumChunkReferences)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.FileChecksumChunkReferences other) {
        if (other == ChunkServer.FileChecksumChunkReferences.getDefaultInstance()) return this;
        if (other.hasFileChecksum()) {
          setFileChecksum(other.getFileChecksum());
        }
        if (chunkReferencesBuilder_ == null) {
          if (!other.chunkReferences_.isEmpty()) {
            if (chunkReferences_.isEmpty()) {
              chunkReferences_ = other.chunkReferences_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureChunkReferencesIsMutable();
              chunkReferences_.addAll(other.chunkReferences_);
            }
            onChanged();
          }
        } else {
          if (!other.chunkReferences_.isEmpty()) {
            if (chunkReferencesBuilder_.isEmpty()) {
              chunkReferencesBuilder_.dispose();
              chunkReferencesBuilder_ = null;
              chunkReferences_ = other.chunkReferences_;
              bitField0_ = (bitField0_ & ~0x00000002);
              chunkReferencesBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getChunkReferencesFieldBuilder() : null;
            } else {
              chunkReferencesBuilder_.addAllMessages(other.chunkReferences_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasFileChecksum()) {
          
          return false;
        }
        for (int i = 0; i < getChunkReferencesCount(); i++) {
          if (!getChunkReferences(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.FileChecksumChunkReferences parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.FileChecksumChunkReferences) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString fileChecksum_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public boolean hasFileChecksum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public com.google.protobuf.ByteString getFileChecksum() {
        return fileChecksum_;
      }
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public Builder setFileChecksum(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        fileChecksum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes file_checksum = 1;</code>
       */
      public Builder clearFileChecksum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fileChecksum_ = getDefaultInstance().getFileChecksum();
        onChanged();
        return this;
      }

      private java.util.List<ChunkServer.ChunkReference> chunkReferences_ =
        java.util.Collections.emptyList();
      private void ensureChunkReferencesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          chunkReferences_ = new java.util.ArrayList<ChunkServer.ChunkReference>(chunkReferences_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.ChunkReference, ChunkServer.ChunkReference.Builder, ChunkServer.ChunkReferenceOrBuilder> chunkReferencesBuilder_;

      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public java.util.List<ChunkServer.ChunkReference> getChunkReferencesList() {
        if (chunkReferencesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(chunkReferences_);
        } else {
          return chunkReferencesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public int getChunkReferencesCount() {
        if (chunkReferencesBuilder_ == null) {
          return chunkReferences_.size();
        } else {
          return chunkReferencesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public ChunkServer.ChunkReference getChunkReferences(int index) {
        if (chunkReferencesBuilder_ == null) {
          return chunkReferences_.get(index);
        } else {
          return chunkReferencesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public Builder setChunkReferences(
          int index, ChunkServer.ChunkReference value) {
        if (chunkReferencesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunkReferencesIsMutable();
          chunkReferences_.set(index, value);
          onChanged();
        } else {
          chunkReferencesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public Builder setChunkReferences(
          int index, ChunkServer.ChunkReference.Builder builderForValue) {
        if (chunkReferencesBuilder_ == null) {
          ensureChunkReferencesIsMutable();
          chunkReferences_.set(index, builderForValue.build());
          onChanged();
        } else {
          chunkReferencesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public Builder addChunkReferences(ChunkServer.ChunkReference value) {
        if (chunkReferencesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunkReferencesIsMutable();
          chunkReferences_.add(value);
          onChanged();
        } else {
          chunkReferencesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public Builder addChunkReferences(
          int index, ChunkServer.ChunkReference value) {
        if (chunkReferencesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunkReferencesIsMutable();
          chunkReferences_.add(index, value);
          onChanged();
        } else {
          chunkReferencesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public Builder addChunkReferences(
          ChunkServer.ChunkReference.Builder builderForValue) {
        if (chunkReferencesBuilder_ == null) {
          ensureChunkReferencesIsMutable();
          chunkReferences_.add(builderForValue.build());
          onChanged();
        } else {
          chunkReferencesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public Builder addChunkReferences(
          int index, ChunkServer.ChunkReference.Builder builderForValue) {
        if (chunkReferencesBuilder_ == null) {
          ensureChunkReferencesIsMutable();
          chunkReferences_.add(index, builderForValue.build());
          onChanged();
        } else {
          chunkReferencesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public Builder addAllChunkReferences(
          java.lang.Iterable<? extends ChunkServer.ChunkReference> values) {
        if (chunkReferencesBuilder_ == null) {
          ensureChunkReferencesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, chunkReferences_);
          onChanged();
        } else {
          chunkReferencesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public Builder clearChunkReferences() {
        if (chunkReferencesBuilder_ == null) {
          chunkReferences_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          chunkReferencesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public Builder removeChunkReferences(int index) {
        if (chunkReferencesBuilder_ == null) {
          ensureChunkReferencesIsMutable();
          chunkReferences_.remove(index);
          onChanged();
        } else {
          chunkReferencesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public ChunkServer.ChunkReference.Builder getChunkReferencesBuilder(
          int index) {
        return getChunkReferencesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public ChunkServer.ChunkReferenceOrBuilder getChunkReferencesOrBuilder(
          int index) {
        if (chunkReferencesBuilder_ == null) {
          return chunkReferences_.get(index);  } else {
          return chunkReferencesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public java.util.List<? extends ChunkServer.ChunkReferenceOrBuilder> 
           getChunkReferencesOrBuilderList() {
        if (chunkReferencesBuilder_ != null) {
          return chunkReferencesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(chunkReferences_);
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public ChunkServer.ChunkReference.Builder addChunkReferencesBuilder() {
        return getChunkReferencesFieldBuilder().addBuilder(ChunkServer.ChunkReference.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public ChunkServer.ChunkReference.Builder addChunkReferencesBuilder(
          int index) {
        return getChunkReferencesFieldBuilder().addBuilder(index, ChunkServer.ChunkReference.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.ChunkReference chunk_references = 2;</code>
       */
      public java.util.List<ChunkServer.ChunkReference.Builder> 
           getChunkReferencesBuilderList() {
        return getChunkReferencesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.ChunkReference, ChunkServer.ChunkReference.Builder, ChunkServer.ChunkReferenceOrBuilder> 
          getChunkReferencesFieldBuilder() {
        if (chunkReferencesBuilder_ == null) {
          chunkReferencesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.ChunkReference, ChunkServer.ChunkReference.Builder, ChunkServer.ChunkReferenceOrBuilder>(
                  chunkReferences_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          chunkReferences_ = null;
        }
        return chunkReferencesBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.FileChecksumChunkReferences)
    }

    static {
      defaultInstance = new FileChecksumChunkReferences(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.FileChecksumChunkReferences)
  }

  public interface FileChecksumStorageHostChunkListsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.FileChecksumStorageHostChunkLists)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    java.util.List<ChunkServer.StorageHostChunkList> 
        getStorageHostChunkListList();
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    ChunkServer.StorageHostChunkList getStorageHostChunkList(int index);
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    int getStorageHostChunkListCount();
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    java.util.List<? extends ChunkServer.StorageHostChunkListOrBuilder> 
        getStorageHostChunkListOrBuilderList();
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    ChunkServer.StorageHostChunkListOrBuilder getStorageHostChunkListOrBuilder(
        int index);

    /**
     * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
     */
    java.util.List<ChunkServer.FileChecksumChunkReferences> 
        getFileChecksumChunkReferencesList();
    /**
     * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
     */
    ChunkServer.FileChecksumChunkReferences getFileChecksumChunkReferences(int index);
    /**
     * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
     */
    int getFileChecksumChunkReferencesCount();
    /**
     * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
     */
    java.util.List<? extends ChunkServer.FileChecksumChunkReferencesOrBuilder> 
        getFileChecksumChunkReferencesOrBuilderList();
    /**
     * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
     */
    ChunkServer.FileChecksumChunkReferencesOrBuilder getFileChecksumChunkReferencesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code chunkserver.FileChecksumStorageHostChunkLists}
   */
  public static final class FileChecksumStorageHostChunkLists extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.FileChecksumStorageHostChunkLists)
      FileChecksumStorageHostChunkListsOrBuilder {
    // Use FileChecksumStorageHostChunkLists.newBuilder() to construct.
    private FileChecksumStorageHostChunkLists(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private FileChecksumStorageHostChunkLists(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final FileChecksumStorageHostChunkLists defaultInstance;
    public static FileChecksumStorageHostChunkLists getDefaultInstance() {
      return defaultInstance;
    }

    public FileChecksumStorageHostChunkLists getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private FileChecksumStorageHostChunkLists(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                storageHostChunkList_ = new java.util.ArrayList<ChunkServer.StorageHostChunkList>();
                mutable_bitField0_ |= 0x00000001;
              }
              storageHostChunkList_.add(input.readMessage(ChunkServer.StorageHostChunkList.PARSER, extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                fileChecksumChunkReferences_ = new java.util.ArrayList<ChunkServer.FileChecksumChunkReferences>();
                mutable_bitField0_ |= 0x00000002;
              }
              fileChecksumChunkReferences_.add(input.readMessage(ChunkServer.FileChecksumChunkReferences.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          storageHostChunkList_ = java.util.Collections.unmodifiableList(storageHostChunkList_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          fileChecksumChunkReferences_ = java.util.Collections.unmodifiableList(fileChecksumChunkReferences_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_FileChecksumStorageHostChunkLists_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_FileChecksumStorageHostChunkLists_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.FileChecksumStorageHostChunkLists.class, ChunkServer.FileChecksumStorageHostChunkLists.Builder.class);
    }

    public static com.google.protobuf.Parser<FileChecksumStorageHostChunkLists> PARSER =
        new com.google.protobuf.AbstractParser<FileChecksumStorageHostChunkLists>() {
      public FileChecksumStorageHostChunkLists parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileChecksumStorageHostChunkLists(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<FileChecksumStorageHostChunkLists> getParserForType() {
      return PARSER;
    }

    public static final int STORAGE_HOST_CHUNK_LIST_FIELD_NUMBER = 1;
    private java.util.List<ChunkServer.StorageHostChunkList> storageHostChunkList_;
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    public java.util.List<ChunkServer.StorageHostChunkList> getStorageHostChunkListList() {
      return storageHostChunkList_;
    }
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    public java.util.List<? extends ChunkServer.StorageHostChunkListOrBuilder> 
        getStorageHostChunkListOrBuilderList() {
      return storageHostChunkList_;
    }
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    public int getStorageHostChunkListCount() {
      return storageHostChunkList_.size();
    }
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    public ChunkServer.StorageHostChunkList getStorageHostChunkList(int index) {
      return storageHostChunkList_.get(index);
    }
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    public ChunkServer.StorageHostChunkListOrBuilder getStorageHostChunkListOrBuilder(
        int index) {
      return storageHostChunkList_.get(index);
    }

    public static final int FILE_CHECKSUM_CHUNK_REFERENCES_FIELD_NUMBER = 2;
    private java.util.List<ChunkServer.FileChecksumChunkReferences> fileChecksumChunkReferences_;
    /**
     * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
     */
    public java.util.List<ChunkServer.FileChecksumChunkReferences> getFileChecksumChunkReferencesList() {
      return fileChecksumChunkReferences_;
    }
    /**
     * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
     */
    public java.util.List<? extends ChunkServer.FileChecksumChunkReferencesOrBuilder> 
        getFileChecksumChunkReferencesOrBuilderList() {
      return fileChecksumChunkReferences_;
    }
    /**
     * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
     */
    public int getFileChecksumChunkReferencesCount() {
      return fileChecksumChunkReferences_.size();
    }
    /**
     * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
     */
    public ChunkServer.FileChecksumChunkReferences getFileChecksumChunkReferences(int index) {
      return fileChecksumChunkReferences_.get(index);
    }
    /**
     * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
     */
    public ChunkServer.FileChecksumChunkReferencesOrBuilder getFileChecksumChunkReferencesOrBuilder(
        int index) {
      return fileChecksumChunkReferences_.get(index);
    }

    private void initFields() {
      storageHostChunkList_ = java.util.Collections.emptyList();
      fileChecksumChunkReferences_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getStorageHostChunkListCount(); i++) {
        if (!getStorageHostChunkList(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getFileChecksumChunkReferencesCount(); i++) {
        if (!getFileChecksumChunkReferences(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < storageHostChunkList_.size(); i++) {
        output.writeMessage(1, storageHostChunkList_.get(i));
      }
      for (int i = 0; i < fileChecksumChunkReferences_.size(); i++) {
        output.writeMessage(2, fileChecksumChunkReferences_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < storageHostChunkList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, storageHostChunkList_.get(i));
      }
      for (int i = 0; i < fileChecksumChunkReferences_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, fileChecksumChunkReferences_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.FileChecksumStorageHostChunkLists parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileChecksumStorageHostChunkLists parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileChecksumStorageHostChunkLists parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileChecksumStorageHostChunkLists parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileChecksumStorageHostChunkLists parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileChecksumStorageHostChunkLists parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileChecksumStorageHostChunkLists parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.FileChecksumStorageHostChunkLists parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileChecksumStorageHostChunkLists parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileChecksumStorageHostChunkLists parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.FileChecksumStorageHostChunkLists prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.FileChecksumStorageHostChunkLists}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.FileChecksumStorageHostChunkLists)
        ChunkServer.FileChecksumStorageHostChunkListsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_FileChecksumStorageHostChunkLists_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_FileChecksumStorageHostChunkLists_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.FileChecksumStorageHostChunkLists.class, ChunkServer.FileChecksumStorageHostChunkLists.Builder.class);
      }

      // Construct using Chunkserver.FileChecksumStorageHostChunkLists.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getStorageHostChunkListFieldBuilder();
          getFileChecksumChunkReferencesFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (storageHostChunkListBuilder_ == null) {
          storageHostChunkList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          storageHostChunkListBuilder_.clear();
        }
        if (fileChecksumChunkReferencesBuilder_ == null) {
          fileChecksumChunkReferences_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          fileChecksumChunkReferencesBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_FileChecksumStorageHostChunkLists_descriptor;
      }

      public ChunkServer.FileChecksumStorageHostChunkLists getDefaultInstanceForType() {
        return ChunkServer.FileChecksumStorageHostChunkLists.getDefaultInstance();
      }

      public ChunkServer.FileChecksumStorageHostChunkLists build() {
        ChunkServer.FileChecksumStorageHostChunkLists result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.FileChecksumStorageHostChunkLists buildPartial() {
        ChunkServer.FileChecksumStorageHostChunkLists result = new ChunkServer.FileChecksumStorageHostChunkLists(this);
        int from_bitField0_ = bitField0_;
        if (storageHostChunkListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            storageHostChunkList_ = java.util.Collections.unmodifiableList(storageHostChunkList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.storageHostChunkList_ = storageHostChunkList_;
        } else {
          result.storageHostChunkList_ = storageHostChunkListBuilder_.build();
        }
        if (fileChecksumChunkReferencesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            fileChecksumChunkReferences_ = java.util.Collections.unmodifiableList(fileChecksumChunkReferences_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.fileChecksumChunkReferences_ = fileChecksumChunkReferences_;
        } else {
          result.fileChecksumChunkReferences_ = fileChecksumChunkReferencesBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.FileChecksumStorageHostChunkLists) {
          return mergeFrom((ChunkServer.FileChecksumStorageHostChunkLists)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.FileChecksumStorageHostChunkLists other) {
        if (other == ChunkServer.FileChecksumStorageHostChunkLists.getDefaultInstance()) return this;
        if (storageHostChunkListBuilder_ == null) {
          if (!other.storageHostChunkList_.isEmpty()) {
            if (storageHostChunkList_.isEmpty()) {
              storageHostChunkList_ = other.storageHostChunkList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureStorageHostChunkListIsMutable();
              storageHostChunkList_.addAll(other.storageHostChunkList_);
            }
            onChanged();
          }
        } else {
          if (!other.storageHostChunkList_.isEmpty()) {
            if (storageHostChunkListBuilder_.isEmpty()) {
              storageHostChunkListBuilder_.dispose();
              storageHostChunkListBuilder_ = null;
              storageHostChunkList_ = other.storageHostChunkList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              storageHostChunkListBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getStorageHostChunkListFieldBuilder() : null;
            } else {
              storageHostChunkListBuilder_.addAllMessages(other.storageHostChunkList_);
            }
          }
        }
        if (fileChecksumChunkReferencesBuilder_ == null) {
          if (!other.fileChecksumChunkReferences_.isEmpty()) {
            if (fileChecksumChunkReferences_.isEmpty()) {
              fileChecksumChunkReferences_ = other.fileChecksumChunkReferences_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureFileChecksumChunkReferencesIsMutable();
              fileChecksumChunkReferences_.addAll(other.fileChecksumChunkReferences_);
            }
            onChanged();
          }
        } else {
          if (!other.fileChecksumChunkReferences_.isEmpty()) {
            if (fileChecksumChunkReferencesBuilder_.isEmpty()) {
              fileChecksumChunkReferencesBuilder_.dispose();
              fileChecksumChunkReferencesBuilder_ = null;
              fileChecksumChunkReferences_ = other.fileChecksumChunkReferences_;
              bitField0_ = (bitField0_ & ~0x00000002);
              fileChecksumChunkReferencesBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getFileChecksumChunkReferencesFieldBuilder() : null;
            } else {
              fileChecksumChunkReferencesBuilder_.addAllMessages(other.fileChecksumChunkReferences_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getStorageHostChunkListCount(); i++) {
          if (!getStorageHostChunkList(i).isInitialized()) {
            
            return false;
          }
        }
        for (int i = 0; i < getFileChecksumChunkReferencesCount(); i++) {
          if (!getFileChecksumChunkReferences(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.FileChecksumStorageHostChunkLists parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.FileChecksumStorageHostChunkLists) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<ChunkServer.StorageHostChunkList> storageHostChunkList_ =
        java.util.Collections.emptyList();
      private void ensureStorageHostChunkListIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          storageHostChunkList_ = new java.util.ArrayList<ChunkServer.StorageHostChunkList>(storageHostChunkList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.StorageHostChunkList, ChunkServer.StorageHostChunkList.Builder, ChunkServer.StorageHostChunkListOrBuilder> storageHostChunkListBuilder_;

      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public java.util.List<ChunkServer.StorageHostChunkList> getStorageHostChunkListList() {
        if (storageHostChunkListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(storageHostChunkList_);
        } else {
          return storageHostChunkListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public int getStorageHostChunkListCount() {
        if (storageHostChunkListBuilder_ == null) {
          return storageHostChunkList_.size();
        } else {
          return storageHostChunkListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public ChunkServer.StorageHostChunkList getStorageHostChunkList(int index) {
        if (storageHostChunkListBuilder_ == null) {
          return storageHostChunkList_.get(index);
        } else {
          return storageHostChunkListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder setStorageHostChunkList(
          int index, ChunkServer.StorageHostChunkList value) {
        if (storageHostChunkListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStorageHostChunkListIsMutable();
          storageHostChunkList_.set(index, value);
          onChanged();
        } else {
          storageHostChunkListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder setStorageHostChunkList(
          int index, ChunkServer.StorageHostChunkList.Builder builderForValue) {
        if (storageHostChunkListBuilder_ == null) {
          ensureStorageHostChunkListIsMutable();
          storageHostChunkList_.set(index, builderForValue.build());
          onChanged();
        } else {
          storageHostChunkListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder addStorageHostChunkList(ChunkServer.StorageHostChunkList value) {
        if (storageHostChunkListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStorageHostChunkListIsMutable();
          storageHostChunkList_.add(value);
          onChanged();
        } else {
          storageHostChunkListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder addStorageHostChunkList(
          int index, ChunkServer.StorageHostChunkList value) {
        if (storageHostChunkListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStorageHostChunkListIsMutable();
          storageHostChunkList_.add(index, value);
          onChanged();
        } else {
          storageHostChunkListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder addStorageHostChunkList(
          ChunkServer.StorageHostChunkList.Builder builderForValue) {
        if (storageHostChunkListBuilder_ == null) {
          ensureStorageHostChunkListIsMutable();
          storageHostChunkList_.add(builderForValue.build());
          onChanged();
        } else {
          storageHostChunkListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder addStorageHostChunkList(
          int index, ChunkServer.StorageHostChunkList.Builder builderForValue) {
        if (storageHostChunkListBuilder_ == null) {
          ensureStorageHostChunkListIsMutable();
          storageHostChunkList_.add(index, builderForValue.build());
          onChanged();
        } else {
          storageHostChunkListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder addAllStorageHostChunkList(
          java.lang.Iterable<? extends ChunkServer.StorageHostChunkList> values) {
        if (storageHostChunkListBuilder_ == null) {
          ensureStorageHostChunkListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, storageHostChunkList_);
          onChanged();
        } else {
          storageHostChunkListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder clearStorageHostChunkList() {
        if (storageHostChunkListBuilder_ == null) {
          storageHostChunkList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          storageHostChunkListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder removeStorageHostChunkList(int index) {
        if (storageHostChunkListBuilder_ == null) {
          ensureStorageHostChunkListIsMutable();
          storageHostChunkList_.remove(index);
          onChanged();
        } else {
          storageHostChunkListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public ChunkServer.StorageHostChunkList.Builder getStorageHostChunkListBuilder(
          int index) {
        return getStorageHostChunkListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public ChunkServer.StorageHostChunkListOrBuilder getStorageHostChunkListOrBuilder(
          int index) {
        if (storageHostChunkListBuilder_ == null) {
          return storageHostChunkList_.get(index);  } else {
          return storageHostChunkListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public java.util.List<? extends ChunkServer.StorageHostChunkListOrBuilder> 
           getStorageHostChunkListOrBuilderList() {
        if (storageHostChunkListBuilder_ != null) {
          return storageHostChunkListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(storageHostChunkList_);
        }
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public ChunkServer.StorageHostChunkList.Builder addStorageHostChunkListBuilder() {
        return getStorageHostChunkListFieldBuilder().addBuilder(ChunkServer.StorageHostChunkList.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public ChunkServer.StorageHostChunkList.Builder addStorageHostChunkListBuilder(
          int index) {
        return getStorageHostChunkListFieldBuilder().addBuilder(index, ChunkServer.StorageHostChunkList.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public java.util.List<ChunkServer.StorageHostChunkList.Builder> 
           getStorageHostChunkListBuilderList() {
        return getStorageHostChunkListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.StorageHostChunkList, ChunkServer.StorageHostChunkList.Builder, ChunkServer.StorageHostChunkListOrBuilder> 
          getStorageHostChunkListFieldBuilder() {
        if (storageHostChunkListBuilder_ == null) {
          storageHostChunkListBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.StorageHostChunkList, ChunkServer.StorageHostChunkList.Builder, ChunkServer.StorageHostChunkListOrBuilder>(
                  storageHostChunkList_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          storageHostChunkList_ = null;
        }
        return storageHostChunkListBuilder_;
      }

      private java.util.List<ChunkServer.FileChecksumChunkReferences> fileChecksumChunkReferences_ =
        java.util.Collections.emptyList();
      private void ensureFileChecksumChunkReferencesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          fileChecksumChunkReferences_ = new java.util.ArrayList<ChunkServer.FileChecksumChunkReferences>(fileChecksumChunkReferences_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.FileChecksumChunkReferences, ChunkServer.FileChecksumChunkReferences.Builder, ChunkServer.FileChecksumChunkReferencesOrBuilder> fileChecksumChunkReferencesBuilder_;

      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public java.util.List<ChunkServer.FileChecksumChunkReferences> getFileChecksumChunkReferencesList() {
        if (fileChecksumChunkReferencesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(fileChecksumChunkReferences_);
        } else {
          return fileChecksumChunkReferencesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public int getFileChecksumChunkReferencesCount() {
        if (fileChecksumChunkReferencesBuilder_ == null) {
          return fileChecksumChunkReferences_.size();
        } else {
          return fileChecksumChunkReferencesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public ChunkServer.FileChecksumChunkReferences getFileChecksumChunkReferences(int index) {
        if (fileChecksumChunkReferencesBuilder_ == null) {
          return fileChecksumChunkReferences_.get(index);
        } else {
          return fileChecksumChunkReferencesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public Builder setFileChecksumChunkReferences(
          int index, ChunkServer.FileChecksumChunkReferences value) {
        if (fileChecksumChunkReferencesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileChecksumChunkReferencesIsMutable();
          fileChecksumChunkReferences_.set(index, value);
          onChanged();
        } else {
          fileChecksumChunkReferencesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public Builder setFileChecksumChunkReferences(
          int index, ChunkServer.FileChecksumChunkReferences.Builder builderForValue) {
        if (fileChecksumChunkReferencesBuilder_ == null) {
          ensureFileChecksumChunkReferencesIsMutable();
          fileChecksumChunkReferences_.set(index, builderForValue.build());
          onChanged();
        } else {
          fileChecksumChunkReferencesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public Builder addFileChecksumChunkReferences(ChunkServer.FileChecksumChunkReferences value) {
        if (fileChecksumChunkReferencesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileChecksumChunkReferencesIsMutable();
          fileChecksumChunkReferences_.add(value);
          onChanged();
        } else {
          fileChecksumChunkReferencesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public Builder addFileChecksumChunkReferences(
          int index, ChunkServer.FileChecksumChunkReferences value) {
        if (fileChecksumChunkReferencesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileChecksumChunkReferencesIsMutable();
          fileChecksumChunkReferences_.add(index, value);
          onChanged();
        } else {
          fileChecksumChunkReferencesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public Builder addFileChecksumChunkReferences(
          ChunkServer.FileChecksumChunkReferences.Builder builderForValue) {
        if (fileChecksumChunkReferencesBuilder_ == null) {
          ensureFileChecksumChunkReferencesIsMutable();
          fileChecksumChunkReferences_.add(builderForValue.build());
          onChanged();
        } else {
          fileChecksumChunkReferencesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public Builder addFileChecksumChunkReferences(
          int index, ChunkServer.FileChecksumChunkReferences.Builder builderForValue) {
        if (fileChecksumChunkReferencesBuilder_ == null) {
          ensureFileChecksumChunkReferencesIsMutable();
          fileChecksumChunkReferences_.add(index, builderForValue.build());
          onChanged();
        } else {
          fileChecksumChunkReferencesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public Builder addAllFileChecksumChunkReferences(
          java.lang.Iterable<? extends ChunkServer.FileChecksumChunkReferences> values) {
        if (fileChecksumChunkReferencesBuilder_ == null) {
          ensureFileChecksumChunkReferencesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, fileChecksumChunkReferences_);
          onChanged();
        } else {
          fileChecksumChunkReferencesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public Builder clearFileChecksumChunkReferences() {
        if (fileChecksumChunkReferencesBuilder_ == null) {
          fileChecksumChunkReferences_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          fileChecksumChunkReferencesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public Builder removeFileChecksumChunkReferences(int index) {
        if (fileChecksumChunkReferencesBuilder_ == null) {
          ensureFileChecksumChunkReferencesIsMutable();
          fileChecksumChunkReferences_.remove(index);
          onChanged();
        } else {
          fileChecksumChunkReferencesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public ChunkServer.FileChecksumChunkReferences.Builder getFileChecksumChunkReferencesBuilder(
          int index) {
        return getFileChecksumChunkReferencesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public ChunkServer.FileChecksumChunkReferencesOrBuilder getFileChecksumChunkReferencesOrBuilder(
          int index) {
        if (fileChecksumChunkReferencesBuilder_ == null) {
          return fileChecksumChunkReferences_.get(index);  } else {
          return fileChecksumChunkReferencesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public java.util.List<? extends ChunkServer.FileChecksumChunkReferencesOrBuilder> 
           getFileChecksumChunkReferencesOrBuilderList() {
        if (fileChecksumChunkReferencesBuilder_ != null) {
          return fileChecksumChunkReferencesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(fileChecksumChunkReferences_);
        }
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public ChunkServer.FileChecksumChunkReferences.Builder addFileChecksumChunkReferencesBuilder() {
        return getFileChecksumChunkReferencesFieldBuilder().addBuilder(ChunkServer.FileChecksumChunkReferences.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public ChunkServer.FileChecksumChunkReferences.Builder addFileChecksumChunkReferencesBuilder(
          int index) {
        return getFileChecksumChunkReferencesFieldBuilder().addBuilder(index, ChunkServer.FileChecksumChunkReferences.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.FileChecksumChunkReferences file_checksum_chunk_references = 2;</code>
       */
      public java.util.List<ChunkServer.FileChecksumChunkReferences.Builder> 
           getFileChecksumChunkReferencesBuilderList() {
        return getFileChecksumChunkReferencesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.FileChecksumChunkReferences, ChunkServer.FileChecksumChunkReferences.Builder, ChunkServer.FileChecksumChunkReferencesOrBuilder> 
          getFileChecksumChunkReferencesFieldBuilder() {
        if (fileChecksumChunkReferencesBuilder_ == null) {
          fileChecksumChunkReferencesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.FileChecksumChunkReferences, ChunkServer.FileChecksumChunkReferences.Builder, ChunkServer.FileChecksumChunkReferencesOrBuilder>(
                  fileChecksumChunkReferences_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          fileChecksumChunkReferences_ = null;
        }
        return fileChecksumChunkReferencesBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.FileChecksumStorageHostChunkLists)
    }

    static {
      defaultInstance = new FileChecksumStorageHostChunkLists(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.FileChecksumStorageHostChunkLists)
  }

  public interface FileGroupsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.FileGroups)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
     */
    java.util.List<ChunkServer.FileChecksumStorageHostChunkLists> 
        getFileGroupsList();
    /**
     * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
     */
    ChunkServer.FileChecksumStorageHostChunkLists getFileGroups(int index);
    /**
     * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
     */
    int getFileGroupsCount();
    /**
     * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
     */
    java.util.List<? extends ChunkServer.FileChecksumStorageHostChunkListsOrBuilder> 
        getFileGroupsOrBuilderList();
    /**
     * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
     */
    ChunkServer.FileChecksumStorageHostChunkListsOrBuilder getFileGroupsOrBuilder(
        int index);

    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    java.util.List<ChunkServer.FileError> 
        getFileErrorList();
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    ChunkServer.FileError getFileError(int index);
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    int getFileErrorCount();
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    java.util.List<? extends ChunkServer.FileErrorOrBuilder> 
        getFileErrorOrBuilderList();
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    ChunkServer.FileErrorOrBuilder getFileErrorOrBuilder(
        int index);

    /**
     * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
     */
    java.util.List<ChunkServer.FileChunkError> 
        getFileChunkErrorList();
    /**
     * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
     */
    ChunkServer.FileChunkError getFileChunkError(int index);
    /**
     * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
     */
    int getFileChunkErrorCount();
    /**
     * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
     */
    java.util.List<? extends ChunkServer.FileChunkErrorOrBuilder> 
        getFileChunkErrorOrBuilderList();
    /**
     * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
     */
    ChunkServer.FileChunkErrorOrBuilder getFileChunkErrorOrBuilder(
        int index);

    /**
     * <code>optional uint32 verbosity_level = 4;</code>
     */
    boolean hasVerbosityLevel();
    /**
     * <code>optional uint32 verbosity_level = 4;</code>
     */
    int getVerbosityLevel();
  }
  /**
   * Protobuf type {@code chunkserver.FileGroups}
   */
  public static final class FileGroups extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.FileGroups)
      FileGroupsOrBuilder {
    // Use FileGroups.newBuilder() to construct.
    private FileGroups(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private FileGroups(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final FileGroups defaultInstance;
    public static FileGroups getDefaultInstance() {
      return defaultInstance;
    }

    public FileGroups getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private FileGroups(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                fileGroups_ = new java.util.ArrayList<ChunkServer.FileChecksumStorageHostChunkLists>();
                mutable_bitField0_ |= 0x00000001;
              }
              fileGroups_.add(input.readMessage(ChunkServer.FileChecksumStorageHostChunkLists.PARSER, extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                fileError_ = new java.util.ArrayList<ChunkServer.FileError>();
                mutable_bitField0_ |= 0x00000002;
              }
              fileError_.add(input.readMessage(ChunkServer.FileError.PARSER, extensionRegistry));
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                fileChunkError_ = new java.util.ArrayList<ChunkServer.FileChunkError>();
                mutable_bitField0_ |= 0x00000004;
              }
              fileChunkError_.add(input.readMessage(ChunkServer.FileChunkError.PARSER, extensionRegistry));
              break;
            }
            case 32: {
              bitField0_ |= 0x00000001;
              verbosityLevel_ = input.readUInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          fileGroups_ = java.util.Collections.unmodifiableList(fileGroups_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          fileError_ = java.util.Collections.unmodifiableList(fileError_);
        }
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          fileChunkError_ = java.util.Collections.unmodifiableList(fileChunkError_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_FileGroups_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_FileGroups_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.FileGroups.class, ChunkServer.FileGroups.Builder.class);
    }

    public static com.google.protobuf.Parser<FileGroups> PARSER =
        new com.google.protobuf.AbstractParser<FileGroups>() {
      public FileGroups parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileGroups(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<FileGroups> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FILE_GROUPS_FIELD_NUMBER = 1;
    private java.util.List<ChunkServer.FileChecksumStorageHostChunkLists> fileGroups_;
    /**
     * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
     */
    public java.util.List<ChunkServer.FileChecksumStorageHostChunkLists> getFileGroupsList() {
      return fileGroups_;
    }
    /**
     * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
     */
    public java.util.List<? extends ChunkServer.FileChecksumStorageHostChunkListsOrBuilder> 
        getFileGroupsOrBuilderList() {
      return fileGroups_;
    }
    /**
     * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
     */
    public int getFileGroupsCount() {
      return fileGroups_.size();
    }
    /**
     * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
     */
    public ChunkServer.FileChecksumStorageHostChunkLists getFileGroups(int index) {
      return fileGroups_.get(index);
    }
    /**
     * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
     */
    public ChunkServer.FileChecksumStorageHostChunkListsOrBuilder getFileGroupsOrBuilder(
        int index) {
      return fileGroups_.get(index);
    }

    public static final int FILE_ERROR_FIELD_NUMBER = 2;
    private java.util.List<ChunkServer.FileError> fileError_;
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    public java.util.List<ChunkServer.FileError> getFileErrorList() {
      return fileError_;
    }
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    public java.util.List<? extends ChunkServer.FileErrorOrBuilder> 
        getFileErrorOrBuilderList() {
      return fileError_;
    }
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    public int getFileErrorCount() {
      return fileError_.size();
    }
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    public ChunkServer.FileError getFileError(int index) {
      return fileError_.get(index);
    }
    /**
     * <code>repeated .chunkserver.FileError file_error = 2;</code>
     */
    public ChunkServer.FileErrorOrBuilder getFileErrorOrBuilder(
        int index) {
      return fileError_.get(index);
    }

    public static final int FILE_CHUNK_ERROR_FIELD_NUMBER = 3;
    private java.util.List<ChunkServer.FileChunkError> fileChunkError_;
    /**
     * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
     */
    public java.util.List<ChunkServer.FileChunkError> getFileChunkErrorList() {
      return fileChunkError_;
    }
    /**
     * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
     */
    public java.util.List<? extends ChunkServer.FileChunkErrorOrBuilder> 
        getFileChunkErrorOrBuilderList() {
      return fileChunkError_;
    }
    /**
     * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
     */
    public int getFileChunkErrorCount() {
      return fileChunkError_.size();
    }
    /**
     * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
     */
    public ChunkServer.FileChunkError getFileChunkError(int index) {
      return fileChunkError_.get(index);
    }
    /**
     * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
     */
    public ChunkServer.FileChunkErrorOrBuilder getFileChunkErrorOrBuilder(
        int index) {
      return fileChunkError_.get(index);
    }

    public static final int VERBOSITY_LEVEL_FIELD_NUMBER = 4;
    private int verbosityLevel_;
    /**
     * <code>optional uint32 verbosity_level = 4;</code>
     */
    public boolean hasVerbosityLevel() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 verbosity_level = 4;</code>
     */
    public int getVerbosityLevel() {
      return verbosityLevel_;
    }

    private void initFields() {
      fileGroups_ = java.util.Collections.emptyList();
      fileError_ = java.util.Collections.emptyList();
      fileChunkError_ = java.util.Collections.emptyList();
      verbosityLevel_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getFileGroupsCount(); i++) {
        if (!getFileGroups(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getFileErrorCount(); i++) {
        if (!getFileError(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getFileChunkErrorCount(); i++) {
        if (!getFileChunkError(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < fileGroups_.size(); i++) {
        output.writeMessage(1, fileGroups_.get(i));
      }
      for (int i = 0; i < fileError_.size(); i++) {
        output.writeMessage(2, fileError_.get(i));
      }
      for (int i = 0; i < fileChunkError_.size(); i++) {
        output.writeMessage(3, fileChunkError_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(4, verbosityLevel_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < fileGroups_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, fileGroups_.get(i));
      }
      for (int i = 0; i < fileError_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, fileError_.get(i));
      }
      for (int i = 0; i < fileChunkError_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, fileChunkError_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, verbosityLevel_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.FileGroups parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileGroups parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileGroups parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.FileGroups parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.FileGroups parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileGroups parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileGroups parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.FileGroups parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.FileGroups parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.FileGroups parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.FileGroups prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.FileGroups}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.FileGroups)
        ChunkServer.FileGroupsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_FileGroups_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_FileGroups_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.FileGroups.class, ChunkServer.FileGroups.Builder.class);
      }

      // Construct using Chunkserver.FileGroups.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getFileGroupsFieldBuilder();
          getFileErrorFieldBuilder();
          getFileChunkErrorFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (fileGroupsBuilder_ == null) {
          fileGroups_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          fileGroupsBuilder_.clear();
        }
        if (fileErrorBuilder_ == null) {
          fileError_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          fileErrorBuilder_.clear();
        }
        if (fileChunkErrorBuilder_ == null) {
          fileChunkError_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          fileChunkErrorBuilder_.clear();
        }
        verbosityLevel_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_FileGroups_descriptor;
      }

      public ChunkServer.FileGroups getDefaultInstanceForType() {
        return ChunkServer.FileGroups.getDefaultInstance();
      }

      public ChunkServer.FileGroups build() {
        ChunkServer.FileGroups result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.FileGroups buildPartial() {
        ChunkServer.FileGroups result = new ChunkServer.FileGroups(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (fileGroupsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            fileGroups_ = java.util.Collections.unmodifiableList(fileGroups_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.fileGroups_ = fileGroups_;
        } else {
          result.fileGroups_ = fileGroupsBuilder_.build();
        }
        if (fileErrorBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            fileError_ = java.util.Collections.unmodifiableList(fileError_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.fileError_ = fileError_;
        } else {
          result.fileError_ = fileErrorBuilder_.build();
        }
        if (fileChunkErrorBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            fileChunkError_ = java.util.Collections.unmodifiableList(fileChunkError_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.fileChunkError_ = fileChunkError_;
        } else {
          result.fileChunkError_ = fileChunkErrorBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000001;
        }
        result.verbosityLevel_ = verbosityLevel_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.FileGroups) {
          return mergeFrom((ChunkServer.FileGroups)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.FileGroups other) {
        if (other == ChunkServer.FileGroups.getDefaultInstance()) return this;
        if (fileGroupsBuilder_ == null) {
          if (!other.fileGroups_.isEmpty()) {
            if (fileGroups_.isEmpty()) {
              fileGroups_ = other.fileGroups_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureFileGroupsIsMutable();
              fileGroups_.addAll(other.fileGroups_);
            }
            onChanged();
          }
        } else {
          if (!other.fileGroups_.isEmpty()) {
            if (fileGroupsBuilder_.isEmpty()) {
              fileGroupsBuilder_.dispose();
              fileGroupsBuilder_ = null;
              fileGroups_ = other.fileGroups_;
              bitField0_ = (bitField0_ & ~0x00000001);
              fileGroupsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getFileGroupsFieldBuilder() : null;
            } else {
              fileGroupsBuilder_.addAllMessages(other.fileGroups_);
            }
          }
        }
        if (fileErrorBuilder_ == null) {
          if (!other.fileError_.isEmpty()) {
            if (fileError_.isEmpty()) {
              fileError_ = other.fileError_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureFileErrorIsMutable();
              fileError_.addAll(other.fileError_);
            }
            onChanged();
          }
        } else {
          if (!other.fileError_.isEmpty()) {
            if (fileErrorBuilder_.isEmpty()) {
              fileErrorBuilder_.dispose();
              fileErrorBuilder_ = null;
              fileError_ = other.fileError_;
              bitField0_ = (bitField0_ & ~0x00000002);
              fileErrorBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getFileErrorFieldBuilder() : null;
            } else {
              fileErrorBuilder_.addAllMessages(other.fileError_);
            }
          }
        }
        if (fileChunkErrorBuilder_ == null) {
          if (!other.fileChunkError_.isEmpty()) {
            if (fileChunkError_.isEmpty()) {
              fileChunkError_ = other.fileChunkError_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureFileChunkErrorIsMutable();
              fileChunkError_.addAll(other.fileChunkError_);
            }
            onChanged();
          }
        } else {
          if (!other.fileChunkError_.isEmpty()) {
            if (fileChunkErrorBuilder_.isEmpty()) {
              fileChunkErrorBuilder_.dispose();
              fileChunkErrorBuilder_ = null;
              fileChunkError_ = other.fileChunkError_;
              bitField0_ = (bitField0_ & ~0x00000004);
              fileChunkErrorBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getFileChunkErrorFieldBuilder() : null;
            } else {
              fileChunkErrorBuilder_.addAllMessages(other.fileChunkError_);
            }
          }
        }
        if (other.hasVerbosityLevel()) {
          setVerbosityLevel(other.getVerbosityLevel());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getFileGroupsCount(); i++) {
          if (!getFileGroups(i).isInitialized()) {
            
            return false;
          }
        }
        for (int i = 0; i < getFileErrorCount(); i++) {
          if (!getFileError(i).isInitialized()) {
            
            return false;
          }
        }
        for (int i = 0; i < getFileChunkErrorCount(); i++) {
          if (!getFileChunkError(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.FileGroups parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.FileGroups) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<ChunkServer.FileChecksumStorageHostChunkLists> fileGroups_ =
        java.util.Collections.emptyList();
      private void ensureFileGroupsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          fileGroups_ = new java.util.ArrayList<ChunkServer.FileChecksumStorageHostChunkLists>(fileGroups_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.FileChecksumStorageHostChunkLists, ChunkServer.FileChecksumStorageHostChunkLists.Builder, ChunkServer.FileChecksumStorageHostChunkListsOrBuilder> fileGroupsBuilder_;

      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public java.util.List<ChunkServer.FileChecksumStorageHostChunkLists> getFileGroupsList() {
        if (fileGroupsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(fileGroups_);
        } else {
          return fileGroupsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public int getFileGroupsCount() {
        if (fileGroupsBuilder_ == null) {
          return fileGroups_.size();
        } else {
          return fileGroupsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public ChunkServer.FileChecksumStorageHostChunkLists getFileGroups(int index) {
        if (fileGroupsBuilder_ == null) {
          return fileGroups_.get(index);
        } else {
          return fileGroupsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public Builder setFileGroups(
          int index, ChunkServer.FileChecksumStorageHostChunkLists value) {
        if (fileGroupsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileGroupsIsMutable();
          fileGroups_.set(index, value);
          onChanged();
        } else {
          fileGroupsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public Builder setFileGroups(
          int index, ChunkServer.FileChecksumStorageHostChunkLists.Builder builderForValue) {
        if (fileGroupsBuilder_ == null) {
          ensureFileGroupsIsMutable();
          fileGroups_.set(index, builderForValue.build());
          onChanged();
        } else {
          fileGroupsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public Builder addFileGroups(ChunkServer.FileChecksumStorageHostChunkLists value) {
        if (fileGroupsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileGroupsIsMutable();
          fileGroups_.add(value);
          onChanged();
        } else {
          fileGroupsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public Builder addFileGroups(
          int index, ChunkServer.FileChecksumStorageHostChunkLists value) {
        if (fileGroupsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileGroupsIsMutable();
          fileGroups_.add(index, value);
          onChanged();
        } else {
          fileGroupsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public Builder addFileGroups(
          ChunkServer.FileChecksumStorageHostChunkLists.Builder builderForValue) {
        if (fileGroupsBuilder_ == null) {
          ensureFileGroupsIsMutable();
          fileGroups_.add(builderForValue.build());
          onChanged();
        } else {
          fileGroupsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public Builder addFileGroups(
          int index, ChunkServer.FileChecksumStorageHostChunkLists.Builder builderForValue) {
        if (fileGroupsBuilder_ == null) {
          ensureFileGroupsIsMutable();
          fileGroups_.add(index, builderForValue.build());
          onChanged();
        } else {
          fileGroupsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public Builder addAllFileGroups(
          java.lang.Iterable<? extends ChunkServer.FileChecksumStorageHostChunkLists> values) {
        if (fileGroupsBuilder_ == null) {
          ensureFileGroupsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, fileGroups_);
          onChanged();
        } else {
          fileGroupsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public Builder clearFileGroups() {
        if (fileGroupsBuilder_ == null) {
          fileGroups_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          fileGroupsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public Builder removeFileGroups(int index) {
        if (fileGroupsBuilder_ == null) {
          ensureFileGroupsIsMutable();
          fileGroups_.remove(index);
          onChanged();
        } else {
          fileGroupsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public ChunkServer.FileChecksumStorageHostChunkLists.Builder getFileGroupsBuilder(
          int index) {
        return getFileGroupsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public ChunkServer.FileChecksumStorageHostChunkListsOrBuilder getFileGroupsOrBuilder(
          int index) {
        if (fileGroupsBuilder_ == null) {
          return fileGroups_.get(index);  } else {
          return fileGroupsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public java.util.List<? extends ChunkServer.FileChecksumStorageHostChunkListsOrBuilder> 
           getFileGroupsOrBuilderList() {
        if (fileGroupsBuilder_ != null) {
          return fileGroupsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(fileGroups_);
        }
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public ChunkServer.FileChecksumStorageHostChunkLists.Builder addFileGroupsBuilder() {
        return getFileGroupsFieldBuilder().addBuilder(ChunkServer.FileChecksumStorageHostChunkLists.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public ChunkServer.FileChecksumStorageHostChunkLists.Builder addFileGroupsBuilder(
          int index) {
        return getFileGroupsFieldBuilder().addBuilder(index, ChunkServer.FileChecksumStorageHostChunkLists.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.FileChecksumStorageHostChunkLists file_groups = 1;</code>
       */
      public java.util.List<ChunkServer.FileChecksumStorageHostChunkLists.Builder> 
           getFileGroupsBuilderList() {
        return getFileGroupsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.FileChecksumStorageHostChunkLists, ChunkServer.FileChecksumStorageHostChunkLists.Builder, ChunkServer.FileChecksumStorageHostChunkListsOrBuilder> 
          getFileGroupsFieldBuilder() {
        if (fileGroupsBuilder_ == null) {
          fileGroupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.FileChecksumStorageHostChunkLists, ChunkServer.FileChecksumStorageHostChunkLists.Builder, ChunkServer.FileChecksumStorageHostChunkListsOrBuilder>(
                  fileGroups_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          fileGroups_ = null;
        }
        return fileGroupsBuilder_;
      }

      private java.util.List<ChunkServer.FileError> fileError_ =
        java.util.Collections.emptyList();
      private void ensureFileErrorIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          fileError_ = new java.util.ArrayList<ChunkServer.FileError>(fileError_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.FileError, ChunkServer.FileError.Builder, ChunkServer.FileErrorOrBuilder> fileErrorBuilder_;

      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public java.util.List<ChunkServer.FileError> getFileErrorList() {
        if (fileErrorBuilder_ == null) {
          return java.util.Collections.unmodifiableList(fileError_);
        } else {
          return fileErrorBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public int getFileErrorCount() {
        if (fileErrorBuilder_ == null) {
          return fileError_.size();
        } else {
          return fileErrorBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public ChunkServer.FileError getFileError(int index) {
        if (fileErrorBuilder_ == null) {
          return fileError_.get(index);
        } else {
          return fileErrorBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder setFileError(
          int index, ChunkServer.FileError value) {
        if (fileErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileErrorIsMutable();
          fileError_.set(index, value);
          onChanged();
        } else {
          fileErrorBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder setFileError(
          int index, ChunkServer.FileError.Builder builderForValue) {
        if (fileErrorBuilder_ == null) {
          ensureFileErrorIsMutable();
          fileError_.set(index, builderForValue.build());
          onChanged();
        } else {
          fileErrorBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder addFileError(ChunkServer.FileError value) {
        if (fileErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileErrorIsMutable();
          fileError_.add(value);
          onChanged();
        } else {
          fileErrorBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder addFileError(
          int index, ChunkServer.FileError value) {
        if (fileErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileErrorIsMutable();
          fileError_.add(index, value);
          onChanged();
        } else {
          fileErrorBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder addFileError(
          ChunkServer.FileError.Builder builderForValue) {
        if (fileErrorBuilder_ == null) {
          ensureFileErrorIsMutable();
          fileError_.add(builderForValue.build());
          onChanged();
        } else {
          fileErrorBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder addFileError(
          int index, ChunkServer.FileError.Builder builderForValue) {
        if (fileErrorBuilder_ == null) {
          ensureFileErrorIsMutable();
          fileError_.add(index, builderForValue.build());
          onChanged();
        } else {
          fileErrorBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder addAllFileError(
          java.lang.Iterable<? extends ChunkServer.FileError> values) {
        if (fileErrorBuilder_ == null) {
          ensureFileErrorIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, fileError_);
          onChanged();
        } else {
          fileErrorBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder clearFileError() {
        if (fileErrorBuilder_ == null) {
          fileError_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          fileErrorBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public Builder removeFileError(int index) {
        if (fileErrorBuilder_ == null) {
          ensureFileErrorIsMutable();
          fileError_.remove(index);
          onChanged();
        } else {
          fileErrorBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public ChunkServer.FileError.Builder getFileErrorBuilder(
          int index) {
        return getFileErrorFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public ChunkServer.FileErrorOrBuilder getFileErrorOrBuilder(
          int index) {
        if (fileErrorBuilder_ == null) {
          return fileError_.get(index);  } else {
          return fileErrorBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public java.util.List<? extends ChunkServer.FileErrorOrBuilder> 
           getFileErrorOrBuilderList() {
        if (fileErrorBuilder_ != null) {
          return fileErrorBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(fileError_);
        }
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public ChunkServer.FileError.Builder addFileErrorBuilder() {
        return getFileErrorFieldBuilder().addBuilder(ChunkServer.FileError.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public ChunkServer.FileError.Builder addFileErrorBuilder(
          int index) {
        return getFileErrorFieldBuilder().addBuilder(index, ChunkServer.FileError.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.FileError file_error = 2;</code>
       */
      public java.util.List<ChunkServer.FileError.Builder> 
           getFileErrorBuilderList() {
        return getFileErrorFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.FileError, ChunkServer.FileError.Builder, ChunkServer.FileErrorOrBuilder> 
          getFileErrorFieldBuilder() {
        if (fileErrorBuilder_ == null) {
          fileErrorBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.FileError, ChunkServer.FileError.Builder, ChunkServer.FileErrorOrBuilder>(
                  fileError_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          fileError_ = null;
        }
        return fileErrorBuilder_;
      }

      private java.util.List<ChunkServer.FileChunkError> fileChunkError_ =
        java.util.Collections.emptyList();
      private void ensureFileChunkErrorIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          fileChunkError_ = new java.util.ArrayList<ChunkServer.FileChunkError>(fileChunkError_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.FileChunkError, ChunkServer.FileChunkError.Builder, ChunkServer.FileChunkErrorOrBuilder> fileChunkErrorBuilder_;

      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public java.util.List<ChunkServer.FileChunkError> getFileChunkErrorList() {
        if (fileChunkErrorBuilder_ == null) {
          return java.util.Collections.unmodifiableList(fileChunkError_);
        } else {
          return fileChunkErrorBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public int getFileChunkErrorCount() {
        if (fileChunkErrorBuilder_ == null) {
          return fileChunkError_.size();
        } else {
          return fileChunkErrorBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public ChunkServer.FileChunkError getFileChunkError(int index) {
        if (fileChunkErrorBuilder_ == null) {
          return fileChunkError_.get(index);
        } else {
          return fileChunkErrorBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public Builder setFileChunkError(
          int index, ChunkServer.FileChunkError value) {
        if (fileChunkErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileChunkErrorIsMutable();
          fileChunkError_.set(index, value);
          onChanged();
        } else {
          fileChunkErrorBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public Builder setFileChunkError(
          int index, ChunkServer.FileChunkError.Builder builderForValue) {
        if (fileChunkErrorBuilder_ == null) {
          ensureFileChunkErrorIsMutable();
          fileChunkError_.set(index, builderForValue.build());
          onChanged();
        } else {
          fileChunkErrorBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public Builder addFileChunkError(ChunkServer.FileChunkError value) {
        if (fileChunkErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileChunkErrorIsMutable();
          fileChunkError_.add(value);
          onChanged();
        } else {
          fileChunkErrorBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public Builder addFileChunkError(
          int index, ChunkServer.FileChunkError value) {
        if (fileChunkErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileChunkErrorIsMutable();
          fileChunkError_.add(index, value);
          onChanged();
        } else {
          fileChunkErrorBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public Builder addFileChunkError(
          ChunkServer.FileChunkError.Builder builderForValue) {
        if (fileChunkErrorBuilder_ == null) {
          ensureFileChunkErrorIsMutable();
          fileChunkError_.add(builderForValue.build());
          onChanged();
        } else {
          fileChunkErrorBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public Builder addFileChunkError(
          int index, ChunkServer.FileChunkError.Builder builderForValue) {
        if (fileChunkErrorBuilder_ == null) {
          ensureFileChunkErrorIsMutable();
          fileChunkError_.add(index, builderForValue.build());
          onChanged();
        } else {
          fileChunkErrorBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public Builder addAllFileChunkError(
          java.lang.Iterable<? extends ChunkServer.FileChunkError> values) {
        if (fileChunkErrorBuilder_ == null) {
          ensureFileChunkErrorIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, fileChunkError_);
          onChanged();
        } else {
          fileChunkErrorBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public Builder clearFileChunkError() {
        if (fileChunkErrorBuilder_ == null) {
          fileChunkError_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          fileChunkErrorBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public Builder removeFileChunkError(int index) {
        if (fileChunkErrorBuilder_ == null) {
          ensureFileChunkErrorIsMutable();
          fileChunkError_.remove(index);
          onChanged();
        } else {
          fileChunkErrorBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public ChunkServer.FileChunkError.Builder getFileChunkErrorBuilder(
          int index) {
        return getFileChunkErrorFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public ChunkServer.FileChunkErrorOrBuilder getFileChunkErrorOrBuilder(
          int index) {
        if (fileChunkErrorBuilder_ == null) {
          return fileChunkError_.get(index);  } else {
          return fileChunkErrorBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public java.util.List<? extends ChunkServer.FileChunkErrorOrBuilder> 
           getFileChunkErrorOrBuilderList() {
        if (fileChunkErrorBuilder_ != null) {
          return fileChunkErrorBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(fileChunkError_);
        }
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public ChunkServer.FileChunkError.Builder addFileChunkErrorBuilder() {
        return getFileChunkErrorFieldBuilder().addBuilder(ChunkServer.FileChunkError.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public ChunkServer.FileChunkError.Builder addFileChunkErrorBuilder(
          int index) {
        return getFileChunkErrorFieldBuilder().addBuilder(index, ChunkServer.FileChunkError.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.FileChunkError file_chunk_error = 3;</code>
       */
      public java.util.List<ChunkServer.FileChunkError.Builder> 
           getFileChunkErrorBuilderList() {
        return getFileChunkErrorFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.FileChunkError, ChunkServer.FileChunkError.Builder, ChunkServer.FileChunkErrorOrBuilder> 
          getFileChunkErrorFieldBuilder() {
        if (fileChunkErrorBuilder_ == null) {
          fileChunkErrorBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.FileChunkError, ChunkServer.FileChunkError.Builder, ChunkServer.FileChunkErrorOrBuilder>(
                  fileChunkError_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          fileChunkError_ = null;
        }
        return fileChunkErrorBuilder_;
      }

      private int verbosityLevel_ ;
      /**
       * <code>optional uint32 verbosity_level = 4;</code>
       */
      public boolean hasVerbosityLevel() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional uint32 verbosity_level = 4;</code>
       */
      public int getVerbosityLevel() {
        return verbosityLevel_;
      }
      /**
       * <code>optional uint32 verbosity_level = 4;</code>
       */
      public Builder setVerbosityLevel(int value) {
        bitField0_ |= 0x00000008;
        verbosityLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 verbosity_level = 4;</code>
       */
      public Builder clearVerbosityLevel() {
        bitField0_ = (bitField0_ & ~0x00000008);
        verbosityLevel_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.FileGroups)
    }

    static {
      defaultInstance = new FileGroups(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.FileGroups)
  }

  public interface ChunkChecksumListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.ChunkChecksumList)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated bytes chunk_checksum = 1;</code>
     */
    java.util.List<com.google.protobuf.ByteString> getChunkChecksumList();
    /**
     * <code>repeated bytes chunk_checksum = 1;</code>
     */
    int getChunkChecksumCount();
    /**
     * <code>repeated bytes chunk_checksum = 1;</code>
     */
    com.google.protobuf.ByteString getChunkChecksum(int index);
  }
  /**
   * Protobuf type {@code chunkserver.ChunkChecksumList}
   */
  public static final class ChunkChecksumList extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.ChunkChecksumList)
      ChunkChecksumListOrBuilder {
    // Use ChunkChecksumList.newBuilder() to construct.
    private ChunkChecksumList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ChunkChecksumList(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ChunkChecksumList defaultInstance;
    public static ChunkChecksumList getDefaultInstance() {
      return defaultInstance;
    }

    public ChunkChecksumList getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ChunkChecksumList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                chunkChecksum_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
                mutable_bitField0_ |= 0x00000001;
              }
              chunkChecksum_.add(input.readBytes());
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          chunkChecksum_ = java.util.Collections.unmodifiableList(chunkChecksum_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_ChunkChecksumList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_ChunkChecksumList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.ChunkChecksumList.class, ChunkServer.ChunkChecksumList.Builder.class);
    }

    public static com.google.protobuf.Parser<ChunkChecksumList> PARSER =
        new com.google.protobuf.AbstractParser<ChunkChecksumList>() {
      public ChunkChecksumList parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChunkChecksumList(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ChunkChecksumList> getParserForType() {
      return PARSER;
    }

    public static final int CHUNK_CHECKSUM_FIELD_NUMBER = 1;
    private java.util.List<com.google.protobuf.ByteString> chunkChecksum_;
    /**
     * <code>repeated bytes chunk_checksum = 1;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getChunkChecksumList() {
      return chunkChecksum_;
    }
    /**
     * <code>repeated bytes chunk_checksum = 1;</code>
     */
    public int getChunkChecksumCount() {
      return chunkChecksum_.size();
    }
    /**
     * <code>repeated bytes chunk_checksum = 1;</code>
     */
    public com.google.protobuf.ByteString getChunkChecksum(int index) {
      return chunkChecksum_.get(index);
    }

    private void initFields() {
      chunkChecksum_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < chunkChecksum_.size(); i++) {
        output.writeBytes(1, chunkChecksum_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < chunkChecksum_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(chunkChecksum_.get(i));
        }
        size += dataSize;
        size += 1 * getChunkChecksumList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.ChunkChecksumList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.ChunkChecksumList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.ChunkChecksumList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.ChunkChecksumList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.ChunkChecksumList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.ChunkChecksumList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.ChunkChecksumList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.ChunkChecksumList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.ChunkChecksumList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.ChunkChecksumList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.ChunkChecksumList prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.ChunkChecksumList}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.ChunkChecksumList)
        ChunkServer.ChunkChecksumListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_ChunkChecksumList_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_ChunkChecksumList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.ChunkChecksumList.class, ChunkServer.ChunkChecksumList.Builder.class);
      }

      // Construct using Chunkserver.ChunkChecksumList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        chunkChecksum_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_ChunkChecksumList_descriptor;
      }

      public ChunkServer.ChunkChecksumList getDefaultInstanceForType() {
        return ChunkServer.ChunkChecksumList.getDefaultInstance();
      }

      public ChunkServer.ChunkChecksumList build() {
        ChunkServer.ChunkChecksumList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.ChunkChecksumList buildPartial() {
        ChunkServer.ChunkChecksumList result = new ChunkServer.ChunkChecksumList(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          chunkChecksum_ = java.util.Collections.unmodifiableList(chunkChecksum_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.chunkChecksum_ = chunkChecksum_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.ChunkChecksumList) {
          return mergeFrom((ChunkServer.ChunkChecksumList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.ChunkChecksumList other) {
        if (other == ChunkServer.ChunkChecksumList.getDefaultInstance()) return this;
        if (!other.chunkChecksum_.isEmpty()) {
          if (chunkChecksum_.isEmpty()) {
            chunkChecksum_ = other.chunkChecksum_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureChunkChecksumIsMutable();
            chunkChecksum_.addAll(other.chunkChecksum_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.ChunkChecksumList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.ChunkChecksumList) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.google.protobuf.ByteString> chunkChecksum_ = java.util.Collections.emptyList();
      private void ensureChunkChecksumIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          chunkChecksum_ = new java.util.ArrayList<com.google.protobuf.ByteString>(chunkChecksum_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated bytes chunk_checksum = 1;</code>
       */
      public java.util.List<com.google.protobuf.ByteString>
          getChunkChecksumList() {
        return java.util.Collections.unmodifiableList(chunkChecksum_);
      }
      /**
       * <code>repeated bytes chunk_checksum = 1;</code>
       */
      public int getChunkChecksumCount() {
        return chunkChecksum_.size();
      }
      /**
       * <code>repeated bytes chunk_checksum = 1;</code>
       */
      public com.google.protobuf.ByteString getChunkChecksum(int index) {
        return chunkChecksum_.get(index);
      }
      /**
       * <code>repeated bytes chunk_checksum = 1;</code>
       */
      public Builder setChunkChecksum(
          int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureChunkChecksumIsMutable();
        chunkChecksum_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes chunk_checksum = 1;</code>
       */
      public Builder addChunkChecksum(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureChunkChecksumIsMutable();
        chunkChecksum_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes chunk_checksum = 1;</code>
       */
      public Builder addAllChunkChecksum(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureChunkChecksumIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, chunkChecksum_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes chunk_checksum = 1;</code>
       */
      public Builder clearChunkChecksum() {
        chunkChecksum_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.ChunkChecksumList)
    }

    static {
      defaultInstance = new ChunkChecksumList(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.ChunkChecksumList)
  }

  public interface StorageHostChunkListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.StorageHostChunkList)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .chunkserver.HostInfo host_info = 1;</code>
     */
    boolean hasHostInfo();
    /**
     * <code>required .chunkserver.HostInfo host_info = 1;</code>
     */
    ChunkServer.HostInfo getHostInfo();
    /**
     * <code>required .chunkserver.HostInfo host_info = 1;</code>
     */
    ChunkServer.HostInfoOrBuilder getHostInfoOrBuilder();

    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
     */
    java.util.List<ChunkServer.ChunkInfo> 
        getChunkInfoList();
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
     */
    ChunkServer.ChunkInfo getChunkInfo(int index);
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
     */
    int getChunkInfoCount();
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
     */
    java.util.List<? extends ChunkServer.ChunkInfoOrBuilder> 
        getChunkInfoOrBuilderList();
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
     */
    ChunkServer.ChunkInfoOrBuilder getChunkInfoOrBuilder(
        int index);

    /**
     * <code>required string storage_container_key = 3;</code>
     */
    boolean hasStorageContainerKey();
    /**
     * <code>required string storage_container_key = 3;</code>
     */
    java.lang.String getStorageContainerKey();
    /**
     * <code>required string storage_container_key = 3;</code>
     */
    com.google.protobuf.ByteString
        getStorageContainerKeyBytes();

    /**
     * <code>required string storage_container_authorization_token = 4;</code>
     */
    boolean hasStorageContainerAuthorizationToken();
    /**
     * <code>required string storage_container_authorization_token = 4;</code>
     */
    java.lang.String getStorageContainerAuthorizationToken();
    /**
     * <code>required string storage_container_authorization_token = 4;</code>
     */
    com.google.protobuf.ByteString
        getStorageContainerAuthorizationTokenBytes();
  }
  /**
   * Protobuf type {@code chunkserver.StorageHostChunkList}
   */
  public static final class StorageHostChunkList extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.StorageHostChunkList)
      StorageHostChunkListOrBuilder {
    // Use StorageHostChunkList.newBuilder() to construct.
    private StorageHostChunkList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StorageHostChunkList(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StorageHostChunkList defaultInstance;
    public static StorageHostChunkList getDefaultInstance() {
      return defaultInstance;
    }

    public StorageHostChunkList getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StorageHostChunkList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              ChunkServer.HostInfo.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = hostInfo_.toBuilder();
              }
              hostInfo_ = input.readMessage(ChunkServer.HostInfo.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(hostInfo_);
                hostInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                chunkInfo_ = new java.util.ArrayList<ChunkServer.ChunkInfo>();
                mutable_bitField0_ |= 0x00000002;
              }
              chunkInfo_.add(input.readMessage(ChunkServer.ChunkInfo.PARSER, extensionRegistry));
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              storageContainerKey_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              storageContainerAuthorizationToken_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          chunkInfo_ = java.util.Collections.unmodifiableList(chunkInfo_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_StorageHostChunkList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_StorageHostChunkList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.StorageHostChunkList.class, ChunkServer.StorageHostChunkList.Builder.class);
    }

    public static com.google.protobuf.Parser<StorageHostChunkList> PARSER =
        new com.google.protobuf.AbstractParser<StorageHostChunkList>() {
      public StorageHostChunkList parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StorageHostChunkList(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StorageHostChunkList> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int HOST_INFO_FIELD_NUMBER = 1;
    private ChunkServer.HostInfo hostInfo_;
    /**
     * <code>required .chunkserver.HostInfo host_info = 1;</code>
     */
    public boolean hasHostInfo() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .chunkserver.HostInfo host_info = 1;</code>
     */
    public ChunkServer.HostInfo getHostInfo() {
      return hostInfo_;
    }
    /**
     * <code>required .chunkserver.HostInfo host_info = 1;</code>
     */
    public ChunkServer.HostInfoOrBuilder getHostInfoOrBuilder() {
      return hostInfo_;
    }

    public static final int CHUNK_INFO_FIELD_NUMBER = 2;
    private java.util.List<ChunkServer.ChunkInfo> chunkInfo_;
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
     */
    public java.util.List<ChunkServer.ChunkInfo> getChunkInfoList() {
      return chunkInfo_;
    }
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
     */
    public java.util.List<? extends ChunkServer.ChunkInfoOrBuilder> 
        getChunkInfoOrBuilderList() {
      return chunkInfo_;
    }
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
     */
    public int getChunkInfoCount() {
      return chunkInfo_.size();
    }
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
     */
    public ChunkServer.ChunkInfo getChunkInfo(int index) {
      return chunkInfo_.get(index);
    }
    /**
     * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
     */
    public ChunkServer.ChunkInfoOrBuilder getChunkInfoOrBuilder(
        int index) {
      return chunkInfo_.get(index);
    }

    public static final int STORAGE_CONTAINER_KEY_FIELD_NUMBER = 3;
    private java.lang.Object storageContainerKey_;
    /**
     * <code>required string storage_container_key = 3;</code>
     */
    public boolean hasStorageContainerKey() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string storage_container_key = 3;</code>
     */
    public java.lang.String getStorageContainerKey() {
      java.lang.Object ref = storageContainerKey_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          storageContainerKey_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string storage_container_key = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStorageContainerKeyBytes() {
      java.lang.Object ref = storageContainerKey_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storageContainerKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STORAGE_CONTAINER_AUTHORIZATION_TOKEN_FIELD_NUMBER = 4;
    private java.lang.Object storageContainerAuthorizationToken_;
    /**
     * <code>required string storage_container_authorization_token = 4;</code>
     */
    public boolean hasStorageContainerAuthorizationToken() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string storage_container_authorization_token = 4;</code>
     */
    public java.lang.String getStorageContainerAuthorizationToken() {
      java.lang.Object ref = storageContainerAuthorizationToken_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          storageContainerAuthorizationToken_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string storage_container_authorization_token = 4;</code>
     */
    public com.google.protobuf.ByteString
        getStorageContainerAuthorizationTokenBytes() {
      java.lang.Object ref = storageContainerAuthorizationToken_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storageContainerAuthorizationToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      hostInfo_ = ChunkServer.HostInfo.getDefaultInstance();
      chunkInfo_ = java.util.Collections.emptyList();
      storageContainerKey_ = "";
      storageContainerAuthorizationToken_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasHostInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStorageContainerKey()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStorageContainerAuthorizationToken()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getHostInfo().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getChunkInfoCount(); i++) {
        if (!getChunkInfo(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, hostInfo_);
      }
      for (int i = 0; i < chunkInfo_.size(); i++) {
        output.writeMessage(2, chunkInfo_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(3, getStorageContainerKeyBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(4, getStorageContainerAuthorizationTokenBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, hostInfo_);
      }
      for (int i = 0; i < chunkInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, chunkInfo_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getStorageContainerKeyBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getStorageContainerAuthorizationTokenBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.StorageHostChunkList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.StorageHostChunkList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.StorageHostChunkList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.StorageHostChunkList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.StorageHostChunkList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.StorageHostChunkList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.StorageHostChunkList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.StorageHostChunkList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.StorageHostChunkList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.StorageHostChunkList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.StorageHostChunkList prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.StorageHostChunkList}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.StorageHostChunkList)
        ChunkServer.StorageHostChunkListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_StorageHostChunkList_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_StorageHostChunkList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.StorageHostChunkList.class, ChunkServer.StorageHostChunkList.Builder.class);
      }

      // Construct using Chunkserver.StorageHostChunkList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getHostInfoFieldBuilder();
          getChunkInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (hostInfoBuilder_ == null) {
          hostInfo_ = ChunkServer.HostInfo.getDefaultInstance();
        } else {
          hostInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (chunkInfoBuilder_ == null) {
          chunkInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          chunkInfoBuilder_.clear();
        }
        storageContainerKey_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        storageContainerAuthorizationToken_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_StorageHostChunkList_descriptor;
      }

      public ChunkServer.StorageHostChunkList getDefaultInstanceForType() {
        return ChunkServer.StorageHostChunkList.getDefaultInstance();
      }

      public ChunkServer.StorageHostChunkList build() {
        ChunkServer.StorageHostChunkList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.StorageHostChunkList buildPartial() {
        ChunkServer.StorageHostChunkList result = new ChunkServer.StorageHostChunkList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (hostInfoBuilder_ == null) {
          result.hostInfo_ = hostInfo_;
        } else {
          result.hostInfo_ = hostInfoBuilder_.build();
        }
        if (chunkInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            chunkInfo_ = java.util.Collections.unmodifiableList(chunkInfo_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.chunkInfo_ = chunkInfo_;
        } else {
          result.chunkInfo_ = chunkInfoBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        result.storageContainerKey_ = storageContainerKey_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.storageContainerAuthorizationToken_ = storageContainerAuthorizationToken_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.StorageHostChunkList) {
          return mergeFrom((ChunkServer.StorageHostChunkList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.StorageHostChunkList other) {
        if (other == ChunkServer.StorageHostChunkList.getDefaultInstance()) return this;
        if (other.hasHostInfo()) {
          mergeHostInfo(other.getHostInfo());
        }
        if (chunkInfoBuilder_ == null) {
          if (!other.chunkInfo_.isEmpty()) {
            if (chunkInfo_.isEmpty()) {
              chunkInfo_ = other.chunkInfo_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureChunkInfoIsMutable();
              chunkInfo_.addAll(other.chunkInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.chunkInfo_.isEmpty()) {
            if (chunkInfoBuilder_.isEmpty()) {
              chunkInfoBuilder_.dispose();
              chunkInfoBuilder_ = null;
              chunkInfo_ = other.chunkInfo_;
              bitField0_ = (bitField0_ & ~0x00000002);
              chunkInfoBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getChunkInfoFieldBuilder() : null;
            } else {
              chunkInfoBuilder_.addAllMessages(other.chunkInfo_);
            }
          }
        }
        if (other.hasStorageContainerKey()) {
          bitField0_ |= 0x00000004;
          storageContainerKey_ = other.storageContainerKey_;
          onChanged();
        }
        if (other.hasStorageContainerAuthorizationToken()) {
          bitField0_ |= 0x00000008;
          storageContainerAuthorizationToken_ = other.storageContainerAuthorizationToken_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasHostInfo()) {
          
          return false;
        }
        if (!hasStorageContainerKey()) {
          
          return false;
        }
        if (!hasStorageContainerAuthorizationToken()) {
          
          return false;
        }
        if (!getHostInfo().isInitialized()) {
          
          return false;
        }
        for (int i = 0; i < getChunkInfoCount(); i++) {
          if (!getChunkInfo(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.StorageHostChunkList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.StorageHostChunkList) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private ChunkServer.HostInfo hostInfo_ = ChunkServer.HostInfo.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          ChunkServer.HostInfo, ChunkServer.HostInfo.Builder, ChunkServer.HostInfoOrBuilder> hostInfoBuilder_;
      /**
       * <code>required .chunkserver.HostInfo host_info = 1;</code>
       */
      public boolean hasHostInfo() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .chunkserver.HostInfo host_info = 1;</code>
       */
      public ChunkServer.HostInfo getHostInfo() {
        if (hostInfoBuilder_ == null) {
          return hostInfo_;
        } else {
          return hostInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>required .chunkserver.HostInfo host_info = 1;</code>
       */
      public Builder setHostInfo(ChunkServer.HostInfo value) {
        if (hostInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hostInfo_ = value;
          onChanged();
        } else {
          hostInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .chunkserver.HostInfo host_info = 1;</code>
       */
      public Builder setHostInfo(
          ChunkServer.HostInfo.Builder builderForValue) {
        if (hostInfoBuilder_ == null) {
          hostInfo_ = builderForValue.build();
          onChanged();
        } else {
          hostInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .chunkserver.HostInfo host_info = 1;</code>
       */
      public Builder mergeHostInfo(ChunkServer.HostInfo value) {
        if (hostInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              hostInfo_ != ChunkServer.HostInfo.getDefaultInstance()) {
            hostInfo_ =
              ChunkServer.HostInfo.newBuilder(hostInfo_).mergeFrom(value).buildPartial();
          } else {
            hostInfo_ = value;
          }
          onChanged();
        } else {
          hostInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .chunkserver.HostInfo host_info = 1;</code>
       */
      public Builder clearHostInfo() {
        if (hostInfoBuilder_ == null) {
          hostInfo_ = ChunkServer.HostInfo.getDefaultInstance();
          onChanged();
        } else {
          hostInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .chunkserver.HostInfo host_info = 1;</code>
       */
      public ChunkServer.HostInfo.Builder getHostInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHostInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>required .chunkserver.HostInfo host_info = 1;</code>
       */
      public ChunkServer.HostInfoOrBuilder getHostInfoOrBuilder() {
        if (hostInfoBuilder_ != null) {
          return hostInfoBuilder_.getMessageOrBuilder();
        } else {
          return hostInfo_;
        }
      }
      /**
       * <code>required .chunkserver.HostInfo host_info = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          ChunkServer.HostInfo, ChunkServer.HostInfo.Builder, ChunkServer.HostInfoOrBuilder> 
          getHostInfoFieldBuilder() {
        if (hostInfoBuilder_ == null) {
          hostInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              ChunkServer.HostInfo, ChunkServer.HostInfo.Builder, ChunkServer.HostInfoOrBuilder>(
                  getHostInfo(),
                  getParentForChildren(),
                  isClean());
          hostInfo_ = null;
        }
        return hostInfoBuilder_;
      }

      private java.util.List<ChunkServer.ChunkInfo> chunkInfo_ =
        java.util.Collections.emptyList();
      private void ensureChunkInfoIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          chunkInfo_ = new java.util.ArrayList<ChunkServer.ChunkInfo>(chunkInfo_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.ChunkInfo, ChunkServer.ChunkInfo.Builder, ChunkServer.ChunkInfoOrBuilder> chunkInfoBuilder_;

      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public java.util.List<ChunkServer.ChunkInfo> getChunkInfoList() {
        if (chunkInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(chunkInfo_);
        } else {
          return chunkInfoBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public int getChunkInfoCount() {
        if (chunkInfoBuilder_ == null) {
          return chunkInfo_.size();
        } else {
          return chunkInfoBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public ChunkServer.ChunkInfo getChunkInfo(int index) {
        if (chunkInfoBuilder_ == null) {
          return chunkInfo_.get(index);
        } else {
          return chunkInfoBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public Builder setChunkInfo(
          int index, ChunkServer.ChunkInfo value) {
        if (chunkInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunkInfoIsMutable();
          chunkInfo_.set(index, value);
          onChanged();
        } else {
          chunkInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public Builder setChunkInfo(
          int index, ChunkServer.ChunkInfo.Builder builderForValue) {
        if (chunkInfoBuilder_ == null) {
          ensureChunkInfoIsMutable();
          chunkInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          chunkInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public Builder addChunkInfo(ChunkServer.ChunkInfo value) {
        if (chunkInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunkInfoIsMutable();
          chunkInfo_.add(value);
          onChanged();
        } else {
          chunkInfoBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public Builder addChunkInfo(
          int index, ChunkServer.ChunkInfo value) {
        if (chunkInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunkInfoIsMutable();
          chunkInfo_.add(index, value);
          onChanged();
        } else {
          chunkInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public Builder addChunkInfo(
          ChunkServer.ChunkInfo.Builder builderForValue) {
        if (chunkInfoBuilder_ == null) {
          ensureChunkInfoIsMutable();
          chunkInfo_.add(builderForValue.build());
          onChanged();
        } else {
          chunkInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public Builder addChunkInfo(
          int index, ChunkServer.ChunkInfo.Builder builderForValue) {
        if (chunkInfoBuilder_ == null) {
          ensureChunkInfoIsMutable();
          chunkInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          chunkInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public Builder addAllChunkInfo(
          java.lang.Iterable<? extends ChunkServer.ChunkInfo> values) {
        if (chunkInfoBuilder_ == null) {
          ensureChunkInfoIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, chunkInfo_);
          onChanged();
        } else {
          chunkInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public Builder clearChunkInfo() {
        if (chunkInfoBuilder_ == null) {
          chunkInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          chunkInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public Builder removeChunkInfo(int index) {
        if (chunkInfoBuilder_ == null) {
          ensureChunkInfoIsMutable();
          chunkInfo_.remove(index);
          onChanged();
        } else {
          chunkInfoBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public ChunkServer.ChunkInfo.Builder getChunkInfoBuilder(
          int index) {
        return getChunkInfoFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public ChunkServer.ChunkInfoOrBuilder getChunkInfoOrBuilder(
          int index) {
        if (chunkInfoBuilder_ == null) {
          return chunkInfo_.get(index);  } else {
          return chunkInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public java.util.List<? extends ChunkServer.ChunkInfoOrBuilder> 
           getChunkInfoOrBuilderList() {
        if (chunkInfoBuilder_ != null) {
          return chunkInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(chunkInfo_);
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public ChunkServer.ChunkInfo.Builder addChunkInfoBuilder() {
        return getChunkInfoFieldBuilder().addBuilder(ChunkServer.ChunkInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public ChunkServer.ChunkInfo.Builder addChunkInfoBuilder(
          int index) {
        return getChunkInfoFieldBuilder().addBuilder(index, ChunkServer.ChunkInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.ChunkInfo chunk_info = 2;</code>
       */
      public java.util.List<ChunkServer.ChunkInfo.Builder> 
           getChunkInfoBuilderList() {
        return getChunkInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.ChunkInfo, ChunkServer.ChunkInfo.Builder, ChunkServer.ChunkInfoOrBuilder> 
          getChunkInfoFieldBuilder() {
        if (chunkInfoBuilder_ == null) {
          chunkInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.ChunkInfo, ChunkServer.ChunkInfo.Builder, ChunkServer.ChunkInfoOrBuilder>(
                  chunkInfo_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          chunkInfo_ = null;
        }
        return chunkInfoBuilder_;
      }

      private java.lang.Object storageContainerKey_ = "";
      /**
       * <code>required string storage_container_key = 3;</code>
       */
      public boolean hasStorageContainerKey() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string storage_container_key = 3;</code>
       */
      public java.lang.String getStorageContainerKey() {
        java.lang.Object ref = storageContainerKey_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            storageContainerKey_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string storage_container_key = 3;</code>
       */
      public com.google.protobuf.ByteString
          getStorageContainerKeyBytes() {
        java.lang.Object ref = storageContainerKey_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          storageContainerKey_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string storage_container_key = 3;</code>
       */
      public Builder setStorageContainerKey(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        storageContainerKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string storage_container_key = 3;</code>
       */
      public Builder clearStorageContainerKey() {
        bitField0_ = (bitField0_ & ~0x00000004);
        storageContainerKey_ = getDefaultInstance().getStorageContainerKey();
        onChanged();
        return this;
      }
      /**
       * <code>required string storage_container_key = 3;</code>
       */
      public Builder setStorageContainerKeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        storageContainerKey_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object storageContainerAuthorizationToken_ = "";
      /**
       * <code>required string storage_container_authorization_token = 4;</code>
       */
      public boolean hasStorageContainerAuthorizationToken() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string storage_container_authorization_token = 4;</code>
       */
      public java.lang.String getStorageContainerAuthorizationToken() {
        java.lang.Object ref = storageContainerAuthorizationToken_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            storageContainerAuthorizationToken_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string storage_container_authorization_token = 4;</code>
       */
      public com.google.protobuf.ByteString
          getStorageContainerAuthorizationTokenBytes() {
        java.lang.Object ref = storageContainerAuthorizationToken_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          storageContainerAuthorizationToken_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string storage_container_authorization_token = 4;</code>
       */
      public Builder setStorageContainerAuthorizationToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        storageContainerAuthorizationToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string storage_container_authorization_token = 4;</code>
       */
      public Builder clearStorageContainerAuthorizationToken() {
        bitField0_ = (bitField0_ & ~0x00000008);
        storageContainerAuthorizationToken_ = getDefaultInstance().getStorageContainerAuthorizationToken();
        onChanged();
        return this;
      }
      /**
       * <code>required string storage_container_authorization_token = 4;</code>
       */
      public Builder setStorageContainerAuthorizationTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        storageContainerAuthorizationToken_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.StorageHostChunkList)
    }

    static {
      defaultInstance = new StorageHostChunkList(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.StorageHostChunkList)
  }

  public interface StorageHostChunkListsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:chunkserver.StorageHostChunkLists)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    java.util.List<ChunkServer.StorageHostChunkList> 
        getStorageHostChunkListList();
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    ChunkServer.StorageHostChunkList getStorageHostChunkList(int index);
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    int getStorageHostChunkListCount();
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    java.util.List<? extends ChunkServer.StorageHostChunkListOrBuilder> 
        getStorageHostChunkListOrBuilderList();
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    ChunkServer.StorageHostChunkListOrBuilder getStorageHostChunkListOrBuilder(
        int index);

    /**
     * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
     */
    java.util.List<ChunkServer.ChunkError> 
        getChunkErrorList();
    /**
     * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
     */
    ChunkServer.ChunkError getChunkError(int index);
    /**
     * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
     */
    int getChunkErrorCount();
    /**
     * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
     */
    java.util.List<? extends ChunkServer.ChunkErrorOrBuilder> 
        getChunkErrorOrBuilderList();
    /**
     * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
     */
    ChunkServer.ChunkErrorOrBuilder getChunkErrorOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code chunkserver.StorageHostChunkLists}
   */
  public static final class StorageHostChunkLists extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:chunkserver.StorageHostChunkLists)
      StorageHostChunkListsOrBuilder {
    // Use StorageHostChunkLists.newBuilder() to construct.
    private StorageHostChunkLists(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StorageHostChunkLists(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StorageHostChunkLists defaultInstance;
    public static StorageHostChunkLists getDefaultInstance() {
      return defaultInstance;
    }

    public StorageHostChunkLists getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StorageHostChunkLists(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                storageHostChunkList_ = new java.util.ArrayList<ChunkServer.StorageHostChunkList>();
                mutable_bitField0_ |= 0x00000001;
              }
              storageHostChunkList_.add(input.readMessage(ChunkServer.StorageHostChunkList.PARSER, extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                chunkError_ = new java.util.ArrayList<ChunkServer.ChunkError>();
                mutable_bitField0_ |= 0x00000002;
              }
              chunkError_.add(input.readMessage(ChunkServer.ChunkError.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          storageHostChunkList_ = java.util.Collections.unmodifiableList(storageHostChunkList_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          chunkError_ = java.util.Collections.unmodifiableList(chunkError_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChunkServer.internal_static_chunkserver_StorageHostChunkLists_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChunkServer.internal_static_chunkserver_StorageHostChunkLists_fieldAccessorTable
          .ensureFieldAccessorsInitialized(ChunkServer.StorageHostChunkLists.class, ChunkServer.StorageHostChunkLists.Builder.class);
    }

    public static com.google.protobuf.Parser<StorageHostChunkLists> PARSER =
        new com.google.protobuf.AbstractParser<StorageHostChunkLists>() {
      public StorageHostChunkLists parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StorageHostChunkLists(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StorageHostChunkLists> getParserForType() {
      return PARSER;
    }

    public static final int STORAGE_HOST_CHUNK_LIST_FIELD_NUMBER = 1;
    private java.util.List<ChunkServer.StorageHostChunkList> storageHostChunkList_;
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    public java.util.List<ChunkServer.StorageHostChunkList> getStorageHostChunkListList() {
      return storageHostChunkList_;
    }
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    public java.util.List<? extends ChunkServer.StorageHostChunkListOrBuilder> 
        getStorageHostChunkListOrBuilderList() {
      return storageHostChunkList_;
    }
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    public int getStorageHostChunkListCount() {
      return storageHostChunkList_.size();
    }
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    public ChunkServer.StorageHostChunkList getStorageHostChunkList(int index) {
      return storageHostChunkList_.get(index);
    }
    /**
     * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
     */
    public ChunkServer.StorageHostChunkListOrBuilder getStorageHostChunkListOrBuilder(
        int index) {
      return storageHostChunkList_.get(index);
    }

    public static final int CHUNK_ERROR_FIELD_NUMBER = 2;
    private java.util.List<ChunkServer.ChunkError> chunkError_;
    /**
     * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
     */
    public java.util.List<ChunkServer.ChunkError> getChunkErrorList() {
      return chunkError_;
    }
    /**
     * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
     */
    public java.util.List<? extends ChunkServer.ChunkErrorOrBuilder> 
        getChunkErrorOrBuilderList() {
      return chunkError_;
    }
    /**
     * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
     */
    public int getChunkErrorCount() {
      return chunkError_.size();
    }
    /**
     * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
     */
    public ChunkServer.ChunkError getChunkError(int index) {
      return chunkError_.get(index);
    }
    /**
     * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
     */
    public ChunkServer.ChunkErrorOrBuilder getChunkErrorOrBuilder(
        int index) {
      return chunkError_.get(index);
    }

    private void initFields() {
      storageHostChunkList_ = java.util.Collections.emptyList();
      chunkError_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getStorageHostChunkListCount(); i++) {
        if (!getStorageHostChunkList(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getChunkErrorCount(); i++) {
        if (!getChunkError(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < storageHostChunkList_.size(); i++) {
        output.writeMessage(1, storageHostChunkList_.get(i));
      }
      for (int i = 0; i < chunkError_.size(); i++) {
        output.writeMessage(2, chunkError_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < storageHostChunkList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, storageHostChunkList_.get(i));
      }
      for (int i = 0; i < chunkError_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, chunkError_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ChunkServer.StorageHostChunkLists parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.StorageHostChunkLists parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.StorageHostChunkLists parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChunkServer.StorageHostChunkLists parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChunkServer.StorageHostChunkLists parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.StorageHostChunkLists parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ChunkServer.StorageHostChunkLists parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ChunkServer.StorageHostChunkLists parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ChunkServer.StorageHostChunkLists parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ChunkServer.StorageHostChunkLists parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ChunkServer.StorageHostChunkLists prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code chunkserver.StorageHostChunkLists}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:chunkserver.StorageHostChunkLists)
        ChunkServer.StorageHostChunkListsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChunkServer.internal_static_chunkserver_StorageHostChunkLists_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChunkServer.internal_static_chunkserver_StorageHostChunkLists_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChunkServer.StorageHostChunkLists.class, ChunkServer.StorageHostChunkLists.Builder.class);
      }

      // Construct using Chunkserver.StorageHostChunkLists.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getStorageHostChunkListFieldBuilder();
          getChunkErrorFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (storageHostChunkListBuilder_ == null) {
          storageHostChunkList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          storageHostChunkListBuilder_.clear();
        }
        if (chunkErrorBuilder_ == null) {
          chunkError_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          chunkErrorBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChunkServer.internal_static_chunkserver_StorageHostChunkLists_descriptor;
      }

      public ChunkServer.StorageHostChunkLists getDefaultInstanceForType() {
        return ChunkServer.StorageHostChunkLists.getDefaultInstance();
      }

      public ChunkServer.StorageHostChunkLists build() {
        ChunkServer.StorageHostChunkLists result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ChunkServer.StorageHostChunkLists buildPartial() {
        ChunkServer.StorageHostChunkLists result = new ChunkServer.StorageHostChunkLists(this);
        int from_bitField0_ = bitField0_;
        if (storageHostChunkListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            storageHostChunkList_ = java.util.Collections.unmodifiableList(storageHostChunkList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.storageHostChunkList_ = storageHostChunkList_;
        } else {
          result.storageHostChunkList_ = storageHostChunkListBuilder_.build();
        }
        if (chunkErrorBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            chunkError_ = java.util.Collections.unmodifiableList(chunkError_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.chunkError_ = chunkError_;
        } else {
          result.chunkError_ = chunkErrorBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChunkServer.StorageHostChunkLists) {
          return mergeFrom((ChunkServer.StorageHostChunkLists)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChunkServer.StorageHostChunkLists other) {
        if (other == ChunkServer.StorageHostChunkLists.getDefaultInstance()) return this;
        if (storageHostChunkListBuilder_ == null) {
          if (!other.storageHostChunkList_.isEmpty()) {
            if (storageHostChunkList_.isEmpty()) {
              storageHostChunkList_ = other.storageHostChunkList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureStorageHostChunkListIsMutable();
              storageHostChunkList_.addAll(other.storageHostChunkList_);
            }
            onChanged();
          }
        } else {
          if (!other.storageHostChunkList_.isEmpty()) {
            if (storageHostChunkListBuilder_.isEmpty()) {
              storageHostChunkListBuilder_.dispose();
              storageHostChunkListBuilder_ = null;
              storageHostChunkList_ = other.storageHostChunkList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              storageHostChunkListBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getStorageHostChunkListFieldBuilder() : null;
            } else {
              storageHostChunkListBuilder_.addAllMessages(other.storageHostChunkList_);
            }
          }
        }
        if (chunkErrorBuilder_ == null) {
          if (!other.chunkError_.isEmpty()) {
            if (chunkError_.isEmpty()) {
              chunkError_ = other.chunkError_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureChunkErrorIsMutable();
              chunkError_.addAll(other.chunkError_);
            }
            onChanged();
          }
        } else {
          if (!other.chunkError_.isEmpty()) {
            if (chunkErrorBuilder_.isEmpty()) {
              chunkErrorBuilder_.dispose();
              chunkErrorBuilder_ = null;
              chunkError_ = other.chunkError_;
              bitField0_ = (bitField0_ & ~0x00000002);
              chunkErrorBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getChunkErrorFieldBuilder() : null;
            } else {
              chunkErrorBuilder_.addAllMessages(other.chunkError_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getStorageHostChunkListCount(); i++) {
          if (!getStorageHostChunkList(i).isInitialized()) {
            
            return false;
          }
        }
        for (int i = 0; i < getChunkErrorCount(); i++) {
          if (!getChunkError(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChunkServer.StorageHostChunkLists parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChunkServer.StorageHostChunkLists) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<ChunkServer.StorageHostChunkList> storageHostChunkList_ =
        java.util.Collections.emptyList();
      private void ensureStorageHostChunkListIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          storageHostChunkList_ = new java.util.ArrayList<ChunkServer.StorageHostChunkList>(storageHostChunkList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.StorageHostChunkList, ChunkServer.StorageHostChunkList.Builder, ChunkServer.StorageHostChunkListOrBuilder> storageHostChunkListBuilder_;

      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public java.util.List<ChunkServer.StorageHostChunkList> getStorageHostChunkListList() {
        if (storageHostChunkListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(storageHostChunkList_);
        } else {
          return storageHostChunkListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public int getStorageHostChunkListCount() {
        if (storageHostChunkListBuilder_ == null) {
          return storageHostChunkList_.size();
        } else {
          return storageHostChunkListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public ChunkServer.StorageHostChunkList getStorageHostChunkList(int index) {
        if (storageHostChunkListBuilder_ == null) {
          return storageHostChunkList_.get(index);
        } else {
          return storageHostChunkListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder setStorageHostChunkList(
          int index, ChunkServer.StorageHostChunkList value) {
        if (storageHostChunkListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStorageHostChunkListIsMutable();
          storageHostChunkList_.set(index, value);
          onChanged();
        } else {
          storageHostChunkListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder setStorageHostChunkList(
          int index, ChunkServer.StorageHostChunkList.Builder builderForValue) {
        if (storageHostChunkListBuilder_ == null) {
          ensureStorageHostChunkListIsMutable();
          storageHostChunkList_.set(index, builderForValue.build());
          onChanged();
        } else {
          storageHostChunkListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder addStorageHostChunkList(ChunkServer.StorageHostChunkList value) {
        if (storageHostChunkListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStorageHostChunkListIsMutable();
          storageHostChunkList_.add(value);
          onChanged();
        } else {
          storageHostChunkListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder addStorageHostChunkList(
          int index, ChunkServer.StorageHostChunkList value) {
        if (storageHostChunkListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStorageHostChunkListIsMutable();
          storageHostChunkList_.add(index, value);
          onChanged();
        } else {
          storageHostChunkListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder addStorageHostChunkList(
          ChunkServer.StorageHostChunkList.Builder builderForValue) {
        if (storageHostChunkListBuilder_ == null) {
          ensureStorageHostChunkListIsMutable();
          storageHostChunkList_.add(builderForValue.build());
          onChanged();
        } else {
          storageHostChunkListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder addStorageHostChunkList(
          int index, ChunkServer.StorageHostChunkList.Builder builderForValue) {
        if (storageHostChunkListBuilder_ == null) {
          ensureStorageHostChunkListIsMutable();
          storageHostChunkList_.add(index, builderForValue.build());
          onChanged();
        } else {
          storageHostChunkListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder addAllStorageHostChunkList(
          java.lang.Iterable<? extends ChunkServer.StorageHostChunkList> values) {
        if (storageHostChunkListBuilder_ == null) {
          ensureStorageHostChunkListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, storageHostChunkList_);
          onChanged();
        } else {
          storageHostChunkListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder clearStorageHostChunkList() {
        if (storageHostChunkListBuilder_ == null) {
          storageHostChunkList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          storageHostChunkListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public Builder removeStorageHostChunkList(int index) {
        if (storageHostChunkListBuilder_ == null) {
          ensureStorageHostChunkListIsMutable();
          storageHostChunkList_.remove(index);
          onChanged();
        } else {
          storageHostChunkListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public ChunkServer.StorageHostChunkList.Builder getStorageHostChunkListBuilder(
          int index) {
        return getStorageHostChunkListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public ChunkServer.StorageHostChunkListOrBuilder getStorageHostChunkListOrBuilder(
          int index) {
        if (storageHostChunkListBuilder_ == null) {
          return storageHostChunkList_.get(index);  } else {
          return storageHostChunkListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public java.util.List<? extends ChunkServer.StorageHostChunkListOrBuilder> 
           getStorageHostChunkListOrBuilderList() {
        if (storageHostChunkListBuilder_ != null) {
          return storageHostChunkListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(storageHostChunkList_);
        }
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public ChunkServer.StorageHostChunkList.Builder addStorageHostChunkListBuilder() {
        return getStorageHostChunkListFieldBuilder().addBuilder(ChunkServer.StorageHostChunkList.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public ChunkServer.StorageHostChunkList.Builder addStorageHostChunkListBuilder(
          int index) {
        return getStorageHostChunkListFieldBuilder().addBuilder(index, ChunkServer.StorageHostChunkList.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.StorageHostChunkList storage_host_chunk_list = 1;</code>
       */
      public java.util.List<ChunkServer.StorageHostChunkList.Builder> 
           getStorageHostChunkListBuilderList() {
        return getStorageHostChunkListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.StorageHostChunkList, ChunkServer.StorageHostChunkList.Builder, ChunkServer.StorageHostChunkListOrBuilder> 
          getStorageHostChunkListFieldBuilder() {
        if (storageHostChunkListBuilder_ == null) {
          storageHostChunkListBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.StorageHostChunkList, ChunkServer.StorageHostChunkList.Builder, ChunkServer.StorageHostChunkListOrBuilder>(
                  storageHostChunkList_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          storageHostChunkList_ = null;
        }
        return storageHostChunkListBuilder_;
      }

      private java.util.List<ChunkServer.ChunkError> chunkError_ =
        java.util.Collections.emptyList();
      private void ensureChunkErrorIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          chunkError_ = new java.util.ArrayList<ChunkServer.ChunkError>(chunkError_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.ChunkError, ChunkServer.ChunkError.Builder, ChunkServer.ChunkErrorOrBuilder> chunkErrorBuilder_;

      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public java.util.List<ChunkServer.ChunkError> getChunkErrorList() {
        if (chunkErrorBuilder_ == null) {
          return java.util.Collections.unmodifiableList(chunkError_);
        } else {
          return chunkErrorBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public int getChunkErrorCount() {
        if (chunkErrorBuilder_ == null) {
          return chunkError_.size();
        } else {
          return chunkErrorBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public ChunkServer.ChunkError getChunkError(int index) {
        if (chunkErrorBuilder_ == null) {
          return chunkError_.get(index);
        } else {
          return chunkErrorBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public Builder setChunkError(
          int index, ChunkServer.ChunkError value) {
        if (chunkErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunkErrorIsMutable();
          chunkError_.set(index, value);
          onChanged();
        } else {
          chunkErrorBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public Builder setChunkError(
          int index, ChunkServer.ChunkError.Builder builderForValue) {
        if (chunkErrorBuilder_ == null) {
          ensureChunkErrorIsMutable();
          chunkError_.set(index, builderForValue.build());
          onChanged();
        } else {
          chunkErrorBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public Builder addChunkError(ChunkServer.ChunkError value) {
        if (chunkErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunkErrorIsMutable();
          chunkError_.add(value);
          onChanged();
        } else {
          chunkErrorBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public Builder addChunkError(
          int index, ChunkServer.ChunkError value) {
        if (chunkErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunkErrorIsMutable();
          chunkError_.add(index, value);
          onChanged();
        } else {
          chunkErrorBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public Builder addChunkError(
          ChunkServer.ChunkError.Builder builderForValue) {
        if (chunkErrorBuilder_ == null) {
          ensureChunkErrorIsMutable();
          chunkError_.add(builderForValue.build());
          onChanged();
        } else {
          chunkErrorBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public Builder addChunkError(
          int index, ChunkServer.ChunkError.Builder builderForValue) {
        if (chunkErrorBuilder_ == null) {
          ensureChunkErrorIsMutable();
          chunkError_.add(index, builderForValue.build());
          onChanged();
        } else {
          chunkErrorBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public Builder addAllChunkError(
          java.lang.Iterable<? extends ChunkServer.ChunkError> values) {
        if (chunkErrorBuilder_ == null) {
          ensureChunkErrorIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, chunkError_);
          onChanged();
        } else {
          chunkErrorBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public Builder clearChunkError() {
        if (chunkErrorBuilder_ == null) {
          chunkError_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          chunkErrorBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public Builder removeChunkError(int index) {
        if (chunkErrorBuilder_ == null) {
          ensureChunkErrorIsMutable();
          chunkError_.remove(index);
          onChanged();
        } else {
          chunkErrorBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public ChunkServer.ChunkError.Builder getChunkErrorBuilder(
          int index) {
        return getChunkErrorFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public ChunkServer.ChunkErrorOrBuilder getChunkErrorOrBuilder(
          int index) {
        if (chunkErrorBuilder_ == null) {
          return chunkError_.get(index);  } else {
          return chunkErrorBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public java.util.List<? extends ChunkServer.ChunkErrorOrBuilder> 
           getChunkErrorOrBuilderList() {
        if (chunkErrorBuilder_ != null) {
          return chunkErrorBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(chunkError_);
        }
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public ChunkServer.ChunkError.Builder addChunkErrorBuilder() {
        return getChunkErrorFieldBuilder().addBuilder(ChunkServer.ChunkError.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public ChunkServer.ChunkError.Builder addChunkErrorBuilder(
          int index) {
        return getChunkErrorFieldBuilder().addBuilder(index, ChunkServer.ChunkError.getDefaultInstance());
      }
      /**
       * <code>repeated .chunkserver.ChunkError chunk_error = 2;</code>
       */
      public java.util.List<ChunkServer.ChunkError.Builder> 
           getChunkErrorBuilderList() {
        return getChunkErrorFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ChunkServer.ChunkError, ChunkServer.ChunkError.Builder, ChunkServer.ChunkErrorOrBuilder> 
          getChunkErrorFieldBuilder() {
        if (chunkErrorBuilder_ == null) {
          chunkErrorBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ChunkServer.ChunkError, ChunkServer.ChunkError.Builder, ChunkServer.ChunkErrorOrBuilder>(
                  chunkError_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          chunkError_ = null;
        }
        return chunkErrorBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:chunkserver.StorageHostChunkLists)
    }

    static {
      defaultInstance = new StorageHostChunkLists(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:chunkserver.StorageHostChunkLists)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_ChunkInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_ChunkInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_NameValuePair_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_NameValuePair_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_HostInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_HostInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_ErrorResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_ErrorResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_FileError_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_FileError_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_ChunkError_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_ChunkError_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_ChunkErrorIndex_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_ChunkErrorIndex_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_FileChunkError_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_FileChunkError_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_StorageContainerError_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_StorageContainerError_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_MethodCompletionInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_MethodCompletionInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_MethodCompletionInfoList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_MethodCompletionInfoList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_FileChunkList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_FileChunkList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_FileChunkLists_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_FileChunkLists_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_StorageContainerChunkList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_StorageContainerChunkList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_StorageContainerChunkLists_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_StorageContainerChunkLists_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_StorageContainerErrorList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_StorageContainerErrorList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_FileChecksumAuthorization_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_FileChecksumAuthorization_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_FileChecksumAuthorizationList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_FileChecksumAuthorizationList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_ChunkReference_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_ChunkReference_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_FileChecksumChunkReferences_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_FileChecksumChunkReferences_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_FileChecksumStorageHostChunkLists_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_FileChecksumStorageHostChunkLists_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_FileGroups_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_FileGroups_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_ChunkChecksumList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_ChunkChecksumList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_StorageHostChunkList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_StorageHostChunkList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chunkserver_StorageHostChunkLists_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chunkserver_StorageHostChunkLists_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021chunkserver.proto\022\013chunkserver\"W\n\tChun" +
      "kInfo\022\026\n\016chunk_checksum\030\001 \002(\014\022\034\n\024chunk_e" +
      "ncryption_key\030\002 \001(\014\022\024\n\014chunk_length\030\003 \002(" +
      "\r\",\n\rNameValuePair\022\014\n\004name\030\001 \002(\t\022\r\n\005valu" +
      "e\030\002 \002(\t\"\304\001\n\010HostInfo\022\020\n\010hostname\030\001 \002(\t\022\014" +
      "\n\004port\030\002 \002(\r\022\016\n\006method\030\003 \002(\t\022\013\n\003uri\030\004 \002(" +
      "\t\022\032\n\022transport_protocol\030\005 \002(\t\022\"\n\032transpo" +
      "rt_protocol_version\030\006 \002(\t\022\016\n\006scheme\030\007 \002(" +
      "\t\022+\n\007headers\030\010 \003(\0132\032.chunkserver.NameVal" +
      "uePair\"\272\001\n\rErrorResponse\022\016\n\006domain\030\001 \002(\t",
      "\022\022\n\nerror_code\030\002 \002(\005\022\031\n\021error_descriptio" +
      "n\030\003 \001(\t\0225\n\021underlying_errors\030\004 \003(\0132\032.chu" +
      "nkserver.ErrorResponse\0223\n\017name_value_pai" +
      "r\030\005 \003(\0132\032.chunkserver.NameValuePair\"V\n\tF" +
      "ileError\022\025\n\rfile_checksum\030\001 \002(\014\0222\n\016error" +
      "_response\030\002 \002(\0132\032.chunkserver.ErrorRespo" +
      "nse\"X\n\nChunkError\022\026\n\016chunk_checksum\030\001 \002(" +
      "\014\0222\n\016error_response\030\002 \002(\0132\032.chunkserver." +
      "ErrorResponse\"r\n\017ChunkErrorIndex\022\026\n\016chun" +
      "k_checksum\030\001 \002(\014\0222\n\016error_response\030\002 \002(\013",
      "2\032.chunkserver.ErrorResponse\022\023\n\013chunk_in" +
      "dex\030\003 \002(\r\"Z\n\016FileChunkError\022\025\n\rfile_chec" +
      "ksum\030\001 \002(\014\0221\n\013chunk_error\030\002 \003(\0132\034.chunks" +
      "erver.ChunkErrorIndex\"j\n\025StorageContaine" +
      "rError\022\035\n\025storage_container_key\030\001 \002(\t\0222\n" +
      "\016error_response\030\002 \002(\0132\032.chunkserver.Erro" +
      "rResponse\"\224\003\n\024MethodCompletionInfo\022\013\n\003ur" +
      "l\030\001 \002(\t\022\034\n\024response_status_code\030\002 \002(\r\022\034\n" +
      "\024response_status_line\030\003 \001(\t\022;\n\027vendor_re" +
      "sponse_headers\030\004 \003(\0132\032.chunkserver.NameV",
      "aluePair\022\025\n\rresponse_body\030\005 \001(\014\022)\n\005error" +
      "\030\006 \001(\0132\032.chunkserver.ErrorResponse\022\033\n\023cl" +
      "ient_computed_md5\030\007 \001(\014\0223\n\017vendor_nv_pai" +
      "rs\030\010 \003(\0132\032.chunkserver.NameValuePair\0223\n\017" +
      "client_nv_pairs\030\t \003(\0132\032.chunkserver.Name" +
      "ValuePair\022-\n%storage_container_authoriza" +
      "tion_token\030\n \002(\t\"]\n\030MethodCompletionInfo" +
      "List\022A\n\026method_completion_info\030\001 \003(\0132!.c" +
      "hunkserver.MethodCompletionInfo\"i\n\rFileC" +
      "hunkList\022\025\n\rfile_checksum\030\001 \002(\014\022\025\n\rautho",
      "rization\030\002 \002(\t\022*\n\nchunk_info\030\003 \003(\0132\026.chu" +
      "nkserver.ChunkInfo\"E\n\016FileChunkLists\0223\n\017" +
      "file_chunk_list\030\001 \003(\0132\032.chunkserver.File" +
      "ChunkList\"\253\001\n\031StorageContainerChunkList\022" +
      "\035\n\025storage_container_key\030\001 \002(\014\022(\n\thost_i" +
      "nfo\030\002 \002(\0132\025.chunkserver.HostInfo\022\026\n\016chun" +
      "k_checksum\030\003 \003(\014\022-\n%storage_container_au" +
      "thorization_token\030\004 \002(\t\"\257\001\n\032StorageConta" +
      "inerChunkLists\022L\n\034storage_container_chun" +
      "k_list\030\001 \003(\0132&.chunkserver.StorageContai",
      "nerChunkList\022*\n\nfile_error\030\002 \003(\0132\026.chunk" +
      "server.FileError\022\027\n\017verbosity_level\030\003 \001(" +
      "\r\"`\n\031StorageContainerErrorList\022C\n\027storag" +
      "e_container_error\030\001 \003(\0132\".chunkserver.St" +
      "orageContainerError\"b\n\031FileChecksumAutho" +
      "rization\022\025\n\rfile_checksum\030\001 \002(\014\022\025\n\rautho" +
      "rization\030\002 \002(\t\022\027\n\017chunk_checksums\030\003 \003(\014\"" +
      "l\n\035FileChecksumAuthorizationList\022K\n\033file" +
      "_checksum_authorization\030\001 \003(\0132&.chunkser" +
      "ver.FileChecksumAuthorization\">\n\016ChunkRe",
      "ference\022\027\n\017container_index\030\001 \002(\004\022\023\n\013chun" +
      "k_index\030\002 \002(\004\"k\n\033FileChecksumChunkRefere" +
      "nces\022\025\n\rfile_checksum\030\001 \002(\014\0225\n\020chunk_ref" +
      "erences\030\002 \003(\0132\033.chunkserver.ChunkReferen" +
      "ce\"\271\001\n!FileChecksumStorageHostChunkLists" +
      "\022B\n\027storage_host_chunk_list\030\001 \003(\0132!.chun" +
      "kserver.StorageHostChunkList\022P\n\036file_che" +
      "cksum_chunk_references\030\002 \003(\0132(.chunkserv" +
      "er.FileChecksumChunkReferences\"\315\001\n\nFileG" +
      "roups\022C\n\013file_groups\030\001 \003(\0132..chunkserver",
      ".FileChecksumStorageHostChunkLists\022*\n\nfi" +
      "le_error\030\002 \003(\0132\026.chunkserver.FileError\0225" +
      "\n\020file_chunk_error\030\003 \003(\0132\033.chunkserver.F" +
      "ileChunkError\022\027\n\017verbosity_level\030\004 \001(\r\"+" +
      "\n\021ChunkChecksumList\022\026\n\016chunk_checksum\030\001 " +
      "\003(\014\"\272\001\n\024StorageHostChunkList\022(\n\thost_inf" +
      "o\030\001 \002(\0132\025.chunkserver.HostInfo\022*\n\nchunk_" +
      "info\030\002 \003(\0132\026.chunkserver.ChunkInfo\022\035\n\025st" +
      "orage_container_key\030\003 \002(\t\022-\n%storage_con" +
      "tainer_authorization_token\030\004 \002(\t\"\211\001\n\025Sto",
      "rageHostChunkLists\022B\n\027storage_host_chunk" +
      "_list\030\001 \003(\0132!.chunkserver.StorageHostChu" +
      "nkList\022,\n\013chunk_error\030\002 \003(\0132\027.chunkserve" +
      "r.ChunkError"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_chunkserver_ChunkInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chunkserver_ChunkInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_ChunkInfo_descriptor,
        new java.lang.String[] { "ChunkChecksum", "ChunkEncryptionKey", "ChunkLength", });
    internal_static_chunkserver_NameValuePair_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chunkserver_NameValuePair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_NameValuePair_descriptor,
        new java.lang.String[] { "Name", "Value", });
    internal_static_chunkserver_HostInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chunkserver_HostInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_HostInfo_descriptor,
        new java.lang.String[] { "Hostname", "Port", "Method", "Uri", "TransportProtocol", "TransportProtocolVersion", "Scheme", "Headers", });
    internal_static_chunkserver_ErrorResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chunkserver_ErrorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_ErrorResponse_descriptor,
        new java.lang.String[] { "Domain", "ErrorCode", "ErrorDescription", "UnderlyingErrors", "NameValuePair", });
    internal_static_chunkserver_FileError_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_chunkserver_FileError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_FileError_descriptor,
        new java.lang.String[] { "FileChecksum", "ErrorResponse", });
    internal_static_chunkserver_ChunkError_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_chunkserver_ChunkError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_ChunkError_descriptor,
        new java.lang.String[] { "ChunkChecksum", "ErrorResponse", });
    internal_static_chunkserver_ChunkErrorIndex_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_chunkserver_ChunkErrorIndex_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_ChunkErrorIndex_descriptor,
        new java.lang.String[] { "ChunkChecksum", "ErrorResponse", "ChunkIndex", });
    internal_static_chunkserver_FileChunkError_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_chunkserver_FileChunkError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_FileChunkError_descriptor,
        new java.lang.String[] { "FileChecksum", "ChunkError", });
    internal_static_chunkserver_StorageContainerError_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_chunkserver_StorageContainerError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_StorageContainerError_descriptor,
        new java.lang.String[] { "StorageContainerKey", "ErrorResponse", });
    internal_static_chunkserver_MethodCompletionInfo_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_chunkserver_MethodCompletionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_MethodCompletionInfo_descriptor,
        new java.lang.String[] { "Url", "ResponseStatusCode", "ResponseStatusLine", "VendorResponseHeaders", "ResponseBody", "Error", "ClientComputedMd5", "VendorNvPairs", "ClientNvPairs", "StorageContainerAuthorizationToken", });
    internal_static_chunkserver_MethodCompletionInfoList_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_chunkserver_MethodCompletionInfoList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_MethodCompletionInfoList_descriptor,
        new java.lang.String[] { "MethodCompletionInfo", });
    internal_static_chunkserver_FileChunkList_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_chunkserver_FileChunkList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_FileChunkList_descriptor,
        new java.lang.String[] { "FileChecksum", "Authorization", "ChunkInfo", });
    internal_static_chunkserver_FileChunkLists_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_chunkserver_FileChunkLists_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_FileChunkLists_descriptor,
        new java.lang.String[] { "FileChunkList", });
    internal_static_chunkserver_StorageContainerChunkList_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_chunkserver_StorageContainerChunkList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_StorageContainerChunkList_descriptor,
        new java.lang.String[] { "StorageContainerKey", "HostInfo", "ChunkChecksum", "StorageContainerAuthorizationToken", });
    internal_static_chunkserver_StorageContainerChunkLists_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_chunkserver_StorageContainerChunkLists_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_StorageContainerChunkLists_descriptor,
        new java.lang.String[] { "StorageContainerChunkList", "FileError", "VerbosityLevel", });
    internal_static_chunkserver_StorageContainerErrorList_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_chunkserver_StorageContainerErrorList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_StorageContainerErrorList_descriptor,
        new java.lang.String[] { "StorageContainerError", });
    internal_static_chunkserver_FileChecksumAuthorization_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_chunkserver_FileChecksumAuthorization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_FileChecksumAuthorization_descriptor,
        new java.lang.String[] { "FileChecksum", "Authorization", "ChunkChecksums", });
    internal_static_chunkserver_FileChecksumAuthorizationList_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_chunkserver_FileChecksumAuthorizationList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_FileChecksumAuthorizationList_descriptor,
        new java.lang.String[] { "FileChecksumAuthorization", });
    internal_static_chunkserver_ChunkReference_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_chunkserver_ChunkReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_ChunkReference_descriptor,
        new java.lang.String[] { "ContainerIndex", "ChunkIndex", });
    internal_static_chunkserver_FileChecksumChunkReferences_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_chunkserver_FileChecksumChunkReferences_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_FileChecksumChunkReferences_descriptor,
        new java.lang.String[] { "FileChecksum", "ChunkReferences", });
    internal_static_chunkserver_FileChecksumStorageHostChunkLists_descriptor =
      getDescriptor().getMessageTypes().get(20);
    internal_static_chunkserver_FileChecksumStorageHostChunkLists_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_FileChecksumStorageHostChunkLists_descriptor,
        new java.lang.String[] { "StorageHostChunkList", "FileChecksumChunkReferences", });
    internal_static_chunkserver_FileGroups_descriptor =
      getDescriptor().getMessageTypes().get(21);
    internal_static_chunkserver_FileGroups_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_FileGroups_descriptor,
        new java.lang.String[] { "FileGroups", "FileError", "FileChunkError", "VerbosityLevel", });
    internal_static_chunkserver_ChunkChecksumList_descriptor =
      getDescriptor().getMessageTypes().get(22);
    internal_static_chunkserver_ChunkChecksumList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_ChunkChecksumList_descriptor,
        new java.lang.String[] { "ChunkChecksum", });
    internal_static_chunkserver_StorageHostChunkList_descriptor =
      getDescriptor().getMessageTypes().get(23);
    internal_static_chunkserver_StorageHostChunkList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_StorageHostChunkList_descriptor,
        new java.lang.String[] { "HostInfo", "ChunkInfo", "StorageContainerKey", "StorageContainerAuthorizationToken", });
    internal_static_chunkserver_StorageHostChunkLists_descriptor =
      getDescriptor().getMessageTypes().get(24);
    internal_static_chunkserver_StorageHostChunkLists_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chunkserver_StorageHostChunkLists_descriptor,
        new java.lang.String[] { "StorageHostChunkList", "ChunkError", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}