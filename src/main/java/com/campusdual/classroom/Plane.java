package com.campusdual.classroom;

public class Plane implements IMachine {

	private final String name;

	public Plane(String name) {
		this.name = name;
	}

	public void takeOff() {
		System.out.println("El avion despega");
	}

	public void land() {
		System.out.println("El avion aterriza");
	}

	public void fly() {
		System.out.println("El avion está volando");
	}

	@Override
	public void start() {
		System.out.println("El avion esta encendido.");
	}

	@Override
	public void stop() {
		System.out.println("El avion esta apagado.");
	}

	@Override
	public void maintenance() {
		System.out.println("El avion esta en mantenimiento.");
	}


}
