package main.org;

import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.TestInstance;

public class JavaUnit1 {
	@Test
	private void text0() {
		String s="abcdef";
		System.out.println(s);
		Assert.assertEquals("Abcded" , s);
		System.out.println(s);
	}
	
	@Test
	private void test1() {
		System.out.println("method");
	}
   
	
	
	
}
