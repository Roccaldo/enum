public class Triangolo extends Forme{


	public Triangolo(String nomeForma, int val1, int val2, FormeGiometricheEnum tipo) {
		super(nomeForma, val1, val2, tipo);
	}

	@Override
	void calcolaArea() {
		int area = getVal1() * getVal2() / 2;
		System.out.println(area);
	}

}
