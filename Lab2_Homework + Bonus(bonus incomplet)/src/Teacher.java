import java.util.Objects;

/**
 * Clasa Teacher extinde clasa Person si reprezinta un profesor care propune proiecte
 */
public class Teacher extends Person {
    int id; // ID-ul unic al profesorului
    Project[] proposedProjects = new Project[100]; // Lista de proiecte propuse de profesor
    int projectsCount = 0; // Contor pentru numarul de proiecte propuse

    /**
     * Constructor pentru teacher
     *
     * @param name Numele profesorului
     * @param surname Prenumele profesorului
     * @param dateOfBirth Data nasterii profesorului
     * @param id ID-ul unic al profesorului
     */
    public Teacher(String name, String surname, String dateOfBirth, int id) {
        super(name, surname, dateOfBirth);
        this.id = id;
    }

    /**
     *
     * @param project Proiectul care urmeaza sa fie propus de profesor
     */
    public void proposedProjects(Project project) {
        for (int i = 0; i < projectsCount; i++) {
            if (proposedProjects[i].equals(project)) {
                return; // Daca proiectul a fost deja propus, nu il adaugam din nou
            }
        }
        if (projectsCount < proposedProjects.length) {
            proposedProjects[projectsCount] = project; // Adaugam proiectul in lista
            projectsCount++; // Incrementam contorul de proiecte propuse
        }
    }

    /**
     *
     * @param obj Obiectul cu care se face comparatia
     * @return true daca cele doua obiecte sunt egale (au acelasi ID), false altfel
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Teacher teacher = (Teacher) obj;
        return Objects.equals(id, teacher.id); // Compararea pe baza ID-ului
    }
}
