package dearpet.service;

import dearpet.model.UsersEntity;
import dearpet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

    @Qualifier("userRepository")
    @Autowired
    private UserRepository userRepository;


    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UsersEntity findByUsername(String username) {
        return userRepository.findByUsername(username);
        //return null;
    }
/*
    @Override
    public  ParentEntity findRenter(RenterPK renterPKPk){
        RenterEntity parent = renterRepository.findOne(renterPk);
        return parent;
    }

    @Override
    public OwnerEntity findProvider(OwnerPK ownerPk){
        OwnerEntity owner = ownerRepository.findOne(providerPk);
        return owner;
    }
*/

    @Override
    public void saveUser(UsersEntity user,String photopath) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        System.out.println("Creating user..." + user.getPassword());
        user.setPhoto(photopath);
        userRepository.save(user);
        System.out.println("Done.");
    }


  /*  @Override
    public Page<UsersEntity> findUsers(){
        return userRepository.findAll();
    }*/

    /*@Override
    public void saveUserProvider(UserEntity user, ProviderEntity provider) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        System.out.println("Creating user...");
        user.setType(2);

        //user.setProviderByUserId(provider);
        userRepository.save(user);
        System.out.println("Creating provider user...");
        System.out.println("Trying to add " + provider.getName() + " " + provider.getSurname() + " " + provider.getEmail());
        provider.setUser(user);
        providerRepository.save(provider);
        System.out.println("Done.");
    }*/


    @Override
    public void updateUser(UsersEntity useron,UsersEntity user){
        if(!user.getEmail().replaceAll(" ","").equals("")){
            useron.setEmail(user.getEmail());
        }
        if(!user.getName().replaceAll(" ","").equals(""))
        {
            useron.setName(user.getName());
        }
        if(!user.getSurname().replaceAll(" ","").equals(""))
        {
            useron.setSurname(user.getSurname());
        }

        if(!String.valueOf(user.getTelephone()).replaceAll(" ","").equals(""))
        {
            useron.setTelephone(user.getTelephone());
        }
        if(!user.getPassword().replaceAll(" ","").equals(""))
        {
            useron.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        }
        userRepository.save(useron);

    }

//    @Override
//    public Page<UsersEntity> findAllPageable(Pageable pageable){
//        return userRepository.findAll(pageable);
//    }
//
//    @Override
//    public Page<UsersEntity> findAllRenters(Pageable pageable)
//    {
//        return userRepository.findByType(2,3,pageable);
//    }
//
//    @Override
//    public Page<UsersEntity> findAllOwners(Pageable pageable)
//    {
//        return userRepository.findByType(1,3,pageable);
//    }
/*
    public List<RenterEntity> getRenters(){
        return renterRepository.findAll();
    }

    public List<OwnerEntity> getOwners(){
        return (List<OwnerEntity>) ownerRepository.findAll();
    }

   */


//    @Override
//    public void approveOwner(OwnerEntity ownerEntity)
//    {
//        ownerEntity.setApproval(1);
//        ownerRepository.save(ownerEntity);
//    }
//
//    @Override
//    public String getType(UsersEntity user)
//    {
//        int type=user.getType();
//        if(type==1)
//            return ("Renter");
//        else if(type==2)
//            return( "Owner");
//        else if(type==3)
//            return ("Owner and Renter");
//        else
//            return( "Admin");
//    }
//
//    @Override
//    public void uploadPhoto(UsersEntity useron,String photopath)
//    {
//        useron.setPhoto(photopath);
//        userRepository.save(useron);
//    }
//
//    @Override
//    public ArrayList<UsersEntity> findAll(){ return userRepository.findAll();}
//
//    @Override
//    public ArrayList<UsersEntity> findAllOwners()
//    {
//        return userRepository.findAllByType(1,3);
//    }
//
//    @Override
//    public ArrayList<UsersEntity> findAllRenters()
//    {
//        return userRepository.findAllByType(2,3);
//    }
//
//
//    @Override
//    public Boolean checkforRenterActivity(RenterEntity renterEntity)
//    {
//        if((renterEntity.getReservationsByUsersUsername().size()==0) || (renterEntity.getComments().size()==0))
//            return  true;
//        else
//            return false;
//    }
//
//    @Override
//    public ArrayList<RenterEntity> findAllRentersEntity()
//    {
//        return  renterRepository.findAll();
//    }
}
