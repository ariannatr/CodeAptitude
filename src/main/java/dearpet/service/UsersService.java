package dearpet.service;

import dearpet.model.PetEntity;
import dearpet.model.UsersEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("usersService")
public interface UsersService {
    public UsersEntity findByUsername(String username);
//    public OwnerEntity findOwnerByUsername(String username);
//    public RenterEntity findRenterByUsername(String username);
   public void saveUser(UsersEntity user, String photopath);
   public List<UsersEntity> giveHome();
//    public UsersEntity findByUsernamePassword(String username, String Password);
        public void updateUser(UsersEntity useron, UsersEntity user);
//    public Page<UsersEntity> findAllPageable(Pageable pageable);
//    public Page<UsersEntity> findAllRenters(Pageable pageable);
//    public Page<UsersEntity> findAllOwners(Pageable pageable);
//    public Page<OwnerEntity> findAllnotApproved(Pageable pageable);
//    //public void updateUserProvider(ProviderEntity provideron,ProviderEntity provider,UserEntity useron,UserEntity user);
//     public void approveOwner(OwnerEntity ownerEntity);
//   public void uploadPhoto(UsersEntity useron, String photopath);
//    public String getType(UsersEntity user);
//    public ArrayList<UsersEntity> findAll();
//    public ArrayList<UsersEntity> findAllOwners();
//    public ArrayList<UsersEntity> findAllRenters();
//
//    public Boolean checkforRenterActivity(RenterEntity renterEntity);
//
//    public ArrayList<RenterEntity> findAllRentersEntity();

}