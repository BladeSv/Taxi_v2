package by.htp.Taxi.run;

import java.util.Scanner;

import by.htp.Taxi.entity.Client;

public class AddClient {
	private static Client client;

	public static Client addClient() {
		client = new Client();
		System.out.println("������� ���� ���:");
		client.setName(Scan.sc.nextLine());
		System.out.println("������� ������� ����������� �� ������ ����������:");
		client.setDistance(Double.parseDouble(Scan.sc.nextLine()));
		System.out.println("������� ����� ������� ������������, � ���.���.:");
		client.setMoney(Double.parseDouble(Scan.sc.nextLine()));
		;
		return client;
	}

}
