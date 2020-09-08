package mqtt;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ClienteMQTT clienteMQTT = new ClienteMQTT("tcp://tnt-iot.maratona.dev:30573", "maratoners", "ndsjknvkdnvjsbvj");
		clienteMQTT.iniciar();

		new Ouvinte(clienteMQTT, "tnt", 0);
	}
}