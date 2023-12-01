public class Main {
	public static void main (String[] args) {
		Rettangolo rettangolo = new Rettangolo("rettangolo", 7,5, FormeGiometricheEnum.RETTANGOLO);
		Triangolo triangolo = new Triangolo("triangolo", 3, 4, FormeGiometricheEnum.TRIANGOLO);

		triangolo.calcolaArea();
		rettangolo.calcolaArea();
	}
}
