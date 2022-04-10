package eje3.modelo;

public class Gasto {
	TipoDeGasto tipoGasto;
	int monto;

	public Gasto(TipoDeGasto tipoGasto, int monto) {
		this.tipoGasto = tipoGasto;
		this.monto = monto;
	}

	public String tipoDeGasto() {
		return this.tipoGasto.tipoDeGasto();
	}

	public int monto() {
		return this.monto;
	}
}
