import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Human peopletest = new Human("12/12/1977","вася","иванов","иванович");
        Human peopletest1 = new Human("12/12/1989","петя","иванов","васильевич");
        Human peopletestFather = new Human("12/12/1967","иван","иванов","иванович");
        Human peopletestMother = new Human("12/12/1969","мария","иванов","петровна");
        System.out.println(peopletest);
        System.out.println(peopletest1);
        peopletest.setFather(peopletestFather);
        peopletest.setMother(peopletestMother);
        System.out.println(peopletest.getMother());

        peopletest.setChildren(peopletest1);
        System.out.println(peopletest.getChildren());
        }
    }
