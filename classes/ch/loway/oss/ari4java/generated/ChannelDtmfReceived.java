package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Nov 08 18:09:34 CET 2014
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;

public interface ChannelDtmfReceived {

// String getDigit
/**********************************************************
 * DTMF digit received (0-9, A-E, # or *)
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getDigit();



// void setDuration_ms int
/**********************************************************
 * Number of milliseconds DTMF was received
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setDuration_ms(int val );



// int getDuration_ms
/**********************************************************
 * Number of milliseconds DTMF was received
 * 
 * @since ari_0_0_1
 *********************************************************/
 public int getDuration_ms();



// Channel getChannel
/**********************************************************
 * The channel on which DTMF was received
 * 
 * @since ari_0_0_1
 *********************************************************/
 public Channel getChannel();



// void setChannel Channel
/**********************************************************
 * The channel on which DTMF was received
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setChannel(Channel val );



// void setDigit String
/**********************************************************
 * DTMF digit received (0-9, A-E, # or *)
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setDigit(String val );


}
;
