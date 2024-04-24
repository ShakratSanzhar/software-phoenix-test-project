package com.shakratsanzhar.softwarephoenixproject.repository;

import com.shakratsanzhar.softwarephoenixproject.domain.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request,Long> {
}
