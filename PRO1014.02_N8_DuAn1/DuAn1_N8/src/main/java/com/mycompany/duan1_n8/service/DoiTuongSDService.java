/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duan1_n8.service;

import com.mycompany.duan1_n8.entity.DoiTuongSD;
import java.util.List;

/**
 *
 * @author fpt
 */
public interface DoiTuongSDService {
        List<DoiTuongSD> getAll();
    
    String add(DoiTuongSD doiTuongSD);
    
    String delete(Long id);
    
    String Update(DoiTuongSD doiTuongSD ,Long id);
    
}
