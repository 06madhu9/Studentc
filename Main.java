import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Course> courses1 = new ArrayList<>();
        courses1.add(new Course("Math", 85));
        courses1.add(new Course("Science", 35)); // Below 40
        courses1.add(new Course("English", 75));

        Student student1 = new Student("Alice", courses1);

        student1.displayCoursesAndMarks();
    }
}


