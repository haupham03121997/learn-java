package servlet.services;

import servlet.Models.UserModel;
import servlet.responsitory.UserRepository;

import java.util.List;

public class LoginService {

    private UserRepository userRepository = new UserRepository();
   public boolean checkLogin (String email , String password) {
       List<UserModel> listUserModel = userRepository.findByEmailAndPassword(email , password);
       return listUserModel.size() > 0;
   }


}
