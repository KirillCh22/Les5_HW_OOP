package Model;


// ЭТО БАЗОВЫЙ КЛАСС ДЛЯ СТУДЕНТА И УЧИТЕЛЯ, ОТ КОТОРОГО ОНИ УЖЕ НАСЛЕДУЮТ
public class User {

    private String firstName;
    private String secondName;
    private  String lastName;



    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getFirstName() {return firstName;}

    public String getSecondName() {return secondName;}

    public String getLastName() {return lastName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public void setSecondName(String secondName) {this.secondName = secondName;}

    public void setLastName(String lastName) {this.lastName = lastName;}
}
