package gt.edu.umg.SingleResponsibilityPrinciple;

public class BookPrinter implements IPrinter{
        @Override
        public void printValue(String value) {
            System.out.println(value);
        }
}
