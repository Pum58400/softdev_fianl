
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tang
 */
public class JobListService {
    MongoDatabase mongoDB = new MongoDatabase();
    static String jobType;
    
    
    public void setJobType(String Type) {
        jobType = Type;
    }
    
    public DefaultListModel SetJobList() {
        mongoDB.connectDatabase();
        ArrayList<Job> jobListArr = new ArrayList<>();
        jobListArr = mongoDB.getJobByJobType(jobType);
        DefaultListModel jobList = new DefaultListModel();
        for (int i = 0 ; i < jobListArr.size() ; i++) {
            jobList.addElement(jobListArr.get(i).jobName.toString());
        }
        return jobList;
    }
    
    
}
