package practic_31.Model.OrderManager;

import practic_31.Model.Menu.Item;
import practic_31.Model.Order.Order;


public interface OrdersManager {
	int itemsQuantity(String itemName);

	int itemsQuantity(Item item);

	Order[] getOrders();

	int ordersCostSummary();

	int ordersQuantity();
}
