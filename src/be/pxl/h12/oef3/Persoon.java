package be.pxl.h12.oef3;

public class Persoon {
	private String Naam;
	private String Voornaam;
	private Datum Geboortedatum;
	private Adres Adres;
	
	public Persoon() {
		this("Aerts","Jef",new Datum(29,11,1990),new Adres("lindestraat","23D",3500,"Hasselt"));
	}
	
	public Persoon(String naam, String voornaam, Datum geboortedatum, Adres adres) {
		setNaam(naam);
		setVoornaam(voornaam);
		setGeboortedatum(geboortedatum);
		setAdres(adres);
	}
	
	
	public String getNaam() {
		return Naam;
	}
	public void setNaam(String naam) {
		Naam = naam;
	}
	public String getVoornaam() {
		return Voornaam;
	}
	public void setVoornaam(String voornaam) {
		Voornaam = voornaam;
	}
	public Datum getGeboortedatum() {
		return Geboortedatum;
	}
	public void setGeboortedatum(Datum geboortedatum) {
		Geboortedatum = geboortedatum;
	}
	public Adres getAdres() {
		return Adres;
	}
	public void setAdres(Adres adres) {
		Adres = adres;
	}
	
	public void voegVoornamenToe(String... strings) {
		for (String s : strings) {
			setVoornaam(getVoornaam()+" "+ s);
		}
	}
	
	public String toString() {
		String retvalue = getVoornaam()+" "+getNaam()+"\n"+getAdres().getStraat()+" "+getAdres().getHuisnr()+"\n"+getAdres().getGemeente().getPostcode()+" "+getAdres().getGemeente().getGemNaam();
		return retvalue;
	}
}
