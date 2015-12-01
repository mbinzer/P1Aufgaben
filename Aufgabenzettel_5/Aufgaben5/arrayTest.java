import java.util.*;


		import java.util.*;

		public class arrayTest {
		
			public static void main(String[] args)
			{
				Random randNumGenerator = new Random();

				int array [] [] = new int[10][10];
				for (int i=0; i<array.length; i++)
				{
					array[i][i] = (randNumGenerator.nextInt(100));
					System.out.println(array[i][i]);
				}
			}
		}
