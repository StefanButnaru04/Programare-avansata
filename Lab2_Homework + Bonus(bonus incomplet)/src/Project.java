import java.util.Objects;

/**
 * Clasa Project reprezinta un proiect ce poate fi asociat cu un student si un profesor.
 */
public class Project {
    String name; // Numele proiectului
    ProjectType type; // Tipul proiectului (teoretic, practic etc.)

    /**
     * Constructor
     * @param name Numele proiectului
     * @param type Tipul proiectului
     */
    public Project(String name, ProjectType type) {
        this.name = name;
        this.type = type;
    }

    public Project(String name) {
        this.name = name;
    }

    /**
     *
     * @param type Tipul proiectului
     */
    public void setType(ProjectType type) {
        this.type = type;
    }

    /**
     *
     * @param name Numele proiectului
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return Tipul proiectului
     */
    public ProjectType getType() {
        return type;
    }

    /**
     *
     * @return Numele proiectului
     */
    public String getName() {
        return name;
    }

    /**
     * Verifica daca doua obiecte Project sunt egale.
     *
     * @param obj Obiectul cu care se face comparatia
     * @return true daca cele doua obiecte sunt egale, false altfel
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Project project = (Project) obj;
        return Objects.equals(name, project.name) && Objects.equals(type, project.type);
    }
}
