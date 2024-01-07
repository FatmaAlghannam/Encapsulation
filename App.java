public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setName("Fatma");
        student.setAge(23);
        student.setGpa(4.0);

        System.out.println(student.getAge());
        System.out.println(student.getGpaStatus());
        System.out.println(student.getName());

    }
}
