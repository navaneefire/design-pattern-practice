package com.thollil.annachi.design.strategy;

public class Animal 
{
	private String name;
	private Double height;
	private Double weight;
	private String food;
	private Double speed;
	private String sound;
	private Fly fly;
	public Fly getFly() {
		return fly;
	}
	public void setFly(Fly fly) {
		this.fly = fly;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public Double getSpeed() {
		return speed;
	}
	public void setSpeed(Double speed) {
		this.speed = speed;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
}
