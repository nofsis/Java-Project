package project;

public class MoniteurA implements AlarmFeuListener,AlarmGazListener {
	
	

	public void problemeFeu(AlarmFeuEvent af) {
		System.out.println(af);
		
	}
	public void problemeGaz(AlarmGazEvent ag) {
		System.out.println(ag);
		
	}
		
	

}
