package Messages;

public class DailyNewsEmailMessage {
	private  String type;

	public void setType(String type) {
		this.type = "DailyNewsEmailMessage";
	}

	public String prepareMessage(String placeHolders[]) {
		// code to replace place holders of this type
		return "DailyNewsEmailMessage#Dear,There is a new news about"+placeHolders[0]+"\n"+placeHolders[1];
	}
}
