package com.example.springbootmall.model;

import java.io.Serializable;

public class CmsSubjectCategory implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject_category.id
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject_category.name
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject_category.icon
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject_category.subject_count
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    private Integer subjectCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject_category.show_status
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    private Integer showStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject_category.sort
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_subject_category
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject_category.id
     *
     * @return the value of cms_subject_category.id
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject_category.id
     *
     * @param id the value for cms_subject_category.id
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject_category.name
     *
     * @return the value of cms_subject_category.name
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject_category.name
     *
     * @param name the value for cms_subject_category.name
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject_category.icon
     *
     * @return the value of cms_subject_category.icon
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject_category.icon
     *
     * @param icon the value for cms_subject_category.icon
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject_category.subject_count
     *
     * @return the value of cms_subject_category.subject_count
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public Integer getSubjectCount() {
        return subjectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject_category.subject_count
     *
     * @param subjectCount the value for cms_subject_category.subject_count
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public void setSubjectCount(Integer subjectCount) {
        this.subjectCount = subjectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject_category.show_status
     *
     * @return the value of cms_subject_category.show_status
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject_category.show_status
     *
     * @param showStatus the value for cms_subject_category.show_status
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject_category.sort
     *
     * @return the value of cms_subject_category.sort
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject_category.sort
     *
     * @param sort the value for cms_subject_category.sort
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
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
        sb.append(", name=").append(name);
        sb.append(", icon=").append(icon);
        sb.append(", subjectCount=").append(subjectCount);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}