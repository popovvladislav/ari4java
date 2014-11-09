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

public interface ActionSounds {

// List<Sound> list String String
/**********************************************************
 * List all sounds.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public List<Sound> list(String lang, String format) throws RestException;



// void get String AriCallback<Sound> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void get(String soundId, AriCallback<Sound> callback);



// Sound get String
/**********************************************************
 * Get a sound's details.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public Sound get(String soundId) throws RestException;



// void list String String AriCallback<List<Sound>> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void list(String lang, String format, AriCallback<List<Sound>> callback);


}
;
