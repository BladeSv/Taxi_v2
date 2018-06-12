package by.htp.Taxi.entity;

public enum TransportType {
	AutoTransport("�������������"), RwTransport("���������������"), AirTransport("���������"), SeaTransport("�������");

	private String type;

	TransportType(String type) {
		this.type = type;

	}

	public String getType() {
		return type;
	}

}