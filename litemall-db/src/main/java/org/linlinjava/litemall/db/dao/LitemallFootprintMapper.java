package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallFootprint;
import org.linlinjava.litemall.db.domain.LitemallFootprintExample;

public interface LitemallFootprintMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    long countByExample(LitemallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int deleteByExample(LitemallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int insert(LitemallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int insertSelective(LitemallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    List<LitemallFootprint> selectByExample(LitemallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallFootprint> selectByExampleSelective(@Param("example") LitemallFootprintExample example, @Param("selective") LitemallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    LitemallFootprint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallFootprint selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int updateByExampleSelective(@Param("record") LitemallFootprint record, @Param("example") LitemallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int updateByExample(@Param("record") LitemallFootprint record, @Param("example") LitemallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int updateByPrimaryKeySelective(LitemallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int updateByPrimaryKey(LitemallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallFootprint selectOneByExample(LitemallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallFootprint selectOneByExampleSelective(@Param("example") LitemallFootprintExample example, @Param("selective") LitemallFootprint.Column ... selective);
}