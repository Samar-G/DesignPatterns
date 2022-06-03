package Messages;

public class DailyNewsEmailMessage {
	private  String type;

	public void setType(String type) {
		this.type = "DailyNewsEmailMessage";
	}

	public String prepareMessage(String placeHolders ,String User) {
		// code to replace place holders of this type
		return "Dear,There is a new news about"+placeHolders+"\n"+"To:" +User;
	}
}
