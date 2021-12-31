import java.util.Scanner;
public class Stockers {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		
		int n=1;
		int num=0;
		double price[];
		boolean b[];
		int c=0;
		System.out.println("Enter  the no of companies");
		num=read.nextInt();
		price=new double[num];
		b=new boolean[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter current stock price of the company "+(i+1));
			price[i]=read.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			b[i]=read.nextBoolean();
		}
		
		Stockers sc=new Stockers();
		sc.sort(price,0,num-1);
		
		do{
			System.out.println("Enter the operation you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			n=read.nextInt();
			if(n==1) {
				System.out.println("Stock prices in Ascending order are :");
				for(int i=0;i<num;i++) {
					System.out.println(price[i]);
				}
				
			}
			if(n==2) {
				System.out.println("Stock prices in Decending order are :");
				for(int i=num-1;i>=0;i--) {
					System.out.println(price[i]);
				}
				
			}
			if(n==3) {
				c=0;
				for(int i=0;i<num;i++) {
					if(b[i]==true) {
						c++;
					}
				}
				System.out.println("Total no of companies whose stock price rose today : "+c);
				
			}
			if(n==4) {
				c=0;
				for(int i=0;i<num;i++) {
					if(b[i]==false) {
						c++;
					}
				}
				System.out.println("Total no of companies whose stock price declined today : "+c);
			}
			if(n==5) {
				System.out.println("Enter the key value");
				double s=read.nextDouble();
				int point=0;
				for(int i=0;i<num;i++) {
					if(price[i]==s) {
						point++;
					}
				}
				if(point>=1)
					System.out.println("Stock of value "+s+" is present ");
				else
					System.out.println("Not present ");
			}

		}while(n!=0);
	}
	public void displayAscending() {
		System.out.println("Stock prices in Ascending order are :");
		
	}
	public void displayDecending() {

		
	}
	public void stockPricesRose() {
		
	}
	public void stockPricesDeclined() {
		
	}
	public void searchPrice() {
		
	}
	public void merge(double price[], int l, int m, int r)
	    {
	        int n1 = m - l + 1;
	        int n2 = r - m;
	        double L[] = new double[n1];
	        double R[] = new double[n2];
	        for (int i = 0; i < n1; ++i)
	            L[i] = price[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = price[m + 1 + j];

	        int i = 0, j = 0;
	  

	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                price[k] = L[i];
	                i++;
	            }
	            else {
	                price[k] = R[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < n1) {
	            price[k] = L[i];
	            i++;
	            k++;
	        } 
	        while (j < n2) {
	            price[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	public void sort(double price[], int l, int r)
	    {
	        if (l < r) {
	            int m =l+ (r-l)/2;
	            sort(price, l, m);
	            sort(price, m + 1, r);
	            merge(price, l, m, r);
	        }
	    }


		
}


