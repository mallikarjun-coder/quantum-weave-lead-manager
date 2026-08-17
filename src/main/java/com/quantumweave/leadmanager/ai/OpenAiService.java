package com.quantumweave.leadmanager.ai;

import com.quantumweave.leadmanager.lead.Lead;
import org.springframework.stereotype.Service;

@Service
public class OpenAiService {

    public String draft(Lead lead) {
        return "Hi " + lead.getName() + ",\n\n"
                + "Thank you for contacting us regarding your requirement: "
                + lead.getRequirement() + ".\n\n"
                + "We have received your enquiry and would be happy to understand "
                + "your requirements in more detail. Our team will get in touch "
                + "with you shortly.\n\n"
                + "Best regards,\n"
                + "Quantum Weave Team";
    }
}