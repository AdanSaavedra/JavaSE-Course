import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {

//        showMenu();

        Doctor myDoctor = new Doctor("Adan Salgado", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10pm");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate()+ " "+ aA.getTime());
        }



        Patient patient = new Patient("Alejandra","alejandra@mail.com");

        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());


    }
}