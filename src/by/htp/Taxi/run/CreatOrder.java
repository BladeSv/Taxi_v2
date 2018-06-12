package by.htp.Taxi.run;

import by.htp.Taxi.entity.*;

public class CreatOrder {

	private static Client client;

	public static Order creatOrder(TransportPark transportPark) {

		Order order = new Order();

		ChooseTransport chooseTransport = new ChooseTransport();
		client = AddClient.addClient();
		order.setClient(client);

		chooseTransport.chooseTranport(client, transportPark.getTpark());
		order.setChooseTransport(chooseTransport);
		return order;

	}

}
