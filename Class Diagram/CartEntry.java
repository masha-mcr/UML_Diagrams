

/**
 * @author masha
 * @version 1.0
 * @created 03-дек.-2021 18:02:22
 */
public class CartEntry {

	private int count;
	private Long id;
	private WarehouseEntry item;
	private TimeStamp timeAdded;
	private WarehouseEntry tickets;

	public CartEntry(){

	}

	public void finalize() throws Throwable {

	}
}//end CartEntry