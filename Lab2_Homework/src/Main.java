import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //proiecte
        Project project1=new Project("Project 1", ProjectType.THEORETICAL);
        Project project2=new Project("Project 2", ProjectType.PRACTICAL);
        Project project3=new Project("Project 3", ProjectType.THEORETICAL);
        Project project4=new Project("Project 4", ProjectType.PRACTICAL);

        //studenti
        Student student1=new Student("Butnaru", "Stefan", "24.12.2004", 25);
        Student student2=new Student("Garb", "Ana", "22.05.2001", 7);
        Student student3=new Student("Larb", "Claus", "14.09.2005", 69);
        Student student4=new Student("Darck", "Kirk", "01.01.2004", 96);

        //profesori
        Teacher teacher1=new Teacher("Alvarez", "Juan", "12.01.1989", 123456789);
        Teacher teacher2=new Teacher("Alehandro", "Maria", "02.02.1979", 127643767);
        Teacher teacher3=new Teacher("Garcia", "Alina", "18.07.1983", 423556789);
        Teacher teacher4=new Teacher("Garincea", "Palton", "15.05.1986", 325656689);

        //updatam lista de proiecte propuse a profesorilor
        teacher1.proposedProjects(project1);
        teacher1.proposedProjects(project2);
        student3.acceptableProjects(project3);
        student3.acceptableProjects(project4);

        //problema
        Problem problem1= new Problem();
        problem1.addStudent(student1);
        problem1.addStudent(student3);
        problem1.addStudent(student2);
        problem1.addTeacher(teacher1);
        problem1.addTeacher(teacher2);
        problem1.getPersons();

        //lista de preferinte ale studentilor
        student1.acceptableProjects(project2);
        student1.acceptableProjects(project1);
        student1.acceptableProjects(project2);
        student1.acceptableProjects(project4);
        student2.acceptableProjects(project4);
        student2.acceptableProjects(project2);
        student3.acceptableProjects(project3);
        student3.acceptableProjects(project4);


        System.out.println();
        //solutie prin greedy
        Solution solution1= new Solution();
        solution1.allocateProjects(problem1.getStudents(), problem1.getProjects(), problem1.getStudentCount());


    }
}