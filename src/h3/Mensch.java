package h3;

public class Mensch {
	public String name = "benn";
	public int gebJahr = 2004;
	public int alter = 21;
	
	public void setName(String x) {
		name = x;
	}
	
	public void setGebJahr(int y) {
		gebJahr = y;
	}
	
	public void setAlter() {
		alter = 2025 - gebJahr;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGebJahr() {
		return gebJahr;
	}
	
	public int getAlter() {
		return alter;
	}
}
