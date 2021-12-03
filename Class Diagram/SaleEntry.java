

/**
 * @author masha
 * @version 1.0
 * @created 03-дек.-2021 18:02:23
 */
public class SaleEntry {

	private int count;
	private Long id;
	private WarehouseEntry item;
	private int price;
	private TimeStamp purchaseDate;
	private TimeStamp timeAdded;
	private Trancastion transaction;
	private User user;

	public SaleEntry(){

	}

	public void finalize() throws Throwable {

	}
}//end SaleEntry