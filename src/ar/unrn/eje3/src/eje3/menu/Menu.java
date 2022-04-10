package eje3.menu;

import java.util.ArrayList;
import java.util.List;

import eje3.modelo.Fecha;
import eje3.modelo.Gasto;
import eje3.modelo.ReporteDeGastos;
import eje3.modelo.TipoDeGasto;

public class Menu {
	public static void main(String[] args) {
		Fecha f = new Fecha();
		ReporteDeGastos reporte = new ReporteDeGastos(f);

		List<Gasto> gastos = new ArrayList<>();
		// TipoDeGasto t = new TipoDeGasto("DESAYUNO");
		gastos.add(new Gasto(new TipoDeGasto("CENA"), 200));
		gastos.add(new Gasto(new TipoDeGasto("DESAYUNO"), 200));
		gastos.add(new Gasto(new TipoDeGasto("ALQUILER_AUTO"), 200));
		// System.out.println(t);
		String v = reporte.imprimir(gastos);
		System.out.println(v);

	}

}
