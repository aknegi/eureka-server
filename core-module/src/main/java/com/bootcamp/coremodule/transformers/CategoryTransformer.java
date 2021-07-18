package com.bootcamp.coremodule.transformers;

import com.bootcamp.coremodule.dto.CategoryDTO;
import com.bootcamp.coremodule.entities.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryTransformer implements EntityDTOTransformer<CategoryDTO, Category>{
    @Override
    public Category fromDTO(CategoryDTO baseDomain) {
        return null;
    }

    @Override
    public CategoryDTO toDTO(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        categoryDTO.setParentId(category.getParentId());
        return categoryDTO;
    }
}
