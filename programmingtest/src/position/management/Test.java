package position.management;

public class Test {
	public static void main(String[] args) {
		Service service=new Service();
		Transactions rel=new Transactions(1,1,"REL",0, "INSERT");
		Transactions itc=new Transactions(2,2,"ITC",40, "INSERT");
		Transactions inf=new Transactions(3,3,"INF",0, "INSERT");
		Transactions relbuy = service.buy(rel, 50);
		relbuy.setTransactionID(4);
		relbuy.setActionCode("UPDATE");
		service.buy(relbuy, 60);
		System.out.println(relbuy);
		Transactions itcsell = service.sell(itc, 40);
		itcsell.setTransactionID(5);
		itcsell.setActionCode("CANCEL");
		service.buy(itcsell, 30);
		System.out.println(itcsell);
		Transactions infbuy = service.buy(inf, 70);
		infbuy.setTransactionID(6);
		service.sell(infbuy, 20);
		System.out.println(infbuy);
	}
}