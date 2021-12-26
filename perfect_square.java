package first_hand;

public class perfect_square {

	public static void main(String[] args)
	{
		int num=23;
		int count_of_factors=0;
		
		for(int i=1;i<=num;i=i+1) {
			if(num%i==0) {
				count_of_factors=count_of_factors+1;
				
			}
		}
		System.out.println(count_of_factors);
		if (count_of_factors%2!=0){
			System.out.println("perfect square");
		}
			else {
				System.out.println("not perfect square");
			}
			
		}
		
		
		
	}

