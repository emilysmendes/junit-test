import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;


    public Student(long id, String name) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<Integer>();
    }


    // returns the student's id
    public long getId() {
        return this.id;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for(double grade: grades) {
            total+= grade;
        }
        return total/grades.size();
    }
}

