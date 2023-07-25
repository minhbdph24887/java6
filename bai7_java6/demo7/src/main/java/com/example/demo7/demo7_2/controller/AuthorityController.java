package com.example.demo7.demo7_2.controller;

import com.example.demo7.demo7_2.model.Authority;
import com.example.demo7.demo7_2.model.Account;
import com.example.demo7.demo7_2.model.Role;
import com.example.demo7.demo7_2.service.AuthorityService;
import com.example.demo7.demo7_2.service.AccountService;
import com.example.demo7.demo7_2.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AuthorityController {
    @Autowired
    AuthorityService authorityService;

    @Autowired
    AccountService accountService;

    @Autowired
    RoleService roleService;

    @GetMapping("/authority/getAll")
    public Map<String, Object> getAllData() {
        Map<String, Object> data = new HashMap<>();
        List<Authority> listPhanQuyen = authorityService.getAllAuthoritys();
        data.put("getAuthority", listPhanQuyen);
        List<Account> listTaiKhoan = accountService.getAllAccounts();
        data.put("getAccount", listTaiKhoan);
        List<Role> listVaiTro = roleService.getAllRoles();
        data.put("getRole", listVaiTro);
        return data;
    }

    @DeleteMapping("/authority/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        authorityService.delete(id);
    }

    @PostMapping("/authority/update")
    public Authority create(@RequestBody Authority authority){
        return authorityService.create(authority);
    }
}
