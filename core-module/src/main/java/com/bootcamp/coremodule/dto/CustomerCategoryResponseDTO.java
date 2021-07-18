package com.bootcamp.coremodule.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerCategoryResponseDTO {
    private String name;
    private List<CategoryDTO> childCategoryList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CategoryDTO> getChildCategoryList() {
        return childCategoryList;
    }

    public void setChildCategoryList(List<CategoryDTO> childCategoryList) {
        this.childCategoryList = childCategoryList;
    }
}
