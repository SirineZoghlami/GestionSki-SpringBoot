package tn.esprit.gestionski.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionski.entities.Abonnement;
import tn.esprit.gestionski.services.IAbonnement;

import java.util.List;

@RestController
@AllArgsConstructor
public class AbonnementController {

    private IAbonnement iabonnement;

    @PostMapping("/AddAbonnemnt")
    public Abonnement AddAbonnemnt(@RequestBody Abonnement a){
        return iabonnement.AddAbonnemnt(a);
    }
    @PatchMapping("/UpdateAbonnemnt")
    public Abonnement UpdateAbonnemnt(@RequestBody  Abonnement a){
        return iabonnement.UpdateAbonnemnt(a);
    }
    @GetMapping("/FindAllAbonnemnt")
    public List<Abonnement> FindAllAbonnemnt(){
        return iabonnement.FindAllAbonnemnt();
    }
    @GetMapping("/FinfAbonnmentById")
    public Abonnement FindAbonnementByID(@PathVariable long numAbon){
        return iabonnement.FindAbonnementByID(numAbon);
    }
    @DeleteMapping("/DeleteAbonnemnt")
    public void DeleteAbonnemnt(@PathVariable long numAbon){
         iabonnement.DeleteAbonnemnt(numAbon);

    }
}
