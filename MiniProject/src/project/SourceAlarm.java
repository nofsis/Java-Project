package project;

import java.util.ArrayList;



public class SourceAlarm {
	ArrayList<AlarmFeuListener>ecouteursFeu= new ArrayList<AlarmFeuListener>();
	ArrayList<AlarmGazListener>ecouteursGaz= new ArrayList<AlarmGazListener>();
	ArrayList<AlarmRadiationListener>ecouteursRadiation= new ArrayList<AlarmRadiationListener>();
	public String myLocalisation;

	public SourceAlarm(String localisation){
		this.myLocalisation=localisation;
	}
	
	public void addAlarmFeuListener(AlarmFeuListener fl){
		ecouteursFeu.add(fl);
		
	}
	public void addAlarmGazListener(AlarmGazListener gl){
		ecouteursGaz.add(gl);
		
	}
	public void addAlarmRadiationListener(AlarmRadiationListener rl){
		ecouteursRadiation.add(rl);
		
	}
	
	public void removeAlarmGazListener(AlarmGazListener rl){
		ecouteursGaz.remove(rl);
		
	}
	public void removeAlarmFeuListener(AlarmFeuListener rl){
		ecouteursFeu.remove(rl);
		
	}
	

	
	public void generateAlarmFeuEvent (int nv){
		AlarmFeuEvent ae= new AlarmFeuEvent(this,this.myLocalisation,nv);
		for(AlarmFeuListener tl: ecouteursFeu){
			tl.problemeFeu(ae);
		}
	}
	public void generateAlarmGazEvent (int nv,TypeAlarmGaz tp){
		AlarmGazEvent ae= new AlarmGazEvent(this,this.myLocalisation,nv,tp);
		for(AlarmGazListener gl: ecouteursGaz){
			gl.problemeGaz(ae);
		}
	}
	public void generateAlarmRadiationEvent (int nv,int nvR){
		AlarmRadiationEvent ae= new AlarmRadiationEvent(this,this.myLocalisation,nv,nvR);
		for(AlarmRadiationListener gl: ecouteursRadiation){
			gl.problemeRadiation(ae);
		}
	}
	
	
	}

