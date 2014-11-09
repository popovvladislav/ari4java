package ch.loway.oss.ari4java.generated.ari_1_5_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Nov 08 18:09:34 CET 2014
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Base type for errors and events
 * 
 * Defined in file: events.json
 *********************************************************/
 @JsonTypeInfo(       use = JsonTypeInfo.Id.NAME,       include = JsonTypeInfo.As.PROPERTY,       property = "type") 
  @JsonSubTypes({  @Type(value = MissingParams_impl_ari_1_5_0.class, name = "MissingParams")
, @Type(value = Event_impl_ari_1_5_0.class, name = "Event")
, @Type(value = DeviceStateChanged_impl_ari_1_5_0.class, name = "DeviceStateChanged")
, @Type(value = PlaybackStarted_impl_ari_1_5_0.class, name = "PlaybackStarted")
, @Type(value = PlaybackFinished_impl_ari_1_5_0.class, name = "PlaybackFinished")
, @Type(value = RecordingStarted_impl_ari_1_5_0.class, name = "RecordingStarted")
, @Type(value = RecordingFinished_impl_ari_1_5_0.class, name = "RecordingFinished")
, @Type(value = RecordingFailed_impl_ari_1_5_0.class, name = "RecordingFailed")
, @Type(value = ApplicationReplaced_impl_ari_1_5_0.class, name = "ApplicationReplaced")
, @Type(value = BridgeCreated_impl_ari_1_5_0.class, name = "BridgeCreated")
, @Type(value = BridgeDestroyed_impl_ari_1_5_0.class, name = "BridgeDestroyed")
, @Type(value = BridgeMerged_impl_ari_1_5_0.class, name = "BridgeMerged")
, @Type(value = BridgeBlindTransfer_impl_ari_1_5_0.class, name = "BridgeBlindTransfer")
, @Type(value = BridgeAttendedTransfer_impl_ari_1_5_0.class, name = "BridgeAttendedTransfer")
, @Type(value = ChannelCreated_impl_ari_1_5_0.class, name = "ChannelCreated")
, @Type(value = ChannelDestroyed_impl_ari_1_5_0.class, name = "ChannelDestroyed")
, @Type(value = ChannelEnteredBridge_impl_ari_1_5_0.class, name = "ChannelEnteredBridge")
, @Type(value = ChannelLeftBridge_impl_ari_1_5_0.class, name = "ChannelLeftBridge")
, @Type(value = ChannelStateChange_impl_ari_1_5_0.class, name = "ChannelStateChange")
, @Type(value = ChannelDtmfReceived_impl_ari_1_5_0.class, name = "ChannelDtmfReceived")
, @Type(value = ChannelDialplan_impl_ari_1_5_0.class, name = "ChannelDialplan")
, @Type(value = ChannelCallerId_impl_ari_1_5_0.class, name = "ChannelCallerId")
, @Type(value = ChannelUserevent_impl_ari_1_5_0.class, name = "ChannelUserevent")
, @Type(value = ChannelHangupRequest_impl_ari_1_5_0.class, name = "ChannelHangupRequest")
, @Type(value = ChannelVarset_impl_ari_1_5_0.class, name = "ChannelVarset")
, @Type(value = ChannelTalkingStarted_impl_ari_1_5_0.class, name = "ChannelTalkingStarted")
, @Type(value = ChannelTalkingFinished_impl_ari_1_5_0.class, name = "ChannelTalkingFinished")
, @Type(value = EndpointStateChange_impl_ari_1_5_0.class, name = "EndpointStateChange")
, @Type(value = Dial_impl_ari_1_5_0.class, name = "Dial")
, @Type(value = StasisEnd_impl_ari_1_5_0.class, name = "StasisEnd")
, @Type(value = StasisStart_impl_ari_1_5_0.class, name = "StasisStart")
, @Type(value = TextMessageReceived_impl_ari_1_5_0.class, name = "TextMessageReceived")
 })  


public class Message_impl_ari_1_5_0 implements Message, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Indicates the type of this message.  */
  private String type;
 public String getType() {
   return type;
 }

 @JsonDeserialize( as=String.class )
 public void setType(String val ) {
   type = val;
 }

/** No missing signatures from interface */
}

