package Model;

import java.util.List;

public class StudyGroup {
    private User teacherGroup;
    private int numberGroup;
    private List<User> students;

    // МЕТОД КОНСТРУКТОР КЛАССА
    public StudyGroup(int numberGroup, User teacherGroup, List<User> students) {
        this.numberGroup = numberGroup;
        this.teacherGroup = teacherGroup;
        this.students = students;;
    }

    //===============  МЕТОДЫ GET AND SET ДЛЯ РАЗНЫХ ЗНАЧЕНИЙ  =======================================
    public User getTeacherGroup() {return teacherGroup;}
    public int getNumberGroup() {return numberGroup;}
    public List<User> getStudents() {return students;}

    public void setTeacherGroup(Teacher teacherGroup) {this.teacherGroup = teacherGroup;}
    public void setNumberGroup(int numberGroup) {this.numberGroup = numberGroup;}
    public void setStudents(List<User> students) {this.students =  students;}

    // СОЗДАНИЕ УДОБНОЧИТАЕМОГО ТЕКСТА
    @Override
    public String toString() {
        return "Группа №" + numberGroup +
                teacherGroup + students;
    }
}
