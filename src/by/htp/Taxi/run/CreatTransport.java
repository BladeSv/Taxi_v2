package by.htp.Taxi.run;

import by.htp.Taxi.entity.Transport;
import by.htp.Taxi.entity.TransportType;

public class CreatTransport {

	public static Transport creatRandTranport() {
		Transport transport = new Transport();

		transport.setName("Transport" + ((int) (Math.random() * 100)));
		switch (((int) (Math.random() * 3 + 1))) {
		case 1:
			transport.setTransprtType(TransportType.AirTransport);
			break;
		case 2:
			transport.setTransprtType(TransportType.RwTransport);
			break;
		case 3:
			transport.setTransprtType(TransportType.AirTransport);
			break;
		case 4:
			transport.setTransprtType(TransportType.SeaTransport);
			break;

		}

		transport.setSpeed(((int) (Math.random() * 200 + 50)));

		transport.setFuel(((int) (Math.random() * 60)));

		transport.setRate((Math.random() * 10));

		transport.setPriceKm((Math.random() * 3));

		System.out.println("���� ������");
		return transport;

	}

	public static Transport creatTranport() {
		Transport transport = new Transport();
		System.out.println("������� �������� ����������:");
		transport.setName(Scan.sc.nextLine());
		System.out.println("�������� ��� ����������");
		System.out.println("1. �������������");
		System.out.println("2. ���������������");
		System.out.println("3. ���������");
		System.out.println("4. ������");
		switch (Integer.parseInt(Scan.sc.nextLine())) {
		case 1:
			transport.setTransprtType(TransportType.AirTransport);
			break;
		case 2:
			transport.setTransprtType(TransportType.RwTransport);
			break;
		case 3:
			transport.setTransprtType(TransportType.AirTransport);
			break;
		case 4:
			transport.setTransprtType(TransportType.SeaTransport);
			break;
		}
		System.out.println("������� ������������ �������� ����������, � ��/�:");
		transport.setSpeed((Integer.parseInt(Scan.sc.nextLine())));
		System.out.println("������� ����� ������� � ����������, � �:");
		transport.setFuel(Integer.parseInt(Scan.sc.nextLine()));
		System.out.println("������� ������ ������� � ���������� �� 100��, � �:");
		transport.setRate(Double.parseDouble(Scan.sc.nextLine()));
		System.out.println("������� ��������� 1 ��, � ���. ���:");
		transport.setPriceKm((Double.parseDouble(Scan.sc.nextLine())));
		return transport;

	}

}
