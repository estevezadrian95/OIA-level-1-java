package vendedoraPremiada;

import java.util.Arrays;

public class Vendedora {

	private int n_vendedora;
	private int ventas[];
	private int importe;
	private int ventasCons;

	public Vendedora(int n_vendedora, int[] ventas, int importe) {
		super();
		this.n_vendedora = n_vendedora;
		this.ventas = ventas;
		this.importe = importe;
	}

	public Vendedora() {

		this.n_vendedora = 0;
		this.ventas = new int[0];
		this.importe = 0;
		this.ventasCons = 0;
	}

	public int getN_vendedora() {
		return n_vendedora;
	}

	public void setN_vendedora(int n_vendedora) {
		this.n_vendedora = n_vendedora;
	}

	public int[] getVentas() {
		return ventas;
	}

	public void setVentas(int[] ventas) {
		this.ventas = ventas;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public int getVentasCons() {
		return ventasCons;
	}

	public void setVentasCons(int ventasCons) {
		this.ventasCons = ventasCons;
	}

	@Override
	public String toString() {
		return "Vendedora [n_vendedora=" + n_vendedora + ", ventas=" + Arrays.toString(ventas) + ", importe=" + importe
				+ ", ventasCons=" + ventasCons + "]";
	}

}
