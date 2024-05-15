package ejercicio15;

public class DecoratorFechaModificacion extends Decorator {

	public DecoratorFechaModificacion(FileOO2 componente) {
		super(componente);
	}

	public String prettyPrint() {
		return super.prettyPrint() + "\n" + this.getFechaModificacion().getHour() + ":"
				+ this.getFechaModificacion().getMinute() + " " + this.getFechaModificacion().getDayOfMonth() + "/"
				+ this.getFechaModificacion().getMonthValue() + "/" + this.getFechaModificacion().getYear();
	}

}
