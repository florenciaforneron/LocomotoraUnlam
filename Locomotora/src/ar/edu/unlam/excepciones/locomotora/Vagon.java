package ar.edu.unlam.excepciones.locomotora;

public class Vagon {
	private Integer carga;
	
	public Vagon(Integer carga){
		this.carga = carga;
	}

	public Integer getCarga() {
		return carga;
	}

	public void setCarga(Integer carga) {
		this.carga = carga;
	}
}
