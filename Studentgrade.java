import java.util.Scanner;
public class Studentgrade {
    public static void main(String[] args){
        System.out.println("\n\n\t\t\t\t STUDENT GRADE CALCULATOR \n\n\t\t");
        Scanner sc=new Scanner(System.in);

                //Taking user input


        System.out.print("Total no:of subjects : ");
        int subjects = sc.nextInt();
        int count=0;
        String[] names = new String[subjects];
        for (int i = 0; i < names.length; i++) {
            System.out.print("\n\n Enter " + (i + 1) + " subject name: ");
            names[i] = sc.next();
        }
        int []mark=new int[names.length];
        for(int i=0;i<=mark.length-1;i++){
            System.out.print("\n\n Enter marks of "+names[i]+" : ");
            mark[i]=sc.nextInt();
            count+=mark[i];
        }

                // Calculate grade


        float Sub=subjects*100;
        float result=((count/Sub)*100);
        if(result>95){
            System.out.println("\n\n Grade : 'S'\n Percentage : "+result+"\n Marks : "+count);
        }
        else if(result>85.0 && result<95.0){
            System.out.println("\n\n Grade : 'A'\n Percentage : "+result+"\n Marks : "+count);
        }
        else if(result>75.0 && result<85.0){
            System.out.println("\n\n Grade : 'B'\n Percentage : "+result+"\n Marks : "+count);
        }
        else if(result>65.0 && result<75.0){
            System.out.println("\n\n Grade : 'C'\n Percentage : "+result+"\n Marks : "+count);
        }
        else if(result>55.0 && result<65.0){
            System.out.println("\n\n Grade : 'D'\n Percentage : "+result+"\n Marks : "+count);
        }
        else if(result>45.0 && result<55.0){
            System.out.println("\n\n Grade : 'E'\n Percentage : "+result+"\n Marks : "+count);
        }
        else{
            System.out.println("\n\n Grade : 'FAIL'\n Percentage : "+result+"\n Marks : "+count);
        }
             // Check for invalid input

        if(result>100){
            System.out.println("Re-Check marks you Entered above");
        }
        else if(count>Sub){
            System.out.println("Re-Check marks you Entered above");
        }
        sc.close();
    }
}
