// public class ReportService {
//     void generate(){
//         ConsoleLogger logger = new ConsoleLogger();
//         logger.log("Generating daily report...");
//         System.out.println("Report contents...");
//     }
// }

public class ReportService {
    private final Logger logger;
    private final ReportGenerator reportGenerator;

    public ReportService(Logger logger, ReportGenerator reportGenerator) {
        this.logger = logger;
        this.reportGenerator = reportGenerator;
    }

    public void report() {
        logger.log("Generating daily report...");
        System.out.println(reportGenerator.generate());
    }
}
