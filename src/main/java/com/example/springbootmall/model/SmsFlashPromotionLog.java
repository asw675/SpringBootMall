package com.example.springbootmall.model;

import java.io.Serializable;
import java.util.Date;

public class SmsFlashPromotionLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_log.id
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_log.member_id
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Integer memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_log.product_id
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_log.member_phone
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private String memberPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_log.product_name
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_log.subscribe_time
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Date subscribeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_log.send_time
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Date sendTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_flash_promotion_log
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_log.id
     *
     * @return the value of sms_flash_promotion_log.id
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_log.id
     *
     * @param id the value for sms_flash_promotion_log.id
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_log.member_id
     *
     * @return the value of sms_flash_promotion_log.member_id
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_log.member_id
     *
     * @param memberId the value for sms_flash_promotion_log.member_id
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_log.product_id
     *
     * @return the value of sms_flash_promotion_log.product_id
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_log.product_id
     *
     * @param productId the value for sms_flash_promotion_log.product_id
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_log.member_phone
     *
     * @return the value of sms_flash_promotion_log.member_phone
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public String getMemberPhone() {
        return memberPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_log.member_phone
     *
     * @param memberPhone the value for sms_flash_promotion_log.member_phone
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_log.product_name
     *
     * @return the value of sms_flash_promotion_log.product_name
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_log.product_name
     *
     * @param productName the value for sms_flash_promotion_log.product_name
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_log.subscribe_time
     *
     * @return the value of sms_flash_promotion_log.subscribe_time
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Date getSubscribeTime() {
        return subscribeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_log.subscribe_time
     *
     * @param subscribeTime the value for sms_flash_promotion_log.subscribe_time
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_log.send_time
     *
     * @return the value of sms_flash_promotion_log.send_time
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_log.send_time
     *
     * @param sendTime the value for sms_flash_promotion_log.send_time
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_log
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", productId=").append(productId);
        sb.append(", memberPhone=").append(memberPhone);
        sb.append(", productName=").append(productName);
        sb.append(", subscribeTime=").append(subscribeTime);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}