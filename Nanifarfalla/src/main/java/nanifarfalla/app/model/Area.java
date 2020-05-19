package nanifarfalla.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "area")
public class Area {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_area;
	String nombre_area;
	String claveApi;
	Date version;

	public Area() {

	}

	public int getCodigo_area() {
		return codigo_area;
	}

	public void setCodigo_area(int codigo_area) {
		this.codigo_area = codigo_area;
	}

	public String getNombre_area() {
		return nombre_area;
	}

	public void setNombre_area(String nombre_area) {
		this.nombre_area = nombre_area;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

}
