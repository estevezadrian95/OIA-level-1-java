package miFigura;

class TestPunto {

	public static void main(String[] args) {
		Punto2D p2D = new Punto2D(2,1);
		Punto3D p3D = new Punto3D(0,0,0);
		
		System.out.println(p2D + " "+ p2D.getClass());
		System.out.println(p3D + " "+ p3D.getClass());
		
		Punto p3 = new Punto2D(3,4);
		Punto p4 = new Punto3D(5,6,7);
		
		p2D = p3D;
		
		Punto [] vecPuntos = new Punto[4];
		
		for(int i=0; i<4; i++)
			vecPuntos[i]=new Punto3D(1,1,1);
		
		vecPuntos[2]=p2D;
		for(int i=0; i<4; i++)
			System.out.println(vecPuntos[i].distanciaAlOrigen());
	}

}
