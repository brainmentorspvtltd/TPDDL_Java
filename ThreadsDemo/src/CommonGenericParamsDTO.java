
public class CommonGenericParamsDTO {
	private String key;
	private String value;
	private String descr;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	@Override
	public String toString() {
		return "CommonGenericParamsDTO [key=" + key + ", value=" + value + ", descr=" + descr + "]";
	}
	

}
