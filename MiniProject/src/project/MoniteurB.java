package project;

public class MoniteurB implements AlarmRadiationListener,AlarmGazListener {
	
	public void problemeGaz(AlarmGazEvent ag) {
		System.out.println(ag);
		
	}
	public void problemeRadiation(AlarmRadiationEvent ar) {
		System.out.println(ar);
		
	}

}
