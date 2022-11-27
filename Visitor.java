

public interface Visitor {
	public double visit(Electronic e_item);
	public double visit(Furniture f_item);
	public double visit(Glass g_item);
	
	public String visit2(Electronic e_item);
	public String visit2(Furniture f_item);
	public String visit2(Glass g_item);
	
	
}
