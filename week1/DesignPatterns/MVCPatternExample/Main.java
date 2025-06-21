public class Main {
    public static void main(String[] args) {
        Student model = new Student("Wisam", "A101", "A+");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Wisama");
        controller.setStudentGrade("A");

        controller.updateView();
    }
}
