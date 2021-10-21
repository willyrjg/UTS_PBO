
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AKSAL
 */
public class Activity {
    private int activityId;
    private static ZonedDateTime activityTimeDate;
    private String actorUserName;
    private String activityType;
    // 1 = login, 2 = membuat user, 3 = mengubah username
    static List<Activity> activityLog = new ArrayList<>();
    static int currentActivityId;

    /**
     * @return the activityId
     */
    public int getActivityId() {
        return activityId;
    }

    /**
     * @return the activityTimeDate
     */
    public static ZonedDateTime getActivityTimeDate() {
        return activityTimeDate;
    }

    /**
     * @return the actorUserName
     */
    public String getActorUserName() {
        return actorUserName;
    }

    /**
     * @return the activityType
     */
    public String getActivityType() {
        return activityType;
    }
    /**
     * Constructor
     * @param activityType tipe activity
     * @param actorUserName Username Pelaku aktivitas
     */
    public Activity (String activityType, String actorUserName){ 
    for(int i=1;i<activityLog.size()+1;i++){
        this.activityId = i;
    }
    this.activityType=activityType;
    this.actorUserName=actorUserName;
    this.activityTimeDate=ZonedDateTime.now();
    }
    
    public static void printAllActivities(){
        for(int i=0; i<activityLog.size();i++){
            System.out.println(activityLog.get(i));
        }  
    }  
    
    public static void printTodaysActivities(){
        ZonedDateTime sekarang = ZonedDateTime.now();
        ZonedDateTime returnvalue = sekarang.truncatedTo(ChronoUnit.DAYS);
        if(returnvalue.equals(Activity.activityTimeDate.truncatedTo(ChronoUnit.DAYS))){
            for(int i=0; i<activityLog.size();i++){
                System.out.println(activityLog.get(i));
        }
    }
    }
    public static void printLastTenActivities(){
        for(int i=activityLog.size()-1; i>=activityLog.size()-10;i--){
            System.out.println(activityLog.get(i));
        
    }
    }
    public static void printUserActivities(String actorUserName){
        if(User.usernameList.contains(actorUserName)){
                    for (currentActivityId=0;currentActivityId<activityLog.size();currentActivityId++){
                String elemen = User.usernameList.get(currentActivityId);
                if(elemen.equals(actorUserName)){
                System.out.println(activityLog.get(Activity.currentActivityId));
                } 
        }
        }
    }
    @Override
    public String toString() {
        return "Activity ID = " + activityId + ", Activity Type = "
        + activityType + ", Actor Username = " + actorUserName +
        ", Activity Time Date = "+ activityTimeDate;
}
}
