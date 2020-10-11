public class BarKeeper {		//Factory
	public static final String GESCH = "";
	public static final String NAME = "";
	public static final int PROZ = 1;

	
	public Cocktail createDrink(int i){
		switch(i){
		case 1:
			return new SwimmingPool();
		case 2:
			return new SexOnTheBeach();
		default:
			throw new IllegalArgumentException(
				"Wrong entry!!!");
		}
	}

}
