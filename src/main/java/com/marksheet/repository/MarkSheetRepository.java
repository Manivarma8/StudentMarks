package com.marksheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marksheet.entity.MarkSheet;

public interface MarkSheetRepository extends JpaRepository<MarkSheet, Long>{

}
