package practic_30.Model.OrderManager;

import practic_30.Model.Menu.Item;
import practic_30.Model.Order.Order;


public interface OrdersManager {
	int itemsQuantity(String itemName);

	int itemsQuantity(Item item);

	Order[] getOrders();

	int ordersCostSummary();

	int ordersQuantity();
}
