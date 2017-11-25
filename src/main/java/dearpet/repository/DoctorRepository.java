package dearpet.repository;

import dearpet.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Arianna on 25/11/2017.
 */
@Repository("doctorRepository")
public interface DoctorRepository extends JpaRepository<Doctor,Long> {

}
