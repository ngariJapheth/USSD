package japhie;

import java.util.Scanner;
public class USSD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int mainOption;
        int subOption;
        do {
   
    	System.out.println("Welcome to mbanking");
    	System.out.println("1:My account");  
    	System.out.println("2:Funds transfer");
    	System.out.println("3:Top-up");
    	System.out.println("0:Exit");
    	System.out.println("Enter your choice");
    	//subOption = scanner.nextInt();
    	mainOption = scanner.nextInt();
    	
    	switch (mainOption){
    		case (1):
    			do {
    			
    				System.out.println("My account details");
    		    	System.out.println("1:check account balance");
    		    	System.out.println("2:view account statement");
    		    	System.out.println("3:change pin");
    		    	System.out.println("0:Back to main menu");
    		    	System.out.println("Enter your choice");
    		    	subOption = scanner.nextInt();
    			    
    		    	switch(subOption) {
    		    	case 1:
    		    	     System.out.println("your account balance is $50");
    		    	     break;
    		    	case 2:
    		    		 System.out.println("view your statement");
    		    		 break;
    		    	case 3:
    		    		 System.out.println("confirm to change your pin");
    		    		 break;
    		    	case 0:
    		             System.out.println("Return to main menu");
    		    		break;
    		    	default:
                        System.out.println("Invalid choice!");
    		    	}
    			} while (mainOption != 0);
            break;
    			
    		case 2:
    			do {
    				System.out.println("Funds transfer");
    		    	System.out.println("1:to own account");
    		    	System.out.println("2:another banks account");
    		    	System.out.println("3:mobile money");
    		    	System.out.println("0:Back to main menu");
    		    	System.out.println("Enter your choice");
    		    	subOption = scanner.nextInt();
    		    	
    		    	switch(subOption) {
    		    
    		    	case 1:
    		    	     System.out.println("confirm beneficiaries details");
    		    	     break;
    		    	case 2:
    		    		 System.out.println("choose bank");
    		    		 break;
    		    	case 3:
    		    		 System.out.println("enter recepients details");
    		    		 break;
    		    	case 0:
    		    		System.out.println("Return to main menu");
    		    		break;
    		    	default:
                        System.out.println("Invalid choice!");
                }
    	} while (mainOption != 0);
            break;    		    		
    		    	 
    		case 3:
    			do {
    				System.out.println("Top up");
    		    	System.out.println("1:Recharge mobile");
    		    	System.out.println("2:Purchase data");
    		    	System.out.println("3:Buy airtime");
    		    	System.out.println("0:Back to main menu");
    		    	System.out.println("Enter your choice");
    		    	subOption = scanner.nextInt();
    		    	
    		    	switch(subOption) {
    		    
    		    	case 1:
    		    	     System.out.println("enter mobile number");
    		    	     break;
    		    	case 2: 
    		    		 System.out.println("select data plan");
    		    		 break;
    		    	case 3:
   		    	     System.out.println("select airtime plan");
   		    	     break;
    		    	case 0:
    		    		System.out.println("Return to main menu");
    		    		break;
    		    	default:
                        System.out.println("Invalid choice!");
                        
    		    	 }
    			} while (mainOption != 0);
                break;
                
    		case 0:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice!");
        }
	} while (mainOption != 0);
//    scanner.close();
	
              }
            }                    
        		
    				
    			
    			
