package by.htp.Taxi.run;

import by.htp.Taxi.SQL.SQL;
import by.htp.Taxi.entity.BaseOrder;
import by.htp.Taxi.entity.TransportPark;
import by.htp.Taxi.entity.TransportType;

public class MainMenu {
	TransportPark transportPark = new TransportPark();

	BaseOrder baseOrder = new BaseOrder();
	SQL sql = new SQL();

	public void mainMenu() {
		do {
			System.out.println();

			System.out.println("Здравствуйте Вас преведствует такси \"Кручу-верчу довезти хочу\"");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅ:");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("1. пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅ.");
			System.out.println("2. пїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ.");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("3. пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ.");
			System.out.println("4. пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅ.");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("5. пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅ.");
			System.out.println("6. пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅ.");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("7. пїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅ пїЅ пїЅпїЅпїЅпїЅпїЅ.");
			System.out.println("8. пїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅ.");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("9. пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅ пїЅпїЅ пїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅ пїЅ пїЅпїЅпїЅпїЅ.");
			System.out.println("10. пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅ пїЅпїЅ пїЅпїЅпїЅпїЅпїЅ пїЅ пїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅ.");
			System.out.println("11. пїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅ пїЅпїЅ пїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅ.");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("12. пїЅпїЅпїЅпїЅпїЅ пїЅпїЅ пїЅпїЅпїЅпїЅ.");

			switch (Integer.parseInt(Scan.sc.nextLine())) {
			case 1:
				baseOrder.addOrder((CreatOrder.creatOrder(transportPark)));
				break;
			case 2:
				Output.output(baseOrder.getBaseOrede()[baseOrder.getBaseOrede().length - 1].getChooseTransport());
				break;
			case 3:
				Sort.sortTime(baseOrder.getBaseOrede()[0].getChooseTransport());
				break;
			case 4:
				Sort.sortPrice(baseOrder.getBaseOrede()[0].getChooseTransport());
				break;
			case 5:
				transportPark.addTranport(CreatTransport.creatTranport());

				break;
			case 6:
				transportPark.addTranport(CreatTransport.creatRandTranport());

				break;
			case 7:
				Output.output(transportPark);
				break;
			case 8:
				Output.output(baseOrder);
				break;
			case 9:
				sql.sqlRead(transportPark);
				break;
			case 10:
				sql.sqlWrite(transportPark);
				break;
			case 11:
				sql.sqldel();
				break;

			case 12:
				System.out.println("пїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅ, пїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅ пїЅпїЅ пїЅпїЅпїЅпїЅ? (y)");
				if (("y").equals(Scan.sc.nextLine())) {
					System.exit(0);
					break;
				}
			}
		} while (true);

	}

}
