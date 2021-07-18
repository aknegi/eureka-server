package com.bootcamp.coremodule.entities.compositeKeys;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CartCompositeKey implements Serializable {
    private long customerId;
    private long variationId;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getVariationId() {
        return variationId;
    }

    public void setVariationId(long variationId) {
        this.variationId = variationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartCompositeKey that = (CartCompositeKey) o;
        return customerId == that.customerId && variationId == that.variationId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, variationId);
    }
}
