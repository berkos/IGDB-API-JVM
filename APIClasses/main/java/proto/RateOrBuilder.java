// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

public interface RateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Rate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>.proto.Game game = 2;</code>
   */
  boolean hasGame();
  /**
   * <code>.proto.Game game = 2;</code>
   */
  proto.Game getGame();
  /**
   * <code>.proto.Game game = 2;</code>
   */
  proto.GameOrBuilder getGameOrBuilder();

  /**
   * <code>double rating = 3;</code>
   */
  double getRating();

  /**
   * <code>.proto.User user = 4;</code>
   */
  boolean hasUser();
  /**
   * <code>.proto.User user = 4;</code>
   */
  proto.User getUser();
  /**
   * <code>.proto.User user = 4;</code>
   */
  proto.UserOrBuilder getUserOrBuilder();
}