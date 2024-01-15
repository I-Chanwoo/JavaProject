package model;

public class MenuVO {
	private String name;
	private int price;
	private int stack;
	
	public MenuVO(String name, int price, int stack) {
		this.name = name;
		this.price = price;
		this.stack = stack;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getStack() {
		return stack;
	}
}
