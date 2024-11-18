public class Tester{
    public static void main(String[] args){
        Student chuck = new Student("Chuckles");
        Student moby = new Student("Moby");
        System.out.println(chuck.getID());
        System.out.println(moby.getID());
        Teacher eddie = new Teacher("eddie", "cuz");
        chuck.setFavoriteTeacher(eddie);
        eddie.setName("boyo");
        System.out.println(chuck.getFavoriteTeacher().getName());
         Student one = new Student("Hobbes");
        Teacher two = new Teacher("Socrates", "He was pretty cool.");
        one.setFavoriteTeacher(two);
        Boolean a = one.getFavoriteTeacher().getName().equals("Socrates");
        Boolean b = one.getFavoriteTeacher().getReason().equals("He was pretty cool.");

        two.setName("Pythagoras");
        two.setReason("Because of the triangles.");
        System.out.println(one.getFavoriteTeacher().getName());
    }
}