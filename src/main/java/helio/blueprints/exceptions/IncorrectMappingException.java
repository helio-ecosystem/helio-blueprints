package helio.blueprints.exceptions;

import helio.bleprints.mappings.Mapping;

/**
 * This exception is thrown when a {@link Mapping} is syntactically incorrect.
 * @author Andrea Cimmino Arriaga
 * @email cimmino@fi.upm.es
 */
public class IncorrectMappingException extends Exception {

	private static final long serialVersionUID = 6479261184926080050L;

	public IncorrectMappingException(String msg) {
		super(msg);
	}
}