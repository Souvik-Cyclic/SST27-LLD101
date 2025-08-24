// public class Demo10 {
//     public static void main(String[] args) {
//         new ReportService().generate();
//     }
// }


public class Demo10 {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger(); 
        ReportGenerator reportGenerator = new DailyReportGenerator();

        ReportService reportService = new ReportService(logger, reportGenerator);
        reportService.report();
    }
}
