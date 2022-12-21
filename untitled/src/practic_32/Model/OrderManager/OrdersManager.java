package practic_32.Model.OrderManager;

import practic_32.Model.Menu.Item;
import practic_32.Model.Order.Order;


public interface OrdersManager {
	int itemsQuantity(String itemName);

	int itemsQuantity(Item item);

	Order[] getOrders();

	int ordersCostSummary();

	int ordersQuantity();
}
