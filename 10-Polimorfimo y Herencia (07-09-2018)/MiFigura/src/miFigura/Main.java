package miFigura;


public class Main {

	public static void main(String[] args) {
		Punto origen = new Punto2D(0, 0);
		Rectangulo rec1 = new Rectangulo("Blanco", origen, 2.0, 4.0);
		Circulo rueda1 = new Circulo("Blanco", origen, 1);
		Triangulo triangulo = new Triangulo("Blanco", origen, 2, 2);
		Cuadrado cuadrado1 = new Cuadrado("Blanco", origen, 0.5);
		Cuadrado cuadrado2 = new Cuadrado("Blanco", origen, 1.0);
		
//		double []vec=new double[10];
//
//		for(int i=0;i<10;i++){
//			
//			vec[i]=
//			
//			
//		}
		double Arq = 0.0;
		Figura[] v = new Figura[10];
		for(int i = 0; i<5; i++)
			v[i]=rueda1;
		for(int i = 5; i<7; i++)
			v[i]=rec1;
		v[7] = cuadrado1;
		v[8] = cuadrado2;
		v[9] = triangulo;
		for (Figura figura : v) {
			Arq += figura.calcularArea();
		}
//		ArrayList<Figura> v = new ArrayList<Figura>();
//		v.add(rueda1);
//		v.add(rueda1);
//		v.add(rueda1);
//		v.add(rueda1);
//		v.add(rueda1);
//		v.add(rec1);
//		v.add(rec1);
//		v.add(cuadrado2);
//		v.add(cuadrado2);
//		v.add(cuadrado1);
//		v.add(cuadrado1);
//		v.add(triangulo);
//		v.add(triangulo);
		System.out.println(Arq);
	}

}
