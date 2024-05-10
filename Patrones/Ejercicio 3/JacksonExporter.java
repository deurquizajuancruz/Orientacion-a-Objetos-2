package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonExporter extends VoorheesExporter {

	public JacksonExporter() {
	}

	public String exportar(List<Socio> socios) {
		ObjectMapper mapeo = new ObjectMapper();
		String resultado = "";
		try {
			resultado = mapeo.writeValueAsString(socios);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return resultado;
	}
}
