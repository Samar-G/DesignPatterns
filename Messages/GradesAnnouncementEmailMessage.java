package Messages;

public class GradesAnnouncementEmailMessage {
    private String type;

	public void setType(String type) {
		this.type = "GradesAnnouncementEmailMessageBuilder";
	}

	public String prepareMessage(String placeHolders[]) {
		// code to replace place holders of this type
		return "GradesAnnouncementEmailMessage# Dear,we are glade to inquire you with your grade in course:"+placeHolders[0]+" is"+placeHolders[1];
	}
	
	public boolean verifyGrades() {
		// code to verify Grades before announcement
		
		return true;
	}
}
