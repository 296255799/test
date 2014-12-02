

public class price implements Comparable<price>{

	private Double price;
	
	private Integer priority;
	
	
	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}


	public price(Double price, Integer priority) {
		super();
		this.price = price;
		this.priority = priority;
	}

	@Override
	public int compareTo(price p) {
		Integer result1 = p.getPriority()-this.priority;
		if(result1>0){
			return -1;
		}else if(result1<0){
			return 1;
		}
		if(result1.equals(0)){
			return this.price.compareTo(p.getPrice());
		}
		return -1;
	}
}
