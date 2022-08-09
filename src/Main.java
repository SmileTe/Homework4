public class Main {
    public static void main(String[] args) {
        task1();
        task2();
       task3();
        task4();
        task5();
    }

    public static void task1() {
      int i = 1;
      while (i <=10) {
          if (i==10){
              System.out.println(i);
          }
          else {
              System.out.print(i + " ");
          }
          i++;
      }
         for (i =10; i >=1; i--) {

               if (i==1){
                 System.out.println(i);
             }
               else
                   System.out.print(i + " ");
        }
    }

    public static void task2() {
     int FirstFriday = 5;
     for(int i=FirstFriday; i <=31; i=i+7)
             System.out.println("Сегодня пятница, "+ i + "-е число. Необходимо подготовить отчет.");

    }

    public static void task3() {
        int ThisYear = 2022;
        int LastYears = 2022-200;
        int NextYears = 2022+100;
        for(int i =LastYears; i<=NextYears; i++){
            if(i%79==0){
                System.out.println(i);
            }
        }
    }

    public static void task4() {
        for ( int i =1; i<=30; i++){
           if(i%3==0&&i%5==0) {
               System.out.println("ping pong");
           }
           if(i%3==0) {
               System.out.println("ping");

           }
           else if(i%5==0) {
               System.out.println("pong");

           }
           else
               System.out.println("");
        }

    }

    public static void task5() {
        int x = 0;
        int y = 1;
        int Sum = 0;
        System.out.print(x + " ") ;
        System.out.print(y + " ") ;

        for(int i =1; i <=8; i++){
            Sum = x+y;

            System.out.print(Sum + " ") ;
            x = y;
            y =Sum;
        }

    }

}