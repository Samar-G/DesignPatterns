package Messages;

public class TaskAddedEmailMessage {
    private String type;

	public void setType(String type) {
		this.type = "TaskAddedEmailMessage";
	}

	public String prepareMessage(String placeHolders,String user) {
		// code to replace place holders of this type
		
		return "Dear,there is anew task add in our course which is :\n"+placeHolders+"\n"+user;
	}
	
	
	public void addTeamDescription() {
		
	}
}
