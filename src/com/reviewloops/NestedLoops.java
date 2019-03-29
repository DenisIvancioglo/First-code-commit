package com.reviewloops;

public class NestedLoops {
	public static void main(String[]   args) {
		
		/* Write a program that prints the following pattern
		1 2 3 4 5 6 7 8 9 10
        2 4 6 8 10 12 14 16 18 20
        3 6 9 12 15 18 21 24 27 30
        4 8 12 16 20 24 28 32 36 40
        5 10 15 20 25 30 35 40 45 50 */
		
		for(int i=1; i<=5; i++) {
		
			
			
			for(int a=1; a<=10; a++) {
				
			System.out.print(i*a +" ");
			}
			System.out.println();
		}
		
		//should run 1 to 5
		//should print dots 1 to 5-i
		//
		for(int b=1; b<=5; b++) {
			for(int i=5; i>=0; i--) {
				if(i<=b) {
					System.out.print(b);
				}else {
				System.out.print(".");
				}
				
			}
			System.out.println();
		}
		//1 to 5
        //1 to 5-i
        //1 to i
        
        for(int i =1; i<=5; i++) {
            for(int k = 1; k<=(5-i); k++) {
                System.out.print(".");
            }
            for(int l = 1; l<=i; l++) {
                
                System.out.print(i);
            }
            
            System.out.println();
            
        }
       /* Write a program that prints the following pattern
        *
....1
...2
..3
.4
5*/
        for(int i=1; i<=5; i++) {
        	for(int k = 1; k<=(5-i); k++) {
                System.out.print(".");
            }
        	
        		System.out.print(i);
        		for(int c=2; c<=i; c++) {
        			System.out.print(".");
        		}
        		
        	
        	System.out.println();
        }
        /**
         * Write a program to produce the following pattern
         *
 ....1
 ...2.
 ..3..
 .4...
 5....

         *
         */
	}

}
