package com.bootcamp.coremodule.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryResponseDTO {

    @Size(min=3,max = 20,message = "category name length should be between 3 to 20")
    private String name;
    private long parentId;
    private List<CategoryDTO> parentCategoryList;
    private  List<CategoryDTO> childCategoryList;

    private List<CategoryMetadataFieldResponse> fields=new ArrayList<>();

    public List<CategoryMetadataFieldResponse> getFields() {
        return fields;
    }

    public void setFields(List<CategoryMetadataFieldResponse> fields) {
        this.fields = fields;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CategoryDTO> getParentCategoryList() {
        return parentCategoryList;
    }

    public void setParentCategoryList(List<CategoryDTO> parentCategoryList) {
        this.parentCategoryList = parentCategoryList;
    }

    public List<CategoryDTO> getChildCategoryList() {
        return childCategoryList;
    }

    public void setChildCategoryList(List<CategoryDTO> childCategoryList) {
        this.childCategoryList = childCategoryList;
    }
}
