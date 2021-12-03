

/**
 * @author masha
 * @version 1.0
 * @created 03-дек.-2021 18:02:23
 */
public class Order {

	private Long id;
	private OrderStatus status;
	private TimeStamp submissionTimestamp;
	private User user;

	public Order(){

	}

	public void finalize() throws Throwable {

	}
}//end Order