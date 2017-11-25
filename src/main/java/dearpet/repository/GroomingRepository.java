package dearpet.repository;

import dearpet.model.Grooming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Arianna on 25/11/2017.
 */
@Repository("groomingRepository")
public interface GroomingRepository extends JpaRepository<Grooming,Long>{

}
