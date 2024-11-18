Your goal for this MP is to create and implement two classes. The first class is
the Student class. The goal of the student class is to store the name, id, GPA,
and favorite teacher of a particular student as well as the total number of
students. You may create any variables or methods that you would like, but must
at a minimum include the following list.

public Student(String name) //A constructor for a new student object (done)
public static void addStudents(int number) //Increases the total number of students (done)
public static int getStudentCount() //Returns the total number of students (done)
public String getName() // Returns the name of the student (done)
public int getID() // Returns the ID of the student (done)
public void addGrade(int Grade) //Takes in a grade on a 1-4 scale and recalculates the GPA (done)
public double getGPA() //Returns the GPA of the student (done)
public void setFavoriteTeacher(Teacher favorite) //Sets the student's favorite teacher (done)
public Teacher getFavoriteTeacher() //Returns a reference to the student's favorite teacher (done)

The second class that you must write is the Teacher class. This class only keeps
track of the name of the teacher and the reason for why they are a favorite
teacher. You may create any variables or methods that you would like, but must
at a minimum include the following list.

public Teacher(String name, String reason) //A constructor for a new teacher object (done)
public String getName() //Returns the name of the teacher (done)
public String getReason() //Returns the reason for the teacher (done)
public void setName() //Sets the name of the teacher (done)
public void setReason() //Sets the reason for the teacher (done)

An autograder is included for you to test your work. All tests must pass for
full credit.
