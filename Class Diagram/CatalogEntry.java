

/**
 * @author masha
 * @version 1.0
 * @created 03-дек.-2021 18:02:22
 */
public class CatalogEntry {

	private int count;
	private Long id;
	private WarehouseEntry item;
	private TimeStamp timeAdded;
	public Catalog m_Catalog;

	public CatalogEntry(){

	}

	public void finalize() throws Throwable {

	}
}//end CatalogEntry