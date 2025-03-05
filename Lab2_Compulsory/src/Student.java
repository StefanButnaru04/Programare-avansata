import java.util.ArrayList;

public class Student {
    String name;
    String surname;
    int age;
    ArrayList<Project> projects = new ArrayList<>();

    Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", projects=" + projects +
                '}';
    }

}
