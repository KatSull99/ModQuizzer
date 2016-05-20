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
				System.out.println("Please write the number of questions you would like to answer.");
				
				int numberOfQuestions=userInput.nextInt();
				int counter=0;
				for (int i=0; i<numberOfQuestions; i++)
					{				
						int randomNumber=(int)(Math.random()*20)+10;
						int randomNumber2=(int)(Math.random()*30)+15;						
						int randomNumber3=(int)(Math.random()*20)+10;
						int randomNumber4=(int)(Math.random()*10)+1;
					if (i%10==0)
						{
							System.out.println();
							System.out.println("What is " + randomNumber + " % " + randomNumber + "?");
							int answer=userInput.nextInt();
							if (answer==(randomNumber%randomNumber))
								{
									System.out.println("Your answer was correct!");
									counter++;
									System.out.println();
								}
						else
							{
								System.out.println("Sorry, your answer was wrong! The correct answer is " + randomNumber%randomNumber);
								System.out.println();
							}
					}
										
					else if (i%7==1)
						{
							System.out.println("What is " + randomNumber4 + " % " + randomNumber3 + "?");
							int answer=userInput.nextInt();
							if (answer==(randomNumber4%randomNumber3))
								{
									System.out.println("Your answer is correct!");
									counter++;
									System.out.println();
								}
							else
								{
									System.out.println("Sorry, your answer was wrong! The correct answer is " + randomNumber4%randomNumber3);
									
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
											counter++;
											System.out.println();
										}
									else
										{
											System.out.println("Sorry, your answer was wrong! The correct answer is " + randomNumber2%randomNumber);
											
											System.out.println();
																																			
								}
						}
					System.out.println();
					System.out.println("You got " + counter + " out of " + numberOfQuestions + " correct!");
							}
						}		
					
			}
	
					 
				

	
