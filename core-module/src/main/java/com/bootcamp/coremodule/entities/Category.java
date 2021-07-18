package com.bootcamp.coremodule.entities;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Category extends BaseDomain {
    private String name;
    private long parentId;

    @OneToMany(mappedBy = "category", cascade = CascadeType.MERGE)
    Set<CategoryMetaDataFieldValues> metaDataValuesSet = new HashSet<>();

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> productList;

    public Category() {
    }

    public Category(long id) {
        this.setId(id);
    }


    public Set<CategoryMetaDataFieldValues> getMetaDataValuesSet() {
        return metaDataValuesSet;
    }

    public void setMetaDataValuesSet(Set<CategoryMetaDataFieldValues> inputSet) {
        if (inputSet != null) {
            for (CategoryMetaDataFieldValues value : inputSet) {
                value.setCategory(this);
                metaDataValuesSet.add(value);
            }
        }
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> products) {
        if (products != null) {
            if (productList == null) {
                productList = new ArrayList<>();
            }
            for (Product product : products) {
                product.setCategory(this);
                productList.add(product);
            }
        }
    }

    public void addProduct(Product product) {
        if (product != null) {
            if (productList == null) {
                productList = new ArrayList<>();
            }
            product.setCategory(this);
            productList.add(product);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }
}
