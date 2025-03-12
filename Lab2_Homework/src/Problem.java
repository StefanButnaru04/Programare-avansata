/**
 * Clasa Problem reprezinta contextul in care se desfasoara alocarea proiectelor.
 */
public class Problem {
    Student[] students = new Student[100]; // Lista de studenti
    Teacher[] teachers = new Teacher[100]; // Lista de profesori
    Project[] projects = new Project[100]; // Lista de proiecte
    int studentCount = 0; // Contor pentru numarul de studenti
    int teacherCount = 0; // Contor pentru numarul de profesori
    int projectCount = 0; // Contor pentru numarul de proiecte

    /**
     *
     * @return numarul de profesori
     */
    public int getTeacherCount() {
        return teacherCount;
    }

    /**
     *
     * @return numarul de studenti
     */
    public int getStudentCount() {
        return studentCount;
    }

    /**
     *
     * @param student Studentul care urmeaza sa fie adaugat
     */
    public void addStudent(Student student) {
        for (int i = 0; i < studentCount; i++) {
            if (student.equals(students[i])) {
                return; // Daca studentul exista deja, nu il adaugam
            }
        }
        if (studentCount < students.length) {
            students[studentCount] = student; // Adaugam studentul
            studentCount++;
        }
    }

    /**
     *
     * @param project Proiectul care urmeaza sa fie adaugat
     */
    public void addProject(Project project) {
        for (int i = 0; i < projectCount; i++) {
            if (projects[i].equals(project)) {
                return; // Daca proiectul exista deja, nu il adaugam
            }
        }
        if (projectCount < projects.length) {
            projects[projectCount] = project; // Adaugam proiectul
            projectCount++;
        }
    }

    /**
     *
     * @param teacher Profesorul care urmeaza sa fie adaugat
     */
    public void addTeacher(Teacher teacher) {
        for (int i = 0; i < teacherCount; i++) {
            if (teachers[i].equals(teacher)) {
                return; // Daca profesorul exista deja, nu il adaugam
            }
        }
        if (teacherCount < teachers.length) {
            teachers[teacherCount] = teacher; // Adaugam profesorul
            teacherCount++;
        }
    }

    /**
     *
     * @return Un array de tip Student cu toti studentii
     */
    public Student[] getStudents() {
        return students; // Returnam lista de studenti
    }

    /**
     * Afiseaza lista profesorilor.
     */
    public void getTeachers() {
        System.out.println();
        System.out.println("Teachers:");
        for (int i = 0; i < teacherCount; i++) {
            System.out.println(teachers[i].getName() + " " + teachers[i].getSurname());
        }
    }

    /**
     * Afiseaza lista tuturor persoanelor (atât studenti cât și profesori).
     */
    public void getPersons() {
        System.out.println();
        System.out.println("Persons:");
        // Afisam studentii
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].getName() + " " + students[i].getSurname());
        }
        // Afisam profesorii
        for (int i = 0; i < teacherCount; i++) {
            System.out.println(teachers[i].getName() + " " + teachers[i].getSurname());
        }
    }

    /**
     *
     * @return Un array de tip Project cu toate proiectele
     */
    public Project[] getProjects() {
        return projects; // Returnam lista de proiecte
    }
}