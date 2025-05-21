package ar.edu.unq.poo2.tp6Solid;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Cliente> clientes;
	private List<Solicitud> solicitudes;
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<Solicitud>();
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<Solicitud> getSolicitudes() {
		return solicitudes;
	}

	public void agregarCliente(Cliente cliente) {
		this.getClientes().add(cliente);
	}

	public void agregarSolicitud(Solicitud prestamo) {
		this.getSolicitudes().add(prestamo);
	}

	public Double getTotalADesembolsar() {
		return this.solicitudesAceptadas().stream().mapToDouble(s->s.getMonto()).sum();
	}

	private List<Solicitud> solicitudesAceptadas() {
		return this.getSolicitudes().stream().filter(s->s.esAceptable()).toList();
	}

}
