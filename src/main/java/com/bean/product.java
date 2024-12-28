package com.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProductId;
    private String ProductName;
    private String ProductDescription;
    private int ProductPrice;
    private String productStock;


    @ManyToOne(cascade = CascadeType.ALL)
    private categories categoryId;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "supplierMap",
            joinColumns = {@JoinColumn(name = "supplierId")},
            inverseJoinColumns = {@JoinColumn(name = "ProductId")}
    )
    private List<suppliers> supplierId;


    public List<suppliers> getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(List<suppliers> supplierId) {
        this.supplierId = supplierId;
    }

    public categories getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(categories categoryId) {
        this.categoryId = categoryId;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String productDescription) {
        ProductDescription = productDescription;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(int productPrice) {
        ProductPrice = productPrice;
    }

    public String getProductStock() {
        return productStock;
    }

    public void setProductStock(String productStock) {
        this.productStock = productStock;
    }
}
