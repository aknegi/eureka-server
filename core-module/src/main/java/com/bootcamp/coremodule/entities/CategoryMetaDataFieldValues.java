package com.bootcamp.coremodule.entities;


import com.bootcamp.coremodule.entities.compositeKeys.ValuesCompositeKey;

import javax.persistence.*;

@Entity
public class CategoryMetaDataFieldValues {

    @EmbeddedId
    private ValuesCompositeKey valuesCompositeKey = new ValuesCompositeKey();

    @ManyToOne
    @MapsId("categoryId")
    @JoinColumn(name = "categoryId")
    Category category;

    @ManyToOne
    @MapsId("metaDataId")
    @JoinColumn(name = "metaDataId")
    CategoryMetaField categoryMetaField;

    private String fieldValues;

    public ValuesCompositeKey getMetaDataFieldCompositeKey() {
        return valuesCompositeKey;
    }

    public void setMetaDataFieldCompositeKey(ValuesCompositeKey valuesCompositeKey) {
        this.valuesCompositeKey = valuesCompositeKey;
    }


    public String getFieldValues() {
        return fieldValues;
    }

    public void setFieldValues(String fieldValues) {
        this.fieldValues = fieldValues;
    }

    public CategoryMetaField getCategoryMetaField() {
        return categoryMetaField;
    }

    public void setCategoryMetaField(CategoryMetaField categoryMetaField) {
        this.categoryMetaField = categoryMetaField;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
