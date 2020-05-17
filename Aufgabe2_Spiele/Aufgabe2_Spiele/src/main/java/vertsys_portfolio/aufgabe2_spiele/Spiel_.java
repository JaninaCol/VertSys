package vertsys_portfolio.aufgabe2_spiele;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

/**
 * Persistence Entity für ein Spiel
 */
@Entity
@Data
public class Spiel_ implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;

    //@Column(length = 64)
    //@Size(min = 1, max = 64, message = "Der Name muss zwischen einem und 64 Zeichen lang sein.")
    @NotNull(message = "Der Name darf nicht leer sein.")
    private String titel = "";

   //@Column(length = 7)
   //@Size(min = 1, max = 7, message = "Die Anzahl Spieler muss zwischen einem und sieben Zeichen lang sein.")
    @NotNull(message = "Die Anzahl der Spieler darf nicht leer sein.")
    private String anzahl_spieler = "";

   // @Column(length = 200)
   // @Size(min = 1, max = 200, message = "Das Material muss zwischen einem und 200 Zeichen lang sein.")
   // @NotNull(message = "Das Material darf nicht leer sein.")
   private String material = "";

   // @Column(length = 500)
   // @Size(min = 1, max = 500, message = "Die Anleitung muss zwischen einem und 500 Zeichen lang sein.")
    @NotNull(message = "Die Anleitung darf nicht leer sein.")
    private String anleitung = "";



    // Rückwärtsbeziehung von einem Spiel zu den dazugehörigen Kommentaren
    @OneToMany(mappedBy="spiel")
    private List<Kommentar> kommentare = new ArrayList<>();

    /**
     * Standard-Konstruktor
     */
    public Spiel_() {
    }

}
