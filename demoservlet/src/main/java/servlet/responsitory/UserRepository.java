package servlet.responsitory;

import servlet.Models.UserModel;
import servlet.config.MysqlConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<UserModel> findByEmailAndPassword (String email , String password) {
        Connection connection = null;
        List<UserModel>  userModelList = new ArrayList<>();
        try{
            String sql = "SELECT  * from users u  WHERE u.email = ? and u.password = ?";
           PreparedStatement statement =  MysqlConfig.getConnection().prepareStatement(sql);
           statement.setString(1 , email);
           statement.setString(2 , password);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                UserModel userModel = new UserModel();

                //Lấy giá trị của id
                userModel.setId(resultSet.getInt("id"));
                userModel.setEmail(resultSet.getString("email"));
                userModel.setFullname(resultSet.getString("fullname"));
                userModel.setRole_id(resultSet.getInt("role_id"));

                userModelList.add(userModel);
            }

        }catch (Exception e){
            System.out.println("Error findByEmailAndPassword" + e);
        }finally {
            if(connection != null){
                try {
                    connection.close();
                }catch (Exception e){
                    System.out.println("Lõi đóng kết nối " + e.getMessage());
                }
            }
        }
        return  userModelList;
    }

    public List<UserModel> getAllUsers () {
        Connection connection = null;
        List<UserModel>  userModelList = new ArrayList<>();

        try {
            String sql = "SELECT  * from users";
            PreparedStatement statement = MysqlConfig.getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                UserModel userModel = new UserModel();

                //Lấy giá trị của id
                userModel.setId(resultSet.getInt("id"));
                userModel.setEmail(resultSet.getString("email"));
                userModel.setFullname(resultSet.getString("fullname"));
                userModel.setAvatar(resultSet.getString("avatar"));
                userModel.setRole_id(resultSet.getInt("role_id"));

                userModelList.add(userModel);
            }

        }catch (Exception e){

        }finally {
            if(connection != null){
                try {
                    connection.close();
                }catch (Exception e){
                    System.out.println("Lõi đóng kết nối " + e.getMessage());
                }
            }
        }
        return  userModelList;
    }

    public boolean isInertUser(String fullname , String email , String phone , String role_id, String password) {
        Connection connection = null;
        boolean issSuccess = false;
        try{
            String sql = "INSERT INTO users (email, password , fullname, phone , role_id) values(?, ? , ? , ? ,?)";

            PreparedStatement statement = MysqlConfig.getConnection().prepareStatement(sql);
            statement.setString(1 ,email);
            statement.setString(2 , password);
            statement.setString(3 , fullname);
            statement.setString(4 , phone);
            statement.setString(5,  role_id);
              issSuccess =  statement.executeUpdate() > 0;
        }catch (Exception e){
            System.out.println("Error insert user" + e);
        }finally {
            if(connection != null){
                try {
                    connection.close();
                }catch (Exception e){
                    System.out.println("Lõi đóng kết nối " + e.getMessage());
                }
            }
        }
        return issSuccess;
    }

    public boolean  isDeleted(int userId){
        Connection connection = null;
        boolean isDeleted = false;
        try{
            String sql = "DELETE from users where id = ?";
            PreparedStatement statement = MysqlConfig.getConnection().prepareStatement(sql);
            statement.setInt(1 , userId);
            isDeleted = statement.executeUpdate() > 0;
        }catch (Exception e){
            System.out.println("Delete user failure" + e);
        }finally {
            if(connection != null){
                try {
                    connection.close();
                }catch (Exception e){
                    System.out.println("Lõi đóng kết nối " + e.getMessage());
                }
            }
        }
        return  isDeleted;
    }
}
