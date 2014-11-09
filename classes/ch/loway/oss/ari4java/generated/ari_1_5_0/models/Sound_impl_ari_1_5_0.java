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
 * A media file that may be played back.
 * 
 * Defined in file: sounds.json
 *********************************************************/

public class Sound_impl_ari_1_5_0 implements Sound, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The formats and languages in which this sound is available.  */
  private List<FormatLangPair> formats;
 public List<FormatLangPair> getFormats() {
   return formats;
 }

 @JsonDeserialize( contentAs=FormatLangPair_impl_ari_1_5_0.class )
 public void setFormats(List<FormatLangPair> val ) {
   formats = val;
 }

  /**  Sound's identifier.  */
  private String id;
 public String getId() {
   return id;
 }

 @JsonDeserialize( as=String.class )
 public void setId(String val ) {
   id = val;
 }

  /**  Text description of the sound, usually the words spoken.  */
  private String text;
 public String getText() {
   return text;
 }

 @JsonDeserialize( as=String.class )
 public void setText(String val ) {
   text = val;
 }

/** No missing signatures from interface */
}

