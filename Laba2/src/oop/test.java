package oop;
//10.Побудувати ієрархію класів: тест, іспит, випускний іспит, випробування.
//Розробити методи і властивості для кожного із розроблюваних класів.
//Написати тестовий застосунок для демонстрації властивостей класів.
public class test
{
    protected String subject;
    protected int estimate;
    protected int satisfactoryEvaluation;

    public test()
    {
        System.out.println("So, this is a review of you exam success: ");

    }

    public void set(String subject, int estimate, int satisfactoryEvaluation)
    {
        this.subject = subject;
        this.estimate = estimate;
        this.satisfactoryEvaluation = satisfactoryEvaluation;
    }

    public void get()
    {
        System.out.println("Subject: " + subject);
        System.out.println(subject + " estimate: " + estimate);
        System.out.println(subject + " satisfactoryEvaluation: " + satisfactoryEvaluation);
    }

    public boolean ifReady()
    {
        if(subject != "" && estimate != 0 && satisfactoryEvaluation != 0)
            return true;
        else
            return false;
    }
}
