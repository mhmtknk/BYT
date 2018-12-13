import domain.PJObserver;
import service.Monitor;
import memento.Originator;
import memento.CareTaker;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void main(String[] args) throws MalformedURLException {

		URL adress0 = new URL("http://www.pja.edu.pl/");

		Monitor monitor = new Monitor();

		PJObserver pjObserver = new PJObserver(monitor, adress0);

		monitor.addToObserversMap(pjObserver);

		CareTaker careTaker = new CareTaker();
		Originator originator = new Originator();

		new Gui(monitor, originator, careTaker);

	}

}
