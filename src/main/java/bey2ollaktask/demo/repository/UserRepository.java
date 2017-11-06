package bey2ollaktask.demo.repository;

import bey2ollaktask.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByUserNameAndPassword(String userName, String password);
}
