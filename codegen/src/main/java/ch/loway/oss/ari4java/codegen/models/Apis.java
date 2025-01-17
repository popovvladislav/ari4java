
package ch.loway.oss.ari4java.codegen.models;

import ch.loway.oss.ari4java.codegen.genJava.JavaGen;
import ch.loway.oss.ari4java.codegen.genJava.JavaInterface;
import ch.loway.oss.ari4java.codegen.genJava.JavaPkgInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author lenz
 */
public class Apis extends JavaPkgInfo {

    public List<Action> actions = new ArrayList<Action>();

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        JavaInterface ji = getBaseInterface();

        JavaGen.importClasses(sb, getActionsPackage(), Arrays.asList(new String[]{
                "ch.loway.oss.ari4java.generated.Module",
                "ch.loway.oss.ari4java.generated.*",
                "java.util.Date",
                "java.util.List",
                "java.util.Map",
                "java.util.ArrayList",
                "ch.loway.oss.ari4java.tools.BaseAriAction",
                "ch.loway.oss.ari4java.tools.RestException",
                "ch.loway.oss.ari4java.tools.AriCallback",
                "ch.loway.oss.ari4java.tools.HttpParam",
                "ch.loway.oss.ari4java.tools.HttpResponse",
                "com.fasterxml.jackson.core.type.TypeReference",
                getModelPackage() + ".*"
        }));

        JavaGen.addBanner(sb, "\n"
                + "Generated by: " + this.getClass().getSimpleName() + "\n"
        );

        JavaGen.emptyLines(sb, 2);

        sb.append("public class ").append(getImplName())
                .append(" extends BaseAriAction ")
                .append(" implements ")
                .append(getInterfaceName())
                .append(" {\n");

        Collections.sort(actions);

        for (Action a : actions) {

            for (Operation o : a.operations) {
                ji.removeSignature(o.getSignature());
                ji.removeSignature(o.getSignatureAsync());
            }

            sb.append(a.toString());
        }

        sb.append(ji.getCodeToImplementMissingSignatures());

        sb.append("};\n");
        return sb.toString();

    }

    public void registerInterfaces(JavaInterface j, String interfaceVersion) {
        for (Action a : actions) {
            a.registerInterfaces(j, interfaceVersion);
        }
    }

}

// $Log$
//
