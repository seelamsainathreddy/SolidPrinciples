package singleResponsibility.goodSRP;

public class ReportManager {

    private ReportGenerator reportGenerator = new ReportGenerator();
    private ReportSaver reportSaver = new ReportSaver();
    private EmailService emailService = new EmailService();

    public void handleReport(String email){
        String data = reportGenerator.generateReport();
        reportSaver.saveToFile(data);
        emailService.sendEmail(email, data);
    }
    
}
