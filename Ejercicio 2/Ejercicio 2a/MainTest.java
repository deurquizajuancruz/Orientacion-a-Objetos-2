package ejercicio2;

public class MainTest {

	public static void main(String[] args) {
		Jugador jugador1, jugador2, jugador3;
		jugador1 = new Jugador("Juancito", new Piedra());
		jugador2 = new Jugador("Pilar", new Papel());
		jugador3 = new Jugador("Francisco", new Tijera());
		System.out.println(new Juego(jugador1, jugador2).jugar());
		System.out.println(new Juego(jugador1, jugador1).jugar());
		System.out.println(new Juego(jugador1, jugador3).jugar());
		System.out.println(new Juego(jugador2, jugador3).jugar());
		System.out.println(new Juego(jugador3, jugador3).jugar());
		System.out.println(new Juego(jugador2, jugador1).jugar());
	}
}
