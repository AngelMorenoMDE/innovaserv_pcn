/**
 *
 * $Id$
 */
package pcn.validation;

import org.eclipse.emf.common.util.EList;

import pcn.PCNTag;

/**
 * A sample validator interface for {@link pcn.PCNProcessStep}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PCNProcessStepValidator {
	boolean validate();

	boolean validateTags(EList<PCNTag> value);
	boolean validateAction(String value);
	boolean validatePredicate(String value);
}
