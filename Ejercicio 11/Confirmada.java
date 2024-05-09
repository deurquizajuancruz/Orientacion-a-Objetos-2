package ejercicio11;

public class Confirmada extends State { 

	public void aprobarEtapa(Proyecto p) { // puse este metodo porque sino me queda una clase anemica, pero sino no hace falta
		throw new RuntimeException("No se puede aprobar esta etapa ya que el proyecto ya esta confirmado");
	}
}
