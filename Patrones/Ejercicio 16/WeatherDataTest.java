package ejercicio16Test;

import ejercicio16.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherDataTest {
	private HomeWeatherStationAdapter hA;
	private DecoratorTemperaturaFahrenheit tF;
	private DecoratorTemperaturaCelsius tC;
	private DecoratorMaximaCelsius maxC;
	private DecoratorMinimaCelsius minC;
	private DecoratorMaximaFahrenheit maxF;
	private DecoratorMinimaFahrenheit minF;
	private DecoratorPromedioCelsius pC;
	private DecoratorPromedioFahrenheit pF;
	private DecoratorPresion p;
	private DecoratorRadiacionSolar rS;

	@BeforeEach
	public void setUp() {
		this.hA = new HomeWeatherStationAdapter(new HomeWeatherStation());
	}

	@Test
	public void testDisplayData1() {
		assertEquals("Datos de la temperatura: \n", hA.displayData());
		assertEquals(67.6, hA.getTemperatura());
		this.tC = new DecoratorTemperaturaCelsius(hA);
		assertEquals("Datos de la temperatura: \nTemperatura C: 19.78;", this.tC.displayData());
		this.p = new DecoratorPresion(tC);
		this.rS = new DecoratorRadiacionSolar(p);
		assertEquals("Datos de la temperatura: \nTemperatura C: 19.78;Presión atmosf: 1008.0;Radiación solar: 400.0;",
				this.rS.displayData());
	}

	@Test
	public void testDisplayData2() {
		this.tF = new DecoratorTemperaturaFahrenheit(hA);
		this.p = new DecoratorPresion(tF);
		this.rS = new DecoratorRadiacionSolar(p);
		this.pF = new DecoratorPromedioFahrenheit(rS);
		assertEquals(
				"Datos de la temperatura: \nTemperatura F: 67.6;Presión atmosf: 1008.0;Radiación solar: 400.0;Promedio F: 68.875;",
				this.pF.displayData());

	}

	@Test
	public void testDisplayData3() {
		this.tF = new DecoratorTemperaturaFahrenheit(hA);
		this.p = new DecoratorPresion(tF);
		this.rS = new DecoratorRadiacionSolar(p);
		this.pF = new DecoratorPromedioFahrenheit(rS);
		this.maxF = new DecoratorMaximaFahrenheit(pF);
		this.minF = new DecoratorMinimaFahrenheit(maxF);
		assertEquals(
				"Datos de la temperatura: \nTemperatura F: 67.6;Presión atmosf: 1008.0;Radiación solar: 400.0;Promedio F: 68.875;Máximo F: 98.1;Mínimo F: 40.5;",
				this.minF.displayData());
	}

	@Test
	public void testDisplayData4() {
		this.tC = new DecoratorTemperaturaCelsius(hA);
		this.p = new DecoratorPresion(tC);
		this.rS = new DecoratorRadiacionSolar(p);
		this.pC = new DecoratorPromedioCelsius(rS);
		this.maxC = new DecoratorMaximaCelsius(pC);
		this.minC = new DecoratorMinimaCelsius(maxC);
		assertEquals(
				"Datos de la temperatura: \nTemperatura C: 19.78;Presión atmosf: 1008.0;Radiación solar: 400.0;Promedio C: 20.49;Máximo C: 36.72;Mínimo C: 4.72;",
				this.minC.displayData());
	}

	@Test
	public void testDisplayData5() {
		this.maxF = new DecoratorMaximaFahrenheit(hA);
		this.minC = new DecoratorMinimaCelsius(maxF);
		this.rS = new DecoratorRadiacionSolar(minC);
		this.tC = new DecoratorTemperaturaCelsius(rS);
		this.p = new DecoratorPresion(tC);
		this.minF = new DecoratorMinimaFahrenheit(p);
		this.pC = new DecoratorPromedioCelsius(minF);
		this.pF = new DecoratorPromedioFahrenheit(pC);
		this.tF = new DecoratorTemperaturaFahrenheit(pF);
		assertEquals(
				"Datos de la temperatura: \nMáximo F: 98.1;Mínimo C: 4.72;Radiación solar: 400.0;Temperatura C: 19.78;Presión atmosf: 1008.0;Mínimo F: 40.5;Promedio C: 20.49;Promedio F: 68.875;Temperatura F: 67.6;",
				this.tF.displayData());
	}

}
