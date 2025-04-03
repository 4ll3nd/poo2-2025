package unq.poo2.practicas.EmpresaLiquida;

import java.util.List;

public class Empresa {
	private String nombre = "Empresa";
	private String cuit = "31445342";
	private List<Empleado> empleados;
	
	public Empresa(String nombre, String cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
	}
	
	public int retenciones() {
		return this.empleados.stream().mapToInt(e -> e.retenciones()).sum();
	}
	
	public int montoTotal() {
		return this.empleados.stream().mapToInt(e -> e.calcularNeto()).sum();
	}
	
	public int montoBrutos() {
		return this.empleados.stream().mapToInt(e -> e.calcularBruto()).sum();
	}
	
	public void liquidar() {
		for(Empleado empleado : this.empleados) {
			empleado.generarRecibo(empleado);
		}
	}
	
}
