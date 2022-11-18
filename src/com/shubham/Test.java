package com.shubham;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
	
	Class cls=Reflect.class;
	
	Reflect srt=new Reflect();
	
	Method methods[]=cls.getDeclaredMethods();
	
	for(Method meth:methods) {
		
		/*
		 * System.out.println(meth.getName()); 
		 * System.out.println(meth.getReturnType());
		 * System.out.println(meth.getParameterCount());
		 */
	meth.invoke(srt, null);
	}
	
}
}
