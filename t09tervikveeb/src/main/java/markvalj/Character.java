public class Character {
	
	private String tyyp;
	private int elud;
	private int tugevus;
	private int kaitse;
	
	private String vastaseTyyp;
	private int vastaseElud;
	private int vastaseTugevus;
	private int vastaseKaitse;
	
	
	public Character(String y, int e, int t, int k) {
		tyyp = y;
		elud = e;
		tugevus = t;
		kaitse = k;
	}
	public String rynnatakse(String vY, int vE, int vT, int vK ) {
		String tulemus;
		vastaseTyyp = vY;
		vastaseElud = vE;
		vastaseTugevus = vT;
		vastaseKaitse = vK;
		
		int sisseTulevTabamus = vastaseTugevus - kaitse;
		if(sisseTulevTabamus < 10) {
			sisseTulevTabamus = 10;
		}
		int v2ljaMinevTabamus = tugevus - vastaseKaitse;
		if(v2ljaMinevTabamus < 10) {
			v2ljaMinevTabamus = 10;
		}
		
		int minuCounter = 0;
		int vastaseCounter = 0;
		
		while(elud > 0){
			
			elud = elud - sisseTulevTabamus;
			vastaseCounter++;
		}
		while(vastaseElud > 0){
			vastaseElud = vastaseElud - v2ljaMinevTabamus;
			minuCounter ++;
		}
		if(minuCounter < vastaseCounter) {
			tulemus = tyyp;
		} else {
			tulemus = vastaseTyyp;
		}
		return tulemus;
	}	
}