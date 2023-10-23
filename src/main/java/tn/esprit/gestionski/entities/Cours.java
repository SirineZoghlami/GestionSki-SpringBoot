package tn.esprit.gestionski.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private Support support;

    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;


      private float prix;
      private int creneau;
      @ManyToOne
    private Moniteur moniteur;
      @OneToMany(mappedBy = "cours")
    private Set<Inscription> inscription;
}
