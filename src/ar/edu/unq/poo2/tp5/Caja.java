package ar.edu.unq.poo2.tp5;

public class Caja {
	private Mercado mercado;
	private Agencia agencia;
	
	public Agencia getAgencia() {
		return agencia;
	}

	public Caja(Mercado mercado) {
		super();
		this.mercado = mercado;
	}
	
	/**PROPOSITO: registrar los productos de un chango.
	 * OBSERVACION: registar es acumular el valor y retornarlo mientras se resta el 
	 * stock del producto
	 * */
	public double registrarProductos(Chango chango) {
		double costo = 0;
		for(Producto p: chango.getProductos()) {
			this.mercado.decrementarStock(p);
			costo += p.getPrecio();
		}
		return costo;
	}
	/***
	 * PROPOSITO: notificar a la agencia el registro de un pago
	 * */
	public void registrarPago(Factura factura) {
		this.getAgencia().registrarPago(factura);
	}

	public void setAgencia(Agencia agencia2) {
		this.agencia = agencia2;
	} 
}
