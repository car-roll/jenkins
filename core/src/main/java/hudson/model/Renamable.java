package hudson.model;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.util.FormValidation;
import org.kohsuke.stapler.HttpResponse;
import org.kohsuke.stapler.QueryParameter;
import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.StaplerResponse;

/**
 * Object who has an editable name/identifier
 */
public interface Renamable {

    /**
     * Dedicated page to rename object
     */
    HttpResponse doConfirmRename(StaplerRequest req, StaplerResponse rsp) throws Exception;

    /**
     * Called by {@link #doConfirmRename} and {@code rename.jelly} to validate renames.
     * @return {@link FormValidation#ok} if this item can be renamed as specified, otherwise
     * {@link FormValidation#error} with a message explaining the problem.
     */
    @NonNull FormValidation doCheckNewName(@QueryParameter String newName);
}
