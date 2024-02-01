package OBS;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int rateOralNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;

        } else {
            System.out.println("Uyuşmuyor.");
        }
    }

    public void printTeacherInfo() {
        this.teacher.printf();
    }
}
