package ejercicio15;

import java.time.LocalDateTime;

public interface FileOO2 {

	public abstract String prettyPrint();

	public abstract String getNombre();

	public abstract String getExtension();

	public abstract String getPermisos();

	public abstract double getTamanio();

	public abstract LocalDateTime getFechaCreacion();

	public abstract LocalDateTime getFechaModificacion();
}
