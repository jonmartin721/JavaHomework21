import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestStudents {

    public static void main(String[] args) {

        //create the list
        List<Student> Students = new ArrayList<>();

        //create rand
        Random rand = new Random();

        //put 25 students into Students, along with random grades
        for (int i = 0; i < 25; i++) {

            Students.add(new Student());
            Students.get(i).setFinals(rand.nextInt((100 - 50) + 1) + 50);
            Students.get(i).setMidterm2(rand.nextInt((100 - 50) + 1) + 50);
            Students.get(i).setMidterm1(rand.nextInt((100 - 50) + 1) + 50);

        }

        //setup table header
        String leftAlignFormat = "| %-10s | %-9d | %-9d | %-8d  | %-7s |%n";
        System.out.format("\nStudent info:\n");
        System.out.format("+------------+-----------+-----------+-----------+---------+%n");
        System.out.format("| Name       | Midterm 1 | Midterm 2 | Final     | Grade   |%n");
        System.out.format("+------------+-----------+-----------+-----------+---------+%n");

        //begin loop to display each student
        for (int i = 0; i < Students.size(); i++) {
            System.out.format(leftAlignFormat, Students.get(i).getName(), Students.get(i).getMidterm1(),
                    Students.get(i).getMidterm2(), Students.get(i).getFinals(), Students.get(i).calculateGrade());
        }

        //ending line
        System.out.format("+------------+-----------+-----------+-----------+---------+%n");

    }
}
