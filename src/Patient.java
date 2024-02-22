
import java.time.LocalDate;
public class Patient {
    private static int nextPatientennummer = 1;
    private int patientennummer;
    private String patientenname;
    private String adresse;
    private LocalDate geburtsdatum;
    private boolean versichertenKarteVorgelegt;
    private String versichertenname;

    Patient(String patientenname, String adresse, LocalDate geburtsdatum,
            String versichertenname, boolean versichertenKarteVorgelegt) {
        this.patientennummer = nextPatientennummer++;
        this.patientenname = patientenname;
        this.geburtsdatum = geburtsdatum;
        this.adresse = adresse;
        this.versichertenname = versichertenname;
        this.versichertenKarteVorgelegt = versichertenKarteVorgelegt;
    }

    public int getPatientennummer() {
        return patientennummer;
    }

    public String getPatientenname() {
        return patientenname;
    }

    public void setPatientenname(String patientenname) {
        this.patientenname = patientenname;
    }


}


