 class Patient {
    String id;
    int age;
    double bloodValues;

    // patientInit(){
    //     id = "0";
    //     age = 0;
    //     bloodValues = 0;
    
    Patient(String idIN, int ageIN, double bloodIN){
        id = idIN;
        age = ageIN;
        bloodValues = bloodIN;
    }

    Patient(String idIN){
        id = idIN;
        age = 0;
        bloodValues = 0;
    }

    Patient(int ageIN){
        id  = "0";
        age = ageIN;
        bloodValues = 0;
    }
    
    Patient(double bloodIN){
        id  = "0";
        age = 0; 
        bloodValues = bloodIN;
    }

}

// void printData(Patient obj){
//     System.out.println("The data is ");
//     System.out.println("ID:"+ obj.id + "AGE: " + obj.age + "BLOOD VALUES:"+ obj.bloodValues);
// }


public class PatientDetails {
    public static void main(String[] args) {
        System.out.println("Patient details ");
        Patient p1 = new Patient("200",20,1.69);
        Patient p2 = new Patient("201");
        Patient p3 = new Patient(21);
        Patient p4 = new  Patient(1.69);
        // printData(p1);
        // printData(p2);
        // printData(p3);
        // printData(p4);
        System.out.println("ID:"+ p1.id + "AGE: " + p1.age + "BLOOD VALUES:"+ p1.bloodValues);
        System.out.println("ID:"+ p2.id + "AGE: " + p2.age + "BLOOD VALUES:"+ p2.bloodValues);
        System.out.println("ID:"+ p3.id + "AGE: " + p3.age + "BLOOD VALUES:"+ p3.bloodValues);
        System.out.println("ID:"+ p4.id + "AGE: " + p4.age + "BLOOD VALUES:"+ p4.bloodValues);

        
        
        
    }
}
