

/**
 * @author masha
 * @version 1.0
 * @created 03-дек.-2021 18:02:22
 */
public class Catalog {

	private List<CatalogEntry> catalogEntries;
	public DbController m_DbController;

	public Catalog(){

	}

	public void finalize() throws Throwable {

	}
	public List<CatalogEntry> findAll(){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public CatalogEntry findById(long id){
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
	 * @param entry
	 */
	public void save(CatalogEntry entry){

	}
}//end Catalog