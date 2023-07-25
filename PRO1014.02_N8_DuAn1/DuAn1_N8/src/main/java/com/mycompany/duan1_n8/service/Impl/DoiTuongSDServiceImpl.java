/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duan1_n8.service.Impl;

import com.mycompany.duan1_n8.entity.DoiTuongSD;
import com.mycompany.duan1_n8.repository.DoiTuongSDRepository;
import com.mycompany.duan1_n8.service.DoiTuongSDService;
import java.util.List;

/**
 *
 * @author fpt
 */
public class DoiTuongSDServiceImpl implements DoiTuongSDService {

    private DoiTuongSDRepository doiTuongSDRepository = new DoiTuongSDRepository();

    public DoiTuongSDServiceImpl() {

    }

    @Override
    public List<DoiTuongSD> getAll() {
        return doiTuongSDRepository.getAll();
    }

    @Override
    public String add(DoiTuongSD doiTuongSD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String Update(DoiTuongSD doiTuongSD, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
