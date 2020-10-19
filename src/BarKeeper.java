public class BarKeeper {		//Factory
//	public static final int SWIMMINGPOOL = 1;
//	public static final int SEXONTHEBEACH = 2;
	
	public Cocktail createDrink(Enum e){
		switch(e){
		case SWIMMINGPOOL:
			return new SwimmingPool();
		case SEXONTHEBEACH:
			return new SexOnTheBeach();
		default:
			throw new IllegalArgumentException(
				"Wrong entry!!!");
		}
	}

}
