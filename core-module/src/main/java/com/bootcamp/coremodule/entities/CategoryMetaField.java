package com.bootcamp.coremodule.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CategoryMetaField extends BaseDomain{

    @Column(unique = true)
    @NotEmpty
    private String name;

    @OneToMany(mappedBy = "categoryMetaField", cascade = CascadeType.ALL)
    Set<CategoryMetaDataFieldValues> categoryMetaDataFieldValues = new HashSet<>();


    public CategoryMetaField() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<CategoryMetaDataFieldValues> getCategoryMetaDataFieldValues() {
        return categoryMetaDataFieldValues;
    }

    public void setCategoryMetaDataFieldValues(Set<CategoryMetaDataFieldValues> categoryMetaDataFieldValues) {
        this.categoryMetaDataFieldValues = categoryMetaDataFieldValues;
    }

    public CategoryMetaField(long id) {
        this.setId(id);
    }
}