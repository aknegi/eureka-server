package com.bootcamp.coremodule.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryMetaDataFieldValuesDTO {


    CategoryDTO category;

    CategoryMetaFieldDTO categoryMetaField;

    List<String> values;


    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public CategoryMetaFieldDTO getCategoryMetaField() {
        return categoryMetaField;
    }

    public void setCategoryMetaField(CategoryMetaFieldDTO categoryMetaField) {
        this.categoryMetaField = categoryMetaField;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }
}

