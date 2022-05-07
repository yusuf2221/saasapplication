package com.saas.application.mastertenant.service;

import com.saas.application.mastertenant.entity.MasterTenant;

public interface MasterTenantService {

    MasterTenant findByClientId(Integer clientId);
}
