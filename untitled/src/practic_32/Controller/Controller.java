package practic_32.Controller;

import practic_32.Model.Database.ReadObject;
import practic_32.Model.Database.RestaurantInfo;
import practic_32.Model.OrderManager.InternetOrdersManager;
import practic_32.Model.OrderManager.OrdersManager;
import practic_32.Model.OrderManager.TableOrdersManager;
import practic_32.Viewer.CustomerFillGUI;

import java.io.IOException;
public class Controller {
	public Controller() {
		OrdersManager[] ordersManagers;
		try {
			ordersManagers = (OrdersManager[]) ReadObject.read();
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			ordersManagers = new OrdersManager[]{
					new TableOrdersManager(RestaurantInfo.tablesCount),
					new InternetOrdersManager(),
			};
		}
		new CustomerFillGUI((TableOrdersManager) ordersManagers[0], (InternetOrdersManager) ordersManagers[1]).setVisible(true);
	}
}
