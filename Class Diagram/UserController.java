

/**
 * @author herma
 * @version 1.0
 * @created 03-дек.-2021 18:02:23
 */
public class UserController implements Controller {

	private DbController dbController;
	private PaymentController paymentSystemContoller;
	public DispatcherServlet m_DispatcherServlet;

	public UserController(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param item
	 */
	private void addItemToCart(Item item){

	}

	/**
	 * 
	 * @param priceMin
	 * @param priceMax
	 * @param page
	 * @param size
	 */
	private void filterItems(int priceMin, int priceMax, int page, int size){

	}

	private void getCart(){

	}

	/**
	 * 
	 * @param item
	 */
	private void getItemDetails(Item item){

	}

	private void logout(){

	}

	/**
	 * 
	 * @param cart
	 */
	private void placeOrder(Cart cart){

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
	 * @param Ticket
	 */
	private void removeItemFromCart(Item Ticket){

	}
}//end UserController