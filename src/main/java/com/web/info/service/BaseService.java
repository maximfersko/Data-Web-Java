package com.web.info.service;

import com.web.info.model.entity.BaseEntity;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class BaseService<C extends BaseEntity<?>, T, R extends JpaRepository<C, T>> {
    protected final R baseRepository;
    @Autowired
    public BaseService(R baseRepository) {
        this.baseRepository = baseRepository;
    }

    public List<C> findAll() {
        return baseRepository.findAll();
    }

    public void save(C elm) {
        baseRepository.save(elm);
    }

    @Transactional
    public void update(C updElm) {
        baseRepository.saveAndFlush(updElm);
    }

    @Transactional
    public void delete(C elm) {
        baseRepository.delete(elm);
    }
}
