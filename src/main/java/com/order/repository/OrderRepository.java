package com.order.repository;

import com.order.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Organization, Long> {}
