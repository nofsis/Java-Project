package project;

import java.util.Date;
import java.util.EventObject;

public class AlarmEvent extends EventObject {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Date dateApparition;
private String localisation;
private int niveauImportance;


	
	public AlarmEvent(Object source,String localisation,int niveauImportance){
		super(source);
		long i = System.currentTimeMillis();
		this.dateApparition= new Date(i);
		this.localisation=localisation;
		this.niveauImportance=niveauImportance;
		
		
	}
	
	public Date getDateCreation(){
		return this.dateApparition;
	}

	@Override
	public String toString() {
		return "AlarmEvent [dateApparition=" + dateApparition
				+ ", localisation=" + localisation + ", niveauImportance="
				+ niveauImportance + "]";
	}
	
	

}
