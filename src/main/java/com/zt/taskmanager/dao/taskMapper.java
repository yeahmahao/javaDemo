package com.zt.taskmanager.dao;
import com.zt.taskmanager.model.task;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;


/**
 * @Author: ac
 * @Description:
 * @Date: Created in 9:04 2020/3/16
 * @Modified By:
 */
@Mapper
public interface taskMapper {
     /**
      *
      * @Description:
      *
      * @auther: ac
      * @date: 13:30
      * @param: []
      * @return: java.util.List<com.zt.taskmanager.model.task>
      *
      */
     @Select("<script> "+
             "select t.*,u.name from task t"+
             " inner join EERMMS.user u"+
             " on(u.id=t.userId)"+
             "<where>"+
             " 1=1"+
             "<if test=\"taskNo != null and  taskNo != ''\">" +
             " and taskNo like \"%\"#{taskNo}\"%\"</if>"+
             "<if test=\"taskStatus!=0\">"+
             " and taskStatus=#{taskStatus}</if>"+
             "<if test=\"taskName !='' and taskName != null\">"+
             " and taskName like \"%\"#{taskName}\"%\"</if>"+
             "<if test=\"taskStartTime != null and taskFinishTime != null\">"+
             " <![CDATA[ and taskStartTime >= #{taskStartTime} and taskFinishTime <= #{taskFinishTime}]]></if>"+
             "<if test=\"taskStartTime!=null\">"+
             " <![CDATA[ and taskStartTime = #{taskStartTime}]]></if>"+
             "<if test=\"taskFinishTime != null\">"+
             " <![CDATA[ and taskFinishTime = #{taskFinishTime}]]></if>"+
             "<if test=\"businessName !='' and businessName != null\">"+
             " and businessName like \"%\"#{businessName}\"%\"</if>"+
             "<if test=\"userId !='' and userId != null\">"+
             " and userId like \"%\"#{userId}\"%\"</if>"+
             "<if test=\"name !='' and name !=null\">"+
             " and u.name like \"%\"#{name}\"%\"</if>"+
             "<if test=\"taskAddress !='' and taskAddress !=null\">"+
             " and taskAddress like \"%\"#{taskAddress}\"%\"</if>"+
             "</where>"+
             "</script>")
     List<task> findAll(task task);
     /**
      *
      * @Description:
      *
      * @auther: ac
      * @date: 13:32
      * @param: [taskNo]
      * @return: int
      *
      */
     @Delete("delete from task where taskNo=#{taskNo}")
     int deleteByTaskNo(String taskNo);
     /**
      *
      * @Description: 
      * 
      * @auther: ac
      * @date: 12:19  
      * @param: [task]
      * @return: int
      *
      */
     @Insert("insert into task(taskNo,taskName,taskStatus,taskStartTime,businessName,taskResult,userId,taskAddress)values(#{taskNo},#{taskName},#{taskStatus},#{taskStartTime},#{taskFinishTime},#{businessName},#{userId},#{taskAddress})")
     int insertTask(task task);
     /**
      *
      * @Description: 
      * 
      * @auther: ac
      * @date: 8:42  
      * @param: [task]
      * @return: int
      *
      */
     @Update("update task set taskName=#{taskName},taskStartTime=#{taskStartTime},taskFinishTime=#{taskFinishTime},businessName=#{businessName},taskResult=#{taskResult},userId=#{userId},taskAddress=#{taskAddress} where taskNo=#{taskNo}")
     int updateTask(task task);

}