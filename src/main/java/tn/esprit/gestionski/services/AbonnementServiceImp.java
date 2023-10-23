package tn.esprit.gestionski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionski.entities.Abonnement;
import tn.esprit.gestionski.repositories.AbonnementRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class AbonnementServiceImp implements IAbonnement{
    private AbonnementRepository abonnementRepository;

    @Override
    public Abonnement AddAbonnemnt(Abonnement a) {
        return abonnementRepository.save(a);
    }

    @Override
    public Abonnement UpdateAbonnemnt(Abonnement a) {
        return abonnementRepository.save(a);
    }

    @Override
    public List<Abonnement> FindAllAbonnemnt() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement FindAbonnementByID(long numAbon) {
        return abonnementRepository.findById(numAbon).orElse(null);
    }

    @Override
    public void DeleteAbonnemnt(long numAbon) {
         abonnementRepository.deleteById(numAbon);

    }
}
