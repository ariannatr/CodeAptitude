package dearpet.repository;

import dearpet.model.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.jpa.repository.Query;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Σταυρίνα on 26/11/2017.
 */
@Repository("petRepository")
public interface PetRepository extends JpaRepository<PetEntity,Integer> {
    PetEntity findById(Integer id);
    ArrayList<PetEntity> findAllByAskforhome(int askforhome);
}
