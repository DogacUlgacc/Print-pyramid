public class PrintSomething {

    public  void RecursivePrintPyramid(int height,int stars){
        if (height>=1){
            for(int i=0 ; i<height-1 ; i++)
                System.out.print(" ");
            for(int i=1; i<=stars*2-1; i++)
                System.out.print("*");
            System.out.println();
            RecursivePrintPyramid(height-1,stars+1);
        }
    }

    public  void PrintPyramidWithSpace(int n){
        int s=1;
        while (n>0) {
            for (int i = 0; i < n - 1; i++) {
                System.out.print(" ");
            }
            for (int m = 0; m < s ; m++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int m = 0; m < s ; m++)
            {
                System.out.print("*");
            }
            System.out.println();
            n--;
            s++;
        }

    }
    public  void RecursivePrintPyramid5(int height, int stars) {
        if(height==1){
            System.out.println("*");}
        else{
            RecursivePrintPyramid5(height-1,stars);
            for(int i =0 ; i<=(height-1)*2 ; i++){

                System.out.print("*");
            }
            System.out.println();
        }

    }
    public  void RecursivePrintPyramid2(int height, int stars) {
        if(height>=1)
            RecursivePrintPyramid(height-1,stars);
        for(int i =1 ; i<=(height-1)*2+1 ; i++) {
            System.out.print("*");

        }
    }

    public  void IterativePrintPyramid(int height) {
        for(int i = 0; i<height; i++){
            for(int j = 0; j<height-i; j++){
                System.out.print(" ");  }
            for (int k=0; k<=i*2;k++){
                System.out.print("*");}
            System.out.println();
        }

    }
    public  void IterativePrintPyramid2(int height){
        for(int i=0; i<height; i++){
            for(int j=0; j<height-i-1; j++)
                System.out.print(" ");
            for(int k= height; k>=(height-2*i); k--)
                System.out.print("*");
            System.out.println();
        }
    }

    public  void PrintSquare(int n){
        if(n>=3) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();

            for (int k = 0; k < n - 2; k++) {
                System.out.print("*");
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }
        else
            System.out.println("n should be n>3");
    }
}
