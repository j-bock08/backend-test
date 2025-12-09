package repositories;

import entities.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.util.List;

@ApplicationScoped
public class UserRepository {

    @Inject
    EntityManager em;

    public List<User> getAllUser(){
        return em.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    public User getUserById(int id){
        return em.createQuery("SELECT u FROM User u WHERE id = :id", User.class).getSingleResult();
    }

}
