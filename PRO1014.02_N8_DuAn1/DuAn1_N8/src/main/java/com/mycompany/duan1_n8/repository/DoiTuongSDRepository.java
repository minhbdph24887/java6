/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duan1_n8.repository;

import com.mycompany.duan1_n8.entity.DoiTuongSD;
import com.mycompany.duan1_n8.utilities.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author fpt
 */
public class DoiTuongSDRepository {

    public List<DoiTuongSD> getAll() {
        List<DoiTuongSD> list = new ArrayList<>();
        try ( Session session = HibernateUtil.getFACTORY().openSession();) {
            Query q = session.createQuery("FROM DoiTuongSuDung");
            list = q.getResultList();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return list;
    }
}
