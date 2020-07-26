package com.example.back.controller;

import com.example.back.common.Result;
import com.example.back.pojo.User;
import com.example.back.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;

@Controller
@RequestMapping("/api/user")
public class UserController {
    @Resource(name="userService")
    UserService userService;
    public UserService getUserService() {
        return userService;
    }
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("selectAllUser")
    @ResponseBody
    public JSONObject selectAllUser() {
        Result result=new Result();
        try {
            ArrayList<User> userlist=userService.selectAllUser();
            result.setCode(200);
            result.setMsg("查询成功");
            result.setData(userlist);
        }catch (Exception e) {
            result.setCode(500);
            result.setMsg("服务器出错");
            result.setData(e);
        }finally {
            JSONObject json=JSONObject.fromObject(result);
            System.out.println(json);
            return json;
        }
    }

    @RequestMapping("selectTheUser")
    @ResponseBody
    public JSONObject selectTheUser(@RequestParam("id" )int id) {
        Result result=new Result();
        try {
            User user=userService.selectTheUser(id);
            result.setCode(200);
            result.setMsg("查询成功");
            result.setData(user);
        }catch (Exception e) {
            result.setCode(500);
            result.setMsg("服务器出错");
            result.setData(e);
        }finally {
            JSONObject json=JSONObject.fromObject(result);
            System.out.println(json);
            return json;
        }
    }

    @RequestMapping("insertUser")
    @ResponseBody
    public JSONObject insertUser(User user) {
        Result result=new Result();
        try {
            userService.insertUser(user);
            result.setCode(200);
            result.setMsg("新增成功");
            result.setData(user);
        }catch (Exception e) {
            result.setCode(500);
            result.setMsg("服务器出错");
            result.setData(e);
        }finally {
            JSONObject json=JSONObject.fromObject(result);
            return json;
        }
    }

    @RequestMapping("deleteUser")
    @ResponseBody
    public JSONObject deleteUser(@RequestParam("id") int id) {
        Result result=new Result();
        try {
            userService.deleteUser(id);
            result.setCode(200);
            result.setMsg("删除成功");
            result.setData(id);
        }catch (Exception e) {
            result.setCode(500);
            result.setMsg("服务器出错");
            result.setData(e);
        }finally {
            JSONObject json=JSONObject.fromObject(result);
            return json;
        }
    }

    @RequestMapping("updateUser")
    @ResponseBody
    public JSONObject updateUser(User user) {
        Result result=new Result();
        try {
            userService.updateUser(user);
            result.setCode(200);
            result.setMsg("编辑成功");
            result.setData(user);
        }catch (Exception e) {
            result.setCode(500);
            result.setMsg("服务器出错");
            result.setData(e);
        }finally {
            JSONObject json=JSONObject.fromObject(result);
            return json;
        }
    }
}
