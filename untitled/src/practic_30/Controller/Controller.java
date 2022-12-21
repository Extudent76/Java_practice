package practic_30.Controller;

import practic_30.Model.Database.RestaurantInfo;
import practic_30.Model.OrderManager.InternetOrdersManager;
import practic_30.Model.OrderManager.TableOrdersManager;
import practic_30.Viewer.CustomerFillGUI;

public class Controller {
	public Controller() {
		new CustomerFillGUI(new TableOrdersManager(RestaurantInfo.tablesCount), new InternetOrdersManager()).setVisible(true);
	}
}
