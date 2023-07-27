public class hospital {
    public static void main(String[] args) {
        System.out.println("DOCTOR DETAILS");
        System.out.println("_____________________");
        doctor obj = new doctor(10, "Vivek");
        obj.display();
        System.out.println();
        System.out.println("SURGEON DETAILS");
        System.out.println("_____________________");
        surgeon obj1 = new surgeon(10, "Avinash", "Cardiologist");
        obj1.display();
        System.out.println();
        System.out.println("NURSE DETAILS");
        System.out.println("_____________________");
        nurse obj2 = new nurse(8, "Prachi", "OT", 10);
        obj2.display();

    }
}

class doctor {
    int experience;
    String name;

    doctor(int experience, String name) {
        this.experience = experience;
        this.name = name;
    }

    void display() {
        System.out.println("Name :" + name);
        System.out.println("Experience :" + experience);
    }

}

class surgeon extends doctor {
    String specializtion;

    surgeon(int experience, String name, String specialization) {
        super(experience, name);
        this.specializtion = specialization;

    }

    void display() {
        super.display();
        System.out.println("Specializtion :" + specializtion);
    }
}

class nurse extends doctor {
    int no_of_patients;

    nurse(int experience, String name, String specialization, int no_of_patients) {
        super(experience, name);
        this.no_of_patients = no_of_patients;
    }

    void display() {
        super.display();
        System.out.println("No of Patient :" + no_of_patients);
    }
}
// //
//class Doctor {
//     private int experience;
//     private String name;

//     Doctor(int experience, String name) {
//         this.experience = experience;
//         this.name = name;
//     }

//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Experience: " + experience);
//     }
// }

// class Surgeon extends Doctor {
//     private String specialization;

//     Surgeon(int experience, String name, String specialization) {
//         super(experience, name);
//         this.specialization = specialization;
//     }

//     @Override
//     void display() {
//         super.display();
//         System.out.println("Specialization: " + specialization);
//     }

//     void performSurgery() {
//         System.out.println("Performing surgery...");
//     }
// }

// class Nurse extends Doctor {
//     private int no_of_patients;

//     Nurse(int experience, String name, int no_of_patients) {
//         super(experience, name);
//         this.no_of_patients = no_of_patients;
//     }

//     @Override
//     void display() {
//         super.display();
//         System.out.println("No of Patients: " + no_of_patients);
//     }

//     void provideCare() {
//         System.out.println("Providing care to patients...");
//     }
// }

// public class hospital {
//     public static void main(String[] args) {
//         System.out.println("DOCTOR DETAILS");
//         System.out.println("_____________________");
//         Doctor doctor = new Doctor(10, "Vivek");
//         doctor.display();
//         System.out.println();

//         System.out.println("SURGEON DETAILS");
//         System.out.println("_____________________");
//         Surgeon surgeon = new Surgeon(15, "Avinash", "Cardiologist");
//         surgeon.display();
//         surgeon.performSurgery();
//         System.out.println();

//         System.out.println("NURSE DETAILS");
//         System.out.println("_____________________");
//         Nurse nurse = new Nurse(8, "Prachi", 10);
//         nurse.display();
//         nurse.provideCare();
//     }
// }
