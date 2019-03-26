package Singleton;

public class ticketMaker {
	private int ticket = 1000;
	private static ticketMaker maker = new ticketMaker();
	private ticketMaker() {
		System.out.println("instance created");
	}
	public static ticketMaker getInstance() {
		return maker;
	}
	public int getNextNumber() {
		return ticket++;
	}
}
