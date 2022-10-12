package com.cg.repository;

import com.cg.model.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;

public interface TransferRepository extends JpaRepository<Transfer, Long> {
    @Query("SELECT SUM(t.feesAmount) FROM Transfer AS t")
    BigDecimal getSumFeesAmount();
}