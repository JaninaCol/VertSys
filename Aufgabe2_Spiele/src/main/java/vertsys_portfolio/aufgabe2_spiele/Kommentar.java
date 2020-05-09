package vertsys_portfolio.aufgabe2_spiele;

 import java.io.Serializable;
 import java.time.LocalTime;
 import java.date.datetime;
 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType;
 import javax.persistence.Id;
 import javax.persistence.ManyToOne;
 import javax.validation.constraints.NotNull;
 import javax.validation.constraints.Size;
 import lombok.Data;

/**
 * Persistence Entity für einen Kommentar.
 */
@Entity
@Data
public class Kommentar implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;

    @ManyToOne
    private Spiel spiel;

    @Column(length = 64)
    @Size(min = 1, max = 64, message = "Der Benutzer muss zwischen einem und 64 Zeichen lang sein.")
    @NotNull(message = "Der Benutzer darf nicht leer sein.")
    private String benutzer = "";

    @NotNull(message = "Das Datum darf nicht leer sein.")
    private LocalTime datum = DateTime.now();

    @Column(length = 500)
    @Size(min = 1, max = 500, message = "Der Kommentar muss zwischen einem und 500 Zeichen lang sein.")
    @NotNull(message = "Der Kommentar darf nicht leer sein.")
    private String kommentar = "";
}