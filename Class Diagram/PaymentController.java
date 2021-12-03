

/**
 * @author herma
 * @version 1.0
 * @created 03-дек.-2021 18:02:23
 */
public interface PaymentController {

	public CeoController m_CeoController;
	public ManagerController m_ManagerController;
	public UserController m_UserController;

	public long getAccountState();

	/**
	 * 
	 * @param transaction
	 */
	public void getTransactionStatus(Transaction transaction);

	/**
	 * 
	 * @param transaction
	 */
	public boolean processTransaction(Transaction transaction);

}