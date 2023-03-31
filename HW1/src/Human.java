import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Human {
    private int birth_date;
    private int birth_month;
    private int birth_year;
    private Human father;
    private Human mother;
    private Set<Human> children;
    private String firstName;
    private String secondName;
    private String patronymic;


    public Human(String birthDay, String firstName, String secondName, String patronymic) {
        convertDateFromStringToInt(birthDay);
        this.firstName = firstName.toUpperCase();
        this.secondName = secondName.toUpperCase();
        this.patronymic = patronymic.toUpperCase();
    }
    private void convertDateFromStringToInt(String input){
        String[] tempString = input.split("[//.,]");
        this.birth_date = Integer.parseInt (tempString[0]);;
        this.birth_month = Integer.parseInt (tempString[1]);;
        this.birth_year = Integer.parseInt (tempString[2]);;
    }

    public String getBirthDay() {
        String bDay =  this.birth_date+"."+  this.birth_month+"."+ this.birth_year;
        return bDay;
    }

    public int getAge() {
        Date dt=new Date();
        int year=dt.getYear();
      return year-birth_year+1900;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getFather() {
        return father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getMother() {
        return mother;
    }

    public void setChildren(Human child) throws IOException {

        if (children == null){
            Set<Human> children = new HashSet<>();
            this.children.add(child);
        }
        else{
            this.children.add(child);
        }
    }

    public Set<Human> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return secondName+ " " + firstName+" "+ patronymic +", возраст :"+ getAge() +" лет";
    }
}
