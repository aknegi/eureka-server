package com.bootcamp.coremodule.dto;

import java.util.List;

public class SellerCategoryResponseDTO {
    String name;
    List<CategoryDTO> parentList;
    List<CategoryMetadataFieldResponse> fields;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CategoryDTO> getParentList() {
        return parentList;
    }

    public void setParentList(List<CategoryDTO> parentList) {
        this.parentList = parentList;
    }

    public List<CategoryMetadataFieldResponse> getFields() {
        return fields;
    }

    public void setFields(List<CategoryMetadataFieldResponse> fields) {
        this.fields = fields;
    }
}
