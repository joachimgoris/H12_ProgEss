package be.pxl.h12.oef3;

public class Gemeente {
	private int postcode;
	private String gemNaam;
	
	public Gemeente() {
		this(0,"Onbekend");
	}
	
	public Gemeente(int p, String g) {
		setPostcode(p);
		setGemNaam(g);
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		String s = Integer.toString(postcode);
		s += "0000";
		s = s.substring(0,4);
		postcode = Integer.parseInt(s);

	}

	public String getGemNaam() {
		gemNaam = gemNaam.substring(0,1).toUpperCase()+gemNaam.substring(1).toLowerCase();
		gemNaam = gemNaam.replaceAll("[^A-Z]", "");
		return gemNaam;
	}

	public void setGemNaam(String gemNaam) {
		this.gemNaam = gemNaam;
	}
	
	public String toString() {
		String retvalue = getPostcode()+getGemNaam();
		return retvalue;
	}
}