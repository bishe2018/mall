package org.linlinjava.litemall.db.domain;

import java.math.BigDecimal;
import java.util.Arrays;

public class LitemallProduct {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_product.id
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_product.goods_id
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_product.goods_specification_ids
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    private Integer[] goodsSpecificationIds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_product.goods_number
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    private Integer goodsNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_product.retail_price
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    private BigDecimal retailPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_product.url
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_product.id
     *
     * @return the value of litemall_product.id
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_product.id
     *
     * @param id the value for litemall_product.id
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_product.goods_id
     *
     * @return the value of litemall_product.goods_id
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_product.goods_id
     *
     * @param goodsId the value for litemall_product.goods_id
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_product.goods_specification_ids
     *
     * @return the value of litemall_product.goods_specification_ids
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    public Integer[] getGoodsSpecificationIds() {
        return goodsSpecificationIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_product.goods_specification_ids
     *
     * @param goodsSpecificationIds the value for litemall_product.goods_specification_ids
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    public void setGoodsSpecificationIds(Integer[] goodsSpecificationIds) {
        this.goodsSpecificationIds = goodsSpecificationIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_product.goods_number
     *
     * @return the value of litemall_product.goods_number
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_product.goods_number
     *
     * @param goodsNumber the value for litemall_product.goods_number
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_product.retail_price
     *
     * @return the value of litemall_product.retail_price
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_product.retail_price
     *
     * @param retailPrice the value for litemall_product.retail_price
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_product.url
     *
     * @return the value of litemall_product.url
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_product.url
     *
     * @param url the value for litemall_product.url
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_product
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsSpecificationIds=").append(goodsSpecificationIds);
        sb.append(", goodsNumber=").append(goodsNumber);
        sb.append(", retailPrice=").append(retailPrice);
        sb.append(", url=").append(url);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_product
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
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
        LitemallProduct other = (LitemallProduct) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (Arrays.equals(this.getGoodsSpecificationIds(), other.getGoodsSpecificationIds()))
            && (this.getGoodsNumber() == null ? other.getGoodsNumber() == null : this.getGoodsNumber().equals(other.getGoodsNumber()))
            && (this.getRetailPrice() == null ? other.getRetailPrice() == null : this.getRetailPrice().equals(other.getRetailPrice()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_product
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + (Arrays.hashCode(getGoodsSpecificationIds()));
        result = prime * result + ((getGoodsNumber() == null) ? 0 : getGoodsNumber().hashCode());
        result = prime * result + ((getRetailPrice() == null) ? 0 : getRetailPrice().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        goodsId("goods_id"),
        goodsSpecificationIds("goods_specification_ids"),
        goodsNumber("goods_number"),
        retailPrice("retail_price"),
        url("url");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_product
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_product
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_product
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_product
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_product
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_product
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}