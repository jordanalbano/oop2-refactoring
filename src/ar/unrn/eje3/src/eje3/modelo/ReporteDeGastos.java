package eje3.modelo;

import java.util.List;

public class ReporteDeGastos {
	private ProveedorDeFecha fechaReporte;

	public ReporteDeGastos(ProveedorDeFecha fechaReporte) {
		this.fechaReporte = fechaReporte;
	}

	public String imprimir(List<Gasto> gastos) {
		String stringGasto = "";
		int total = 0;
		int gastosDeComida = 0;

		// System.out.println("Expenses " + this.fechaReporte.fecha());

		for (Gasto gasto : gastos) {
			if (gasto.tipoDeGasto() == "CENA" || gasto.tipoDeGasto() == "DESAYUNO") {
				gastosDeComida += gasto.monto;
			}
			// System.out.println(gasto.tipoDeGasto());
			String nombreGasto = "";
			switch (gasto.tipoDeGasto()) {
			case "CENA":
				nombreGasto = "Cena";
				break;
			case "DESAYUNO":
				nombreGasto = "Desayuno";
				break;
			case "ALQUILER_AUTO":
				nombreGasto = "Alquiler de Autos";
				break;
			}
			String marcaExcesoComidas = gasto.tipoDeGasto() == "CENA" && gasto.monto() > 5000
					|| gasto.tipoDeGasto() == "DESAYUNO" && gasto.monto() > 1000 ? "X" : " ";

			stringGasto = stringGasto + "\n" + "Expenses " + this.fechaReporte.fecha() + " " + gasto.tipoDeGasto() + " "
					+ gasto.monto() + "   " + marcaExcesoComidas;

			total += gasto.monto;
		}
		stringGasto = stringGasto + "\nGastos de comida " + gastosDeComida + "\n" + "Total de gastos: " + total;

		return stringGasto;
	}
}
