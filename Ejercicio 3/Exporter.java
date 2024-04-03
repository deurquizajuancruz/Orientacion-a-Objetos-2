package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Exporter extends VoorheesExporter {

	public Exporter() {
	}

	@SuppressWarnings({ "unused", "unchecked" })
	private JSONObject exportar(Socio s) {
		JSONObject socioExportado = new JSONObject();
		socioExportado.put("nombre", s.getNombre());
		socioExportado.put("email", s.getEmail());
		socioExportado.put("legajo", s.getLegajo());
		return socioExportado;
	}

	@Override
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty())
			return "[]";
		JSONArray sociosExportados = new JSONArray();
		socios.forEach(s -> sociosExportados.add(this.exportar(s)));
		return sociosExportados.toJSONString();
	}
}
