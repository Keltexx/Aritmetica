package ecuaciones;

import java.util.ArrayList;

public class EcuacionCuadratica {
	//ax^2+bx+c=0
	private double a;
	private double b;
	private double c;
	private double solucionMasRaiz;
	private double solucionMenosRaiz;
	
	public EcuacionCuadratica(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double resolverMasRaiz(EcuacionCuadratica eC) {
		
		if(eC.a==0) throw new IllegalArgumentException();
		if(eC.b==0) throw new IllegalArgumentException();
		else {
			if((Math.pow(eC.b, 2)-4*eC.a*eC.c)<0) throw new IllegalArgumentException();
	
			eC.solucionMasRaiz=(-eC.b+(Math.sqrt(Math.pow(eC.b, 2)-4*eC.a*eC.c)))/(2*eC.a);
		}
		return eC.solucionMasRaiz;
		
	}
	
	public double resolverMenosRaiz(EcuacionCuadratica eC) {
		
		if(eC.a==0) throw new IllegalArgumentException();
		if(eC.b==0) throw new IllegalArgumentException();
		else {
			if((Math.pow(eC.b, 2)-4*eC.a*eC.c)<0) throw new IllegalArgumentException();
				
			eC.solucionMenosRaiz=(-eC.b-(Math.sqrt(Math.pow(eC.b, 2)-4*eC.a*eC.c)))/(2*eC.a);
			
		}
		return eC.solucionMenosRaiz;
		
	}
}
