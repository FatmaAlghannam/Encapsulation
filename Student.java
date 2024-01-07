public class Student {

    private String name;
    private int age;
    private double gpa;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getGpaStatus() {
        if (gpa > 3) {
            return "Excellent";
        }

        else if (gpa <= 3) {
            return "good";
        }

        else if (gpa < 2)
            ;
        {
            return "need improvment";
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;

        } else {
            System.out.println("ERROR:GPA must be between 0.0 & 4.0 ");
            this.gpa = 0.0;

        }
    }
}
