import java.util.*;
public class Game {
	  public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("\n\n\n\t\t\t\t<<<<<<<<<< Welcome to Numbers Prediction Game >>>>>>>>>>\n\n");
	        System.out.print("\n\n\tEnter your name please : ");
	        String name=sc.nextLine();
            int limit=0;
	        Into(name,sc,limit);
	        sc.close();
	    }
	    public static void Into(String name,Scanner sc,int limit){
	        try{
	            System.out.println("\n\t"+name+" Choise the level you want \n\t\t 1.Easy \n\t\t 2.Medium \n\t\t 3.difficult\n");
	            int choise=sc.nextInt();
	            if(choise==1){
	                System.err.println("\n\tYou chosen Easy Level\n\t Hint : The Number present  between the Range 1 to 10");
	                Thread.sleep(2000);
	                mainGame(limit=10,name,sc);
	            }
	            else if(choise==2){
	                System.err.println("\n\tYou chosen Medium Level\n\t Hint : The Number present  between the Range 1 to 50");
	                Thread.sleep(2000);
	                mainGame(limit=50,name,sc);
	            }
	            else{
	                System.err.println("\n\tYou chosen Hard Level\n\t Hint : The Number present  between the Range 1 to 100");
	                Thread.sleep(2000);
	                mainGame(limit=100,name,sc);
	            }
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	        
	    }
	    public static void mainGame(int limit,String name,Scanner sc){
	        try{
	            Random random=new Random();
	            String str= ("\n\t Read the Instructions carefully   " );
	            String str1=("\n\n  -> Only 5 Chances are Given to complete the game. ");
	            String str2=("\n  -> You can choose only one number at once.");
	            String str3=("\n  -> No time limit is given to complete the game.");
	            String str4=("\n  -> If you are failed to guess number play again.");
	            String str5=("\n  -> Guess number should be in between the range only.");
	            synchronized (str){
	                System.out.println(str);
	                Thread.sleep(2000);
	            }
	            synchronized (str1){
	                System.out.println(str1);
	                Thread.sleep(3000);
	            }
	            synchronized (str2){
	                System.out.println(str2);
	                Thread.sleep(3000);
	            }
	            synchronized (str3){
	                System.out.println(str3);
	                Thread.sleep(3000);
	            }
	            synchronized (str4){
	                System.out.println(str4);
	                Thread.sleep(3000);
	            }
	            synchronized (str5){
	                System.out.println(str5);
	                Thread.sleep(3000);
	            }
	            System.out.println("\n\n\t\t\t************ Let's begin the Game ************");
	            int computer=random.nextInt(limit)+1;
	            int randomAssign=random.nextInt(10)+1;
	            int count=5;
				int score=100;
	            // System.out.println(computer);
	            while(count>0)
	            {
	                System.out.println("\n Moves : "+count);
					System.out.println("\n Your Score : "+score);
	                System.out.print("\n Enter your Guessed number here "+name+": ");
	                int guess=sc.nextInt();
	                if(guess>computer){
	                    if(guess>limit){
	                        System.err.println("\n\n\t Your guess is out of range\n\n\tRead instruction carefully");
	                        continue;
	                    }
	                    else if((computer-guess) >= -randomAssign && (computer-guess) <= randomAssign){
	                        System.out.println("Yeah! Your Now Closely......Come On "+name);
							System.out.println("\n Your Score : "+(score+=25));
	                        count--;
	                        continue;
	                    }
	                    System.out.println("\n Your guess is high "+name);
						System.out.println("\n Your Score : "+(score-=20));
	                }
	                else if(guess<computer){
	                    System.out.println("\n Your guess is low "+name);
						System.out.println("\n Your Score : "+(score-=20));
	                }
	                else if(computer==guess){
	                    System.err.println("\n\n\t\t ------------->Congratulation "+name+"<-------------"+" \n\n\t\t You won the game\n\n\t\t Your Score : "+score);
	                    break;
	                }
	                else{
	                    System.out.println("\n It is  a wrong number please try again!");
						System.out.println("\n Your Score : "+(score-=20));;
	                }
	                count--;
	            }
	            if(count==0){
	                System.err.println("\n\n\t\t Sorry, you are failed to guess the number "+name+"\n\n\t\t Your Score : "+score+"\n\n\t\t Answer : "+computer);
	            }
	            }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	        System.out.println("\n\n\tDo you like to play game again !!\n\n\t Enter your Answer as  (Yes) or (No)");
	        String option=sc.next();
	    	if(option.equals("yes")|| option.equals("YES")||option.equals("Yes")){
	            System.out.println("\n\n\t\t\tWelcome to Numbers game\n\n");
	            Into(name,sc,limit);
	        }
	        else{
	            System.out.println("\n\n\t\tThanks for playing game\n\n\t\t Have a nice day ");
	            System.exit(0);
	        }
	        
	    }
	}


