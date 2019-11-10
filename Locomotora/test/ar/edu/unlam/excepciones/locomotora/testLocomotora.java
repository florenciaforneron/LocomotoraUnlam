package ar.edu.unlam.excepciones.locomotora;

import org.junit.Test;

public class testLocomotora {

//	@Test(expected = Exception.class) // si fuese try o catch no se pone el expected, es porque no tengo un assert y asi lo compruebo
//	public void testQueSeLanceUnaExcepcionSiSuperaLaCapacidadMaxima() throws Exception{
//		Integer capacidadMaxima = 100;
//		Locomotora miLocomotora = new Locomotora(capacidadMaxima);
//		Vagon vagon1 = new Vagon(50);
//		Vagon vagon2 = new Vagon(50);
//		Vagon vagon3 = new Vagon(50);
//		miLocomotora.agregarVagon(vagon1);
//		miLocomotora.agregarVagon(vagon2);
//		miLocomotora.agregarVagon(vagon3);
//	}
//	
	
	@Test(expected = Exception.class) // si fuese try o catch no se pone el expected, es porque no tengo un assert y asi lo compruebo
	public void testQueSeLanceUnaExcepcionSiSuperaLaCapacidadMaxima() throws Exception { // se lanza
		Integer capacidadMaxima = 100;
		Locomotora miLocomotora = new Locomotora(capacidadMaxima);
		Vagon vagon1 = new Vagon(50);
		Vagon vagon2 = new Vagon(50);
		Vagon vagon3 = new Vagon(50);
		try { // si tengo varios catch pongo lo mas especifico arriba y lo menos especifico abajo
			miLocomotora.agregarVagon(vagon1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // genera una salida
			throw new Exception ("vuelvo a lanzarla");
		}
		try {
			miLocomotora.agregarVagon(vagon2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			miLocomotora.agregarVagon(vagon3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// esto es lo que se ejecuta si o si por default
		}
	}
	
	

}
