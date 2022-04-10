package eje3.modelo;

import java.time.LocalDate;

public class Fecha implements ProveedorDeFecha {
	private LocalDate fecha;

	public Fecha() {
		fecha = LocalDate.now();
	}

	@Override
	public LocalDate fecha() {
		return this.fecha;
	}

}
