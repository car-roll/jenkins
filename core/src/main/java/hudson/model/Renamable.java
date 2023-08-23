package hudson.model;

import org.kohsuke.stapler.HttpResponse;
import org.kohsuke.stapler.QueryParameter;

/**
 * Object who has an editable name/identifier
 */
public interface Renamable {

    /**
     * Dedicated page to rename object
     */
//    HttpResponse doConfirmRename(StaplerRequest req, StaplerResponse rsp) throws Exception;
    HttpResponse doConfirmRename(@QueryParameter String newName) throws Exception;

//    /**
//     * Called by {@link #doConfirmRename} and {@code rename.jelly} to validate renames.
//     * @return {@link FormValidation#ok} if this item can be renamed as specified, otherwise
//     * {@link FormValidation#error} with a message explaining the problem.
//     */
//    @NonNull FormValidation doCheckNewName(@QueryParameter String newName);
}
