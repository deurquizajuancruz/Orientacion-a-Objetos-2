package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

	public boolean agregarNumeroTelefono(String str) {
		return this.guia.agregarNumeroTelefono(str);
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}

	public ClienteFisico registrarUsuarioFisico(String data, String nombre) {
		ClienteFisico var = new ClienteFisico(nombre, this.obtenerNumeroLibre(), data);
		clientes.add(var);
		return var;
	}

	public ClienteJuridico registrarUsuarioJuridico(String data, String nombre) {
		ClienteJuridico var = new ClienteJuridico(nombre, this.obtenerNumeroLibre(), data);
		clientes.add(var);
		return var;
	}

	public LlamadaNacional registrarLlamadaNacional(Cliente origen, Cliente destino, int duracion) {
		LlamadaNacional llamada = new LlamadaNacional(origen.getNumeroTelefono(), destino.getNumeroTelefono(),
				duracion);
		llamadas.add(llamada);
		origen.agregarLlamada(llamada);
		return llamada;
	}

	public LlamadaInternacional registrarLlamadaInternacional(Cliente origen, Cliente destino, int duracion) {
		LlamadaInternacional llamada = new LlamadaInternacional(origen.getNumeroTelefono(), destino.getNumeroTelefono(),
				duracion);
		llamadas.add(llamada);
		origen.agregarLlamada(llamada);
		return llamada;
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) {
		return cliente.calcularMontoTotalLlamadas();
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
