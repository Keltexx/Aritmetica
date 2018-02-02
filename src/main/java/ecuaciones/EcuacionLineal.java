package ecuaciones;

public class EcuacionLineal {
	private double a;
	private double b;
	private double solucion;
	
	public EcuacionLineal(double a, double b){
		this.a=a;
		this.b=b;
	}
	
	public double resolver(double a, double b){
		if(a==0) throw new IllegalArgumentException();
		solucion=-b/a;
		return solucion;
	}
}
