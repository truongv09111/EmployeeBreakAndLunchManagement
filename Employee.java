public class Employee {
    //fields
    private String name;
    private String startTime;
    private String endTime;
    private String wantedLunchTime;
    private String suggestedLunchTime;
    private String suggestedFirstBreak;
    private String suggestedSecondBreak;
    private int hoursTilLunch;
    private double hoursTilFirstBreak;
    private double hoursTilSecondBreak;


    //constructor method
    public Employee(String name, String startTime, String endTime){
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        hoursTilLunch = 0;
        hoursTilFirstBreak = 0;
        hoursTilSecondBreak = 0;
        wantedLunchTime = null;
        suggestedLunchTime = null;
        suggestedFirstBreak = null;
        suggestedSecondBreak = null;

    }

    //getter methods

    public String getName() {
        return name;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getWantedLunchTime() {
        return wantedLunchTime;
    }

    public String getSuggestedLunchTime() {
        return suggestedLunchTime;
    }

    public int getHoursTilLunch() {
        return hoursTilLunch;
    }

    public double getHoursTilFirstBreak() {
        return hoursTilFirstBreak;
    }

    public double getHoursTilSecondBreak() {
        return hoursTilSecondBreak;
    }

    public String getSuggestedFirstBreak() {
        return suggestedFirstBreak;
    }

    public String getSuggestedSecondBreak() {
        return suggestedSecondBreak;
    }

    //setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setWantedLunchTime(String wantedLunchTime) {
        this.wantedLunchTime = wantedLunchTime;
    }

    public void setSuggestedLunchTime(String suggestedLunchTime) {
        this.suggestedLunchTime = suggestedLunchTime;
    }

    public void setHoursTilLunch(int hoursTilLunch) {
        this.hoursTilLunch = hoursTilLunch;
    }

    public void setHoursTilFirstBreak(double hoursTilFirstBreak) {
        this.hoursTilFirstBreak = hoursTilFirstBreak;
    }

    public void setHoursTilSecondBreak(double hoursTilSecondBreak) {
        this.hoursTilSecondBreak = hoursTilSecondBreak;
    }

    public void setSuggestedFirstBreak(String suggestedFirstBreak) {
        this.suggestedFirstBreak = suggestedFirstBreak;
    }

    public void setSuggestedSecondBreak(String suggestedSecondBreak) {
        this.suggestedSecondBreak = suggestedSecondBreak;
    }

    //instance methods
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Start time: " + startTime);
        System.out.println("End time: " + endTime);
        if(wantedLunchTime != null){
            System.out.println("Wanted lunch time: " + wantedLunchTime);
        }

    }
}
