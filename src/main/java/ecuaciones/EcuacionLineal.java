package ecuaciones;

public class EcuacionLineal {
	//ax + b= 0
	private double a;
	private double b;
	private double solucion;
	
	public EcuacionLineal(double a, double b){
		this.a=a;
		this.b=b;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double resolver(EcuacionLineal ecuacionLineal){
		if(ecuacionLineal.a==0) throw new IllegalArgumentException();
		if(ecuacionLineal.b==0)
			ecuacionLineal.solucion=0;
		else
			ecuacionLineal.solucion=-b/a;
		return ecuacionLineal.solucion;
	}
}
