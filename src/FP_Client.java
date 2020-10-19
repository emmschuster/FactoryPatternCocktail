public class FP_Client {

	public static void main(String[] args) {
		BarKeeper f = new BarKeeper();
		 
		Cocktail newSP = 
			f.createDrink(Enum.SWIMMINGPOOL);
		
		Cocktail newSOTB = 
			f.createDrink(Enum.SEXONTHEBEACH);
		
		System.out.println(
			newSP.Name() + " schmeckt " + 
			newSP.geschmack() + " und hat ca " +
			newSP.AlkoholProzent() + "%");
		
		System.out.println(
				newSOTB.Name() + " schmeckt " + 
				newSOTB.geschmack() + " und hat ca " +
				newSOTB.AlkoholProzent() + "%");

	}

}
