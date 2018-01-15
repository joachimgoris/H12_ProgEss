package be.pxl.h12.oef4;

public class Vlucht {
	private String regio;
	private String stad;
	private int duurUur;
	private int duurMin;
	
	public Vlucht(String r, String s, int dU, int dM) {
		setRegio(r);
		setStad(s);
		setDuurUur(dU);
		setDuurMin(dM);
	}

	public String getRegio() {
		return regio;
	}

	public void setRegio(String regio) {
		this.regio = regio;
	}

	public String getStad() {
		return stad;
	}

	public void setStad(String stad) {
		this.stad = stad;
	}

	public int getDuurUur() {
		return duurUur;
	}

	public void setDuurUur(int duurUur) {
		this.duurUur = duurUur;
	}

	public int getDuurMin() {
		return duurMin;
	}

	public void setDuurMin(int duurMin) {
		this.duurMin = duurMin;
	}
}
