package singleResponsibility.antiSRP;



public class ReportManager {

    public void generateReport() {
        System.out.println("Generating report data...");
    }

    public void saveToFile(String data) {
        System.out.println("Saving to file...");
    }

    public void sendEmail(String data) {
        System.out.println("Sending email...");
    }

}
