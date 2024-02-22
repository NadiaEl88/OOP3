import java.util.ArrayList;
import java.time.LocalDate;

    public class Krankenkasse {
        private int kassennummer;
        private String kassenname;
        private ArrayList<Patient> patienten;

        public Krankenkasse(int kassennummer, String kassenname) {
            this.kassennummer = kassennummer;
            this.kassenname = kassenname;
            this.patienten = new ArrayList<>();
        }

        public void addPatient(Patient patient) {
            patienten.add(patient);
        }
    }

