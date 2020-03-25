package com.example.springbootmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UmsMemberStatisticsInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.id
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.member_id
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Long memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.consume_amount
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private BigDecimal consumeAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.order_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Integer orderCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.coupon_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Integer couponCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.comment_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Integer commentCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.return_order_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Integer returnOrderCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.login_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Integer loginCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.attend_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Integer attendCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.fans_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Integer fansCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.collect_product_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Integer collectProductCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.collect_subject_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Integer collectSubjectCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.collect_topic_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Integer collectTopicCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.collect_comment_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Integer collectCommentCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.invite_friend_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Integer inviteFriendCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.recent_order_time
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private Date recentOrderTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.id
     *
     * @return the value of ums_member_statistics_info.id
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.id
     *
     * @param id the value for ums_member_statistics_info.id
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.member_id
     *
     * @return the value of ums_member_statistics_info.member_id
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.member_id
     *
     * @param memberId the value for ums_member_statistics_info.member_id
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.consume_amount
     *
     * @return the value of ums_member_statistics_info.consume_amount
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.consume_amount
     *
     * @param consumeAmount the value for ums_member_statistics_info.consume_amount
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.order_count
     *
     * @return the value of ums_member_statistics_info.order_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Integer getOrderCount() {
        return orderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.order_count
     *
     * @param orderCount the value for ums_member_statistics_info.order_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.coupon_count
     *
     * @return the value of ums_member_statistics_info.coupon_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Integer getCouponCount() {
        return couponCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.coupon_count
     *
     * @param couponCount the value for ums_member_statistics_info.coupon_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.comment_count
     *
     * @return the value of ums_member_statistics_info.comment_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.comment_count
     *
     * @param commentCount the value for ums_member_statistics_info.comment_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.return_order_count
     *
     * @return the value of ums_member_statistics_info.return_order_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Integer getReturnOrderCount() {
        return returnOrderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.return_order_count
     *
     * @param returnOrderCount the value for ums_member_statistics_info.return_order_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setReturnOrderCount(Integer returnOrderCount) {
        this.returnOrderCount = returnOrderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.login_count
     *
     * @return the value of ums_member_statistics_info.login_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.login_count
     *
     * @param loginCount the value for ums_member_statistics_info.login_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.attend_count
     *
     * @return the value of ums_member_statistics_info.attend_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Integer getAttendCount() {
        return attendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.attend_count
     *
     * @param attendCount the value for ums_member_statistics_info.attend_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.fans_count
     *
     * @return the value of ums_member_statistics_info.fans_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Integer getFansCount() {
        return fansCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.fans_count
     *
     * @param fansCount the value for ums_member_statistics_info.fans_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.collect_product_count
     *
     * @return the value of ums_member_statistics_info.collect_product_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Integer getCollectProductCount() {
        return collectProductCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.collect_product_count
     *
     * @param collectProductCount the value for ums_member_statistics_info.collect_product_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setCollectProductCount(Integer collectProductCount) {
        this.collectProductCount = collectProductCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.collect_subject_count
     *
     * @return the value of ums_member_statistics_info.collect_subject_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Integer getCollectSubjectCount() {
        return collectSubjectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.collect_subject_count
     *
     * @param collectSubjectCount the value for ums_member_statistics_info.collect_subject_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setCollectSubjectCount(Integer collectSubjectCount) {
        this.collectSubjectCount = collectSubjectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.collect_topic_count
     *
     * @return the value of ums_member_statistics_info.collect_topic_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Integer getCollectTopicCount() {
        return collectTopicCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.collect_topic_count
     *
     * @param collectTopicCount the value for ums_member_statistics_info.collect_topic_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setCollectTopicCount(Integer collectTopicCount) {
        this.collectTopicCount = collectTopicCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.collect_comment_count
     *
     * @return the value of ums_member_statistics_info.collect_comment_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Integer getCollectCommentCount() {
        return collectCommentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.collect_comment_count
     *
     * @param collectCommentCount the value for ums_member_statistics_info.collect_comment_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setCollectCommentCount(Integer collectCommentCount) {
        this.collectCommentCount = collectCommentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.invite_friend_count
     *
     * @return the value of ums_member_statistics_info.invite_friend_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Integer getInviteFriendCount() {
        return inviteFriendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.invite_friend_count
     *
     * @param inviteFriendCount the value for ums_member_statistics_info.invite_friend_count
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setInviteFriendCount(Integer inviteFriendCount) {
        this.inviteFriendCount = inviteFriendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.recent_order_time
     *
     * @return the value of ums_member_statistics_info.recent_order_time
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public Date getRecentOrderTime() {
        return recentOrderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.recent_order_time
     *
     * @param recentOrderTime the value for ums_member_statistics_info.recent_order_time
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    public void setRecentOrderTime(Date recentOrderTime) {
        this.recentOrderTime = recentOrderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
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
        sb.append(", consumeAmount=").append(consumeAmount);
        sb.append(", orderCount=").append(orderCount);
        sb.append(", couponCount=").append(couponCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", returnOrderCount=").append(returnOrderCount);
        sb.append(", loginCount=").append(loginCount);
        sb.append(", attendCount=").append(attendCount);
        sb.append(", fansCount=").append(fansCount);
        sb.append(", collectProductCount=").append(collectProductCount);
        sb.append(", collectSubjectCount=").append(collectSubjectCount);
        sb.append(", collectTopicCount=").append(collectTopicCount);
        sb.append(", collectCommentCount=").append(collectCommentCount);
        sb.append(", inviteFriendCount=").append(inviteFriendCount);
        sb.append(", recentOrderTime=").append(recentOrderTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}