package tn.esprit.gestionski.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste;
    private String nomPiste;
    private int longeur;
    private int pente;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;

    @ManyToMany
    private List <Skieur> skieur;

}
