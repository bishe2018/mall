package org.linlinjava.litemall.db.domain;

import java.time.LocalDateTime;

public class LitemallAd {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_ad.id
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_ad.position
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    private Integer position;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_ad.name
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_ad.link
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    private String link;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_ad.url
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_ad.content
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_ad.start_time
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    private LocalDateTime startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_ad.end_time
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    private LocalDateTime endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_ad.enabled
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    private Boolean enabled;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_ad.id
     *
     * @return the value of litemall_ad.id
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_ad.id
     *
     * @param id the value for litemall_ad.id
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_ad.position
     *
     * @return the value of litemall_ad.position
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_ad.position
     *
     * @param position the value for litemall_ad.position
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_ad.name
     *
     * @return the value of litemall_ad.name
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_ad.name
     *
     * @param name the value for litemall_ad.name
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_ad.link
     *
     * @return the value of litemall_ad.link
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public String getLink() {
        return link;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_ad.link
     *
     * @param link the value for litemall_ad.link
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_ad.url
     *
     * @return the value of litemall_ad.url
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_ad.url
     *
     * @param url the value for litemall_ad.url
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_ad.content
     *
     * @return the value of litemall_ad.content
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_ad.content
     *
     * @param content the value for litemall_ad.content
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_ad.start_time
     *
     * @return the value of litemall_ad.start_time
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_ad.start_time
     *
     * @param startTime the value for litemall_ad.start_time
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_ad.end_time
     *
     * @return the value of litemall_ad.end_time
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_ad.end_time
     *
     * @param endTime the value for litemall_ad.end_time
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_ad.enabled
     *
     * @return the value of litemall_ad.enabled
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_ad.enabled
     *
     * @param enabled the value for litemall_ad.enabled
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", position=").append(position);
        sb.append(", name=").append(name);
        sb.append(", link=").append(link);
        sb.append(", url=").append(url);
        sb.append(", content=").append(content);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", enabled=").append(enabled);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LitemallAd other = (LitemallAd) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getLink() == null ? other.getLink() == null : this.getLink().equals(other.getLink()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated Tue Apr 24 16:58:37 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getLink() == null) ? 0 : getLink().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        position("position"),
        name("name"),
        link("link"),
        url("url"),
        content("content"),
        startTime("start_time"),
        endTime("end_time"),
        enabled("enabled");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_ad
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_ad
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_ad
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_ad
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_ad
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_ad
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}