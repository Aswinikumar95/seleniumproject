package main.org;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
	@BeforeClass
	public static void beforelass() {
      System.out.println("before class");
	}
	@AfterClass
	public static void AfterClass() {
         System.out.println("after class");
         
	}
	@Before 
	public void before() {
       System.out.println("before");
	}
	 @After
	 public void after() {
		 System.out.println("after");
	}
	 @Test
	 public void test(){
		System.out.println("test");
	}
	 private void testx() {
		 System.out.println("test");
	}

}
