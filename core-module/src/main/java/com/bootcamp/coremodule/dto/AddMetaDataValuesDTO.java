package com.bootcamp.coremodule.dto;

import javax.validation.constraints.NotNull;
import java.util.List;

public class AddMetaDataValuesDTO extends BaseDomainDTO {

    @NotNull(message = "Please provide the category Id")
    private long categoryId;
    @NotNull(message = "Please provide the metadata field Id")
    private long metadataFieldId;
    @NotNull(message = "Please provide the Values array")
    List<String> values;

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public long getMetadataFieldId() {
        return metadataFieldId;
    }

    public void setMetadataFieldId(long metadataFieldId) {
        this.metadataFieldId = metadataFieldId;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }
}
