package tn.esprit.gestionski.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.Set;
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkieur;
    private String nomS;
    private String prenomS;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String ville;

    @OneToOne
    private Abonnement abonnement;
    @ManyToMany(mappedBy = "skieur")
    private Set <Piste> pisteSet;

    @OneToMany(mappedBy = "skieur")
    private Set<Inscription> inscription;
}
