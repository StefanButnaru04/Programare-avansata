import java.util.Objects;


/**
 * Clasa Student reprezinta un student, care este o subclasa a clasei Person.
 */
public class Student extends Person {
    int registrationNumber; // Numarul de inregistrare al studentului
    Project[] acceptableProjects = new Project[100]; // Lista de proiecte acceptabile de catre student
    int projectsCount = 0; // Contor pentru numarul de proiecte acceptabile

    /**
     * Constructorul clasei Student
     *
     * @param name Numele studentului
     * @param surname Prenumele studentului
     * @param dateOfBirth Data nasterii studentului
     * @param registrationNumber Numarul de inregistrare al studentului
     */
    public Student(String name, String surname, String dateOfBirth, int registrationNumber) {
        super(name, surname, dateOfBirth);
        this.registrationNumber = registrationNumber;
    }


    public void acceptableProjects(Project project) {
        // Verifica daca proiectul este deja in lista
        for (int i = 0; i < projectsCount; i++) {
            if (acceptableProjects[i].equals(project)) {
                return; // Daca proiectul este deja acceptat, nu il adauga din nou
            }
        }
        // Adauga proiectul
        if (projectsCount < acceptableProjects.length) {
            acceptableProjects[projectsCount] = project;
            projectsCount++;
        }
    }

    /**
     *
     * @return Un array de tip Project cu proiectele acceptabile ale studentului
     */
    public Project[] getAcceptableProject() {
        return acceptableProjects;
    }

    /**
     * Suprascrierea metodei equals pentru a compara doua obiecte Student.
     *
     * @param obj Obiectul cu care se face comparatia
     * @return true daca cele doua obiecte sunt egale (au acelasi numar de inregistrare), altfel false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(registrationNumber, student.registrationNumber);
    }
}
