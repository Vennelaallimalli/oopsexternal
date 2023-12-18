mkdir dept
// File: dept/Department.java
package dept;

public interface Department {
    void displaySubjects();
}
// File: dept/CSE.java
package dept;

public class CSE implements Department {
    @Override
    public void displaySubjects() {
        System.out.println("Computer Science and Engineering Subjects:");
        System.out.println("1. Algorithms");
        System.out.println("2. Data Structures");
        System.out.println("3. Database Management");
        // Add more subjects as needed
    }
}
// File: dept/ECE.java
package dept;

public class ECE implements Department {
    @Override
    public void displaySubjects() {
        System.out.println("Electronics and Communication Engineering Subjects:");
        System.out.println("1. Signals and Systems");
        System.out.println("2. Digital Electronics");
        System.out.println("3. Communication Systems");
        // Add more subjects as needed
    }
}
// File: dept/ME.java
package dept;

public class ME implements Department {
    @Override
    public void displaySubjects() {
        System.out.println("Mechanical Engineering Subjects:");
        System.out.println("1. Thermodynamics");
        System.out.println("2. Fluid Mechanics");
        System.out.println("3. Strength of Materials");
        // Add more subjects as needed
    }
}
// File: dept/CE.java
package dept;

public class CE implements Department {
    @Override
    public void displaySubjects() {
        System.out.println("Civil Engineering Subjects:");
        System.out.println("1. Structural Analysis");
        System.out.println("2. Geotechnical Engineering");
        System.out.println("3. Environmental Engineering");
        // Add more subjects as needed
    }
}
// File: DepartmentApp.java
import dept.CSE;
import dept.ECE;
import dept.ME;
import dept.CE;
import dept.Department;

public class DepartmentApp {
    public static void main(String[] args) {
        // Create instances of each department
        Department cse = new CSE();
        Department ece = new ECE();
        Department me = new ME();
        Department ce = new CE();

        // Display subjects for each department
        System.out.println("Subjects for Computer Science and Engineering:");
        cse.displaySubjects();

        System.out.println("\nSubjects for Electronics and Communication Engineering:");
        ece.displaySubjects();

        System.out.println("\nSubjects for Mechanical Engineering:");
        me.displaySubjects();

        System.out.println("\nSubjects for Civil Engineering:");
        ce.displaySubjects();
    }
}
