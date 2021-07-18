package com.bootcamp.coremodule.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryMetaFieldDTO extends BaseDomainDTO {

    @NotNull(message = "Filed Name is required")
    @Size(min = 2,max = 15, message = "Please provide the name of length min 2 and max 15")
    private String name;

    List<CategoryMetaDataFieldValuesDTO> categoryMetaDataFieldValues = new ArrayList<>();


    public CategoryMetaFieldDTO() {
    }

    public CategoryMetaFieldDTO(long id) {
        this.setId(id);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CategoryMetaDataFieldValuesDTO> getCategoryMetaDataFieldValues() {
        return categoryMetaDataFieldValues;
    }

    public void setCategoryMetaDataFieldValues(List<CategoryMetaDataFieldValuesDTO> categoryMetaDataFieldValues) {
        this.categoryMetaDataFieldValues = categoryMetaDataFieldValues;
    }
}