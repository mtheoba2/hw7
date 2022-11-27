

public class Main {

	public static void main(String[] args) {
		
		Leaf Teakwando = new Leaf("Womans's Teakwondo Team" , 5 , 2);
		Leaf Waterpolo = new Leaf("Womans's Waterpolo Team" , 14 , 0);
		Leaf Artistic_Gymnastics = new Leaf("Womans's Artistic Gymnastics Team" , 5 ,1);
		Leaf Shooting = new Leaf(" Mens's Shooting Team" , 4 , 5);
		Leaf Cycling = new Leaf("Woman's Cycling Team" , 3 , 0);
		Leaf Tennis = new Leaf("Woman's Tennis Team", 2 , 1);
		Leaf Table_Tennis = new Leaf("Men's Table Tennis Team" , 2 , 5 );
		Leaf Football = new Leaf("Men's Football Team" , 25 , 2);
		Leaf Sky = new Leaf ("Woman's Alpine Sky Team" , 6 , 10);
		Leaf Football2 = new Leaf("Mens's Football Team" , 25 , 0);
		Leaf Swimmin = new Leaf("Men's Swimming Team " , 6 , 7);
		Leaf Afganistan = new Leaf("Afganistan Team " , 40 , 1);
		Leaf Africa = new Leaf("Africa Team" , 60 , 10);
		Leaf South_america = new Leaf ("South America Team" , 80 , 20);
		
		Composite Olympic = new Composite("Olympic Teams");
		
		Composite Europe = new Composite("Europe Team");
		Composite Asia = new Composite ("Asia Team");
		
		Composite China = new Composite("China Team");
		Composite Germany = new Composite("Germany Team");
		Composite Italy = new Composite("Italy Team");
		
		Composite C_Woman = new Composite("China Womans Team");
		Composite C_Men = new Composite("China Mens Team");
		Composite G_Woman = new Composite("Germany Womans Team");
		Composite G_Men = new Composite("Germany Mens Team");
		Composite I_Woman = new Composite("Italies Womans Team");
		Composite I_Men = new Composite("Italies Mens Team");
		
		Olympic.addComponent(Asia);
		Olympic.addComponent(Europe);
		Olympic.addComponent(Africa);
		Olympic.addComponent(South_america);
		
		Europe.addComponent(Germany);
		Europe.addComponent(Italy);
		
		Asia.addComponent(China);
		Asia.addComponent(Afganistan);

		China.addComponent(C_Woman);
		China.addComponent(C_Men);
		
		Germany.addComponent(G_Woman);
		Germany.addComponent(G_Men);
		
		Italy.addComponent(I_Woman);
		Italy.addComponent(I_Men);
		
		C_Woman.addComponent(Teakwando);
		C_Woman.addComponent(Waterpolo);
		C_Woman.addComponent(Artistic_Gymnastics);
		
		C_Men.addComponent(Shooting);
		
		G_Woman.addComponent(Cycling);
		G_Woman.addComponent(Tennis);
		
		G_Men.addComponent(Table_Tennis);
		G_Men.addComponent(Football);
		
		I_Woman.addComponent(Sky);
	
		I_Men.addComponent(Football2);
		I_Men.addComponent(Swimmin);
		
		G_Men.printNameAndNumberAthletes();
		System.out.println("\n");
		Germany.printNameAndNumberMedals();
		System.out.println("\n");
		Asia.printNameAndNumberMedals();
		System.out.println("\n");
		Olympic.printNameAndNumberAthletes();
		
		
		
	}

}
