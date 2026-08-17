package com.quantumweave.leadmanager.lead;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.LocalDateTime;
@Entity @Table(name="leads") public class Lead {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
@NotBlank @Size(max=100) @Column(nullable=false,length=100) private String name;
@NotBlank @Size(max=100) @Column(nullable=false,length=100) private String contact;
@NotBlank @Size(max=1000) @Column(nullable=false,length=1000) private String requirement;
@Enumerated(EnumType.STRING) @Column(nullable=false,length=20) private LeadStatus status=LeadStatus.NEW;
@Column(nullable=false,updatable=false) private LocalDateTime createdDate;
@PrePersist void onCreate(){if(createdDate==null)createdDate=LocalDateTime.now();if(status==null)status=LeadStatus.NEW;}
public Lead(){} public Long getId(){return id;} public String getName(){return name;} public String getContact(){return contact;} public String getRequirement(){return requirement;} public LeadStatus getStatus(){return status;} public LocalDateTime getCreatedDate(){return createdDate;}
public void setId(Long v){id=v;} public void setName(String v){name=v;} public void setContact(String v){contact=v;} public void setRequirement(String v){requirement=v;} public void setStatus(LeadStatus v){status=v;} public void setCreatedDate(LocalDateTime v){createdDate=v;}
}
