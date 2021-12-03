

/**
 * @author masha
 * @version 1.0
 * @created 03-дек.-2021 18:02:21
 */
public class Cart {

	private Long id;
	private List<CartEntry> items;
	private User owner;
	public User user;
	public CartRepository m_CartRepository;
	public CartEntry m_CartEntry;

	public Cart(){

	}

	public void finalize() throws Throwable {

	}
}//end Cart