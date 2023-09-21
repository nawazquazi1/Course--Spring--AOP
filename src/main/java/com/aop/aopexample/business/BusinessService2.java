package com.aop.aopexample.business;

import java.util.Arrays;

import com.aop.aopexample.data.DataService2;
import org.springframework.stereotype.Service;

/**
 * @author nawaz
 */
@Service
public class BusinessService2 {
	
	private DataService2 dataService2;
	
	public BusinessService2(DataService2 dataService2) {
		this.dataService2 = dataService2;
	}
	
	public int calculateMin() {
		int[] data = dataService2.retrieveData();
		
		//throw new RuntimeException("Something Went Wrong!");
		return Arrays.stream(data).min().orElse(0);
	}
}
