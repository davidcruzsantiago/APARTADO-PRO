
public class CambioMoneda {
	
	double Cantidad;
	double Cambio;
	
	CambioMoneda(double Cantidad){
	Cambio = 1.09;	
	}
	
	public double CambioMoneda(double Cambio) {
		return Cambio = this.Cambio;
	}
	
	public double EurosDolares(double Cantidad) {
		return this.Cantidad = Cantidad * Cambio;
	}
	
	public double DolaresEuros(double Cantidad) {
		return this.Cantidad = Cantidad / Cambio;
	}
	
	public double getCantidad() {
		return Cantidad;
	}

	public void setCantidad(double cantidad) {
		Cantidad = cantidad;
	}
}
