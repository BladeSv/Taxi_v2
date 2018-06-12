package by.htp.Taxi.entity;

public class Transport extends TransportPark {

	private int speed;
	private int fuel;
	private double rate;
	private double priceKm;

	private TransportType transprtType;

	public double getPriceKm() {
		return priceKm;
	}

	public void setPriceKm(double priceKm) {
		this.priceKm = priceKm;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public TransportType getTransprtType() {
		return transprtType;
	}

	public void setTransprtType(TransportType transprtType) {
		this.transprtType = transprtType;
	}

	@Override
	public String toString() {
		return this.getName() + ": ��� ����������=" + transprtType.getType() + ", ��������=" + speed
				+ "��.�, ������ �������=" + fuel + "�, ������ ������� �� 100��.=" + String.format("%.2f", rate)
				+ "�, ��������� 1-�� ��=" + String.format("%.2f", priceKm) + "���.���.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fuel;
		long temp;
		temp = Double.doubleToLongBits(priceKm);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + speed;
		result = prime * result + ((transprtType == null) ? 0 : transprtType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transport other = (Transport) obj;
		if (fuel != other.fuel)
			return false;
		if (Double.doubleToLongBits(priceKm) != Double.doubleToLongBits(other.priceKm))
			return false;
		if (Double.doubleToLongBits(rate) != Double.doubleToLongBits(other.rate))
			return false;
		if (speed != other.speed)
			return false;
		if (transprtType != other.transprtType)
			return false;
		return true;
	}

}
