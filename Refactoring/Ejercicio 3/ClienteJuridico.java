package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridico extends Cliente {
	private static final double DESCUENTO_JUR = 0.15;
	private String cuit;

	public ClienteJuridico(String nombre, String numeroTelefono, String cuit) {
		super(nombre, numeroTelefono);
		this.cuit = cuit;
	}

	public double calcularDescuento(double valor) {
		return valor * DESCUENTO_JUR;
	}

}
