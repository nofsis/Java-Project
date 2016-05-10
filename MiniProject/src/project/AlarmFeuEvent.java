package project;

public class AlarmFeuEvent extends AlarmEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AlarmFeuEvent(Object source, String localisation,
			int niveauImportance) {
		super(source, localisation, niveauImportance);
		if(niveauImportance<1 || niveauImportance>3){
			throw new IllegalArgumentException("Le niveau de importance doit se situer entre 1 et 3");
		}
	}
	
	

}
