import Controller.StudyGroupController;

public class Main {
    public static void main(String[] args) {

        StudyGroupController controller = new StudyGroupController();

        controller.createStudent("Иван", "Васильевич", "Иванов");
        controller.createStudent("Надежда", "Иванова", "Сергеевна");
        controller.createStudent("Павел", "Гапанов", "Романович");
        controller.createStudent("Виктория", "Каширина", "Петрова");

        controller.getAllStudents();
        System.out.println("/////////////////");

        controller.createTeacher("Ушаков", "Дмитрий", "Алексеевич");
        controller.createTeacher("Потапова", "Александра", "Борисовна");

        controller.getAllTeachers();
        System.out.println("/////////////////");

        controller.createGroup();
    }

}