package com.app.nre.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.nre.model.PerformanceAppraisal;
import com.app.nre.model.Organization;
import com.app.nre.model.Training;
import com.app.nre.model.EmployeePersonalInfo;
import com.app.nre.model.EmlpoyeeProfile;
import com.app.nre.enums.EmploymentType;
import com.app.nre.enums.OrgDept;
import com.app.nre.enums.TrainingLevel;
import com.app.nre.enums.OrgBranch;
import com.app.nre.converter.OrgBranchConverter;
import com.app.nre.converter.TrainingLevelConverter;
import com.app.nre.converter.EmploymentTypeConverter;
import com.app.nre.converter.OrgDeptConverter;
import com.app.nre.converter.DurationConverter;
import com.app.nre.converter.UUIDToByteConverter;
import com.app.nre.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "EmployeePersonalInfo")
@Table(name = "\"EmployeePersonalInfo\"", schema =  "\"nre\"")
@Data
                        
public class EmployeePersonalInfo {
	public EmployeePersonalInfo () {   
  }
	  
  @Column(name = "\"EmpFullName\"", nullable = true )
  private String empFullName;
  
	  
  @Column(name = "\"EmpGender\"", nullable = true )
  private String empGender;
  
	  
  @Column(name = "\"EmpDOB\"", nullable = true )
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date empDOB;  
  
	  
  @Column(name = "\"EmpPhoneNo\"", nullable = true )
  private Long empPhoneNo;
  
	  
  @Column(name = "\"EmpEmailID\"", nullable = true )
  private String empEmailID;
  
	  
  @Column(name = "\"EmpLaguagesKnown\"", nullable = true )
  private String empLaguagesKnown;
  
	  
  @Column(name = "\"EmployeePersonalID\"", nullable = true )
  private Integer employeePersonalID;
  
	  
  @Column(name = "\"PrevCompany\"", nullable = true )
  private String prevCompany;
  
	  
  @Column(name = "\"JobTtile\"", nullable = true )
  private String jobTtile;
  
	  
  @Column(name = "\"WorkLocation\"", nullable = true )
  private String workLocation;
  
	  
  @Column(name = "\"FromDate\"", nullable = true )
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date fromDate;  
  
	  
  @Column(name = "\"ToDate\"", nullable = true )
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date toDate;  
  
	  
  @Column(name = "\"EmpType\"", nullable = true )
  private String empType;
  
	  
  @Column(name = "\"RecentGrad\"", nullable = true )
  private String recentGrad;
  
	  
  @Column(name = "\"CertificationsVerified\"", nullable = true )
  private Boolean certificationsVerified;
  
	  
  @Column(name = "\"EmpBloodgroup\"", nullable = true )
  private String empBloodgroup;
  
	  
  @Column(name = "\"EmpEmergencycontact\"", nullable = true )
  private Long empEmergencycontact;
  
	  
  @Column(name = "\"Relation\"", nullable = true )
  private String relation;
  
	  
  @Column(name = "\"PocName\"", nullable = true )
  private String pocName;
  
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"Id\"", nullable = true )
  private Integer id;
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "EmployeePersonalInfo [" 
  + "EmpFullName= " + empFullName  + ", " 
  + "EmpGender= " + empGender  + ", " 
  + "EmpDOB= " + empDOB  + ", " 
  + "EmpPhoneNo= " + empPhoneNo  + ", " 
  + "EmpEmailID= " + empEmailID  + ", " 
  + "EmpLaguagesKnown= " + empLaguagesKnown  + ", " 
  + "EmployeePersonalID= " + employeePersonalID  + ", " 
  + "PrevCompany= " + prevCompany  + ", " 
  + "JobTtile= " + jobTtile  + ", " 
  + "WorkLocation= " + workLocation  + ", " 
  + "FromDate= " + fromDate  + ", " 
  + "ToDate= " + toDate  + ", " 
  + "EmpType= " + empType  + ", " 
  + "RecentGrad= " + recentGrad  + ", " 
  + "CertificationsVerified= " + certificationsVerified  + ", " 
  + "EmpBloodgroup= " + empBloodgroup  + ", " 
  + "EmpEmergencycontact= " + empEmergencycontact  + ", " 
  + "Relation= " + relation  + ", " 
  + "PocName= " + pocName  + ", " 
  + "Id= " + id 
 + "]";
	}
	
}