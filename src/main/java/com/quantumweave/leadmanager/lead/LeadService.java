package com.quantumweave.leadmanager.lead; import org.springframework.stereotype.Service; import java.util.List;
@Service public class LeadService{private final LeadRepository repo; public LeadService(LeadRepository r){repo=r;}
public Lead create(Lead l){l.setId(null);l.setCreatedDate(null);if(l.getStatus()==null)l.setStatus(LeadStatus.NEW);return repo.save(l);}
public List<Lead> all(String q){if(q==null||q.isBlank())return repo.findAll();q=q.trim();return repo.findByNameContainingIgnoreCaseOrContactContainingIgnoreCaseOrRequirementContainingIgnoreCase(q,q,q);}
public Lead get(Long id){return repo.findById(id).orElseThrow(()->new LeadNotFoundException(id));}
public Lead update(Long id,Lead x){Lead l=get(id);l.setName(x.getName());l.setContact(x.getContact());l.setRequirement(x.getRequirement());if(x.getStatus()!=null)l.setStatus(x.getStatus());return repo.save(l);}
public void delete(Long id){repo.delete(get(id));}}
