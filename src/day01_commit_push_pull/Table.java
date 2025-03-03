package day01_commit_push_pull;

public class Table {

    /*
    Method: multiplicationTable
    Param: num
    prints multiplication table for the number
     */
    public static void main(String[] args) {
        multiplicationTable(3);
        multiplicationTable();
    }

    public static void multiplicationTable(int num){
        for(int i= 1; i<= 12; i++){
            System.out.println(num + " X " + i + " = " + (i*num));
        }
    }

    public static void multiplicationTable(){
        for(int i = 1; i <= 10 ; i++){
            multiplicationTable(i);
//            for(int j = 1; j <=12; j++){
//                System.out.print(i + " X " + j + " = " + (i*j) + "\t");
//            }
            System.out.println("------");
        }
    }


}


