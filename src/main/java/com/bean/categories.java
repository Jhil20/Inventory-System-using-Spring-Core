package com.bean;

import javax.persistence.*;
import java.util.Set;

@Entity
public class categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    private String categoryName;

    @OneToMany(mappedBy = "categoryId")
    private Set<product> productsId;

    public Set<product> getProductsId() {
        return productsId;
    }

    public void setProductsId(Set<product> productsId) {
        this.productsId = productsId;
    }

    public int getCategoryId() {

        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
