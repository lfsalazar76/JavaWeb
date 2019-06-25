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
@Table(name="Consultant")
//@IdClass(value= ConsultantPK.class)
public class Consultant {
    @Id
    @Column(name="CONSULTANTID")
    private int consultantID ;
    
    @Column(name = "NAME")
    private String name ;
    
    @Column(name="STARTDATE")
    private Date startDate ;
    
    public int getConsultantID(){
        return consultantID ;
    }
    
    public void setConsultantID(int consultantID){
        this.consultantID = consultantID ;
    }
    
    public String getName(){
        return name ;
    }
    
    public void setName(String name){
        this.name = name ;
    }
    
    public Date getStartDate(){
        return  startDate ;
    }
    
    public void setStartDate(Date startDate){
        this.startDate = startDate ;
    }
    
    
    
}
