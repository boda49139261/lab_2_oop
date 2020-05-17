package oop;


public class trial
{
    private int attempt1 ;
    private int attempt2;
    private int attempt3;

    public void set(int attempt1, int attempt2, int attempt3)
    {
        this.attempt1 = attempt1;
        this.attempt2 = attempt2;
        this.attempt3 = attempt3;
    }

    public void get()
    {

        System.out.println(" attempt1: " + attempt1);
        System.out.println(" attempt2: " + attempt2);
        System.out.println(" attempt3: " + attempt3);
    }


    public void trying (int attempt1, int attempt2, int attempt3)
    {
        if ((attempt1 + attempt2 + attempt3)/3 < 6){
            System.out.println("After trial attempt you have this result: " + "Very bad, you need to fail your final exam!");
            System.out.println();
        } else if (((attempt1 + attempt2 + attempt3)/3 >= 6)&&((attempt1 + attempt2 + attempt3)/3 <= 8)){
            System.out.println("After trial attempt you have this result: " + "Not bad, good lucky!");
            System.out.println();
        } else if ((attempt1 + attempt2 + attempt3)/3 > 8){
            System.out.println("After trial attempt you have this result: " + "Excelent!");
            System.out.println();
        }
    }

}
