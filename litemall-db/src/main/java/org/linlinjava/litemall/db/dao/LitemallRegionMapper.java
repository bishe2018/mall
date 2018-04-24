package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallRegion;
import org.linlinjava.litemall.db.domain.LitemallRegionExample;

public interface LitemallRegionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    long countByExample(LitemallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int deleteByExample(LitemallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int insert(LitemallRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int insertSelective(LitemallRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    List<LitemallRegion> selectByExample(LitemallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallRegion> selectByExampleSelective(@Param("example") LitemallRegionExample example, @Param("selective") LitemallRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    LitemallRegion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallRegion selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int updateByExampleSelective(@Param("record") LitemallRegion record, @Param("example") LitemallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int updateByExample(@Param("record") LitemallRegion record, @Param("example") LitemallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int updateByPrimaryKeySelective(LitemallRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int updateByPrimaryKey(LitemallRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallRegion selectOneByExample(LitemallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallRegion selectOneByExampleSelective(@Param("example") LitemallRegionExample example, @Param("selective") LitemallRegion.Column ... selective);
}