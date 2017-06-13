package com.mycompany.app;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Customer Job!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	  String[] str = {"customer-batch-job.xml"};
    	ApplicationContext context = new ClassPathXmlApplicationContext("customer-batch-job.xml");
        
 //       JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
 //      Job job = (Job) context.getBean("readCustomerBatchJob");
//        Job job = (Job) context.getBean("PoiExcelConverter");
      
    /*    try {
            JobExecution execution = jobLauncher.run(job, new JobParameters());
            System.out.println("Job Exit Status : "+ execution.getStatus());
      
        } catch (JobExecutionException e) {
            System.out.println("Job ExamResult failed");
            e.printStackTrace();
        }*/
    }
}
