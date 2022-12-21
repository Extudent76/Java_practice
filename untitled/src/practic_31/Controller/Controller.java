package practic_31.Controller;

import practic_31.Model.Database.RestaurantInfo;
import practic_31.Model.OrderManager.InternetOrdersManager;
import practic_31.Model.OrderManager.TableOrdersManager;
import practic_31.Viewer.CustomerFillGUI;

public class Controller {
	public Controller() {
		new CustomerFillGUI(new TableOrdersManager(RestaurantInfo.tablesCount), new InternetOrdersManager()).setVisible(true);
	}
}
