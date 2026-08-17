package com.quantumweave.leadmanager.lead; public class LeadNotFoundException extends RuntimeException{public LeadNotFoundException(Long id){super("Lead not found: "+id);}}
