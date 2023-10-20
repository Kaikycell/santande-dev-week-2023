package me.dio.domain.model;
import jakarta.persistence.*;

import java.math.BigDecimal;

@MappedSuperclass
public abstract class BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String icon;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String setDescription() {
        return description;
    }

    public void setDescription(String descripton) {
        this.description = descripton;
    }
}


