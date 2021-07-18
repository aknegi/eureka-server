package com.bootcamp.coremodule.entities.compositeKeys;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ValuesCompositeKey implements Serializable {

    private long categoryId;
    private long metaDataId;

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public long getMetaDataId() {
        return metaDataId;
    }

    public void setMetaDataId(long metaDataId) {
        this.metaDataId = metaDataId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValuesCompositeKey that = (ValuesCompositeKey) o;
        return categoryId == that.categoryId && metaDataId == that.metaDataId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, metaDataId);
    }
}
