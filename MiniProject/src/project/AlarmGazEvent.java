package project;

public class AlarmGazEvent extends AlarmEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AlarmGazEvent(Object source, String localisation,
			int niveauImportance,TypeAlarmGaz tp) {
		super(source, localisation, niveauImportance);
		if(niveauImportance<1 || niveauImportance>3){
			throw new IllegalArgumentException("Le niveau de importance doit se situer entre 1 et 3");
		}
		
	}

}
