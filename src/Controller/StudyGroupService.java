package Controller;

import Model.Student;
import Model.StudyGroup;
import Model.Teacher;
import Model.User;

import java.util.List;

public class StudyGroupService {

    // МЕТОД ПО СОЗДАНИЮ ГРУППЫ И ВЫЗОВУ ОПРЕДЕЛЕННОГО ДЛЯ ЭТОГО КЛАССА
    public StudyGroup createGroup(int number, User teacher, List<User> students) {
        return new StudyGroup(number, teacher, students);
    }
}
