public class Main {

    public static void main(String[] args) {

        PrintSomething print = new PrintSomething();

        System.out.println("Print Pyramid with space");
        print.PrintPyramidWithSpace(3);
        System.out.println();
        System.out.println("Recursive Print Pyramid 5 ");
        print.RecursivePrintPyramid5(3,3);
        System.out.println();
        System.out.println("Recursive Print Pyramid 3");
        print.RecursivePrintPyramid5(3,3);
        System.out.println();
        System.out.println("Iterative Print Pyramid");
        print.IterativePrintPyramid(3);
        System.out.println();
        System.out.println("Iterative PrintPyramid 2");
        print.IterativePrintPyramid2(3);
        System.out.println();
        System.out.println("Print Square");
        print.PrintSquare(3);






    }

}



