package be.pxl.h12.oef3;

public class Datum {
	private int Dag;
	private int Maand;
	private int Jaar;
	private String[] MaandNamen = new String[] {"januari","februari","maart","april","mei","juni","juli","augustus","september","oktober","november","december"};
	
	public Datum() {
		
	}
	
	public Datum(int d, int m, int j) {
		setDag(d);
		setMaand(m);
		setJaar(j);
	}
	
	public Datum(Datum d) {
		this(d.getDag(),d.getMaandNr(),d.getJaar());
	}

	public int getDag() {
		return Dag;
	}

	public void setDag(int dag) {
		Dag = dag;
	}

	public int getMaandNr() {
		return Maand;
	}
	
	public String getMaandNaam() {
		return MaandNamen[getMaandNr()-1];
	}

	public void setMaand(int maand) {
		if(getMaandNr()>MaandNamen.length) {
			maand =12;
		}
		if(getMaandNr()<1) {
			maand = 1;
		}
		Maand = maand;
	}

	public int getJaar() {
		return Jaar;
	}

	public void setJaar(int jaar) {
		Jaar = jaar;
	}
	
	public String toString() {
		String retvalue = getDag()+" "+getMaandNaam()+" "+getJaar();
		return retvalue;
	}
}
