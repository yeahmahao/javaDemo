package com.zt.taskmanager.controller;

import com.zt.taskmanager.model.task;
import com.zt.taskmanager.service.taskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author: ac
 * @Description:
 * @Date: Created in 9:11 2020/3/16
 * @Modified By:
 */
@RestController
@CrossOrigin("*")
public class taskController {
    @Autowired
    taskService service;
    /**
     *
     * @Description: 
     * 
     * @auther: ac
     * @date: 8:50  
     * @param: [task, bindingResult]
     * @return: java.util.List<com.zt.taskmanager.model.task>
     *
     */
    @RequestMapping(value = "/findAll")
    public List<task> findAll( task task,BindingResult bindingResult){
        System.out.println(task.getTaskStartTime());
        return service.findAll(task);
    }
    /**
     *
     * @Description: 
     * 
     * @auther: ac
     * @date: 8:50  
     * @param: [taskNo]
     * @return: int
     *
     */
    @RequestMapping("/deleteByTaskNo")
    public int deleteByTaskNo(String taskNo){
        return service.deleteByTaskNo(taskNo);
    }
    /**
     *
     * @Description: 
     * 
     * @auther: ac
     * @date: 8:50  
     * @param: [task]
     * @return: int
     *
     */
    @RequestMapping(value = "/insertTask")
    public int insertTask(task task){
        return service.insertTask(task);
    }
    /**
     *
     * @Description: 
     * 
     * @auther: ac
     * @date: 8:50  
     * @param: [task]
     * @return: int
     *
     */
    @RequestMapping("/updateTask")
    int updateTask(task task){
        return service.updateTask(task);
    }
}
