package com.saas.application.mastertenant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saas.application.mastertenant.entity.MasterTenant;

@Repository
public interface MasterTenantRepository extends JpaRepository<MasterTenant, Integer> {
    MasterTenant findByTenantClientId(Integer clientId);
}
