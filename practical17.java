class University {

    static int totalStudents;
    
    static String universityName;

    static {
        universityName = "Global Tech University";
        totalStudents = 0;
        System.out.println("Static Block Executed");
        System.out.println("University Name gtu: " + universityName);
    }

        {
        System.out.println("Instance Block Executed");
    }

   
    University() {
        totalStudents++;
        System.out.println("Constructor Executed");
    }

  
    static int getTotalStudents() {
        return totalStudents;
    }

   
    public static void main(String[] args) {

        System.out.println("Main Method Started");

        University s1 = new University();
        System.out.println("Total Students: " + University.getTotalStudents());

        University s2 = new University();
        System.out.println("Total Students: " + University.getTotalStudents());
    }
}