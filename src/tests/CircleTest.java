package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Circle;

public class CircleTest {

	@Test
	public void test() {
		Circle circle = new Circle(2);
		assertEquals("kur", 12.56, circle.perimeter(), 0.01);
	}
	@Test(expected = IllegalArgumentException.class)
	public void test2() {
		Circle circle2 = new Circle(-1);
		assertEquals("kur", 6.28, circle2.perimeter(), 0);
	}

}
