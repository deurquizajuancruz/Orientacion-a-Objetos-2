package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteFisico extends Cliente {
	private String dni;
	private static final double DESCUENTO_FIS = 0;

	public ClienteFisico(String nombre, String numeroTelefono, String dni) {
		super(nombre, numeroTelefono);
		this.dni = dni;
	}

	public double calcularDescuento(double valor) {
		return valor * DESCUENTO_FIS;
	}

}
