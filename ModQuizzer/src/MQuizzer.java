import java.util.Scanner;

public class MQuizzer
	{

		public static void main(String[] args)
			{
				printNumOfQuestions();
			}
				
		public static void printNumOfQuestions()
			{
				Scanner userInput=new Scanner (System.in);
				System.out.println("Please write the number of questions you would like to answer");
				int numberOfQuestions=userInput.nextInt();
				int counter=0;
				for (int i=0; i<numberOfQuestions; i++)
					{				
						int randomNumber=(int)(Math.random()*20)+1;
						int randomNumber2=(int)(Math.random()*20)+1;
						int randomNumber3=(int)(Math.random()*10)+1;
						int randomNumber4=(int)(Math.random()*20)+6;
					if (i%4==0)
						{
							System.out.println();
							System.out.println("What is " + randomNumber + " % " + randomNumber + "?");
							int answer=userInput.nextInt();
							if (answer==(randomNumber%randomNumber))
								{
									System.out.println("Your answer was correct!");
									
									System.out.println();
								}
						else
							{
								System.out.println("Sorry, your answer was wrong! The correct answer is " + randomNumber2%randomNumber);
								System.out.println();
							}
					}
										
					else if (i%2==0)
						{
							System.out.println("What is " + randomNumber3 + " % " + randomNumber4 + "?");
							int answer=userInput.nextInt();
							if (answer==(randomNumber3%randomNumber4))
								{
									System.out.println("Your answer is correct!");
									
									System.out.println();
								}
							else
								{
									System.out.println("Sorry, your answer was wrong! The correct answer is " + randomNumber3%randomNumber4);
									counter++;
									System.out.println();
								}
						}
							else
								{
									System.out.println("What is " + randomNumber2 + " % " + randomNumber + "?");
									int answer=userInput.nextInt();
									if (answer==(randomNumber2%randomNumber))
										{
											System.out.println("Your answer is correct!");
											
											System.out.println();
										}
									else
										{
											System.out.println("Sorry, your answer was wrong! The correct answer is " + randomNumber2%randomNumber);
											
										
								
								}
						}
					System.out.println();
					System.out.println("You got " + counter + " out of " + numberOfQuestions + " correct!");
							}
						}		
					
			}
	
					 
				

	
