package com.bootcamp.coremodule.transformers;


import com.bootcamp.coremodule.dto.BaseDomainDTO;
import com.bootcamp.coremodule.entities.BaseDomain;

public interface EntityDTOTransformer<T extends BaseDomainDTO,T1 extends BaseDomain> {
    T1 fromDTO(T baseDomain);
    T toDTO(T1 baseDomainDTO);
}
