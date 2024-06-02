package ejercicio19;

public class Personaje {
	private int vida;
	private Armadura armadura;
	private Arma arma;

	public Personaje(Armadura armadura, Arma arma) {
		this.vida = 100;
		this.armadura = armadura;
		this.arma = arma;
	}

	// Para el test
	public int getVida() {
		return this.vida;
	}

	// Para el test
	public Armadura getArmadura() {
		return this.armadura;
	}

	// Para el test
	public Arma getArma() {
		return this.arma;
	}

	public void atacar(Personaje otro) {
		if (this.estaVivo())
			otro.recibirDanio(this.arma.pegarArmadura(otro.getArmadura()));
		else
			throw new RuntimeException("No se puede atacar a otro personaje estando muerto.");
	}

	private boolean estaVivo() {
		return this.vida > 0;
	}

	public void recibirDanio(int danio) {
		if (this.estaVivo())
			if (this.vida > danio)
				this.vida -= danio;
			else
				this.vida = 0;
		else
			throw new RuntimeException("No se puede recibir daño estando muerto.");
	}
}
