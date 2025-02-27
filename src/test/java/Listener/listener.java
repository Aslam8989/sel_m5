package Listener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.util.Listener;
 
//@Listeners(base.util.Listener.class)
	public class listener {
		@Test
		public void demo() {
		System.out.println("test execution");
		}
}
