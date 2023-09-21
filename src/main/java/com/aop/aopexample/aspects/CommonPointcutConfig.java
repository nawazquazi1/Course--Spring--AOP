package com.aop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author nawaz
 */
public class CommonPointcutConfig {
	
	@Pointcut("execution(* com.aop.aopexample.*.*.*(..))")
	public void businessAndDataPackageConfig() {}

	@Pointcut("execution(* com.aop.aopexample.business.*.*(..))")
	public void businessPackageConfig() {}

	@Pointcut("execution(* com.aop.aopexample.data.*.*(..))")
	public void dataPackageConfig() {}
	
	@Pointcut("bean(*Service*)")
	public void allPackageConfigUsingBean() {}

	@Pointcut("@annotation(com.aop.aopexample.annotations.TrackTime)")
	public void trackTimeAnnotation() {}
}
