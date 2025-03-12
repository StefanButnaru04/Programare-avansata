/**
 * Clasa Solution se ocupa cu alocarea proiectelor studentilor pe baza preferintelor
 */
public class Solution {

    private Project[] allocatedProjects = new Project[100];
    private int allocatedProjectCount = 0;

    /**
     * Aloca proiecte studentilor pe baza preferintelor lor.
     *
     * @param students Lista de studenti pentru care se aloca proiecte
     * @param projects Lista de proiecte disponibile
     * @param numStudents Numarul de studenti care trebuie sa primeasca un proiect
     */
    public void allocateProjects(Student[] students, Project[] projects, int numStudents) {
        // Ne plimbam prin toti studentii
        for (int i = 0; i < numStudents; i++) {
            boolean assigned = false;
            Student student = students[i];
            Project[] acceptableProjects = student.getAcceptableProject(); // Obtinem proiectele acceptabile ale studentului

            // Cautam in lista de preferinte
            for (int j = 0; j < acceptableProjects.length; j++) {
                Project preferredProject = acceptableProjects[j];

                // Verificam daca proiectul respectiv este disponibil
                if (isProjectAvailable(preferredProject)) {
                    System.out.println("Assigning project \"" + preferredProject.getName() + "\" to student " + student.getName());
                    assignProjectToStudent(preferredProject); // Alocam proiectul
                    assigned = true;
                    break; // Studentul a primit proiect
                }
            }

            // Daca nu am gasit niciun proiect disponibil
            if (!assigned) {
                System.out.println("No project available for student " + student.getName());
            }
        }
    }

    /**
     * Verifica daca un proiect este disponibil (adica nu a fost deja alocat).
     *
     * @param project proiectul pe care vrem sa-l verificam
     * @return true daca proiectul este disponibil, false altfel
     */
    private boolean isProjectAvailable(Project project) {
        // Verificam daca proiectul este deja alocat
        for (int i = 0; i < allocatedProjectCount; i++) {
            if (allocatedProjects[i].equals(project)) {
                return false; // Proiectul a fost deja alocat
            }
        }
        return true; // Proiectul este disponibil
    }

    /**
     * Marcheaza un proiect ca fiind alocat si il adauga in lista de proiecte alocate.
     *
     * @param project proiectul pe care il alocam studentului
     */
    private void assignProjectToStudent(Project project) {
        if (allocatedProjectCount < allocatedProjects.length) {
            allocatedProjects[allocatedProjectCount] = project; // Adaugam proiectul in lista de proiecte alocate
            allocatedProjectCount++;
        }
    }
}
