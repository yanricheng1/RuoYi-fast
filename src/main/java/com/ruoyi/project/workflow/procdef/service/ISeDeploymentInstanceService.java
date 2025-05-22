package com.ruoyi.project.workflow.procdef.service;

import java.util.List;
import com.ruoyi.project.workflow.procdef.domain.SeDeploymentInstance;

/**
 * 流程定义部署实例Service接口
 * 
 * @author ruoyi
 * @date 2025-05-22
 */
public interface ISeDeploymentInstanceService 
{
    /**
     * 查询流程定义部署实例
     * 
     * @param id 流程定义部署实例主键
     * @return 流程定义部署实例
     */
    public SeDeploymentInstance selectSeDeploymentInstanceById(String id);

    /**
     * 查询流程定义部署实例列表
     * 
     * @param seDeploymentInstance 流程定义部署实例
     * @return 流程定义部署实例集合
     */
    public List<SeDeploymentInstance> selectSeDeploymentInstanceList(SeDeploymentInstance seDeploymentInstance);

    /**
     * 新增流程定义部署实例
     * 
     * @param seDeploymentInstance 流程定义部署实例
     * @return 结果
     */
    public int insertSeDeploymentInstance(SeDeploymentInstance seDeploymentInstance);

    /**
     * 修改流程定义部署实例
     * 
     * @param seDeploymentInstance 流程定义部署实例
     * @return 结果
     */
    public int updateSeDeploymentInstance(SeDeploymentInstance seDeploymentInstance);

    /**
     * 批量删除流程定义部署实例
     * 
     * @param ids 需要删除的流程定义部署实例主键集合
     * @return 结果
     */
    public int deleteSeDeploymentInstanceByIds(String ids);

    /**
     * 删除流程定义部署实例信息
     * 
     * @param id 流程定义部署实例主键
     * @return 结果
     */
    public int deleteSeDeploymentInstanceById(String id);
}
