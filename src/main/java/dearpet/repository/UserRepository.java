package dearpet.repository;

import dearpet.model.UsersEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by Arianna on 23/8/2017.
 */
@Repository("userRepository")
public interface UserRepository extends PagingAndSortingRepository<UsersEntity,String>{
    UsersEntity findByUsername(String username);

    ArrayList<UsersEntity> findAll();

    ArrayList<UsersEntity> findAllByHost(int host);
}
