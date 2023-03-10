package singleton;

public class You {

    private You(){};
    private static You instance = new You();
    public static You getInstance(){
        return instance;
    }

    private String name;
    private String gender;
    private String feeling;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }

    public String revealFeeling(){
        return "You're now feeling " + this.feeling;
    }
}
