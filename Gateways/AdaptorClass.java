package Gateways;

import Messages.*;

public class AdaptorClass implements AdaptorInterface{

    EmailGateway eg=new EmailGateway();
    SMSGateway sms=new SMSGateway();
    @Override
    public void  receiveMessage(String msg,String to) {
        String [] s=msg.split("#");
        Director di=new Director();
        if(s[0].equalsIgnoreCase("Ann")){
            DailyNewsEmailMessageBuilder Dm=new DailyNewsEmailMessageBuilder();
            di.buildDailyNewsEmailMessage(Dm);
            DailyNewsEmailMessage d=Dm.getMsg();
             eg.sendMessage(d,s[1],to);
            DailyNewsMobileMessageBuilder Dms=new DailyNewsMobileMessageBuilder();
            di.buildDailyNewsMobileMessage(Dms);
            DailyNewsMobileMessage dm=Dms.get();
            sms.sendMessage(dm,s[1],to);

        }
        else if(s[0].equalsIgnoreCase("Grade")){
            GradesAnnouncementEmailMessageBuilder Dm=new GradesAnnouncementEmailMessageBuilder();
            di.buildGradesAnnouncementEmailMessage(Dm);
            GradesAnnouncementEmailMessage gE=Dm.get();
            eg.sendMessage(gE,s[1],to);
            GradesAnnouncementMobileMessageBuilder Dmg=new GradesAnnouncementMobileMessageBuilder();
            di.buildGradesAnnouncementMobileMessage(Dmg);
            GradesAnnouncementMobileMessage gm=Dmg.get();
            sms.sendMessage(gm,s[1],to);

        }
        else if(s[0].equalsIgnoreCase("TaskAddedEmailMessage")){
            TaskAddedEmailMessageBuilder Dm=new TaskAddedEmailMessageBuilder();
            di.buildTaskAddedEmailMessage(Dm);
            TaskAddedEmailMessage t=Dm.get();
            eg.sendMessage(t,s[1],to);
            TaskAddedMobileMessageBuilder Dms=new TaskAddedMobileMessageBuilder();
            di.buildTaskAddedMobileMessage(Dms);
            TaskAddedMobileMessage t1=Dms.get();
            sms.sendMessage(t1,s[1],to);

        }

    }
}
