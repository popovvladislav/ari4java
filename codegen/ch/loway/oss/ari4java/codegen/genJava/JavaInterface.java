
package ch.loway.oss.ari4java.codegen.genJava;

import ch.loway.oss.ari4java.codegen.genJava.JavaGen;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * @author lenz
 */
public class JavaInterface {

    public String pkgName = "";
    public String className = "";
    public String since = "";

    Map<String,String> definitions = new HashMap<String, String>();

    public void iKnow( String signature, String method, String comment, String sinceVersion ) {

        StringBuilder sb = new StringBuilder();
        JavaGen.addBanner(sb, comment, sinceVersion);
        sb.append( method ).append(";\n\n");

        if ( !definitions.containsKey(signature) ) {
            definitions.put( signature, sb.toString() );
        }
    }


    public JavaInterface createScratchCopy() {
        JavaInterface ji = new JavaInterface();
        ji.pkgName = pkgName;
        ji.className = className;
        ji.since = since;
        ji.definitions = new HashMap<String, String>(definitions);
        return ji;
    }





    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        JavaGen.importClasses(sb, pkgName, Arrays.asList( new String[] {
            "java.util.Date",
            "java.util.List",
            "java.util.Map",
            "java.util.ArrayList",
            "ch.loway.oss.ari4java.tools.RestException",
            "ch.loway.oss.ari4java.tools.AriCallback"
        }));


        sb.append( "public interface ").append(className).append(" {\n");

        for ( String signature: definitions.keySet() ) {
            sb.append( "\n// ").append( signature ).append("\n");
            sb.append( definitions.get( signature) );
            sb.append( "\n" );
        }


        sb.append( "}\n;");
        return sb.toString();

    }

    /**
     * Removes a signature.
     * When you serialize an object, you remove all required signatures.
     *
     * @param signature
     */

    public void removeSignature( String signature ) {
        if ( definitions.containsKey(signature) ) {
            definitions.remove(signature);
        } else {
            throw new IllegalArgumentException( "Signature not found: " + signature );
        }
    }
    

    public String getCodeToImplementMissingSignatures() {
        if ( definitions.isEmpty() ) {
            return "/** No missing signatures from interface */\n";
        } else {

            StringBuilder sb = new StringBuilder();

            // generate empty methods that just throw an UnsupportedOperationException
            for ( String s: definitions.values() ) {

                String replaceTo = "{\n"
                        + "  throw new UnsupportedOperationException(\"Method availble from ...\");\n"
                        + "};";

                s = s.replace(";", replaceTo);

                sb.append( s );
            }

            return sb.toString();

        }
    }
    
}

