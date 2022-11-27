

public class PackingInstructions implements Visitor{

	@Override
	public double visit(Electronic e_item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double visit(Furniture f_item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double visit(Glass g_item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String visit2(Electronic e_item) {
		
		return "<should be covered with Polyethylene foam film and packed in a box with a dimension:" + (e_item.height+1) +"x"+(e_item.lenght+1) + "x" + (e_item.width+1);
	}

	@Override
	public String visit2(Furniture f_item) {
		
		return "<should be covered with waterproof covers with an area of:" + f_item.lenght + "x" + f_item.width;
	}

	@Override
	public String visit2(Glass g_item) {
	
		return "<should be packed in a box filled with Bubble wraps and dimension:" + (g_item.height+1) +"x"+(g_item.lenght+1) + "x" + (g_item.width+1);
	}

}
