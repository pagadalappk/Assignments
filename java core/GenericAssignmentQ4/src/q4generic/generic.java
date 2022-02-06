package q4generic;

public class generic<k,v>{
	
	private k key;
	private v value;
	public generic(k key, v value) {
		super();
		this.key = key;
		this.value = value;
	}
	public k getKey() {
		return key;
	}
	public void setKey(k key) {
		this.key = key;
	}
	public v getValue() {
		return value;
	}
	public void setValue(v value) {
		this.value = value;
	}

	
}
