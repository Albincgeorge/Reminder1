/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author Radeon
 */
public class bdshe implements Runnable {
    @Override
    public void run()  {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   try{
   JobDetail j =JobBuilder.newJob(timjob.class).build();
        
        Trigger t = TriggerBuilder.newTrigger().withIdentity("CroneTrigger").withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(60).repeatForever()).build();
     
        Scheduler s =StdSchedulerFactory.getDefaultScheduler();
        
        s.start();
        s.scheduleJob(j,t);
   }catch(SchedulerException x){
   x.printStackTrace();
   }
    }}

