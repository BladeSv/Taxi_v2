package by.htp.Taxi.SQL;

import java.sql.*;

import by.htp.Taxi.entity.Transport;
import by.htp.Taxi.entity.TransportPark;
import by.htp.Taxi.entity.TransportType;

public class SQL {
	private static final String url = "jdbc:mysql://db4free.net:3306/bladesv_mytest?useSSL=false";
	private static final String user = "bladesv";
	private static final String password = "12345678";

	private static Connection con;
	private static Statement stmt;
	private static ResultSet rs;

	public static void sqlRead(TransportPark transportPark) {
		String query = "select * from transport";

		try {

			con = DriverManager.getConnection(url, user, password);

			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				Transport trans = new Transport();

				String name = rs.getString(2);

				TransportType type = TransportType.valueOf(rs.getString(3));
				int speed = rs.getInt(4);

				int fuel = rs.getInt(5);
				double rate = rs.getDouble(6);
				double pricekm = rs.getDouble(7);
				trans.setName(name);
				trans.setTransprtType(type);
				trans.setSpeed(speed);
				trans.setFuel(fuel);
				trans.setRate(rate);
				trans.setPriceKm(pricekm);
				transportPark.addTranport(trans);

			}
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		} finally {

			try {
				con.close();
			} catch (SQLException se) {
				/* can't do anything */ }
			try {
				stmt.close();
			} catch (SQLException se) {
				/* can't do anything */ }
			try {
				rs.close();
			} catch (SQLException se) {
				/* can't do anything */ }
		}

	}

	public static void sqlWrite(TransportPark transportPark) {
		String query = "select * from transport";

		try {

			con = DriverManager.getConnection(url, user, password);

			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			TransportPark transportParktemp = new TransportPark();

			while (rs.next()) {
				Transport trans = new Transport();

				String name = rs.getString(2);
				TransportType type = TransportType.valueOf(rs.getString(3));
				int speed = rs.getInt(4);
				int fuel = rs.getInt(5);
				double rate = rs.getDouble(6);
				double pricekm = rs.getDouble(7);
				trans.setName(name);
				trans.setTransprtType(type);
				trans.setSpeed(speed);
				trans.setFuel(fuel);
				trans.setRate(rate);
				trans.setPriceKm(pricekm);
				transportParktemp.addTranport(trans);
			}
			if (transportParktemp.getTpark() == null) {
				for (Transport tran : transportPark.getTpark()) {
					String insert = "INSERT INTO transport (name,type,speed,fuel,rate,pricekm) VALUES ('"
							+ tran.getName() + "','" + tran.getTransprtType().name() + "'," + tran.getSpeed() + ","
							+ tran.getFuel() + "," + tran.getRate() + "," + tran.getPriceKm() + ");";

					stmt.executeUpdate(insert);
				}
			} else {

				for (Transport tran : transportPark.getTpark()) {
					boolean check = false;
					for (Transport tran2 : transportParktemp.getTpark()) {
						if ((tran2.equals(tran))) {
							check = true;
						}

					}
					if (!check) {
						String insert = "INSERT INTO transport (name,type,speed,fuel,rate,pricekm) VALUES ('"
								+ tran.getName() + "','" + tran.getTransprtType().name() + "'," + tran.getSpeed() + ","
								+ tran.getFuel() + "," + tran.getRate() + "," + tran.getPriceKm() + ");";

						stmt.executeUpdate(insert);
					}
				}

			}
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		} finally {

			try {
				con.close();
			} catch (SQLException se) {
				/* can't do anything */ }
			try {
				stmt.close();
			} catch (SQLException se) {
				/* can't do anything */ }
			try {
				rs.close();
			} catch (SQLException se) {
				/* can't do anything */ }
		}

	}

	public static void sqldel() {
		String query = "DELETE FROM transport WHERE id ORDER BY id DESC LIMIT 1";

		try {

			con = DriverManager.getConnection(url, user, password);

			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		} finally {

			try {
				con.close();
			} catch (SQLException se) {
				/* can't do anything */ }
			try {
				stmt.close();
			} catch (SQLException se) {
				/* can't do anything */ }
			try {
				rs.close();
			} catch (SQLException se) {
				/* can't do anything */ }
		}

	}

}
