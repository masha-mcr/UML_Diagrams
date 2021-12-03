

/**
 * @author masha
 * @version 1.0
 * @created 03-дек.-2021 18:02:22
 */
public class ManagerController implements Controller {

	private DbController dbController;
	private PaymentController paymentSystemController;
	private SupplierController supplierController;
	public DispatcherServlet m_DispatcherServlet;

	public ManagerController(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param ticket
	 */
	private void addItemToCatalog(Item ticket){

	}

	/**
	 * 
	 * @param Ticket
	 */
	private void addItemToWarehouse(Item Ticket){

	}

	/**
	 * 
	 * @param order
	 */
	private void confirmOrder(Order order){

	}

	/**
	 * 
	 * @param page
	 * @param size
	 */
	private void getCatalogEntries(int page, int size){

	}

	/**
	 * 
	 * @param page
	 * @param size
	 */
	private void getItems(int page, int size){

	}

	/**
	 * 
	 * @param page
	 * @param size
	 */
	private void getOrders(int page, int size){

	}

	private void getWayBills(){

	}

	/**
	 * 
	 * @param req
	 * @param resp
	 */
	public void processRequest(HttpServletRequest req, HttpServletResponse resp){

	}

	/**
	 * 
	 * @param order
	 */
	private void revokeOrder(Order order){

	}

	private void signOut(){

	}
}//end ManagerController