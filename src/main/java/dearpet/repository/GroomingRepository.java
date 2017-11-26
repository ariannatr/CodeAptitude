package dearpet.repository;

import dearpet.model.Doctor;
import dearpet.model.Grooming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Arianna on 25/11/2017.
 */
@Repository("groomingRepository")
public interface GroomingRepository extends JpaRepository<Grooming,Integer>{
    List<Grooming> findAllByTown(String town);
}
