package com.bean;

import net.bytebuddy.agent.builder.AgentBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
public class suppliers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int supplierId;
    private String supplierName;
    private Long supplierPhone;


    @ManyToMany(mappedBy = "supplierId",fetch = FetchType.EAGER)
    private List<product> productId;


    public List<product> getProductId() {
        return productId;
    }

    public void setProductId(List<product> productId) {
        this.productId = productId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Long getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(Long supplierPhone) {
        this.supplierPhone = supplierPhone;
    }
}
