import java.util.*;
public class StonePaperScissor 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str[]={"stone","paper","scissor"};
        Random random = new Random();
        int computerNUM=random.nextInt(3);

        System.out.println("your chance please enter : 0-->stone OR 1-->paper OR 2-->scissor");
        int yourchoice=sc.nextInt();
        System.out.println("computer choice is : "+str[yourchoice]);
        System.out.println("computer choice is : " + str[computerNUM]);
        if(yourchoice>computerNUM) System.out.println("congratulations YOU WON");
        else if(yourchoice<computerNUM)
        System.out.println("bad luck YOU LOSE");
        else System.out.println("match is drawn");
    }
}
