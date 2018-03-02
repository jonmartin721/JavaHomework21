public class Student {

    //member variables
    private int id, midterm1, midterm2, finals;
    private String name;

    //static variable
    private static int nextId = 1;

    //default constructor
    Student() {

        //assigning default values
        name = "Student" + nextId;
        id = nextId;
        midterm1 = 0;
        midterm2 = 0;
        finals = 0;

        //increment nextId
        nextId++;
    }

    //"fully overloaded" constructor
    Student(int id, int midterm1, int midterm2, int finals, String name) {

        this.id = id;
        this.midterm1 = midterm1;
        this.midterm2 = midterm2;
        this.finals = finals;
        this.name = name;
    }


    //this method calculates grade, assigns a letter grade, and returns it
    public String calculateGrade() {

        //local variables
        String letterGrade;
        double finalScore;

        //calculate the weighted number grade
        finalScore = 0.3 * midterm1 + 0.3 * midterm2 + 0.4 * finals;

        if (finalScore > 89) {
            letterGrade = "A";
        } else if (finalScore > 79 && finalScore < 89) {
            letterGrade = "B";
        } else if (finalScore > 69 && finalScore < 79) {
            letterGrade = "C";
        } else if (finalScore > 59 && finalScore < 69) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        return letterGrade;
    }

    public int getMidterm1() {
        return midterm1;
    }

    public void setMidterm1(int midterm1) {
        this.midterm1 = midterm1;
    }

    public int getMidterm2() {
        return midterm2;
    }

    public void setMidterm2(int midterm2) {
        this.midterm2 = midterm2;
    }

    public int getFinals() {
        return finals;
    }

    public void setFinals(int finals) {
        this.finals = finals;
    }

    public String getName() {
        return name;
    }
}
