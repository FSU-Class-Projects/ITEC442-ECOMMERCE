package edu.frostburg.itec442.ecommerce.repository;

import edu.frostburg.itec442.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
