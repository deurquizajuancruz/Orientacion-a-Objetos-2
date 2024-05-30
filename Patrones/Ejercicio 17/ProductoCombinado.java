package ejercicio17;

import java.util.List;

public class ProductoCombinado extends ProductoFinanciero {
	private List<ProductoFinanciero> productos;

	public ProductoCombinado(List<ProductoFinanciero> productos) {
		this.productos = productos;
	}

	// para el test
	public List<ProductoFinanciero> getProductos() {
		return productos;
	}
	
	public double retornoInversion(double montoInicial) {
		return this.productos.stream().mapToDouble(p -> p.retornoInversion(montoInicial)).sum();
	}

	
	

}
