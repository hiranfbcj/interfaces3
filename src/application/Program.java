package application;

import devices.ConcretePrinter;
import devices.ConcreteScanner;
import devices.ComboDevice;

public class Program {
	public static void main(String[] args) {
		ConcretePrinter p = new ConcretePrinter("1000");
		p.processDoc("My letter");
		p.print("My letter");

		System.out.println();
		ConcreteScanner s = new ConcreteScanner("1001");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());

		System.out.println();
		ComboDevice c = new ComboDevice("1002");
		c.processDoc("My Dissertation");
		c.print("My Dissertation");
		System.out.println("Scan result: " + c.scan());
	}
}