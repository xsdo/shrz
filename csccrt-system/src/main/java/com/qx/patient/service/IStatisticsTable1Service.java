package com.qx.patient.service;

import com.qx.patient.domain.StatisticsTable1;
import java.util.List;

/**
 * 统计1Service接口
 * 
 * @author patient
 * @date 2020-09-02
 */
public interface IStatisticsTable1Service 
{
    /**
     * 查询统计1
     * 
     * @param id 统计1ID
     * @return 统计1
     */
    public StatisticsTable1 selectStatisticsTable1ById(Long id);

    /**
     * 查询统计1列表
     * 
     * @param statisticsTable1 统计1
     * @return 统计1集合
     */
    public StatisticsTable1 selectStatisticsTable1List(StatisticsTable1 statisticsTable1);

    /**
     * 新增统计1
     * 
     * @param statisticsTable1 统计1
     * @return 结果
     */
    public int insertStatisticsTable1(StatisticsTable1 statisticsTable1);

    /**
     * 修改统计1
     * 
     * @param statisticsTable1 统计1
     * @return 结果
     */
    public int updateStatisticsTable1(StatisticsTable1 statisticsTable1);

    /**
     * 批量删除统计1
     * 
     * @param ids 需要删除的统计1ID
     * @return 结果
     */
    public int deleteStatisticsTable1ByIds(Long[] ids);

    /**
     * 删除统计1信息
     * 
     * @param id 统计1ID
     * @return 结果
     */
    public int deleteStatisticsTable1ById(Long id);
}
