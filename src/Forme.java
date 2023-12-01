public class Forme {
	private String nomeForma;
	private int val1;
	private int val2;

	public Forme(String nomeForma, int val1, int val2, FormeGiometricheEnum tipo){
		this.nomeForma = nomeForma;
		this.val1 = val1;
		this.val2 = val2;
	}

	public String getNomeForma() {
		return nomeForma;
	}

	public int getVal1() {
		return val1;
	}

	public int getVal2() {
		return val2;
	}

	public void setNomeForma(String nomeForma) {
		this.nomeForma = nomeForma;
	}

	public void setVal1(int val1) {
		this.val1 = val1;
	}

	public void setVal2(int val2) {
		this.val2 = val2;
	}

	void calcolaArea(){
		System.out.println("calcolo area forma");
	}

	@Override
	public String toString() {
		return "Forme{" +
				"nomeForma='" + nomeForma + '\'' +
				", val1=" + val1 +
				", val2=" + val2 +
				'}';
	}
}
