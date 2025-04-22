package labtuan2;

public class Student{
    private String stID;
    private String stName;
    private String stClass;

    public Student(){
        this.stID = "";
        this.stName = "";
        this.stClass = "";
          }

    public Student(String stID, String stName, String stClass){
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
        }
    public Student(Student st){
        this.stID = st.stID;
        this.stName = st.stName;
        this.stClass = st.stClass;
    }

    public String getStID(){
        return stID;
       }

    public String getStName(){
        return stName;
       }

    public String getStClass(){
        return stClass;
    }
    public void setStID(String id){
        this.stID = id;
      }

    public void setStName(String name){
        this.stName = name;
    }

    public void setStClass(String stClass){
        this.stClass = stClass;
      }

    // toString
    public String toString(){
        return "ID: " + stID + ", Name: " + stName + ", Class: " + stClass;
    }
}