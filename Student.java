public class Student{
    private String name = "";
    private Teacher teacher = new Teacher();
    private Teacher replace = new Teacher();
    private int id = 0;
    private static int count = 0;
    private double gpa = 0.0;
    private static double numGrade = 0.0;
    private double totalPoint = 0;

    public Student(String name){
        this.name = name;
        this.id = count;
        count++;
    }
    public void setFavoriteTeacher(Teacher teacher){ 
        Teacher a1 = new Teacher(teacher.getName(), teacher.getReason());
        this.teacher = teacher;
        this.replace = a1;
    }
    public int getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public static void addStudents(int num){
        count += num;
    }
    public static int getStudentCount(){
        return count;
    }
    public Teacher getFavoriteTeacher(){
        return this.replace;
    }
    public void addGrade(int grade){
        double better = (double)(grade);
        numGrade++;
        totalPoint += grade;
        this.gpa = totalPoint/numGrade;
    }
    public double getGPA(){
        return this.gpa;
    }

}