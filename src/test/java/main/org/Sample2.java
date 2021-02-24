package main.org;

import org.testng.annotations.Test;

public class Sample2 {
//	@Test
//	private void test0() {
//		System.out.println("method");
//	}
//    @Test
//    private void test1() {
//    	System.out.println("method1");
//	}
//    @Test
//    private void test2() {
//    	System.out.println("method2");
//	}
    
    @Test
    private void test0() {
    	System.out.println("method0");
    	System.out.println(Thread.currentThread().getId());
	}
    @Test
    private void test1() {
    	System.out.println("method1");
    	System.out.println(Thread.currentThread().getId());
	}
    @Test
    private void test2() {
    	System.out.println("method2");
    	System.out.println(Thread.currentThread().getId());
	}
}
