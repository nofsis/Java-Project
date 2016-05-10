package project;

public class AlarmRadiationEvent extends AlarmEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1862632244189649111L;

	public AlarmRadiationEvent(Object source, String localisation,
			int niveauImportance,int niveauRadiation) {
		super(source, localisation, niveauImportance);
		if(niveauImportance<1 || niveauImportance>3){
			throw new IllegalArgumentException("Le niveau de importance doit se situer entre 1 et 3");
		}
		if(niveauRadiation<0 || niveauRadiation>100){
			throw new IllegalArgumentException("Le niveau de Radiation doit se situer entre 0 et 100");
		}
	}

}
