package ar.edu.unlam.excepciones.locomotora;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Locomotora {
		private Integer capacidadMaxima;
		private List <Vagon> vagones;
		// private cargaActual;
		
		
		public Locomotora(Integer capacidadMaxima){
			this.capacidadMaxima = capacidadMaxima;
			this.vagones = new LinkedList<Vagon>();
			
		}
		
		/* 1 private Integer obtenerCarga(){
			Integer carga = 0;
			for (Vagon vagon :this.vagones){ // Recorre la coleccion pero no puedo modificarla
				carga= carga + vagon.getCarga();
			}
			return carga;
		}*/
		private Integer obtenerCarga(){ // Recorre la coleccion pero puedo modificarla
			Integer carga = 0;
		Iterator <Vagon> vagonIterator = this.vagones.iterator();
		while (vagonIterator.hasNext()){
			carga = carga + vagonIterator.next().getCarga();
		} return carga;
		}
		
		public void agregarVagon(Vagon vagon) throws Exception {
			if (this.obtenerCarga() + vagon.getCarga() <= capacidadMaxima){
			this.vagones.add(vagon);
			}else {
				throw new Exception ("Carga maxima superada");
			}
		} 
		/* public void agregarVagon(Vagon vagon) throws Exception {
			if (this.cargaActual + vagon.getCarga() <= capacidadMaxima){
			this.vagones.add(vagon);
			}else {
				throw new Exception ("Carga maxima superada");
			}
			*/
		
		
}
