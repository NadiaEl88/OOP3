import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Krankenkasse krankenkasse = new Krankenkasse(1, "TK");
        Krankenkasse weitereKrankenkasse = new Krankenkasse(2, "AOK");

        Patient patient1 = new Patient("Max Mustermann", "Musterstraße 123", LocalDate.of(1990, 1, 1),
                "Max Mustermann", true);
        Patient patient2 = new Patient("Anna Schmidt", "Schmidtallee 456", LocalDate.of(1985, 5, 15),
                "Anna Schmidt", true);

        krankenkasse.addPatient(patient1);
        weitereKrankenkasse.addPatient(patient2);
    }
}

