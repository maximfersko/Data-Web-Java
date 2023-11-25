package com.web.info.repositories;

import com.web.info.model.entity.BaseEntity;
import com.web.info.model.entity.P2P;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<C extends BaseEntity, T> extends JpaRepository<C, T> {
}
