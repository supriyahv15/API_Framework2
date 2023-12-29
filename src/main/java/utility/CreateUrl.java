package utility;

public class CreateUrl {
	
	public final static String BaseURL="https://api.github.com";

	public static String getBaseurl() {
		return BaseURL;
	}
	public static String getBaseurl(String resource) {
		return BaseURL+resource;
	}
	

}
