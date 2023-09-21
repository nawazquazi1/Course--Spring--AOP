package com.aop.aopexample.data;

import org.springframework.stereotype.Repository;

/**
 * @author nawaz
 */
@Repository
public class DataService1 {
	
	public int[] retrieveData() {
		
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new int[] {11, 22, 33, 44, 55};
	}

}
