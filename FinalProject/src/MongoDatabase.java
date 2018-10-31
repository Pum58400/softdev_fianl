/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tang
 */
import com.mongodb.*;
import java.util.ArrayList;
public class MongoDatabase {
    DB db;
    DBCollection Collection;
    MongoClientURI uri;
    MongoClient client;
    DBCursor cursor;
    
    public void connectDatabase() {
        try {
            uri = new MongoClientURI("mongodb://tang:tang1234@ds147233.mlab.com:47233/project");
            client = new MongoClient(uri);
            db = client.getDB(uri.getDatabase());
            Collection = db.getCollection("Job");
            
            System.out.println("ConnectDatabase Success");
        } catch (Exception e) {
            System.out.println("ConnectDatabase Fail");
        }
    }
    
    public ArrayList<Job> getJobByJobType(String jobType) {
        BasicDBObject query = new BasicDBObject();
        ArrayList<Job> jobValue = new ArrayList<>();
        DBCursor cursor = Collection.find(query);
        for( DBObject dock : Collection.find() ) {
            
            String jobName = (String) dock.get("jobName").toString();
            String value = (String) dock.get("jobType").toString();
            String jobOwner = (String) dock.get("jobOwner").toString();
            int jobAmount = (int) dock.get("jobAmount");
            int jobSalary = (int) dock.get("jobSalary");
            String jobDetail = (String) dock.get("jobDetail").toString();
            String employeeProperty = (String) dock.get("employeeProperty").toString();
            String jobAddress = (String) dock.get("jobAddress").toString();
            String jobProvince = (String) dock.get("jobProvince").toString();
            String jobNote = (String) dock.get("jobNote").toString();
            
            if (value.equals(jobType)){
                Job job = new Job(jobName, value, jobOwner, jobAmount, jobSalary, jobDetail, employeeProperty, jobAddress, jobProvince, jobNote);
                jobValue.add(job);
            }
        }
        return jobValue;
    }
}
    
    
