package ch.loway.oss.ari4java.generated.ari_1_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;

/**********************************************************
 * A recording that is in progress
 * 
 * Defined in file: recordings.json
 *********************************************************/

public class LiveRecording_impl_ari_1_0_0 implements LiveRecording, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Cause for recording failure if failed  */
  private String cause;
 public String getCause() {
   return cause;
 }

 @JsonDeserialize( as=String.class )
 public void setCause(String val ) {
   cause = val;
 }

  /**    */
  private String format;
 public String getFormat() {
   return format;
 }

 @JsonDeserialize( as=String.class )
 public void setFormat(String val ) {
   format = val;
 }

  /**  Base name for the recording  */
  private String name;
 public String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(String val ) {
   name = val;
 }

  /**    */
  private String state;
 public String getState() {
   return state;
 }

 @JsonDeserialize( as=String.class )
 public void setState(String val ) {
   state = val;
 }

/** No missing signatures from interface */
}
