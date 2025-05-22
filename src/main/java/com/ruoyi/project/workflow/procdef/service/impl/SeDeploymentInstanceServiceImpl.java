package com.ruoyi.project.workflow.procdef.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.workflow.procdef.mapper.SeDeploymentInstanceMapper;
import com.ruoyi.project.workflow.procdef.domain.SeDeploymentInstance;
import com.ruoyi.project.workflow.procdef.service.ISeDeploymentInstanceService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 流程定义部署实例Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-22
 */
@Service
public class SeDeploymentInstanceServiceImpl implements ISeDeploymentInstanceService 
{
    @Autowired
    private SeDeploymentInstanceMapper seDeploymentInstanceMapper;

    /**
     * 查询流程定义部署实例
     * 
     * @param id 流程定义部署实例主键
     * @return 流程定义部署实例
     */
    @Override
    public SeDeploymentInstance selectSeDeploymentInstanceById(String id)
    {
        return seDeploymentInstanceMapper.selectSeDeploymentInstanceById(id);
    }

    /**
     * 查询流程定义部署实例列表
     * 
     * @param seDeploymentInstance 流程定义部署实例
     * @return 流程定义部署实例
     */
    @Override
    public List<SeDeploymentInstance> selectSeDeploymentInstanceList(SeDeploymentInstance seDeploymentInstance)
    {
        return seDeploymentInstanceMapper.selectSeDeploymentInstanceList(seDeploymentInstance);
    }

    /**
     * 新增流程定义部署实例
     * 
     * @param seDeploymentInstance 流程定义部署实例
     * @return 结果
     */
    @Override
    public int insertSeDeploymentInstance(SeDeploymentInstance seDeploymentInstance)
    {
        return seDeploymentInstanceMapper.insertSeDeploymentInstance(seDeploymentInstance);
    }

    /**
     * 修改流程定义部署实例
     * 
     * @param seDeploymentInstance 流程定义部署实例
     * @return 结果
     */
    @Override
    public int updateSeDeploymentInstance(SeDeploymentInstance seDeploymentInstance)
    {
        return seDeploymentInstanceMapper.updateSeDeploymentInstance(seDeploymentInstance);
    }

    /**
     * 批量删除流程定义部署实例
     * 
     * @param ids 需要删除的流程定义部署实例主键
     * @return 结果
     */
    @Override
    public int deleteSeDeploymentInstanceByIds(String ids)
    {
        return seDeploymentInstanceMapper.deleteSeDeploymentInstanceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除流程定义部署实例信息
     * 
     * @param id 流程定义部署实例主键
     * @return 结果
     */
    @Override
    public int deleteSeDeploymentInstanceById(String id)
    {
        return seDeploymentInstanceMapper.deleteSeDeploymentInstanceById(id);
    }
}
