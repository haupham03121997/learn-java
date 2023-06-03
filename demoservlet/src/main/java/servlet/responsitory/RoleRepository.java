package servlet.responsitory;

import servlet.Models.RoleModel;
import servlet.Models.UserModel;
import servlet.config.MysqlConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RoleRepository {
    public List<RoleModel> getAll() {
        Connection connection = null;
        List<RoleModel> roleModelList = new ArrayList<>();
        try{
            String sql = "SELECT * from roles";
            PreparedStatement statement = MysqlConfig.getConnection().prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
               RoleModel roleModel = new RoleModel();

                //Lấy giá trị của id
                roleModel.setId(resultSet.getInt("id"));
                roleModel.setName(resultSet.getString("name"));
                roleModel.setDescription(resultSet.getString("description"));

                roleModelList.add(roleModel);
            }
        }catch (Exception e){
            System.out.println("Get role failure " + e);
        } finally {
            if(connection != null){
                try {
                    connection.close();
                }catch (Exception e){
                    System.out.println("Lõi đóng kết nối " + e.getMessage());
                }
            }
        }
        return  roleModelList;
    }
}
