package org.example;

public class AuditService {
    private Logger logger;

    public AuditService(Logger logger) {
        this.logger = logger;
    }

    public void performAudit(String action) {
        // Perform audit logic here
        logger.log("Audit action: " + action);
    }
}
