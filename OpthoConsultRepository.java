package com.op.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.op.main.model.OpthoConsult;

@Repository
public interface OpthoConsultRepository extends JpaRepository<OpthoConsult, Integer> {

}
