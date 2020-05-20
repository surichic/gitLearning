package position.management;
public class Transactions {
	private Integer transactionID;
	private Integer TradeID;
	private Integer Version;
	private String SecurityCode;
	private Integer Quantity;
	private String actionCode;
	
	public Transactions(Integer transactionID, Integer tradeID, String securityCode, Integer quantity,
			String actionCode) {
		this.transactionID = transactionID;
		this.TradeID = tradeID;
		this.SecurityCode = securityCode;
		this.Quantity = quantity;
		this.actionCode = actionCode;
	}
	public Integer getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(Integer transactionID) {
		this.transactionID = transactionID;
	}
	public Integer getTradeID() {
		return TradeID;
	}
	public void setTradeID(Integer tradeID) {
		this.TradeID = tradeID;
	}
	public Integer getVersion() {
		return Version;
	}
	public void setVersion(Integer version) {
		Version = version;
	}
	public String getSecurityCode() {
		return SecurityCode;
	}
	public void setSecurityCode(String securityCode) {
		SecurityCode = securityCode;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	public String getActionCode() {
		return actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}
	@Override
	public String toString() {
		return "Transactions [transactionID=" + transactionID + ", TradeID=" + TradeID + ", Version=" + Version
				+ ", SecurityCode=" + SecurityCode + ", Quantity=" + Quantity + ", actionCode=" + actionCode + "]";
	}
}