package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUNITStack {

	@Test
	public void testCreateNewEmtpyStack() {
		
		Stack s1 = new Stack(20);
		int size = s1.getSize();
		
		assertEquals(0, size);
		boolean emtpy=s1.isEmtpy();
		assertTrue(emtpy);
	}
	
	@Test
	public void testPushElmToTop() {
		
		Stack s1 = new Stack(20);
		s1.push(1);
		int top = s1.getTop();
		assertEquals(1, top);
	}
	
	@Test
	public void LastInFirstOut() {
		
		Stack s1 = new Stack(20);
		s1.push(1);
		
		s1.pop();
		int num = s1.getTop();
		assertEquals(0, num);
	}
	
	@Test
	public void PushElmToLimitedSizeStack() {
		
		Stack s1 = new Stack(5);
		s1.push(1);
		
		assertTrue(s1.isFull());
		s1.push(2);
		
		assertTrue(s1.isFull());
		s1.push(3);
		
		assertTrue(s1.isFull());
		s1.push(4);
		
		assertTrue(s1.isFull());
		s1.push(5);
		
		assertTrue(s1.isFull());
		s1.push(6);
		assertTrue(s1.isFull());
	} 

}
