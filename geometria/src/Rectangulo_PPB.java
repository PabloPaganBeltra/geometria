/**
 * 
 * @author PabloPagánBeltrá
 * @version 1.2
 *
 */
public class Rectangulo_PPB extends FiguraGeometrica_PPB {
	private double l1;
	private double l2;
	/**
	 * Este método crea un rectángulo 
	 * @param tipoFigura Es la variable que define qué figura es 	
	 * @param lG Es el lado uno
	 * @param lP Es el lado dos
	 */
	public Rectangulo_PPB(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	@Override
	/**
	 * El método area genera el area de un rectangulo
	 * @return l1*l2 que es el area de un rectangulo
	 */
	public double area() {
		return l1 * l2;
	}
	
	@Override
	/**
	 * El método preímetro genera el perímetro del rectángulo
	 * @return (2*l1)*(2*12) que es el perímetro de un rectángulo
	 */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
