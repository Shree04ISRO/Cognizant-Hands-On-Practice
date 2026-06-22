public class Main {

    public static void main(String[] args) {

        Student model =
                new Student("Hari", 101, "A");

        StudentView view =
                new StudentView();

        StudentController controller =
                new StudentController(model, view);

        System.out.println("Initial Details:");
        controller.updateView();

        System.out.println();

        controller.setStudentName("Shree Hari");
        controller.setStudentGrade("A+");

        System.out.println("Updated Details:");
        controller.updateView();
    }
}