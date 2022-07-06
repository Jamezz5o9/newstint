package tddClass;

public class LearnStatic {
    public static void main(String[] args) {
        //getAccountNum(24);
        getName();
    }
    private static int accNum;
    private static String name;

  static void setName(String name){
        LearnStatic.name = name;
        System.out.print("God is the greatest");
    }

    static String getName(){
        return name;
    }
    static void setAccountNum(int acctNum){
        LearnStatic.accNum = acctNum;
    }

    static int getAccountNum(int i){
        return accNum;
    }

}
