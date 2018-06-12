package by.htp.Taxi.run;

import java.util.Arrays;

import by.htp.Taxi.entity.Client;
import by.htp.Taxi.entity.Transport;

public class ChooseTransport {
	private Client client;
	private Transport[] chooseTpark;
	private Transport[] temp;
	private double[] time;
	private double[] price;

	public Transport[] getChooseTpark() {
		return chooseTpark;
	}

	public void setChooseTpark(Transport[] chooseTpark) {
		this.chooseTpark = chooseTpark;
	}

	public double[] getTime() {
		return time;
	}

	public double[] getPrice() {
		return price;
	}

	public void chooseTranport(Client client, Transport[] Tpark) {

		double timeT = 0, priceT = 0;
		for (int i = 0; i < Tpark.length; i++) {
			double km = Tpark[i].getFuel() / Tpark[i].getRate() * 100;
			timeT = client.getDistance() / Tpark[i].getSpeed();
			priceT = client.getDistance() / Tpark[i].getPriceKm();
			if (km >= client.getDistance()) {
				if (client.getMoney() >= priceT) {
					addChooseTransport(Tpark[i]);
					addTime(timeT);
					addPrice(priceT);

				}
			}

		}

	}

	private void addChooseTransport(Transport transport) {
		if (chooseTpark == null) {
			chooseTpark = new Transport[1];
			chooseTpark[0] = transport;
		} else {
			Transport[] temp = new Transport[chooseTpark.length + 1];
			for (int i = 0; i < (chooseTpark.length); i++) {
				temp[i] = chooseTpark[i];
			}
			temp[chooseTpark.length] = transport;
			chooseTpark = temp;
		}
	}

	private void addTime(double timeAdd) {
		if (time == null) {
			time = new double[1];
			time[0] = timeAdd;
		} else {
			double[] temp = new double[time.length + 1];
			for (int i = 0; i < (time.length); i++) {
				temp[i] = time[i];
			}
			temp[time.length] = timeAdd;
			time = temp;
		}

	}

	private void addPrice(double priceAdd) {
		if (price == null) {
			price = new double[1];
			price[0] = priceAdd;
		} else {
			double[] temp = new double[price.length + 1];
			for (int i = 0; i < (price.length); i++) {
				temp[i] = price[i];
			}
			temp[price.length] = priceAdd;
			price = temp;
		}

	}

	@Override
	public String toString() {
		return "ChooseTransport [client=" + client + ", chooseTpark=" + Arrays.toString(chooseTpark) + ", temp="
				+ Arrays.toString(temp) + ", time=" + Arrays.toString(time) + ", price=" + Arrays.toString(price) + "]";
	}

}
