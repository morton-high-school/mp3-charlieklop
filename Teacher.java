public class Teacher{
    private String name = "";
    private String reason = "";


    public Teacher(String name, String reason){
        this.name = name;
        this.reason = reason;
    }
    public Teacher(){
        this.name = "There is no teacher.";
        this.reason = "The fog is coming";
    }
    public String getName(){
        return this.name;
    }
    public String getReason(){
        return this.reason;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setReason(String reason){
        this.reason = reason;
    }
}