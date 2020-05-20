package position.management;

public class Service {
	public Transactions buy(Transactions transactions,Integer quantity) {
		if("INSERT".equals(transactions.getActionCode())) {
			transactions.setVersion(1);
			transactions.setQuantity(quantity);
		}else {
			transactions.setVersion(2);
			if("UPDATE".equals(transactions.getActionCode())){
				transactions.setQuantity(quantity);
			}else {
				transactions.setQuantity(0);
			}
		}
		return transactions;
	}
	public Transactions sell(Transactions transactions,Integer quantity) {
		transactions.setVersion(1);
		transactions.setQuantity(transactions.getQuantity()-quantity);
		return transactions;
	}
}