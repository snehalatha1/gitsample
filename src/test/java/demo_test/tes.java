package demo_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import demo_test.cal;

class tes {
	cal o=new cal();

	@Test

	public void add() {
		assertEquals(30, o.add(10,20));
		}
	@Test
	public void sub() {
		assertEquals(10, o.sub(30,20));
			}
	@Test
	public void mul() {
		assertEquals(200, o.mul(10,20));
			}
	@Test
	public void div() {
		assertEquals(6, o.div(30,5));
		}

}
