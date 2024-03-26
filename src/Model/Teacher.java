package Model;

public class Teacher extends User {
    private int teacherID;

    // МЕТОД КОНСТРУКТОРА КЛАССА
    public Teacher(int teacherID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherID = teacherID;
    }

    // МЕТОД ПОЛУЧЕНИЕ ID УЧИТЕЛЯ
    public int getTeacherID() {return teacherID;}

    // МЕТОД ПО ЗАДАНИЮ ID УЧИТЕЛЯ
    public void setTeacherID(int teacherID) {this.teacherID = teacherID;}

    // КРАСИВЫЙ ВЫВОД В КОНСОЛИ
    @Override
    public String toString() {
        return " Учитель[" +
                "ID: " + teacherID +
                " Фамилия: " + super.getSecondName() +
                " Имя: " + super.getFirstName() +
                " Отчество: " + super.getLastName() +
                ']';
    }
}


