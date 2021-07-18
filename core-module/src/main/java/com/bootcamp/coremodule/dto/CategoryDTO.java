package com.bootcamp.coremodule.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//@JsonFilter(value = "responseDTOFilter")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryDTO extends BaseDomainDTO {
    @NotEmpty(message = "Category Name is required")
    @Size(min=3,max = 20,message = "category name length should be between 3 to 20")
    private String name;

    private Long parentId;

    @JsonIgnore
    Set<CategoryMetaDataFieldValuesDTO> metaDataValuesSet = new HashSet<>();

    @JsonIgnore
    private List<ProductDTO> productList;

    public CategoryDTO() {
    }




    public Set<CategoryMetaDataFieldValuesDTO> getMetaDataValuesSet() {
        return metaDataValuesSet;
    }

    public void setMetaDataValuesSet(Set<CategoryMetaDataFieldValuesDTO> inputSet) {
        if (inputSet != null) {
            for (CategoryMetaDataFieldValuesDTO value : inputSet) {
                value.setCategory(this);
                metaDataValuesSet.add(value);
            }
        }
    }

    public List<ProductDTO> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductDTO> products) {
        if (products != null) {
            if (productList == null) {
                productList = new ArrayList<>();
            }
            for (ProductDTO product : products) {
                product.setCategory(this);
                productList.add(product);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
