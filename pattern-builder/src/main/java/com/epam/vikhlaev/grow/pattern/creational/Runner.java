package com.epam.vikhlaev.grow.pattern.creational;

public class Runner {

	public static void main(String[] args) {

	}

}



class Director<T>{
	private Builder<T> builder;
	
	
	public Director(Builder<T> builder) {
		this.builder = builder;
	}


	public T make() {
		
		return null;		
	}
	
	
	
}

class Prioduct {
	private String a;
	private String b;
	private String c;
	private String d;
	
	
}

interface Builder<T> {
	public T buildStepA();

	public T buildStepB();

	public T buildStepC();

	public T buildStepD();

	public T reset();

}

class ConcreteBuilder1 implements Builder<Object> {

	public Object buildStepA() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object buildStepB() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object buildStepC() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object buildStepD() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object reset() {
		// TODO Auto-generated method stub
		return null;
	}
}

class ConcreteBuilder2 implements Builder<Object>{

	public Object buildStepA() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object buildStepB() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object buildStepC() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object buildStepD() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object reset() {
		// TODO Auto-generated method stub
		return null;
	}
}