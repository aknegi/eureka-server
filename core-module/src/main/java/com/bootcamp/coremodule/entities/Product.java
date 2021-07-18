package com.bootcamp.coremodule.entities;

import org.hibernate.annotations.Where;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Component
@Entity
@Where(clause = "deleted = false")
public class Product extends BaseDomain {

    private String productName;

    @ManyToOne
    @JoinColumn(name = "seller_user_id")
    private Seller seller;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @OneToMany(mappedBy = "product")
    private List<ProductReview> productReview;

    @OneToMany(mappedBy = "product")
    private List<ProductVariation> productVariations;

    private Boolean cancellable = false;
    private Boolean returnable = false;
    private String brand;
    private Boolean active = false;
    private String description;


    public Product() {
    }

    public Product(long id) {
        this.setId(id);
    }


    public List<ProductVariation> getProductVariations() {
        return productVariations;
    }

    public void setProductVariations(List<ProductVariation> inputVariations) {
        if (inputVariations != null) {
            if (productVariations == null) {
                productVariations = new ArrayList<>();
            }
            for (ProductVariation variation : inputVariations) {
                variation.setProduct(this);
                productVariations.add(variation);
            }
        }
    }

    public List<ProductReview> getProductReview() {
        return productReview;
    }

    public void setProductReview(List<ProductReview> productReview) {
        this.productReview = productReview;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Boolean getCancellable() {
        return cancellable;
    }

    public void setCancellable(Boolean cancellable) {
        this.cancellable = cancellable;
    }

    public Boolean getReturnable() {
        return returnable;
    }

    public void setReturnable(Boolean returnable) {
        this.returnable = returnable;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
