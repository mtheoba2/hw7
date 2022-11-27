

public class PriceCalculator implements Visitor {

	public PriceCalculator() {

	}

	@Override
	public double visit(Electronic e_item) {
		if(e_item.fragile) {
			 return ((double)e_item.weight/10.0) * 5;
		}
		else {
			return ((double)e_item.weight/15.0)*5;
		}
	}

	@Override
	public double visit(Furniture f_item) {
		return ((double)f_item.weight / 20.0) * 5;
	}

	@Override
	public double visit(Glass g_item) {
		double price = 0;
		if (g_item.tickness == 1) {
			price = 2.0 * (double)g_item.lenght/100.0;
		} else if (g_item.tickness == 2) {
			price = 1.2 * (double)g_item.lenght/100.0;
		} else if (g_item.tickness == 3) {
			price = 0.7 * (double)g_item.lenght/100.0;
		}
		return price;
	}

	@Override
	public String visit2(Electronic e_item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit2(Furniture f_item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit2(Glass g_item) {
		// TODO Auto-generated method stub
		return null;
	}

}
