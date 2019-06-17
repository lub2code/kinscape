// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Next request to get a script's actions.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.NextScriptActionsRequestProto}
 */
public  final class NextScriptActionsRequestProto extends
    com.google.protobuf.GeneratedMessageLite<
        NextScriptActionsRequestProto, NextScriptActionsRequestProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.NextScriptActionsRequestProto)
    NextScriptActionsRequestProtoOrBuilder {
  private NextScriptActionsRequestProto() {
    processedActions_ = emptyProtobufList();
  }
  public static final int PROCESSED_ACTIONS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto> processedActions_;
  /**
   * <pre>
   * The result of processing each ActionProto from the previous response. This
   * field must be in the same order as the actions in the original response.
   * It may have less actions in case of failure.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
   */
  public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto> getProcessedActionsList() {
    return processedActions_;
  }
  /**
   * <pre>
   * The result of processing each ActionProto from the previous response. This
   * field must be in the same order as the actions in the original response.
   * It may have less actions in case of failure.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
   */
  public java.util.List<? extends org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProtoOrBuilder> 
      getProcessedActionsOrBuilderList() {
    return processedActions_;
  }
  /**
   * <pre>
   * The result of processing each ActionProto from the previous response. This
   * field must be in the same order as the actions in the original response.
   * It may have less actions in case of failure.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
   */
  public int getProcessedActionsCount() {
    return processedActions_.size();
  }
  /**
   * <pre>
   * The result of processing each ActionProto from the previous response. This
   * field must be in the same order as the actions in the original response.
   * It may have less actions in case of failure.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto getProcessedActions(int index) {
    return processedActions_.get(index);
  }
  /**
   * <pre>
   * The result of processing each ActionProto from the previous response. This
   * field must be in the same order as the actions in the original response.
   * It may have less actions in case of failure.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProtoOrBuilder getProcessedActionsOrBuilder(
      int index) {
    return processedActions_.get(index);
  }
  private void ensureProcessedActionsIsMutable() {
    if (!processedActions_.isModifiable()) {
      processedActions_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(processedActions_);
     }
  }

  /**
   * <pre>
   * The result of processing each ActionProto from the previous response. This
   * field must be in the same order as the actions in the original response.
   * It may have less actions in case of failure.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
   */
  private void setProcessedActions(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureProcessedActionsIsMutable();
    processedActions_.set(index, value);
  }
  /**
   * <pre>
   * The result of processing each ActionProto from the previous response. This
   * field must be in the same order as the actions in the original response.
   * It may have less actions in case of failure.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
   */
  private void setProcessedActions(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto.Builder builderForValue) {
    ensureProcessedActionsIsMutable();
    processedActions_.set(index, builderForValue.build());
  }
  /**
   * <pre>
   * The result of processing each ActionProto from the previous response. This
   * field must be in the same order as the actions in the original response.
   * It may have less actions in case of failure.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
   */
  private void addProcessedActions(org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureProcessedActionsIsMutable();
    processedActions_.add(value);
  }
  /**
   * <pre>
   * The result of processing each ActionProto from the previous response. This
   * field must be in the same order as the actions in the original response.
   * It may have less actions in case of failure.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
   */
  private void addProcessedActions(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureProcessedActionsIsMutable();
    processedActions_.add(index, value);
  }
  /**
   * <pre>
   * The result of processing each ActionProto from the previous response. This
   * field must be in the same order as the actions in the original response.
   * It may have less actions in case of failure.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
   */
  private void addProcessedActions(
      org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto.Builder builderForValue) {
    ensureProcessedActionsIsMutable();
    processedActions_.add(builderForValue.build());
  }
  /**
   * <pre>
   * The result of processing each ActionProto from the previous response. This
   * field must be in the same order as the actions in the original response.
   * It may have less actions in case of failure.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
   */
  private void addProcessedActions(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto.Builder builderForValue) {
    ensureProcessedActionsIsMutable();
    processedActions_.add(index, builderForValue.build());
  }
  /**
   * <pre>
   * The result of processing each ActionProto from the previous response. This
   * field must be in the same order as the actions in the original response.
   * It may have less actions in case of failure.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
   */
  private void addAllProcessedActions(
      java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto> values) {
    ensureProcessedActionsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, processedActions_);
  }
  /**
   * <pre>
   * The result of processing each ActionProto from the previous response. This
   * field must be in the same order as the actions in the original response.
   * It may have less actions in case of failure.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
   */
  private void clearProcessedActions() {
    processedActions_ = emptyProtobufList();
  }
  /**
   * <pre>
   * The result of processing each ActionProto from the previous response. This
   * field must be in the same order as the actions in the original response.
   * It may have less actions in case of failure.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
   */
  private void removeProcessedActions(int index) {
    ensureProcessedActionsIsMutable();
    processedActions_.remove(index);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < processedActions_.size(); i++) {
      output.writeMessage(1, processedActions_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < processedActions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, processedActions_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Next request to get a script's actions.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.NextScriptActionsRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.NextScriptActionsRequestProto)
      org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The result of processing each ActionProto from the previous response. This
     * field must be in the same order as the actions in the original response.
     * It may have less actions in case of failure.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
     */
    public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto> getProcessedActionsList() {
      return java.util.Collections.unmodifiableList(
          instance.getProcessedActionsList());
    }
    /**
     * <pre>
     * The result of processing each ActionProto from the previous response. This
     * field must be in the same order as the actions in the original response.
     * It may have less actions in case of failure.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
     */
    public int getProcessedActionsCount() {
      return instance.getProcessedActionsCount();
    }/**
     * <pre>
     * The result of processing each ActionProto from the previous response. This
     * field must be in the same order as the actions in the original response.
     * It may have less actions in case of failure.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto getProcessedActions(int index) {
      return instance.getProcessedActions(index);
    }
    /**
     * <pre>
     * The result of processing each ActionProto from the previous response. This
     * field must be in the same order as the actions in the original response.
     * It may have less actions in case of failure.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
     */
    public Builder setProcessedActions(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto value) {
      copyOnWrite();
      instance.setProcessedActions(index, value);
      return this;
    }
    /**
     * <pre>
     * The result of processing each ActionProto from the previous response. This
     * field must be in the same order as the actions in the original response.
     * It may have less actions in case of failure.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
     */
    public Builder setProcessedActions(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto.Builder builderForValue) {
      copyOnWrite();
      instance.setProcessedActions(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * The result of processing each ActionProto from the previous response. This
     * field must be in the same order as the actions in the original response.
     * It may have less actions in case of failure.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
     */
    public Builder addProcessedActions(org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto value) {
      copyOnWrite();
      instance.addProcessedActions(value);
      return this;
    }
    /**
     * <pre>
     * The result of processing each ActionProto from the previous response. This
     * field must be in the same order as the actions in the original response.
     * It may have less actions in case of failure.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
     */
    public Builder addProcessedActions(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto value) {
      copyOnWrite();
      instance.addProcessedActions(index, value);
      return this;
    }
    /**
     * <pre>
     * The result of processing each ActionProto from the previous response. This
     * field must be in the same order as the actions in the original response.
     * It may have less actions in case of failure.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
     */
    public Builder addProcessedActions(
        org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto.Builder builderForValue) {
      copyOnWrite();
      instance.addProcessedActions(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The result of processing each ActionProto from the previous response. This
     * field must be in the same order as the actions in the original response.
     * It may have less actions in case of failure.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
     */
    public Builder addProcessedActions(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto.Builder builderForValue) {
      copyOnWrite();
      instance.addProcessedActions(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * The result of processing each ActionProto from the previous response. This
     * field must be in the same order as the actions in the original response.
     * It may have less actions in case of failure.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
     */
    public Builder addAllProcessedActions(
        java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto> values) {
      copyOnWrite();
      instance.addAllProcessedActions(values);
      return this;
    }
    /**
     * <pre>
     * The result of processing each ActionProto from the previous response. This
     * field must be in the same order as the actions in the original response.
     * It may have less actions in case of failure.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
     */
    public Builder clearProcessedActions() {
      copyOnWrite();
      instance.clearProcessedActions();
      return this;
    }
    /**
     * <pre>
     * The result of processing each ActionProto from the previous response. This
     * field must be in the same order as the actions in the original response.
     * It may have less actions in case of failure.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ProcessedActionProto processed_actions = 1;</code>
     */
    public Builder removeProcessedActions(int index) {
      copyOnWrite();
      instance.removeProcessedActions(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.NextScriptActionsRequestProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        processedActions_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto other = (org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto) arg1;
        processedActions_= visitor.visitList(processedActions_, other.processedActions_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(tag, input)) {
                  done = true;
                }
                break;
              }
              case 10: {
                if (!processedActions_.isModifiable()) {
                  processedActions_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(processedActions_);
                }
                processedActions_.add(
                    input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto.parser(), extensionRegistry));
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:autofill_assistant.NextScriptActionsRequestProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new NextScriptActionsRequestProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<NextScriptActionsRequestProto> PARSER;

  public static com.google.protobuf.Parser<NextScriptActionsRequestProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

