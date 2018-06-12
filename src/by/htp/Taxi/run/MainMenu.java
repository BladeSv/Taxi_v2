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

			System.out.println("Здавствуйте Вас приведствует такси\"Кручу-верчу довезти хочу\"");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("�������� ����� ����:");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("1. �������� �����.");
			System.out.println("2. ������� ���������� ������� ����������.");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("3. ������������� ���������� ������� ���������� �� ������� ��������.");
			System.out.println("4. ������������� ���������� ������� ���������� �� ��������� ������.");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("5. �������� ��������� � �������� �����.");
			System.out.println("6. �������� ��������� ��������� � �������� �����.");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("7. ������� ���� � �����.");
			System.out.println("8. ������� ��� ������.");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("9. �������� ���� �� ���� ������ � ����.");
			System.out.println("10. ���������� ���� �� ����� � ���� ������.");
			System.out.println("11. ������� ��������� ���� �� ���� ������.");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("12. ����� �� ����.");

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
				System.out.println("�� �������, ��� ������ ����� �� ����? (y)");
				if (("y").equals(Scan.sc.nextLine())) {
					System.exit(0);
					break;
				}
			}
		} while (true);

	}

}
