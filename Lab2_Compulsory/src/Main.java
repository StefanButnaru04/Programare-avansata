public class Main {
    public static void main(String[] args) {
        Project project1 = new Project("Project A", ProjectType.THEORETICAL); //Proiect1
        Project project2 = new Project("Project B", ProjectType.PRACTICAL);   //Proiect2
        Project project3 = new Project("Project C", ProjectType.THEORETICAL); //Proiect3
        Project project4 = new Project("Project B", ProjectType.PRACTICAL);   //Proiect4

        Student student1 = new Student("John", "Smith", 20);     //Student1
        Student student2 = new Student("Jane", "Marry", 21);     //Student2
        Student student3 = new Student("Eugen", "Clark", 22);    //Student3
        Student student4 = new Student("Chloe", "Bingo", 25);    //Student4

        Project[] projects = {project1, project2, project3, project4};
        student1.addProject(project1);
        student1.addProject(project2);
        student2.addProject(project3);

        System.out.println(project1.toString());
        System.out.println(project2.toString());
        System.out.println(project3.toString());
        System.out.println(project4.toString());

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        }
    }
