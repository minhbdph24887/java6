package com.giap.shopoline.services;

import com.giap.shopoline.dao.AnhDao;
import com.giap.shopoline.models.TblAnhEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnhService {
    @Autowired
    private static AnhDao dao;

    public AnhService() {
        dao = new AnhDao();
    }

    public void persist(TblAnhEntity entity) {
        dao.openCurrentSessionwithTransaction();
        dao.persist(entity);
        dao.closeCurrentSessionwithTransaction();
    }

    public void update(TblAnhEntity entity) {
        dao.openCurrentSessionwithTransaction();
        dao.update(entity);
        dao.closeCurrentSessionwithTransaction();
    }


    public TblAnhEntity findById(String id) {
        dao.openCurrentSession();
        TblAnhEntity TblAnhEntity = dao.findById(id);
        dao.closeCurrentSession();
        return TblAnhEntity;
    }

    public void delete(String id) {
        dao.openCurrentSessionwithTransaction();
        TblAnhEntity TblAnhEntity = dao.findById(id);
        dao.delete(TblAnhEntity);
        dao.closeCurrentSessionwithTransaction();
    }

    public List<TblAnhEntity> findAll() {
        dao.openCurrentSession();
        List<TblAnhEntity> TblAnhEntitys = dao.findAll();
        dao.closeCurrentSession();
        return TblAnhEntitys;
    }

    public void deleteAll() {
        dao.openCurrentSessionwithTransaction();
        dao.deleteAll();
        dao.closeCurrentSessionwithTransaction();
    }

    public AnhDao Anhdao() {
        return dao;
    }


}
