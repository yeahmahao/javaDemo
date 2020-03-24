package com.zt.taskmanager.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.format.annotation.DateTimeFormat;
import java.sql.Date;


/**
 * @Author: ac
 * @Description:
 * @Date: Created in 8:57 2020/3/16
 * @Modified By:
 */
@Data
public class task {
private String taskNo;
private String taskName;
private int taskStatus;
@DateTimeFormat(pattern = "yyyy-MM-dd")
private String taskStartTime;
@DateTimeFormat(pattern = "yyyy-MM-dd")
private String taskFinishTime;
private String businessName;
private String taskResult;
private String userId;
private String taskAddress;
private String name;

}
