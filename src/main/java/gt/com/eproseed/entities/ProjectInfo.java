/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.eproseed.entities;

/**
 *
 * @author lsalazar
 */

import javax.persistence.Column ;
import javax.persistence.Entity ;
import javax.persistence.Id ;
import javax.persistence.IdClass ;
import javax.persistence.Table ;
import java.util.Date ;

@Entity
@Table(name="ProjectInfo")
public class ProjectInfo {
    @Id
    @Column(name="PROJECTID")
    private int projectInfoID;
    
    @Column(name="NAME")
    private String name ;
    
    @Column(name="STARTDATE")
    private Date startDate ;
    
    @Column(name="ENDDATE")
    private Date endDate ;
    
    @Column(name="DASHBOARD")
    private int dashboard ;
    
    @Column(name="CONTRACTEDHOURS")
    private float contratedHours ;
    
    @Column(name="CONSUMEDHOURS")
    private float consumedHours ;
    
    @Column(name="ESTIMATEDHOURS")
    private float estimatedHours ;

    public int getProjectInfoID() {
        return projectInfoID;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getDashboard() {
        return dashboard;
    }

    public float getContratedHours() {
        return contratedHours;
    }

    public float getConsumedHours() {
        return consumedHours;
    }

    public float getEstimatedHours() {
        return estimatedHours;
    }

    public void setProjectInfoID(int projectInfoID) {
        this.projectInfoID = projectInfoID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setDashboard(int dashboard) {
        this.dashboard = dashboard;
    }

    public void setContratedHours(float contratedHours) {
        this.contratedHours = contratedHours;
    }

    public void setConsumedHours(float consumedHours) {
        this.consumedHours = consumedHours;
    }

    public void setEstimatedHours(float estimatedHours) {
        this.estimatedHours = estimatedHours;
    }
    
    
}
