

/**
 * @author masha
 * @version 1.0
 * @created 03-дек.-2021 18:02:24
 */
public class Warehouse {

	private List<WarehouseEntry> items;
	public DbController m_DbController;
	public WarehouseEntry m_WarehouseEntry;

	public Warehouse(){

	}

	public void finalize() throws Throwable {

	}
	public List<Item> findAll(){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public Item findById(long id){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public boolean removeById(long id){
		return false;
	}

	/**
	 * 
	 * @param ticket
	 */
	public void save(Item ticket){

	}
}//end Warehouse