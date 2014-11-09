package ch.loway.oss.ari4java.generated.ari_1_5_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Nov 08 18:09:34 CET 2014
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Talking is no longer detected on the channel.
 * 
 * Defined in file: events.json
 *********************************************************/

public class ChannelTalkingFinished_impl_ari_1_5_0 extends Event_impl_ari_1_5_0 implements ChannelTalkingFinished, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The channel on which talking completed.  */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_5_0.class )
 public void setChannel(Channel val ) {
   channel = val;
 }

  /**  The length of time, in milliseconds, that talking was detected on the channel  */
  private int duration;
 public int getDuration() {
   return duration;
 }

 @JsonDeserialize( as=int.class )
 public void setDuration(int val ) {
   duration = val;
 }

/** No missing signatures from interface */
}

