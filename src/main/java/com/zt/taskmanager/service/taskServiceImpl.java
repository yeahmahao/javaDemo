package com.zt.taskmanager.service;

import com.zt.taskmanager.dao.taskMapper;
import com.zt.taskmanager.model.task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ac
 * @Description:
 * @Date: Created in 9:10 2020/3/16
 * @Modified By:
 */
@Service
public class taskServiceImpl implements taskService{
@Autowired
    taskMapper taskmapper;
    @Override
    public List<task> findAll(task task) {
        return taskmapper.findAll(task);
    }

    @Override
    public int deleteByTaskNo(String taskNo) {
        return taskmapper.deleteByTaskNo(taskNo);
    }

    @Override
    public int insertTask(task task) {
        return taskmapper.insertTask(task);
    }

    @Override
    public int updateTask(task task) {
        return taskmapper.updateTask(task);
    }
}
