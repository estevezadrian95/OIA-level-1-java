package unlam.edu.tpa;

public class Estanque {

	private int supEstanque;
	private int profEstanque;
	private int profTubo;

	public Estanque(int supEstanque, int profEstanque, int profTubo) {
		this.supEstanque = supEstanque;
		this.profEstanque = profEstanque;
		this.profTubo = profTubo;
	}

	/**
	 * :: SUBCLASE ESTANQUE :: - El conjunto de "Estanques" construye la clase
	 * Pileta con un array de estanques
	 **/
	public static class Pileta {
		private Estanque[] pileta;
		private int volumenAgua;

		// Para el contructor
		public Pileta(Estanque[] pileta, int volumenAgua) {
			this.pileta = pileta;
			this.volumenAgua = volumenAgua;
		}

		public int verificarDesborde() {

			int volumenTotal = 0;
			for (int i = 0; i < this.pileta.length; i++)
				volumenTotal += this.pileta[i].profEstanque * this.pileta[i].supEstanque;

			System.out.println(" ** Volumen total: " + volumenTotal);
			return this.volumenAgua - volumenTotal;
		}

		public static int calcProfTubo(Estanque e) {
			return e.profEstanque - e.profTubo;
		}

		public static int volHTubo(Estanque e) {
			return calcProfTubo(e) * e.supEstanque;
		}

		public int[] distribuirAgua() {
			int[] rEstanques = new int[this.pileta.length];
			int nroEs = 0;

			// Para el primero
			int volAgua = this.volumenAgua;
			int volAlTubo = volHTubo(this.pileta[nroEs]);
			int hTubo = calcProfTubo(this.pileta[nroEs]);

			// Veo que hago en el primer estanque, si me alcanza o no.
			if (hTubo > (volAgua / this.pileta[nroEs].supEstanque)) {
				rEstanques[nroEs] = volAgua / this.pileta[nroEs].supEstanque;
				return rEstanques;
			} else {
				volAgua -= volAlTubo;
				rEstanques[nroEs] = hTubo;

			}

			// Mientras haya agua
			int hTuboMasBajo = 0;
			boolean anteriorMasBajo = false;
			while (volAgua > 0) {

				// Busco el tubo mas bajo.
				nroEs++;
				hTubo = calcProfTubo(this.pileta[nroEs]);

				if (this.pileta[nroEs].profTubo < this.pileta[nroEs-1].profTubo) {
					hTuboMasBajo = this.pileta[nroEs].profEstanque - this.pileta[nroEs-1].profTubo;
					anteriorMasBajo = true;
				} else {
					anteriorMasBajo = false;
					hTuboMasBajo = calcProfTubo(this.pileta[nroEs]);
				}

				// Veo si llego al mas bajo
				if (hTuboMasBajo > (volAgua / this.pileta[nroEs].supEstanque)) {
					rEstanques[nroEs] = volAgua / this.pileta[nroEs].supEstanque;
					return rEstanques;
				} else {
					rEstanques[nroEs] = hTuboMasBajo;
					volAgua -= this.pileta[nroEs].supEstanque * hTuboMasBajo;
				}

				// Acumulo superficies anteriores
				if (anteriorMasBajo == true) {

					int auxNroEs = nroEs - 1;
					int supAcumulada = this.pileta[nroEs].supEstanque;
					boolean aux = false; // Cuando encontre uno mas alto que
					//Acumulo
					while (auxNroEs >= 0 && this.pileta[auxNroEs].profTubo > this.pileta[nroEs].profTubo) {

						supAcumulada += this.pileta[auxNroEs].supEstanque;		
						auxNroEs--;
					} // End_While
					
					if(auxNroEs == -1)
						auxNroEs = 0;
					
					//Lleno el pileton acumulado
					if( (this.pileta[nroEs].profEstanque - this.pileta[nroEs-1].profTubo) > (volAgua / supAcumulada)) {
						
						for( int i = auxNroEs; i <= nroEs; i++)
							rEstanques[i] += volAgua / supAcumulada;
						
						volAgua = 0;
						return rEstanques;
					}
					else {
						for( int i = auxNroEs; i <= nroEs; i++)
							rEstanques[i] = hTubo;
							
						volAgua -= hTubo * supAcumulada;
					}
				
				}//End_if_Acumula

			}

			return rEstanques;
		}
	}

}
