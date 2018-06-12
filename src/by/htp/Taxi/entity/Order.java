package by.htp.Taxi.entity;

import by.htp.Taxi.run.ChooseTransport;

public class Order extends BaseOrder {

	private ChooseTransport chooseTransport;

	private Client client;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ChooseTransport getChooseTransport() {
		return chooseTransport;
	}

	public void setChooseTransport(ChooseTransport chooseTransport) {
		this.chooseTransport = chooseTransport;
	}

	@Override
	public String toString() {
		return "Order [chooseTransport=" + chooseTransport + ", client=" + client + "]";
	}

}
