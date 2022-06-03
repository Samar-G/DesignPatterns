package Messages;

public class TaskAddedMobileMessage {
    private String type;

	public void setType(String type) {
		this.type = "TaskAddedMobileMessage";
	}

	public String prepareMessage(String placeHolders,String user) {
		// code to replace place holders of this type
		return "The task added is: \n"+placeHolders+"\n To:"+user;
	}
	
	
	public void addTeamDescription() {
		
	}
}
