

/**
 * @author masha
 * @version 1.0
 * @created 03-дек.-2021 18:02:22
 */
public class Item {

	private List<Effect> effects;
	private Long id;
	private List<Ingridient> ingridients;
	private String name;
	private List<SkinType> skinTypes;
	private int volume;
	public SkinType m_SkinType;
	public Ingridients m_Ingridients;
	public Effect m_Effect;

	public Item(){

	}

	public void finalize() throws Throwable {

	}
}//end Item