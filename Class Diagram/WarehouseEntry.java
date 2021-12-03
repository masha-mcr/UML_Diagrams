

/**
 * @author masha
 * @version 1.0
 * @created 03-дек.-2021 18:02:24
 */
public class WarehouseEntry {

	private int count;
	private Long id;
	private Item item;
	private ItemStatus itemStatus;
	private int priceBought;
	private int priceSold;
	private Supplier supplier;
	private TimeStamp timeAdded;
	private ItemStatus status;

	public WarehouseEntry(){

	}

	public void finalize() throws Throwable {

	}
}//end WarehouseEntry