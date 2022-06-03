package Messages;

public class TaskAddedMobileMessage {
    private String type;

	public void setType(String type) {
		this.type = "TaskAddedMobileMessage";
	}

	public String prepareMessage(String placeHolders[]) {
		// code to replace place holders of this type
		return "TaskAddedMobileMessage#The task added is: \n"+placeHolders[0]+"\n"+placeHolders[1];
	}
	
	
	public void addTeamDescription() {
		
	}
}
