public class Person {
    private String name;
    private String address;

    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class Student extends Person {
    private String[] courses;
    private int[] grades;
    private int numCourses;

    // Constructor
    public Student(String name, String address) {
        super(name, address);
        courses = new String[30];
        grades = new int[30];
        numCourses = 0;
    }

    // Add a course with grade
    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    // Print all courses taken and the average grade
    public void printCourses() {
        System.out.println("Courses taken:");
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
        System.out.println("Average grade: " + getAverageGrade());
    }

    // Calculate the average grade
    private double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }
}

public class Teacher extends Person {
    private String[] courses;
    private int numCourses;

    // Constructor
    public Teacher(String name, String address) {
        super(name, address);
        courses = new String[5];
        numCourses = 0;
    }

    // Add a course taught
    public void addCourse(String course) {
        courses[numCourses] = course;
        numCourses++;
    }

    // Remove a course taught
    public void removeCourse(String course) {
        int index = -1;
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < numCourses - 1; i++) {
                courses[i] = courses[i + 1];
            }
            numCourses--;
        }
    }
}
