package edu.frostburg.itec442.ecommerce.repository;

import edu.frostburg.itec442.ecommerce.model.Merchandise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchandiseRepository extends JpaRepository<Merchandise, String> {
}
