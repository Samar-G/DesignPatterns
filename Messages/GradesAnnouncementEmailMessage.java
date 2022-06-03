package Messages;

public class GradesAnnouncementEmailMessage {
    private String type;

	public void setType(String type) {
		this.type = "GradesAnnouncementEmailMessageBuilder";
	}

	public String prepareMessage(String placeHolders,String user) {
		// code to replace place holders of this type
		return " Dear,we are glade to inquire you with your grade in course:"+placeHolders+"\nTo:" +user;
	}
	
	public boolean verifyGrades() {
		// code to verify Grades before announcement
		
		return true;
	}
}
