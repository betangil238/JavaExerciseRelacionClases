package Exercise2;

public class RevolverDeAgua {
	
	private int[] revolver= new int[6];
	private int posicionAgua=(int) Math.floor(Math.random()*(0-6)+6);
	private int posicionActual=(int) Math.floor(Math.random()*(0-6)+6);
	
	public int[] llenarRevolver() {
		for (int i = 0; i < revolver.length; i++) {
			if (i== posicionAgua) {
				revolver[i]=1;
			}else {
				revolver[i]=0;
			}
		}
		return revolver;
	}
	
	public boolean mojar() {
		if (posicionAgua==posicionActual) {
			System.out.println("Perdiste");
			return true;
		}else {
			siguienteChorro();
			System.out.println("Otro dia para contarlo");
			return false;
		}
	}
	
	private void siguienteChorro() {
		if (posicionActual==5) {
			posicionActual=0;
		}else {
			posicionActual++;
		}
	}

	@Override
	public String toString() {
		return "posicionAgua= " + posicionAgua + " PosicionActual= "+posicionActual ;
	}
}
