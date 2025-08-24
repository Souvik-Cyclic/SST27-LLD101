// public class Demo07 {
//     public static void main(String[] args) {
//         Machine m = new BasicPrinter();
//         m.print("Hello");
//         m.scan("/tmp/out"); // blows up
//     }
// }


public class Demo07 {
    public static void main(String[] args) {
        Printer basicPrinter = new BasicPrinter();
        basicPrinter.print("Hello");

        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.print("Hello");
        multiFunctionPrinter.scan("/tmp/out");
        multiFunctionPrinter.fax("123");
    }
}
