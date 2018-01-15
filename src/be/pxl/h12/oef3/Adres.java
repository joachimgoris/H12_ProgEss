package be.pxl.h12.oef3;

public class Adres {
	private String straat;
	private String huisnr;
	private Gemeente gemeente;
	
	public Adres(String straat, String nr, int postcode, String naam) {
		setStraat(straat);
		setHuisnr(nr);
		Gemeente g = new Gemeente(postcode,naam);
		setGemeente(g);
	}

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public String getHuisnr() {
		return huisnr;
	}

	public void setHuisnr(String huisnr) {
		this.huisnr = huisnr;
	}

	public Gemeente getGemeente() {
		return gemeente;
	}

	public void setGemeente(Gemeente gemeente) {
		this.gemeente = gemeente;
	}
	
	public String toString() {
		String retvalue = getStraat()+" "+getHuisnr()+"\n"+gemeente.getPostcode()+" "+gemeente.getGemNaam();
		return retvalue;
	}
}
