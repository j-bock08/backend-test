package services;

import entities.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import repositories.UserRepository;

import java.util.List;

@ApplicationScoped
public class UserService {

    @Inject
    UserRepository userRepository;

    @Transactional
    public List<User> getAllUsers(){
        return userRepository.getAllUser();
    }

    @Transactional
    public User getUserById(int id){
        return userRepository.getUserById(id);
    }
}