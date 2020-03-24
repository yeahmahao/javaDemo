package com.zt.taskmanager.service;

import com.zt.taskmanager.model.task;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ac
 * @Description:
 * @Date: Created in 9:09 2020/3/16
 * @Modified By:
 */
@Service
public interface taskService {
    List<task> findAll(task task);
    int deleteByTaskNo(String taskNo);
    int insertTask(task task);
    int updateTask(task task);
}
