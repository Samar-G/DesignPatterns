package Messages;

public class TaskAddedEmailMessage {
    private String type;

	public void setType(String type) {
		this.type = "TaskAddedEmailMessage";
	}

	public String prepareMessage(String placeHolders[]) {
		// code to replace place holders of this type
		
		return "TaskAddedEmailMessage#Dear,there is anew task add in our course which is :\n"+placeHolders[0]+"is"+placeHolders[1];
	}
	
	
	public void addTeamDescription() {
		
	}
}
