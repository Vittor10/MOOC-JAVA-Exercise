public class CreatStar {
    public static void main(String[] args) {

        printTriangle(4);
    }

    private static int printStar(int x) {
        for (int i = 0 ; i < x; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        return x;
    }

    private static int printWhiteSpaces(int x) {
        for (int i = 0; i < x ; i++)
            System.out.print(' ');

        return x;
    }

   /* private static int printSquare(){
        int x = 4;
        for(int i=0; i<x; i++){
            printStar(x);
        }
        return x;
    }*/

  /*  private static int printRectangle(int width, int heigth) {
        for (int i = 0; i < heigth; i++)
            printStar(width);

        return width;
    } */

  private static int printTriangle(int size){
      for(int i=0; i < size;i++){
          int numberOfSpaces = size - 1 - i;
          int numberOfStars = size - numberOfSpaces;
          printWhiteSpaces(numberOfSpaces);
          printStar(numberOfStars);
      }


      return size;
  }
}
