import java.util.Objects;

public class Project {
    String name; // Numele proiectului
    ProjectType type; // Tipul proiectului

    // Constructor
    public Project(String name, ProjectType type) {
        this.name = name;
        this.type= type;
    }

    // Setteri
    public void setType(ProjectType type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getteri
    public ProjectType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    // Metoda equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Project project = (Project) obj;
        return Objects.equals(name, project.name) && Objects.equals(type, project.type);
    }
}
