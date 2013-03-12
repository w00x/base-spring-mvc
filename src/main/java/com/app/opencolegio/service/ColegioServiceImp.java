/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.opencolegio.service;

import com.app.opencolegio.domain.Colegios;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author fernando
 */
@Service
public class ColegioServiceImp implements ColegioService {
    @Autowired
    private SessionFactory sessionFactory;
    
    @Transactional
    public List<Colegios> getListColegio() {
        return sessionFactory.getCurrentSession().createQuery("from Colegios").list();
    }
    
}