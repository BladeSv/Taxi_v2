package by.htp.Taxi.run;

import by.htp.Taxi.entity.Transport;

public class Sort {

	public static void sortTime(ChooseTransport chooseTransport) {
		Transport temp;
		double tepmT;
		double tempP;
		for (int i = 0; i < chooseTransport.getChooseTpark().length; i++) {
			for (int j = 0; j < chooseTransport.getChooseTpark().length; j++) {

				if (chooseTransport.getTime()[i] < chooseTransport.getTime()[j]) {
					temp = chooseTransport.getChooseTpark()[i];
					tepmT = chooseTransport.getTime()[i];
					tempP = chooseTransport.getPrice()[i];

					chooseTransport.getChooseTpark()[i] = chooseTransport.getChooseTpark()[j];
					chooseTransport.getTime()[i] = chooseTransport.getTime()[j];
					chooseTransport.getPrice()[i] = chooseTransport.getPrice()[j];

					chooseTransport.getChooseTpark()[j] = temp;
					chooseTransport.getTime()[j] = tepmT;
					chooseTransport.getPrice()[j] = tempP;

				}
			}
		}

	}

	public static void sortPrice(ChooseTransport chooseTransport) {
		Transport temp;
		double tepmT;
		double tempP;
		for (int i = 0; i < chooseTransport.getChooseTpark().length; i++) {
			for (int j = 0; j < chooseTransport.getChooseTpark().length; j++) {

				if (chooseTransport.getPrice()[i] < chooseTransport.getPrice()[j]) {
					temp = chooseTransport.getChooseTpark()[i];
					tepmT = chooseTransport.getTime()[i];
					tempP = chooseTransport.getPrice()[i];

					chooseTransport.getChooseTpark()[i] = chooseTransport.getChooseTpark()[j];
					chooseTransport.getTime()[i] = chooseTransport.getTime()[j];
					chooseTransport.getPrice()[i] = chooseTransport.getPrice()[j];

					chooseTransport.getChooseTpark()[j] = temp;
					chooseTransport.getTime()[j] = tepmT;
					chooseTransport.getPrice()[j] = tempP;

				}
			}
		}

	}

}
