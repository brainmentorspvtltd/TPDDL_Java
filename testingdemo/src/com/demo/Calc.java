package com.demo;

public class Calc {
	public int add(int x, int y) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  x + y;
	}

}
