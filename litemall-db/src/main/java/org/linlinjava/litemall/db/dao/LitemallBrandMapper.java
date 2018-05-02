package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallBrand;
import org.linlinjava.litemall.db.domain.LitemallBrandExample;

public interface LitemallBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    long countByExample(LitemallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    int deleteByExample(LitemallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    int insert(LitemallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    int insertSelective(LitemallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    List<LitemallBrand> selectByExample(LitemallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallBrand> selectByExampleSelective(@Param("example") LitemallBrandExample example, @Param("selective") LitemallBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    LitemallBrand selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallBrand selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") LitemallBrand record, @Param("example") LitemallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    int updateByExample(@Param("record") LitemallBrand record, @Param("example") LitemallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    int updateByPrimaryKeySelective(LitemallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    int updateByPrimaryKey(LitemallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallBrand selectOneByExample(LitemallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallBrand selectOneByExampleSelective(@Param("example") LitemallBrandExample example, @Param("selective") LitemallBrand.Column ... selective);
}