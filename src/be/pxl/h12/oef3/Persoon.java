package be.pxl.h12.oef3;

import java.time.LocalDate;

public class Persoon {
	private String Naam;
	private String Voornaam;
	public LocalDate Geboortedatum;
	private Adres Adres;
	
	public Persoon() {
		this("Aerts","Jef",new LocalDate(29,11,1990),new Adres("lindestraat","23D",3500,"Hasselt"));
	}
	
	public Persoon(String naam, String voornaam, LocalDate geboortedatum, Adres adres) {
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
	public LocalDate getGeboortedatum() {
		return Geboortedatum;
	}
	public void setGeboortedatum(LocalDate geboortedatum) {
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
