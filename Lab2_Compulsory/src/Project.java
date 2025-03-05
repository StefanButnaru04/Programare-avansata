public class Project {
    String name;
    ProjectType type;

    public Project(String name, ProjectType type) {
        this.name = name;
        this.type = type;
    }

    public Project(String name) {
        this.name = name;
    }


    public void setType(ProjectType type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
