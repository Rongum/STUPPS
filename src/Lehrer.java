
public class Lehrer {
	String name; 
	int stundenzahl=0; 
	boolean [][] stundeBelegt;
	
	public Lehrer (String name) {
		this.name = name;
	
		stundeBelegt = new boolean [6][7];
			}
	
	public String getName() {
		return name;
	}

	public int getStundenzahl() {
		return stundenzahl;
	}

	
	public void setStundeBelegt(int tag, int stunde) {
		if((tag >0 && tag<6) && (stunde >0 && stunde < 7) ) {
			stundeBelegt[tag][stunde] = true;
			stundenzahl++;
		}
	}
	
	public boolean getStundeBelegt (int tag, int stunde) {
		if((tag >0 && tag<6) && (stunde >0 && stunde < 7) )
			return stundeBelegt[tag][stunde] ;
	}
}
