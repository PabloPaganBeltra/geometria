import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Circulo_PPBTest {

	@Test
	void testA0() {
		Circulo_PPB c1 = new Circulo_PPB(0,"circulo");
		assertEquals((0*0*3.1416),c1.area(),0.01);
	}
	@Test
	void testA7() {
		Circulo_PPB c1 = new Circulo_PPB(7,"circulo");
		assertEquals((7*7*3.1416),c1.area(),0.01);
	}
	@Test
	void testA3() {
		Circulo_PPB c1 = new Circulo_PPB(-3,"circulo");
		assertEquals((-3*-3*3.1416),c1.area(),0.01);
	}
	@Test
	void testP0() {
		Circulo_PPB c1 = new Circulo_PPB(0,"circulo");
		assertEquals((0*0*3.1416),c1.perimetro(),0.01);
	}
	@Test
	void testP7() {
		Circulo_PPB c1 = new Circulo_PPB(7,"circulo");
		assertEquals((7*7*3.1416),c1.perimetro(),0.01);
	}
	@Test
	void testP3() {
		Circulo_PPB c1 = new Circulo_PPB(-3,"circulo");
		assertEquals((-3*-3*3.1416),c1.perimetro(),0.01);
	}
	

}
