package ch.loway.oss.ari4java.generated.ari_1_0_0.models;

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
 * Effective user/group id
 * 
 * Defined in file: asterisk.json
 *********************************************************/

public class SetId_impl_ari_1_0_0 implements SetId, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Effective group id.  */
  private String group;
 public String getGroup() {
   return group;
 }

 @JsonDeserialize( as=String.class )
 public void setGroup(String val ) {
   group = val;
 }

  /**  Effective user id.  */
  private String user;
 public String getUser() {
   return user;
 }

 @JsonDeserialize( as=String.class )
 public void setUser(String val ) {
   user = val;
 }

/** No missing signatures from interface */
}

