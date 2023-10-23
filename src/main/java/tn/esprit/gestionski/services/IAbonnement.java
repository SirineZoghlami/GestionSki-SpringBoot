package tn.esprit.gestionski.services;

import tn.esprit.gestionski.entities.Abonnement;

import java.util.List;

public interface IAbonnement {
    public Abonnement AddAbonnemnt(Abonnement a);
    public Abonnement UpdateAbonnemnt(Abonnement a);
    public List<Abonnement> FindAllAbonnemnt();
    public Abonnement FindAbonnementByID(long numAbon);
    public void DeleteAbonnemnt(long numAbon);





}
