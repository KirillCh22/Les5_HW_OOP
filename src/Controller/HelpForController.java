package Controller;

import Model.Student;
import Model.StudyGroup;
import Model.Teacher;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public class HelpForController {
    private List<User> userList = new ArrayList<>();


    // МЕТОД ПО СОЗДАНИЮ НОВЫХ ПОЛЬЗОАТЕЛЕЙ Т ДОБАВЛЕНИЕ ИХ В СПИСОК В ЗАВИСИМОСТИ ОТ УКАЗАННОЙ
    // ПЕРЕМЕННОЙ, КОГО МЫ ХОТИМ СЕЙЧАС ДОБАВИТЬ В СПСИОК
    public void createUser(String firstName, String secondName,String lastName, String WhoIsThis) {
        int id = getID(WhoIsThis);
        if (WhoIsThis.equals("student")) userList.add(new Student(id, firstName, secondName, lastName));
        if (WhoIsThis.equals("teacher")) userList.add(new Teacher(id, firstName, secondName, lastName));
    }


    // МЕТОД ПО ДОБАВЛЕНИЮ ID К СТУДЕНТУ И УЧИТЕЛЮ
    private int getID(String WhoIsThis) {
        boolean itsStudent = WhoIsThis.equals("student");
        int ID = 1;
        for (User user:userList) {
            if(user instanceof Student && itsStudent) ID =  ((Student) user).getStudentID() + 1;    // instanceof сравнивает объект с типом и возвращает значение True or False
            if(user  instanceof Teacher && !itsStudent) ID = ((Teacher) user).getTeacherID() + 1;
        }

        return ID;
    }

    // МЕТОД ПО ПОЛУЧЕНИЮ ВСЕГО СПИСКА ЛИБО СТУДДЕНТУ, ЛИБО ПО УЧИТЕЛЮ В
    // ЗВИСИМОСТИ КАКАЯ ПЕРЕМЕННАЯ УКАЗАНА
    public List<User> getAllUsers(String WhoIsThis) {
        List<User>  totalList = new ArrayList<>();
        boolean itsStudent = WhoIsThis.equals("student");
        for(User user:userList) {
            if(user instanceof Student && itsStudent) totalList.add(user);
            if(user instanceof Teacher && !itsStudent) totalList.add(user);

        }

        return totalList;
    }


    // МЕТОД ПО ПОЛУЧЕНИЮ ПОЛЬЗОВАТЕЛЯ ИЗ СПИСКА ПО ID
    public User getUserById(String WhoIsThis, int id) {
        boolean itsStudent = WhoIsThis.equals("student");
        for (User user:userList) {
            if(user instanceof Student && itsStudent && ((Student) user).getStudentID() == id) return user;   // ЕСЛИ ТУТ НЕ СРАВНИВАТЬ ID, ТО ОТОБРАЖАТЬСЯ В КОНСОЛИ БУДЕТ ВСЕГДА ТОЛЬКО 1-ЫЙ СТУДЕНТ, n-ое кол-во раз
            if (user instanceof Teacher && !itsStudent &&((Teacher) user).getTeacherID() == id) return user;
        }

        return null;
    }


}
