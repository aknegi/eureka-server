package com.bootcamp.coremodule.entities.compositeKeys;


import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ReviewCompositeKey implements Serializable {

    private long productId;
    private long customerId;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewCompositeKey that = (ReviewCompositeKey) o;
        return productId == that.productId && customerId == that.customerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, customerId);
    }
}
