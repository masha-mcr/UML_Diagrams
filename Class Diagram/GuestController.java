

/**
 * @author herma
 * @version 1.0
 * @created 03-дек.-2021 18:02:22
 */
public class GuestController implements Controller {

	private DbController dbController;
	public DispatcherServlet m_DispatcherServlet;

	public GuestController(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param req
	 * @param resp
	 */
	private void executeCommand(HttpServletRequest req, HttpServletResponse resp){

	}

	/**
	 * 
	 * @param departureDate
	 * @param directon
	 * @param priceMin
	 * @param page
	 * @param size
	 * @param priceMax
	 */
	private void getItems(DateTime departureDate, ItemDescription directon, int priceMin, int page, int size, int priceMax){

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
	 * @param user
	 */
	private void signIn(User user){

	}

	/**
	 * 
	 * @param user
	 */
	private void signUp(User user){

	}
}//end GuestController