package servlet.controller;

import servlet.Models.RoleModel;
import servlet.Models.UserModel;
import servlet.services.RoleService;
import servlet.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

@WebServlet(name = "userController" , urlPatterns = {"/user", "/user/add" , "/user/delete"})
public class UserController extends HttpServlet {
    private UserService userService  = new UserService();
    private  RoleService roleService = new RoleService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String path =  req.getServletPath();
        switch (path) {
            case "/user":
                getAllUser(req , resp);
               break;
            case "/user/add":
                addUser(req , resp);
                break;
            case  "/user/delete":
                deleteUser(req , resp);
            break;
            default: break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path =  req.getServletPath();
        switch (path){
            case "/user":
                break;
            case "/user/add":
                addUser( req , resp);
                break;
            default: break;
        }
    }

    private void getAllUser(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        List<UserModel> list = userService.getAllUser();
        System.out.println("page user");
        req.setAttribute("listUsers" , list);
        req.getRequestDispatcher("/user-table.jsp").forward(req, resp);
    }

    private void addUser(  HttpServletRequest req ,HttpServletResponse resp) throws ServletException, IOException {

        String method = req.getMethod();
        System.out.println(method);
        if(method.toLowerCase().equals("post")){
            String fullname = req.getParameter("fullname");

            String email = req.getParameter("email");
            String password = req.getParameter("password");
            String phone = req.getParameter("phone");
            String roleId = req.getParameter("role_id");
            System.out.println("FULL NAME" + fullname );
            boolean isInsertSuccess =   userService.isInsertUser(fullname , email,phone , roleId , password);
            if (isInsertSuccess){
                String contextPath = req.getContextPath();
                System.out.println("contextPath" + contextPath);
                resp.sendRedirect(contextPath + "/user");
            }else{
                PrintWriter printWriter = resp.getWriter();
                printWriter.write("Add user FAilure");
                printWriter.close();
            }
        }else{
            List<RoleModel> listRoles = roleService.getAll();
            req.setAttribute("listRoles" , listRoles);
        }

        req.getRequestDispatcher("/user-add.jsp").forward(req, resp);
    }

    public void deleteUser (HttpServletRequest req ,HttpServletResponse resp) throws IOException {
        int userId  = Integer.parseInt(req.getParameter("id"));
        boolean isDeleted = userService.isDeletedUser(userId);
        System.out.println("isdeleted"  + isDeleted);
        if (isDeleted) {
            String contextPath = req.getContextPath();
            resp.sendRedirect(contextPath + "/user");
        }else{
            PrintWriter printWriter = resp.getWriter();
            printWriter.write("Delete user failure");
            printWriter.close();
        }
    }


}

