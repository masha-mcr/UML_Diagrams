

/**
 * @author masha
 * @version 1.0
 * @created 03-дек.-2021 18:02:22
 */
public class DbController implements DbController {

	private Catalog catalog;
	private Warehouse itemRepository;
	private UserRepository userRepository;

	public DbController(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param entity
	 */
	public Set<Object> findAll(Object entity){
		return null;
	}

	public Object findById(){
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
	 * @param entity
	 */
	public void save(Object entity){

	}
}//end DbController

/**
 * @author herma
 * @version 1.0
 * @created 03-дек.-2021 18:02:22
 */
public interface DbController {

	public DeliveryController m_DeliveryController;
	public GuestController m_GuestController;
	public UserController m_UserController;
	public ManagerController m_ManagerController;
	public CeoController m_CeoController;

	/**
	 * 
	 * @param entity
	 */
	public List<Object> findAll(Object entity);

	public Object findById();

	public void remove();

	/**
	 * 
	 * @param entity
	 */
	public void save(Object entity);

}