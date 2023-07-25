package com.example.demo7.demo7_2.service.impl;

import com.example.demo7.demo7_2.model.Role;
import com.example.demo7.demo7_2.repository.RoleRepository;
import com.example.demo7.demo7_2.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;
    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
