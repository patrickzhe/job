package com.chenzhe.job.query;


import com.chenzhe.job.entity.JobPriority;
import com.chenzhe.job.entity.JobStatus;
import lombok.Data;

@Data
public class QueryJobTask {

    private Long id;

    private String type;

    private JobPriority priority;

    private JobStatus status;

    private String name;

    private long createTimeStart;

    private long createTimeEnd;

    private int page;

    private int pageSize;

}
