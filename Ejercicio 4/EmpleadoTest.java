package ejercicio4Test;

import ejercicio4.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	private Pasante pas1, pas2;
	private Temporario temp1, temp2;
	private Planta plan1, plan2;
	
	@BeforeEach
	public void setUp() {
		this.pas1 = new Pasante(false, 0, 0, 0, 3);
		this.pas2 = new Pasante(false, 0, 0, 0, 36);
		this.temp1 = new Temporario(false, 2, 24, 3);
		this.temp2 = new Temporario(true, 4, 41, 12);
		this.plan1 = new Planta(false, 4, 13, 9);
		this.plan2 = new Planta(true, 1, 45, 6);
	}
	
	@Test
	public void testSueldoBasico() {
		assertEquals(20000, this.pas1.getSueldoBasico());
		assertEquals(27200,this.temp1.getSueldoBasico());
		assertEquals(32300,this.temp2.getSueldoBasico());
		assertEquals(50000,this.plan1.getSueldoBasico());
	}
	
	@Test
	public void testSueldoAdicional() {
		assertEquals(6000,this.pas1.calcularSueldoAdicional());
		assertEquals(72000,this.pas2.calcularSueldoAdicional());
		assertEquals(4000,this.temp1.calcularSueldoAdicional());
		assertEquals(13000,this.temp2.calcularSueldoAdicional());
		assertEquals(26000,this.plan1.calcularSueldoAdicional());
		assertEquals(19000,this.plan2.calcularSueldoAdicional());
	}
	
	@Test
	public void testSueldoDescuento() {
		assertEquals(2900,this.pas1.calcularDescuento());
		assertEquals(6200,this.pas2.calcularDescuento());
		assertEquals(3736,this.temp1.calcularDescuento());
		assertEquals(4849,this.temp2.calcularDescuento());
		assertEquals(7800,this.plan1.calcularDescuento());
		assertEquals(7450,this.plan2.calcularDescuento());
	}
	
	@Test
	public void testSueldo() {
		assertEquals(28900, this.pas1.sueldo());
		assertEquals(98200,this.pas2.sueldo());
		assertEquals(34936,this.temp1.sueldo());
		assertEquals(50149,this.temp2.sueldo());
		assertEquals(83800,this.plan1.sueldo());
		assertEquals(76450,this.plan2.sueldo());
	}
}
