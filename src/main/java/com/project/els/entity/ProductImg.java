package com.project.els.entity;

import java.util.Date;

public class ProductImg {
    // ID
    private Long productImdId;
    // 图片链接
    private String imgAddr;
    // 图片描述
    private String imgDesc;
    // 权重
    private Integer priority;
    // 创建时间
    private Date creatTime;
    // 商品ID
    private Long productId;

    public Long getProductImdId() {
        return productImdId;
    }

    public void setProductImdId(Long productImdId) {
        this.productImdId = productImdId;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
