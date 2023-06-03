package servlet.services;

import servlet.Models.UserModel;
import servlet.responsitory.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository userRepository = new UserRepository();
    public  List<UserModel> getAllUser(){
        return userRepository.getAllUsers();
    }

    public  boolean isInsertUser( String fullname , String email , String phone , String role_id, String password){
        return  userRepository.isInertUser(fullname, email , phone , role_id, password);
    }

    public  boolean isDeletedUser (int userId){
        return  userRepository.isDeleted(userId);
    }
}
