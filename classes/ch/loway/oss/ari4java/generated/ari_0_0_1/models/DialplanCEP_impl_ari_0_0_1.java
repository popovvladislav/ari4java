package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

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
 * Dialplan location (context/extension/priority)
 * 
 * Defined in file: channels.json
 *********************************************************/

public class DialplanCEP_impl_ari_0_0_1 implements DialplanCEP, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Context in the dialplan  */
  private String context;
 public String getContext() {
   return context;
 }

 @JsonDeserialize( as=String.class )
 public void setContext(String val ) {
   context = val;
 }

  /**  Extension in the dialplan  */
  private String exten;
 public String getExten() {
   return exten;
 }

 @JsonDeserialize( as=String.class )
 public void setExten(String val ) {
   exten = val;
 }

  /**  Priority in the dialplan  */
  private long priority;
 public long getPriority() {
   return priority;
 }

 @JsonDeserialize( as=long.class )
 public void setPriority(long val ) {
   priority = val;
 }

/** No missing signatures from interface */
}

