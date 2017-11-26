package dearpet.repository;

import dearpet.model.UsersEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<UsersEntity,String> {
    UsersEntity findByUsername(String username);

    ArrayList<UsersEntity> findAll();
    ArrayList<UsersEntity> findAllByAskforhome(Integer ask);
    ArrayList<UsersEntity> findAllByHost(Integer host);
}
