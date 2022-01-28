package helio.bleprints.mappings;



import java.io.InputStream;

/**
 * This component is responsible of translating data from hetergeneous data sources into RDF.
 * @author Andrea Cimmino
 *
 */
public interface TranslationUnit {
	
	/**
	 * This method provides the id of a {@link TranslationUnit}
	 * @return the id of the {@link TranslationUnit}
	 */
	public String getId();

	/**
	 * This method provides the {@link UnitType} of a {@link TranslationUnit}
	 * @return a {@link UnitType}
	 */
	public UnitType getUnitType();

	/**
	 * This method translates heterogeneous data into RDF synchronously or scheduled
	 */
	public void translate();

	/**
	 * This method translates heterogeneous data into RDF asynchronously
	 */
	public void translate(InputStream stream);

	/**
	 * This method specifies whether an RDF subject is generated by this {@link TranslationUnit} 
	 * @param subject an RDF subject
	 * @return true if the {@link TranslationUnit} generates RDF with the provided subject, false otherwise
	 */
	public boolean generatesSubject(String subject);
}
