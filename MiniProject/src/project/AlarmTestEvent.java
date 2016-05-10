package project;

public class AlarmTestEvent {

	public static void main(String[] args) {

	    MoniteurA monA= new MoniteurA();
	    MoniteurB monB= new MoniteurB();
	    
	    SourceAlarm sa= new SourceAlarm("c217");
	    
	    sa.addAlarmFeuListener(monA);
	    sa.addAlarmGazListener(monA);
	    
	    sa.addAlarmGazListener(monB);
	    sa.addAlarmRadiationListener(monB);
	    
	    sa.generateAlarmFeuEvent(2);
	    sa.generateAlarmGazEvent(1,TypeAlarmGaz.CO2);
	    sa.generateAlarmRadiationEvent(3,100);
	}
}
