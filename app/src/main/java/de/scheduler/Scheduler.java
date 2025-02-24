package de.scheduler;

import jakarta.ejb.Schedule;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;

@Singleton
@Startup
public class Scheduler {
    
   @Schedule(hour = "*", minute = "*/1", persistent = false) // Executes every 5 minutes
    public void scheduledMethod() {
        System.out.println("Scheduled task executed.");
    }

}
