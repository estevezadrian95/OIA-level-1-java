package depositoDeSubterraneo;

import java.util.ArrayList;

public class CalculoSubterraneo {

	private ArrayList<Deposito> depositos;
	private long cantDepositos;
	private long volumen;
	private long depositosUsados;
	private long metrosLibres;// es el resto entre el piso y el nivel de fluido
	
	public CalculoSubterraneo(ArrayList<Deposito> depositos, long cantDepositos, long volumen) {

		this.depositos = depositos;
		this.cantDepositos = cantDepositos;
		this.volumen = volumen;
	}

	public void calcular() {

		long suma = 0;
		int contador = 0;
		while (suma < this.volumen && contador < depositos.size()) {
			suma += depositos.get(contador).getSuperficie() * depositos.get(contador).getProfundidad();
			contador++;
		}

//		System.out.println(suma);
//		System.out.println(contador);

		if (volumen > suma && contador == depositos.size()) {// esto ocurre si rebalsa
			long resta = volumen - suma;
			System.out.println("rebasan: "+resta);
		}
		if (volumen <= suma && contador < depositos.size()) {
			
			depositosUsados=++contador;
			long calculo = 0;
			int sumasuperficie = 0;

			for (int i = 0; i < contador - 1; i++)
				calculo += (depositos.get(i).getProfundidad() - depositos.get(i + 1).getProfundidad())
						* depositos.get(i).getSuperficie();

			volumen -= calculo;

			for (int i = 0; i < contador; i++)
				sumasuperficie += depositos.get(i).getSuperficie();

			double volumen2 = volumen;
			double sumaSup2 = sumasuperficie;
			metrosLibres = Math.round(volumen2 / sumaSup2);// trunco
			System.out.println("Depositos usados: "+ depositosUsados);
			System.out.println("Metros libres: "+metrosLibres);
		}
	}

	@Override
	public String toString() {
		return "CalculoSubterraneo [depositos=" + depositos + ", cantDepositos=" + cantDepositos + ", volumen="
				+ volumen + "]";
	}

}
