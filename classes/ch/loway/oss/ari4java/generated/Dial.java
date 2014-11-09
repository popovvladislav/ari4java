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

public interface Dial {

// void setPeer Channel
/**********************************************************
 * The dialed channel.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public void setPeer(Channel val );



// Channel getForwarded
/**********************************************************
 * Channel that the caller has been forwarded to.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public Channel getForwarded();



// String getDialstatus
/**********************************************************
 * Current status of the dialing attempt to the peer.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public String getDialstatus();



// void setDialstatus String
/**********************************************************
 * Current status of the dialing attempt to the peer.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public void setDialstatus(String val );



// void setDialstring String
/**********************************************************
 * The dial string for calling the peer channel.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public void setDialstring(String val );



// String getDialstring
/**********************************************************
 * The dial string for calling the peer channel.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public String getDialstring();



// Channel getPeer
/**********************************************************
 * The dialed channel.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public Channel getPeer();



// void setForward String
/**********************************************************
 * Forwarding target requested by the original dialed channel.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public void setForward(String val );



// void setForwarded Channel
/**********************************************************
 * Channel that the caller has been forwarded to.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public void setForwarded(Channel val );



// String getForward
/**********************************************************
 * Forwarding target requested by the original dialed channel.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public String getForward();



// void setCaller Channel
/**********************************************************
 * The calling channel.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public void setCaller(Channel val );



// Channel getCaller
/**********************************************************
 * The calling channel.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public Channel getCaller();


}
;
