package ejercicio17Test;

import ejercicio17.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoFinancieroTest {
	private CompraBonoAltoRiesgo alto;
	private CompraBonoBajoRiesgo bajo;
	private CompraDolares dolares;
	private CompraPesos pesos;
	private PlazoFijo fijo;
	private Silver silver;
	private Golden golden;

	@BeforeEach
	public void setUp() {
		this.silver = new Silver();
		this.golden = new Golden();
		this.alto = new CompraBonoAltoRiesgo(72);
		this.bajo = new CompraBonoBajoRiesgo(72);
		this.dolares = new CompraDolares();
		this.pesos = new CompraPesos();
		this.fijo = new PlazoFijo(4, 0.4);
	}

	@Test
	public void testRetornoInversionSimple() {
		assertEquals(2456.5, this.alto.retornoInversion(500));
		this.alto.setParking(24);
		assertEquals(850, this.alto.retornoInversion(500));
		assertEquals(665.5, this.bajo.retornoInversion(500));
		this.bajo.setParking(24);
		assertEquals(537.9, this.bajo.retornoInversion(489));
		assertEquals(284.55, this.dolares.retornoInversion(350000)); // con $350.000 se compran U$D284.55
		assertEquals(246000, this.pesos.retornoInversion(200)); // con U$D200 se compran $246.000
		assertEquals(2304.96, this.fijo.retornoInversion(600));
	}

	@Test
	public void testMembresias() {
		assertEquals(3, this.silver.crearProducto1().getProductos().size());
		assertEquals(4, this.golden.crearProducto2().getProductos().size());
		assertEquals(3, this.golden.crearProducto4().getProductos().size());
		assertEquals(3, this.golden.crearProducto3().getProductos().size());
		Exception exc = assertThrows(RuntimeException.class, () -> this.silver.crearProducto3());
		assertEquals("Este tipo de membresía no incluye este producto", exc.getMessage());
	}
	
	@Test
	public void testRetornoInversionCombinado() {
		assertEquals(308879.2, this.silver.crearProducto1().retornoInversion(250));
		assertEquals(1530, this.golden.crearProducto4().retornoInversion(300));
	}
}
