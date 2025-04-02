package unq.poo2.practicas.EmpresaLiquida;

import java.time.LocalDate;
import java.util.List;

public class Recibo {
	private String nombre;
	private String direccion;
	private LocalDate fechaDeEmision;
	private int sueldoNeto;
	private int sueldoBruto;
	private List<Concepto> conceptos;
	/*como creo dinamicamente los conceptos en base a la cantidad que 
	 * deba crear en base al empleado?*/
	
	public Recibo(Empleado empleado) {
		this.nombre = empleado.getNombre();
		this.direccion = empleado.getDireccion();
		//this.fechaDeEmision = como asigno la fecha al momento de crear el recibo?
		this.sueldoBruto = empleado.calcularBruto();
		this.sueldoNeto = empleado.calcularNeto();
	}

}
