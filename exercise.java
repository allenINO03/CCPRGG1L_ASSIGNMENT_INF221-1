import java.lang.reflect.Array;

public class App {
    public static void main(String[] args) throws Exception {

        char [][] one  = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};


        // // PATTERN 1
        System.out.println("");

        System.out.println("1. PATTERN 1");
        for (int rows= 0; rows <one.length; rows++){

            System.out.println("");

            for (int column = 0; column <3; column++){

                if (rows  %2 !=0){

                    System.out.print(one[rows][column]);
                }
            }
        }
        System.out.println("");

        //PATTERN 2
        System.out.println("");

        System.out.println("2. PATTERN 2");
         for (int rows= 0; rows <one.length; rows++){

            System.out.println("");
        
            for (int column = 0; column <3; column++){
        
                    if (rows  %2 ==0){
        
                        System.out.print(one[rows][column]);
                    }
                    else if (rows%2!=0){
                        System.out.println("");
                    }
                     
            }
        }
        System.out.println("");

        //    // // PATTERN 3
        System.out.println("");

        System.out.println("3. PATTERN 3");
        for (int rows= 0; rows < 4; rows++){

            System.out.println("");
    
            for (int column = 0; column < 3; column++){
            
                if (rows == 1 || rows == 2 ){

                    if (column == 0 || column == 2) {
                        System.out.print(" ");
                    }
                    else if(column == 1){
                        System.out.print(one[rows][column]);
                    }
                }
                else{
                    System.out.print(one[rows][column]);
                }
            }
        }
        
        System.out.println("");

        // // PATTERN 4
        System.out.println("");
        
        System.out.println("4. PATTERN 4");
        
        for (int rows= 0; rows < 4; rows++){

            System.out.println("");
    
            for (int column = 0; column < 3; column++){
            
                if (rows == 0 || rows == 2 ){

                    if (column == 0 || column == 2) {
                        System.out.print(" ");
                    }
                    else if(column == 1){
                        System.out.print(one[rows][column]);
                    }
                }
                else{
                    System.out.print(one[rows][column]);
                }
            }
        }
        System.out.println("");

         // // PATTERN 5
         System.out.println("");

         System.out.println("5. find the SUM");
          int i, j, row_sum = 0, column_sum; 
         
          int[][] SumOfRowCols_arr = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
       
        
          for(i = 0; i < SumOfRowCols_arr.length; i++)
         {
          column_sum = 0;
          for(j = 0; j < SumOfRowCols_arr[0].length; j++)
          {
         row_sum = row_sum + SumOfRowCols_arr[i][j];
          //column_sum = column_sum + SumOfRowCols_arr[j][i];
         }
         
          // System.out.println("\nThe Sum of Matrix Items "
          //      + "in Column " + i + " = " + column_sum);
         }
          System.out.println ("Sum of " + row_sum);
          }
        }
        
