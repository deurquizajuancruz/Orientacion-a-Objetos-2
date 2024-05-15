package ejercicio15;

public class DecoratorFechaCreacion extends Decorator {

	public DecoratorFechaCreacion(FileOO2 componente) {
		super(componente);
	}

	public String prettyPrint() {
		return super.prettyPrint() + "\n" + this.getFechaCreacion().getHour() + ":"
				+ this.getFechaCreacion().getMinute() + " " + this.getFechaCreacion().getDayOfMonth() + "/"
				+ this.getFechaCreacion().getMonthValue() + "/" + this.getFechaCreacion().getYear();
	}

}
