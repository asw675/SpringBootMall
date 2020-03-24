package com.example.springbootmall.model;

import java.io.Serializable;
import java.util.Date;

public class PmsProductVertifyRecord implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_vertify_record.id
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_vertify_record.product_id
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_vertify_record.create_time
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_vertify_record.vertify_man
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    private String vertifyMan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_vertify_record.status
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_vertify_record.detail
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    private String detail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_product_vertify_record
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_vertify_record.id
     *
     * @return the value of pms_product_vertify_record.id
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_vertify_record.id
     *
     * @param id the value for pms_product_vertify_record.id
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_vertify_record.product_id
     *
     * @return the value of pms_product_vertify_record.product_id
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_vertify_record.product_id
     *
     * @param productId the value for pms_product_vertify_record.product_id
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_vertify_record.create_time
     *
     * @return the value of pms_product_vertify_record.create_time
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_vertify_record.create_time
     *
     * @param createTime the value for pms_product_vertify_record.create_time
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_vertify_record.vertify_man
     *
     * @return the value of pms_product_vertify_record.vertify_man
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public String getVertifyMan() {
        return vertifyMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_vertify_record.vertify_man
     *
     * @param vertifyMan the value for pms_product_vertify_record.vertify_man
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public void setVertifyMan(String vertifyMan) {
        this.vertifyMan = vertifyMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_vertify_record.status
     *
     * @return the value of pms_product_vertify_record.status
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_vertify_record.status
     *
     * @param status the value for pms_product_vertify_record.status
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_vertify_record.detail
     *
     * @return the value of pms_product_vertify_record.detail
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_vertify_record.detail
     *
     * @param detail the value for pms_product_vertify_record.detail
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", createTime=").append(createTime);
        sb.append(", vertifyMan=").append(vertifyMan);
        sb.append(", status=").append(status);
        sb.append(", detail=").append(detail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}