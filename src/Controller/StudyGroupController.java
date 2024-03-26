package Controller;

import Model.Student;
import Model.StudyGroup;
import Model.Teacher;
import Model.User;
import View.GroupView;
import View.StudentView;
import View.TeacherView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudyGroupController {

    private final HelpForController helpForController = new HelpForController();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private  final GroupView groupView = new GroupView();
    private final StudyGroupService studyGroupService = new StudyGroupService();


    // МЕТОД ПО СОЗДАНИЮ СТУДЕНТА
    public void createStudent(String firstName, String secondName, String lastName) {
        helpForController.createUser(firstName, secondName, lastName, "student");
    }

    // МЕТОД ПО ОТОБРАЖЕНИЮ ВСЕХ СТУДЕНТОВ В КОНСОЛИ
    public void getAllStudents() {
        for (User user : helpForController.getAllUsers("student")) {
            studentView.showInConsole((Student) user);
        }
    }


    // МЕТОД ПО СОЗДАНИЮ УЧИТЕЛЯ
    public void createTeacher(String firstName, String secondName, String lastName) {
        helpForController.createUser(firstName, secondName, lastName, "teacher");
    }


    // МЕТОД ПО ОТОБРАЖЕНИЮ ВСЕХ УЧИТЕЛЕЙ В КОНСОЛИ
    public void getAllTeachers() {
        for (User user : helpForController.getAllUsers("teacher")) {
            teacherView.showInConsole((Teacher) user);
        }
    }

    // ЗАДАНИЕ ПОЛЬЗОВАТЕЛЬСКИМ ВВОДОМ НОМЕРА ГРУППЫ
    public int getGroupNumber() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер группы: ");
        number = Integer.parseInt(scanner.next());

        return number;
    }

    // УЗНАЕМ УЧИТЕЛЯ ПО ЗАДАННОМУ ID
    public User getGroupTeacher() {
        int id;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ID преподавателя: ");
        id = Integer.parseInt(scanner.next());


        return  helpForController.getUserById("teacher", id);
    }


    // МЕТОД ПО ЗАПОЛНЕНИЮ ГРУППЫ СТУДЕНТАМИ
    public List<User> studentsInGroup() {
        List<User> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ID студентов, для того чтобы закончить напишите цифру - '0': ");

        while (true) {
            int num = Integer.parseInt(scanner.next());
            studentList.add(helpForController.getUserById("student", num));

            if (num == 0) break;
        }
        return studentList;
    }


    // МЕТОД УПРАВЛЕНИЯ СОЗДАНИЕМ ГРУППЫ
    public void createGroup() {
        int numberGroup = getGroupNumber();
        User teacherGroup = getGroupTeacher();
        List<User> students = studentsInGroup();
        StudyGroup group = studyGroupService.createGroup(numberGroup, teacherGroup, students);
        groupView.showInConsole(group);
    }
}
