package servlet.services;

import servlet.Models.RoleModel;
import servlet.responsitory.RoleRepository;

import java.util.List;

public class RoleService {
    private RoleRepository roleRepository = new RoleRepository();

    public List<RoleModel> getAll(){
        return  roleRepository.getAll();
    }

}
