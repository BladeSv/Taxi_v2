package by.htp.Taxi.entity;

public class Client {

	private String name;
	private double distance;
	private double money;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "������ [���=" + name + ", ������ ��������=" + distance + "��., ���������� �����=" + money
				+ ",���.���.]";
	}

}
