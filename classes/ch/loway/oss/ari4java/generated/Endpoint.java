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

public interface Endpoint {

// List<String> getChannel_ids
/**********************************************************
 * Id's of channels associated with this endpoint
 * 
 * @since ari_0_0_1
 *********************************************************/
 public List<String> getChannel_ids();



// void setState String
/**********************************************************
 * Endpoint's state
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setState(String val );



// void setChannel_ids List<String>
/**********************************************************
 * Id's of channels associated with this endpoint
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setChannel_ids(List<String> val );



// String getResource
/**********************************************************
 * Identifier of the endpoint, specific to the given technology.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getResource();



// void setTechnology String
/**********************************************************
 * Technology of the endpoint
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setTechnology(String val );



// String getTechnology
/**********************************************************
 * Technology of the endpoint
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getTechnology();



// void setResource String
/**********************************************************
 * Identifier of the endpoint, specific to the given technology.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setResource(String val );



// String getState
/**********************************************************
 * Endpoint's state
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getState();


}
;
