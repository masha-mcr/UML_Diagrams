

/**
 * @author masha
 * @version 1.0
 * @created 03-дек.-2021 18:02:23
 */
public class SupplierController implements SupplierController {

	private SuppliersRepository suppliers;

	public SupplierController(){

	}

	public void finalize() throws Throwable {

	}
	public List<Object> getWaybills(){
		return null;
	}
}//end SupplierController

/**
 * @author herma
 * @version 1.0
 * @created 03-дек.-2021 18:02:23
 */
public interface SupplierController {

	public ManagerController m_ManagerController;

	public List<Object> getWaybills();

}