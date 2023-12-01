public enum FormeGiometricheEnum {
	RETTANGOLO("Rettangolo"),
	TRIANGOLO("Triangolo");
	private final String tipo;

	FormeGiometricheEnum(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "FormeGiometricheEnum{" +
				"tipo='" + tipo + '\'' +
				'}';
	}
}