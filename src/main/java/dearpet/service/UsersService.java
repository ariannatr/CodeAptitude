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

   public void saveUser(UsersEntity user, String photopath);
   public ArrayList<UsersEntity> giveHome();
    public ArrayList<UsersEntity> lookHome();
   public  ArrayList<UsersEntity> findAll();
    public List<UsersEntity> lostpets();
        public void updateUser(UsersEntity useron, UsersEntity user);



}