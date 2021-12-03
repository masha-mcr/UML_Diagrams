

/**
 * @author herma
 * @version 1.0
 * @created 03-дек.-2021 18:02:21
 */
public interface AutoMailingSystemController {

	public ManagerController m_ManagerController;

	/**
	 * 
	 * @param user
	 * @param tickets
	 */
	public boolean sendTickets(User user, List<Ticket> tickets);

}