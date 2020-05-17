package oop;

public class test2
{
    public static void main(String[] args)
    {

        System.out.println("That are your attempt:");
        trial obj = new trial();
        obj.set(7,8,9);
        obj.get();
        obj.trying(7 ,8, 9 );


        test obj1 = new test();
        obj1.set("Psysics", 12, 8);
        if(obj1.ifReady())
        {
            System.out.println(obj1.ifReady());
            obj1.get();
        }
        else
            System.out.println(obj1.ifReady());
        System.out.println("");


        test obj2 = new exam();
        obj2.set("Math", 12, 8);
        if(obj2.ifReady())
        {
            System.out.println(obj2.ifReady());
            obj2.get();
        }
        else
            System.out.println(obj2.ifReady());
        System.out.println("");


        test obj3 = new final_exam();
        obj3.set("English", 7, 8);
        if(obj3.ifReady())
        {
            System.out.println(obj3.ifReady());
            obj3.get();
        }
        else
            System.out.println(obj2.ifReady());
        System.out.println("");

    }
}
