
public class Circulo_PPB extends FiguraGeometrica_PPB {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_PPB(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
			if (radio<0) {
				radio*=-1;
			}
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}
	
	

}
