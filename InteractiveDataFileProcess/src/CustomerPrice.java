import java.io.Serializable;


public class CustomerPrice implements Serializable {
	private String serialNo;
	private String custId;
	private String pricingDate;
	private String price;
	private String sect;
	private String amount;
	
	public CustomerPrice(){
		
	}
	
	public CustomerPrice(String serialNo, String custId, String pricingDate, String price,
			String sect, String amount) {
		super();
		this.serialNo = serialNo;
		this.custId = custId;
		this.pricingDate = pricingDate;
		this.price = price;
		this.sect = sect;
		this.amount = amount;
	}
	
	
	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getPricingDate() {
		return pricingDate;
	}
	public void setPricingDate(String pricingDate) {
		this.pricingDate = pricingDate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSect() {
		return sect;
	}
	public void setSect(String sect) {
		this.sect = sect;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((custId == null) ? 0 : custId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerPrice other = (CustomerPrice) obj;
		if (custId == null) {
			if (other.custId != null)
				return false;
		} else if (!custId.equals(other.custId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(serialNo).append(", ")
				.append(custId).append(", ")
				.append(pricingDate).append(", ")
				.append(price).append(", ")
				.append(sect).append(", ")
				.append(amount);
		return strBuilder.toString();
	}
	
	
	
	
}
