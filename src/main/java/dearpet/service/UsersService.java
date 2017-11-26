package dearpet.service;

import dearpet.model.UsersEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("usersService")
public interface UsersService {
    public UsersEntity findByUsername(String username);
    public void saveUseronUpdate(UsersEntity useron);
//    public OwnerEntity findOwnerByUsername(String username);
//    public RenterEntity findRenterByUsername(String username);
   public void saveUser(UsersEntity user, String photopath);
   public List<UsersEntity> giveHome();
   public  ArrayList<UsersEntity> findAll();
//    public UsersEntity findByUsernamePassword(String username, String Password);
        public void updateUser(UsersEntity useron, UsersEntity user);
//    public Page<UsersEntity> findAllPageable(Pageable pageable);


}