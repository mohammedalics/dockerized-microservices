// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package com.se7so.model;

public interface FindPasswordsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.se7so.model.FindPasswordsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 numOfMatches = 1;</code>
   */
  int getNumOfMatches();

  /**
   * <code>repeated string matches = 2;</code>
   */
  java.util.List<java.lang.String>
      getMatchesList();
  /**
   * <code>repeated string matches = 2;</code>
   */
  int getMatchesCount();
  /**
   * <code>repeated string matches = 2;</code>
   */
  java.lang.String getMatches(int index);
  /**
   * <code>repeated string matches = 2;</code>
   */
  com.google.protobuf.ByteString
      getMatchesBytes(int index);
}