package by.htp.Taxi.entity;

public class BaseOrder {
	private Order[] baseOrede;

	public Order[] getBaseOrede() {
		return baseOrede;
	}

	public void setBaseOrede(Order[] baseOrede) {
		this.baseOrede = baseOrede;
	}

	public void addOrder(Order order) {
		if (baseOrede == null) {
			baseOrede = new Order[1];
			baseOrede[0] = order;
		} else {
			Order[] temp = new Order[baseOrede.length + 1];
			for (int i = 0; i < (baseOrede.length); i++) {
				temp[i] = baseOrede[i];
			}
			temp[baseOrede.length] = order;
			baseOrede = temp;

		}
	}

}
