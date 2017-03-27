//package myquiz;

import java.util.*;


public class playquiz
{

	public static void main(String[] args)
	{

		System.out.println("\n\n\t\t   DIAMOND    Q U I Z    CHALLENGE \n");
		System.out.println("\t\t######################################");

		quiz obj1 = new quiz();

		obj1.menu();
	}

}



//Creating a quiz class
class quiz
{
		//static int max=5;
		public int count=0;


		String[] ques = new String[7];
		String[] opts = new String[7];
		int[] ans = new int[7];

		public void menu()
		{
			System.out.println("\n\n\n\t\t######################################");

			System.out.println("\n\t\t*** *** MAIN MENU *** ***\n");
			System.out.println("\t\t1. Quiz Rules");
			System.out.println("\t\t2. Play Quiz");
			System.out.println("\t\t3. Exit ");

			System.out.print ("\n\n\t\t Choose option (1-3) :\t ");

			Scanner inp1 = new Scanner(System.in);
			int choice = inp1.nextInt();


			if(choice==1)
			{


			for(int clear = 0; clear < 10; clear++)
			{
		     	System.out.println() ;
  			}



			System.out.println("\n\n\n \t\t######################################");

			System.out.println("\n\t\t*** *** QUIZ RULES *** ***\n");
			System.out.println ("\t\tTotal Questions\t = 7 ");
			System.out.println ("\t\tGold\t\t = 4 out of 7 correct ");
			System.out.println ("\t\tDiamond\t\t = 7 out 0f 7 correct ");


			quiz obj1 = new quiz();

			obj1.menu();


		}


		else if(choice==2)
		{


			quiz obj1 = new quiz();

			obj1.questions();
			obj1.options();
			obj1.answers();
			obj1.play();

		}

		else if(choice == 3)
		{
			System.exit(0);


		}
		else
		{
			System.out.println("\t\tInvalid option. Please select 1-3");
		}
	}




		//### Question function ###
		public void questions()
		{

					ques[0] = "what is Si?";
					ques[1] = "what is the capital of Nepal?";
					ques[2] = "What is height of Everest?";
					ques[3] = "what is the capital of Canada?";
					ques[4] = "what is the height of Tilicho lake?";
					ques[5] = "Who was the first Malla king of Nepal?";
					ques[6] = "When did PN Shah died?";




		}





		//### Option function ###
		public void options()
		{

				opts[0]=" 1.Silicon 2.Silica 3.Silly";
				opts[1]=" 1.pkr 2.ktm 3.brt";
				opts[2]=" 1.8844 2.8848 3.8852";
				opts[3]=" 1.Toronto 2.Ottawa 3.Victoria";
				opts[4]=" 1.4919 2.4920 3.4921";
				opts[5]=" 1.AriDev 2.Yalambar 3.JayDev";
				opts[6]=" 1.1833 2.1828 3.1831";

		}

		public void answers()
		{

				ans[0]= 1;
				ans[1]= 2;
				ans[2]= 2;
				ans[3]= 2;
				ans[4]= 1;
				ans[5]= 1;
				ans[6]= 3;


		}

		public void play()
		{

			for(int clear = 0; clear < 30; clear++)
			{
		     	System.out.println() ;
  			}

			for(int i=0; i< ques.length; i++)
			{
				Scanner inp = new Scanner(System.in);


				System.out.print("\n\n\n\t\t");
				System.out.print("Q " + (i+1) +":" );
				String temp_ques = ques[i];
				System.out.println(temp_ques); //prints questions


				System.out.print("\n\n\t\t");
				String temp_opts = opts[i];
				System.out.println(temp_opts); //prints options


				System.out.print("\n\n\t\t");
				System.out.print("Choose 1-3:\t");

				int answer = inp.nextInt(); // inputs answer user

				if(answer == ans[i]) //checks user's answer and correct answer
				{
					count++;

					for(int clear = 0; clear < 50; clear++)
					{
					   	System.out.println("\b") ;
					}


					switch(count)
					{
						case 1:
						{

							System.out.println("     #################");
							System.out.println("     #               #");
							System.out.println("     # G _ _ _       #");
							System.out.println("     # D _ _ _ _ _ _ #");
							System.out.println("     #               #");
							System.out.println("     #################");
							break;
						}


						case 2:
						{

							System.out.println("     #################");
							System.out.println("     #               #");
							System.out.println("     # G O _ _       #");
							System.out.println("     # D I _ _ _ _ _ #");
							System.out.println("     #               #");
							System.out.println("     #################");
							break;
						}
						case 3:
						{

							System.out.println("     #################");
							System.out.println("     #               #");
							System.out.println("     # G O L _       #");
							System.out.println("     # D I A _ _ _ _ #");
							System.out.println("     #               #");
							System.out.println("     #################");
							break;
						}
						case 4:
						{

							System.out.println("     #################");
							System.out.println("     #               #");
							System.out.println("     # G O L D       #");
							System.out.println("     # D I A M _ _ _ #");
							System.out.println("     #               #");
							System.out.println("     #################");
							break;
						}
						case 5:
						{

							System.out.println("     #################");
							System.out.println("     #               #");
							System.out.println("     # G O L D       #");
							System.out.println("     # D I A M O _ _ #");
							System.out.println("     #               #");
							System.out.println("     #################");
							break;
						}
						case 6:
						{

							System.out.println("     #################");
							System.out.println("     #               #");
							System.out.println("     # G O L D       #");
							System.out.println("     # D I A M O N _ #");
							System.out.println("     #               #");
							System.out.println("     #################");
							break;
						}
						case 7:
						{

							System.out.println("     #################");
							System.out.println("     #               #");
							System.out.println("     # G O L D       #");
							System.out.println("     # D I A M O N D #");
							System.out.println("     #               #");
							System.out.println("     #################");
							break;
						}
						default:
						{

							break;
						}
					}



				}



			}

			System.out.println("######################################");

			for(int i=0; i<30; i++)
			{
				System.out.println();
			}


			if(count <4)
			{
				System.out.println("\n\n\nSorry ! You narrowly miss gold. Try again\n\n\n");
			//	quiz obj1 = new quiz();

				//obj1.menu();

				quiz obj2 = new quiz();
				obj2.menu();

			}

			else if(count>3 && count<7)
			{
				System.out.println("\n\n\nCongratulations ! You won gold\n\n\n");

											System.out.println("     ############");
											System.out.println("     #          #");
											System.out.println("     # G O L D  #");
											System.out.println("     #          #");
											System.out.println("     ############");

				quiz obj2 = new quiz();
				obj2.menu();


			}
			else
			{
				System.out.println("\n\n\nBravo ! You won the DIAMOND  QUIZ CHALLENEGE\n\n\n");
											System.out.println("     #################");
											System.out.println("     #               #");
											System.out.println("     # D I A M O N D #");
											System.out.println("     #               #");
											System.out.println("     #################");

				quiz obj2 = new quiz();
				obj2.menu();


			}
		}



	}
