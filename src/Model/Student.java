package Model;

public class Student extends User{
    private int  studentID;

    // МЕТОД КОНСТРУКТОР КЛАССА
    public Student(int studentID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;
    }

    // МЕТОД ПО ПОЛУЧЕНИЮ ID СТУДЕНТА
    public int getStudentID() {return studentID;}

    // МЕТОД ПО ЗАДАГНИЮ ID для студента
    public void setStudentID(int studentID) {this.studentID = studentID;}

    // СОЗДАНИЕ КРАСИВОГО ВЫВОДА В КОНСОЛИ
    @Override
    public String toString() {
        return " Студент[" +
                "ID: " + studentID +
                " Фамилия: " + super.getSecondName() +
                " Имя: " + super.getFirstName() +
                " Отчество: " + super.getLastName() +
                ']';
    }
}


