/*It is a program by which a user/patient can book an appointment of a doctor
or can book a medical test . */  

/*  ******

    2nd Year , CSE-D 
    Project Made By :
    1.Ayush Raj         (RA2311003050162) 
    2.Priyanshu Bisht   (RA2311003050089) 
    3.Sarthak Jain      (RA2311003050174) 
    
    ******
*/

import java.util.*;
public class Project {
    static String name;static int age;static long phone;static String gender;static String address;static int choice;static int choice2;
    static int choice3;static int choice4;static int choice5;static int choice6;static int choice7;static int choice8;static int choice9;static int choice10;
    static int choice11;static int choice12;static int choice13;static int choice14;static int choice15;static int choice16;static int condition;    
    static String test;static int amt;static int input15;static String department;static int amount;
    static String doctor;   // declaring necessary variables
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calendar c = Calendar.getInstance();  
        boolean flag= true;
        do{
            System.out.println("Enter Patient's name :"); //taking patient's detail
            name=sc.nextLine();
            System.out.println("Enter Patient's age :");
            age =sc.nextInt();
            System.out.println("Enter Patient's phone number :");
            phone=sc.nextLong();
            sc.nextLine();
            System.out.println("Enter Patient's gender :");
            gender=sc.nextLine();
            System.out.println("Enter Patient's address :");
            address=sc.nextLine();

            System.out.print("Please Tell Whether ");
            System.out.print("You Want To Consult A Doctor");
            System.out.println(" Or Want To Perform A Test ");
            System.out.println("");  // giving choice to user/patient
            System.out.println("Press 1 to Consult A Doctor");
            System.out.println("");
            System.out.println("Press 2 to Have A Medical Test");
            condition=sc.nextInt();

            if(condition == 1)   {
                System.out.print("Now Showing The List Of Departments ");
                System.out.println(",(with their respective codes),");
                System.out.print("Please Select The Code of The One ");
                System.out.println("Which You Want To Refer :");
                System.out.println("");
                System.out.println("");     // displaying the list of departments
                System.out.print("----------------------------------------");
                System.out.println("----------------------------------------");
                System.out.print("SNo.    Department               Code  |");
                System.out.println("   SNo.    Department               Code");
                System.out.print("01.     General Practitioner     111   |   ");
                System.out.println("02.     Pediatrician             112");
                System.out.print("03.     Neurologist              113   |   ");
                System.out.println("04.     Rheumatologist           114");
                System.out.print("05.     Psychiatrist             115   |   ");
                System.out.println("06.     Nephrologist             116");
                System.out.print("07.     Pulmonologist            117   |   ");
                System.out.println("08.     Surgeon                  118");
                System.out.print("09.     Dermatologist            119   |   ");
                System.out.println("10.     Radiologist              120");
                System.out.print("11.     Cardiologist             121   |   ");
                System.out.println("12.     Orthopedist              122");
                System.out.print("13.     ENT                      123   |   ");
                System.out.println("14.     Oncologist               124");
                System.out.print("---------------------------------------");
                System.out.println("-----------------------------------------");
                System.out.println("");
                System.out.print("* Enter The Code of The Doctor ");
                System.out.println("Which You Want To Select *");
                choice=sc.nextInt();
                switch(choice){
                    case 111:
                        System.out.print("Selected Category Is :");
                        System.out.println(" General Practitioner");
                        System.out.print("Fees of all doctors ");
                        System.out.println("under this category is : 900");
                        System.out.println("");
                        System.out.print("The doctors under this ");
                        System.out.println("category are: ");
                        System.out.println("");
                        department="General Practitioner";
                        amount=900;
                        System.out.print("------------------------------");
                        System.out.print("------------------------------");
                        System.out.println("------------------------------");
                        System.out.println("  Doctor                 Code");
                        System.out.print("Dr. Rashmika Shindae     1111");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 8:00 am - 11:00 am * ");
                        System.out.print("Dr. Neeraj Rastogi       1112");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 2:00 pm - 4:00 pm * ");
                        System.out.print("Dr. Aayush Sharma        1113");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 5:00 pm - 8:00 pm * ");
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");
                        System.out.println("-----------------------------");
                        System.out.print("Enter The Code Of The Doctor");
                        System.out.println(" You Want To Refer :");
                        choice2=sc.nextInt();
                        switch(choice2) {
                            case 1111:
                                System.out.print("Selected Category Is : ");
                                System.out.println("General Practitioner");
                                System.out.print("Selected Doctor Is : ");
                                System.out.println("Dr. Rashmika Shindae");
                                doctor="Dr. Rashmika Shindae";
                                break;

                            case 1112:
                                System.out.print("Selected Category Is : ");
                                System.out.println("General Practitioner");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Neeraj Rastogi");
                                doctor="Dr. Neeraj Rastogi";
                                break;

                            case 1113:
                                System.out.print("Selected Category Is : ");
                                System.out.println("General Practitioner");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Aayush Sharma");
                                doctor="Dr. Aayush Sharma";
                                break;

                            default :
                                System.out.println("-- No Such code --");
                        }
                        System.out.println("");
                        System.out.print("*Payment To Be Done By Cash ");
                        System.out.println("Only At The Counter Of The Hospital*");
                        System.out.println("Payement to be paid : Rs.900");
                        System.out.println("");
                        System.out.println("To confirm appointment--> press 1");
                        System.out.println("To cancel appointment --> press 0 ");
                        int input=sc.nextInt();
                        if(input==1) {
                            System.out.println("*Appointment Confirmed*");
                        }else {
                            System.out.println(" -- *  Thank You  * -- ");
                            System.exit(0);
                        }
                        break;

                    case 112:
                        System.out.print("Selected Category Is : ");
                        System.out.println("Pediatrician");
                        System.out.print("Fees of all doctors under");
                        System.out.println(" this category is : 700");
                        System.out.print("The doctors under ");
                        System.out.println("this category are: ");
                        System.out.println("");
                        department="Pediatrician";
                        amount=700;
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");
                        System.out.println("-----------------------------");
                        System.out.println("  Doctor                 Code");
                        System.out.print("Dr. Manasvi Sinha        1121");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 8:00 am - 11:00 am * ");
                        System.out.print("Dr. Priya Singh          1122");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 2:00 pm - 4:00 pm * ");
                        System.out.print("Dr. Neerja Chopra        1123");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 5:00 pm - 8:00 pm * ");
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");
                        System.out.println("-----------------------------");
                        System.out.print("Enter The Code Of The Doctor");
                        System.out.println(" You Want To Refer :");                        
                        choice3=sc.nextInt();
                        switch(choice3) {
                            case 1121:
                                System.out.print("Selected Category Is : ");
                                System.out.println("Pediatrician");
                                System.out.print("Selected Doctor Is : ");
                                System.out.println("Dr. Manasvi Sinha");
                                doctor="Dr. Manasvi Sinha";
                                break;

                            case 1122:
                                System.out.print("Selected Category Is : ");
                                System.out.println("Pediatrician");
                                System.out.print("Selected Doctor Is : ");
                                System.out.println("Dr. Priya Singh");
                                doctor="Dr. Priya Singh";
                                break;

                            case 1123:
                                System.out.print("Selected Category Is : ");
                                System.out.println("Pediatrician");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Neerja Chopra");
                                doctor="Dr. Neerja Chopra";
                                break;

                            default :
                                System.out.println("-- No Such code --");
                        }
                        System.out.println("");
                        System.out.print("*Payment To Be Done By Cash ");
                        System.out.println("Only At The Counter Of The Hospital*");
                        System.out.println("Payement to be paid : Rs.700");
                        System.out.println("");
                        System.out.println("To confirm appointment--> press 1");
                        System.out.println("To cancel appointment --> press 0 ");
                        int input2=sc.nextInt();
                        if(input2==1) {
                            System.out.println("*Appointment Confirmed*");
                        }else {
                            System.out.println(" -- *  Thank You  * -- ");
                            System.exit(0);
                        }
                        break;

                    case 113:
                        System.out.print("Selected Category Is :");
                        System.out.println("Neurologist");
                        System.out.print("Fees of all doctors ");
                        System.out.println("under this category is : 1100");
                        System.out.println("");
                        System.out.print("The doctors under this ");
                        System.out.println("category are: ");
                        System.out.println("");
                        department="Neurologist";
                        amount=1100;
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.println("  Doctor                 Code");
                        System.out.print("Dr. Rajesh Kumar         1131");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 8:00 am - 11:00 am * ");
                        System.out.print("Dr. Kushagra Kushwaha    1132");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 2:00 pm - 4:00 pm * ");
                        System.out.print("Dr. Aditya Mishra        1133");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 5:00 pm - 8:00 pm * ");
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.print("Enter The Code Of The Doctor");
                        System.out.println(" You Want To Refer :");
                        choice4=sc.nextInt();
                        switch(choice4) {
                            case 1131:
                                System.out.println("Selected Category : ");
                                System.out.println("Neurologist");
                                System.out.println("Selected Doctor Is :");
                                System.out.println(" Dr. Rajesh Kumar");
                                doctor="Dr. Rajesh Kumar";
                                break;

                            case 1132:
                                System.out.println("Selected Category :");
                                System.out.println(" Neurologist");
                                System.out.println("Selected Doctor Is :");
                                System.out.println(" Dr. Kushagra Kushwaha");
                                doctor="Dr. Kushagra Kushwaha";
                                break;

                            case 1133:
                                System.out.println("Selected Category : ");
                                System.out.println("Neurologist");
                                System.out.println("Selected Doctor Is :");
                                System.out.println(" Dr. Aditya Mishra");
                                doctor="Dr. Aditya Mishra";
                                break;

                            default :
                                System.out.println("-- No Such code --");
                        }
                        System.out.println("");
                        System.out.print("*Payment To Be Done By Cash ");
                        System.out.println("Only At The Counter Of The Hospital*");
                        System.out.println("Payement to be paid : Rs.1100");
                        System.out.println("");
                        System.out.println("To confirm appointment--> press 1");
                        System.out.println("To cancel appointment --> press 0 ");
                        int input3=sc.nextInt();
                        if(input3==1) {
                            System.out.println("*Appointment Confirmed*");
                        }else {
                            System.out.println(" -- *  Thank You  * -- ");
                            System.exit(0);
                        }
                        break;

                    case 114:
                        System.out.print("Selected Category Is : ");
                        System.out.println("Rheumatologist");
                        System.out.print("Fees of all doctors under");
                        System.out.println(" this category is : 1100");
                        System.out.print("The doctors under ");
                        System.out.println("this category are: ");
                        System.out.println("");
                        department="Rheumatologist";
                        amount=1100;
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.println("  Doctor                 Code");
                        System.out.print("Dr. Garvit Pandey        1141");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 8:00 am - 11:00 am * ");
                        System.out.print("Dr. Akshita Poddar       1142");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 2:00 pm - 4:00 pm * ");
                        System.out.print("Dr. Sia Bhakuni          1143");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 5:00 pm - 8:00 pm * ");
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.print("Enter The Code Of The Doctor");
                        System.out.println(" You Want To Refer :");
                        choice5=sc.nextInt();
                        switch(choice5) {
                            case 1141:
                                System.out.print("Selected Category : ");
                                System.out.println("Rheumatologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Garvit Pandey");
                                doctor="Dr. Garvit Pandey";
                                break;

                            case 1142:
                                System.out.print("Selected Category : ");
                                System.out.println("Rheumatologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Akshita Poddar");
                                doctor="Dr. Akshita Poddar";
                                break;

                            case 1143:
                                System.out.print("Selected Category : ");
                                System.out.println("Rheumatologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Sia Bhakuni");
                                doctor="Dr. Sia Bhakuni";
                                break;

                            default :
                                System.out.println("-- No Such code --");
                        }
                        System.out.println("");
                        System.out.print("*Payment To Be Done By Cash ");
                        System.out.println("Only At The Counter Of The Hospital*");
                        System.out.println("Payement to be paid : Rs.1100");
                        System.out.println("");
                        System.out.println("To confirm appointment--> press 1");
                        System.out.println("To cancel appointment --> press 0 ");
                        int input4=sc.nextInt();
                        if(input4==1) {
                            System.out.println("*Appointment Confirmed*");
                        }else {
                            System.out.println(" -- *  Thank You  * -- ");
                            System.exit(0);
                        }
                        break;

                    case 115:
                        System.out.print("Selected Category Is : ");
                        System.out.println("Psyhiatrist");
                        System.out.print("Fees of all doctors under");
                        System.out.println(" this category is : 1300");
                        System.out.print("The doctors under ");
                        System.out.println("this category are: ");
                        System.out.println("");
                        department="Psyhiatrist";
                        amount=1300;
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.println("  Doctor                 Code");
                        System.out.print("Dr. Mansi Shahi          1151");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 8:00 am - 11:00 am * ");
                        System.out.print("Dr. Sona Tiwari          1152");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 2:00 pm - 4:00 pm * ");
                        System.out.print("Dr. Vivek Bisht          1153");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 5:00 pm - 8:00 pm * ");
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.print("Enter The Code Of The Doctor");
                        System.out.println(" You Want To Refer :");
                        choice6=sc.nextInt();
                        switch(choice6) {
                            case 1151:
                                System.out.print("Selected Category :  ");
                                System.out.println("Psychiatrist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Mansi Shahi");
                                doctor="Dr. Mansi Shahi";
                                break;

                            case 1152:
                                System.out.print("Selected Category :  ");
                                System.out.println("Psychiatrist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Sona Tiwari");
                                doctor="Dr. Sona Tiwari";
                                break;

                            case 1153:
                                System.out.print("Selected Category :  ");
                                System.out.println("Psychiatrist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Vivek Bisht");
                                doctor="Dr. Vivek Bisht";
                                break;

                            default :
                                System.out.println("-- No Such code --");
                        }
                        System.out.println("");
                        System.out.print("*Payment To Be Done By Cash ");
                        System.out.println("Only At The Counter Of The Hospital*");
                        System.out.println("Payement to be paid : Rs.1300");
                        System.out.println("");
                        System.out.println("To confirm appointment--> press 1");
                        System.out.println("To cancel appointment --> press 0 ");
                        int input5=sc.nextInt();
                        if(input5==1) {
                            System.out.println("*Appointment Confirmed*");
                        }else {
                            System.out.println(" -- *  Thank You  * -- ");
                            System.exit(0);
                        }
                        break;

                    case 116:
                        System.out.print("Selected Category Is : ");
                        System.out.println("Nephrologist");
                        System.out.print("Fees of all doctors under");
                        System.out.println(" this category is : 1100");
                        System.out.print("The doctors under ");
                        System.out.println("this category are: ");
                        System.out.println("");
                        department="Nephrologist";
                        amount=1100;
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.println("  Doctor                 Code");
                        System.out.print("Dr. Prince Verma         1161");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 8:00 am - 11:00 am * ");
                        System.out.print("Dr. Raj Arayan           1162");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 2:00 pm - 4:00 pm * ");
                        System.out.print("Dr. Sameer Singh         1163");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 5:00 pm - 8:00 pm * ");
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.print("Enter The Code Of The Doctor");
                        System.out.println(" You Want To Refer :");
                        choice7=sc.nextInt();
                        switch(choice7) {
                            case 1161:
                                System.out.print("Selected Category : ");
                                System.out.println("Nephrologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Prince Verma");
                                doctor="Dr. Prince Verma";
                                break;

                            case 1162:
                                System.out.print("Selected Category : ");
                                System.out.println("Nephrologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Raj Arayan");
                                doctor="Dr. Raj Arayan";
                                break;

                            case 1163:
                                System.out.print("Selected Category : ");
                                System.out.println("Nephrologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Sameer Singh");
                                doctor="Dr. Sameer Singh";
                                break;

                            default :
                                System.out.println("-- No Such code --");
                        }
                        System.out.println("");
                        System.out.print("*Payment To Be Done By Cash ");
                        System.out.println("Only At The Counter Of The Hospital*");
                        System.out.println("Payement to be paid : Rs.1100");
                        System.out.println("");
                        System.out.println("To confirm appointment--> press 1");
                        System.out.println("To cancel appointment --> press 0 ");
                        int input6=sc.nextInt();
                        if(input6==1) {
                            System.out.println("*Appointment Confirmed*");
                        }else {
                            System.out.println(" -- *  Thank You  * -- ");
                            System.exit(0);
                        }
                        break;

                    case 117:
                        System.out.print("Selected Category Is : ");
                        System.out.println("Pulmonologist");
                        System.out.print("Fees of all doctors under");
                        System.out.println(" this category is : 1100");
                        System.out.print("The doctors under ");
                        System.out.println("this category are: ");
                        System.out.println("");
                        department="Pulmonologist";
                        amount=1100;
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.println("  Doctor                 Code");
                        System.out.print("Dr. Rakesh Thakur        1171");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 8:00 am - 11:00 am * ");
                        System.out.print("Dr. Himanshu Pant        1172");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 2:00 pm - 4:00 pm * ");
                        System.out.print("Dr. Neha Roy             1173");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 5:00 pm - 8:00 pm * ");
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.print("Enter The Code Of The Doctor");
                        System.out.println(" You Want To Refer :");
                        choice8=sc.nextInt();
                        switch(choice8) {
                            case 1171:
                                System.out.print("Selected Category : ");
                                System.out.println("Pulmonologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Rakesh Thakur");
                                doctor="Dr. Rakesh Thakur";
                                break;

                            case 1172:
                                System.out.print("Selected Category : ");
                                System.out.println("Pulmonologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Himanshu Pant");
                                doctor="Dr. Himanshu Pant";
                                break;

                            case 1173:
                                System.out.print("Selected Category : ");
                                System.out.println("Pulmonologist");
                                System.out.print("Selected Doctor Is : ");
                                System.out.println("Dr. Neha Roy");
                                doctor="Dr. Neha Roy";
                                break;

                            default :
                                System.out.println("-- No Such code --");
                        }
                        System.out.println("");
                        System.out.print("*Payment To Be Done By Cash ");
                        System.out.println("Only At The Counter Of The Hospital*");
                        System.out.println("Payement to be paid : Rs.1100");
                        System.out.println("");
                        System.out.println("To confirm appointment--> press 1");
                        System.out.println("To cancel appointment --> press 0 ");
                        int input7=sc.nextInt();
                        if(input7==1) {
                            System.out.println("*Appointment Confirmed*");
                        }else {
                            System.out.println(" -- *  Thank You  * -- ");
                            System.exit(0);
                        }
                        break;

                    case 118:
                        System.out.print("Selected Category Is : ");
                        System.out.println("Surgeon");
                        System.out.print("Fees of all doctors under");
                        System.out.println(" this category is : 900");
                        System.out.print("The doctors under ");
                        System.out.println("this category are: ");
                        System.out.println("");
                        department="Surgeon";
                        amount=900;
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.println("  Doctor                 Code");
                        System.out.print("Dr. Hasan Ali              1181");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 8:00 am - 11:00 am * ");
                        System.out.print("Dr. Aadarsh Gupta          1182");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 2:00 pm - 4:00 pm * ");
                        System.out.print("Dr. Payal Mehta            1183");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 5:00 pm - 8:00 pm * ");
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.print("Enter The Code Of The Doctor");
                        System.out.println(" You Want To Refer :");
                        choice9=sc.nextInt();
                        switch(choice9) {
                            case 1181:
                                System.out.print("Selected Category : ");
                                System.out.println("Surgeon");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Hasan Ali");
                                doctor="Dr. Hasan Ali";
                                break;

                            case 1182:
                                System.out.print("Selected Category : ");
                                System.out.println("Surgeon");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Aadarsh Gupta");
                                doctor="Dr. Aadarsh Gupta";
                                break;

                            case 1183:
                                System.out.print("Selected Category : ");
                                System.out.println("Surgeon");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Payal Mehta");
                                doctor="Dr. Payal Mehta";
                                break;

                            default :
                                System.out.println("-- No Such code --");
                        }
                        System.out.println("");
                        System.out.print("*Payment To Be Done By Cash ");
                        System.out.println("Only At The Counter Of The Hospital*");
                        System.out.println("Payement to be paid : Rs.900");
                        System.out.println("");
                        System.out.println("To confirm appointment--> press 1");
                        System.out.println("To cancel appointment --> press 0 ");
                        int input8=sc.nextInt();
                        if(input8==1) {
                            System.out.println("*Appointment Confirmed*");
                        }else {
                            System.out.println(" -- *  Thank You  * -- ");
                            System.exit(0);
                        }
                        break;

                    case 119:
                        System.out.print("Selected Category Is : ");
                        System.out.println("Dermatologist");
                        System.out.print("Fees of all doctors under");
                        System.out.println(" this category is : 1100");
                        System.out.print("The doctors under ");
                        System.out.println("this category are: ");
                        System.out.println("");
                        department="Dermatologist";
                        amount=1100;
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.println("  Doctor                 Code");
                        System.out.print("Dr. Komal Singhania        1191");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 8:00 am - 11:00 am * ");
                        System.out.print("Dr. Rishita Tiwari         1192");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 2:00 pm - 4:00 pm * ");
                        System.out.print("Dr. Dheeraj Oberoi         1193");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 5:00 pm - 8:00 pm * ");
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.print("Enter The Code Of The Doctor");
                        System.out.println(" You Want To Refer :");
                        choice10=sc.nextInt();
                        switch(choice10) {
                            case 1191:
                                System.out.print("Selected Category : ");
                                System.out.println("Dermatologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Komal Singhania");
                                doctor="Dr. Komal Singhania";
                                break;

                            case 1192:
                                System.out.print("Selected Category : ");
                                System.out.println("Dermatologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Rishita Tiwari");
                                doctor="Dr. Rishita Tiwari";
                                break;

                            case 1193:
                                System.out.print("Selected Category : ");
                                System.out.println("Dermatologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Dheeraj Oberoi");
                                doctor="Dr. Dheeraj Oberoi";
                                break;

                            default :
                                System.out.println("-- No Such code --");
                        }
                        System.out.println("");
                        System.out.print("*Payment To Be Done By Cash ");
                        System.out.println("Only At The Counter Of The Hospital*");
                        System.out.println("Payement to be paid : Rs.1100");
                        System.out.println("");
                        System.out.println("To confirm appointment--> press 1");
                        System.out.println("To cancel appointment --> press 0 ");
                        int input9=sc.nextInt();
                        if(input9==1) {
                            System.out.println("*Appointment Confirmed*");
                        }else {
                            System.out.println(" -- *  Thank You  * -- ");
                            System.exit(0);
                        }
                        break;

                    case 120:
                        System.out.print("Selected Category Is : ");
                        System.out.println("Radiologist");
                        System.out.print("Fees of all doctors under");
                        System.out.println(" this category is : 1100");
                        System.out.print("The doctors under ");
                        System.out.println("this category are: ");
                        System.out.println("");
                        department="Radiologist";
                        amount=1100;
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.println("  Doctor                 Code");
                        System.out.print("Dr. Madan Bora           1201");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 8:00 am - 11:00 am * ");
                        System.out.print("Dr. Harish Rawat         1202");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 2:00 pm - 4:00 pm * ");
                        System.out.print("Dr. Jeevan Rautela       1203");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 5:00 pm - 8:00 pm * ");
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.print("Enter The Code Of The Doctor");
                        System.out.println(" You Want To Refer :");
                        choice11=sc.nextInt();
                        switch(choice11) {
                            case 1201:
                                System.out.println("Selected Category : ");
                                System.out.println("Radiologist");
                                System.out.println("Selected Doctor Is :");
                                System.out.println(" Dr. Madan Bora");
                                doctor="Dr. Madan Bora";
                                break;

                            case 1202:
                                System.out.println("Selected Category : ");
                                System.out.println("Radiologist");
                                System.out.println("Selected Doctor Is :");
                                System.out.println(" Dr. Harish Rawat");
                                doctor="Dr. Harish Rawat";
                                break;

                            case 1203:
                                System.out.println("Selected Category : ");
                                System.out.println("Radiologist");
                                System.out.println("Selected Doctor Is :");
                                System.out.println(" Dr. Jeevan Rautela");
                                doctor="Dr. Jeevan Rautela";
                                break;

                            default :
                                System.out.println("-- No Such code --");
                        }
                        System.out.println("");
                        System.out.print("*Payment To Be Done By Cash ");
                        System.out.println("Only At The Counter Of The Hospital*");
                        System.out.println("Payement to be paid : Rs.1100");
                        System.out.println("");
                        System.out.println("To confirm appointment--> press 1");
                        System.out.println("To cancel appointment --> press 0 ");
                        int input10=sc.nextInt();
                        if(input10==1) {
                            System.out.println("*Appointment Confirmed*");
                        }else {
                            System.out.println(" -- *  Thank You  * -- ");
                            System.exit(0);
                        }
                        break;

                    case 121:
                        System.out.print("Selected Category Is : ");
                        System.out.println("Cardiologist");
                        System.out.print("Fees of all doctors under");
                        System.out.println(" this category is : 1100");
                        System.out.print("The doctors under ");
                        System.out.println("this category are: ");
                        System.out.println("");
                        department="Cardiologist";
                        amount=1100;
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.println("  Doctor                 Code");
                        System.out.print("Dr. Khuswant Bhatt       1211");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 8:00 am - 11:00 am * ");
                        System.out.print("Dr. Deepak Joshi         1212");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 2:00 pm - 4:00 pm * ");
                        System.out.print("Dr. Kamlesh Yadav        1213");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 5:00 pm - 8:00 pm * ");
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.print("Enter The Code Of The Doctor");
                        System.out.println(" You Want To Refer :");
                        choice12=sc.nextInt();
                        switch(choice12) {
                            case 1211:
                                System.out.print("Selected Category : ");
                                System.out.println("Cardiologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Khuswant Bhatt");
                                doctor="Dr. Khuswant Bhatt";
                                break;

                            case 1212:
                                System.out.print("Selected Category : ");
                                System.out.println("Cardiologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Deepak Joshi");
                                doctor="Dr. Deepak Joshi";
                                break;

                            case 1213:
                                System.out.print("Selected Category : ");
                                System.out.println("Cardiologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Kamlesh Yadav");
                                doctor="Dr. Kamlesh Yadav";
                                break;

                            default :
                                System.out.println("-- No Such code --");
                        }
                        System.out.println("");
                        System.out.print("*Payment To Be Done By Cash ");
                        System.out.println("Only At The Counter Of The Hospital*");
                        System.out.println("Payement to be paid : Rs.1100");
                        System.out.println("");
                        System.out.println("To confirm appointment--> press 1");
                        System.out.println("To cancel appointment --> press 0 ");
                        int input11=sc.nextInt();
                        if(input11==1) {
                            System.out.println("*Appointment Confirmed*");
                        }else {
                            System.out.println(" -- *  Thank You  * -- ");
                            System.exit(0);
                        }
                        break;

                    case 122:
                        System.out.print("Selected Category Is : ");
                        System.out.println("Orthopedist");
                        System.out.print("Fees of all doctors under");
                        System.out.println(" this category is : 900");
                        System.out.print("The doctors under ");
                        System.out.println("this category are: ");
                        System.out.println("");
                        department="Orthopedist";
                        amount=900;
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.println("  Doctor                   Code");
                        System.out.print("Dr. Kailsahnath Dhami    1221");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 8:00 am - 11:00 am * ");
                        System.out.print("Dr. Yogendra Kandpal     1222");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 2:00 pm - 4:00 pm * ");
                        System.out.print("Dr. Dikshika Joshi       1223");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 5:00 pm - 8:00 pm * ");
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.print("Enter The Code Of The Doctor");
                        System.out.println(" You Want To Refer :");
                        choice13=sc.nextInt();
                        switch(choice13) {
                            case 1221:
                                System.out.print("Selected Category : ");
                                System.out.println("Orthopedist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Kailsahnath Dhami");
                                doctor="Dr. Kailsahnath Dhami";
                                break;

                            case 1222:
                                System.out.print("Selected Category : ");
                                System.out.println("Orthopedist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Yogendra Kandpal");
                                doctor="Dr. Yogendra Kandpal";
                                break;

                            case 1223:
                                System.out.print("Selected Category : ");
                                System.out.println("Orthopedist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Dikshika Joshi");
                                doctor="Dr. Dikshika Joshi";
                                break;

                            default :
                                System.out.println("-- No Such code --");
                        }
                        System.out.println("");
                        System.out.print("*Payment To Be Done By Cash ");
                        System.out.println("Only At The Counter Of The Hospital*");
                        System.out.println("Payement to be paid : Rs.900");
                        System.out.println("");
                        System.out.println("To confirm appointment--> press 1");
                        System.out.println("To cancel appointment --> press 0 ");
                        int input12=sc.nextInt();
                        if(input12==1) {
                            System.out.println("*Appointment Confirmed*");
                        }else {
                            System.out.println(" -- *  Thank You  * -- ");
                            System.exit(0);
                        }
                        break;

                    case 123:
                        System.out.print("Selected Category Is : ");
                        System.out.println("ENT");
                        System.out.print("Fees of all doctors under");
                        System.out.println(" this category is : 900");
                        System.out.print("The doctors under ");
                        System.out.println("this category are: ");
                        System.out.println("");
                        department="ENT";
                        amount=900;
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.println("  Doctor                 Code");
                        System.out.print("Dr. Rajendra Prasad      1231");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 8:00 am - 11:00 am * ");
                        System.out.print("Dr. Rakesh Maurya        1232");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 2:00 pm - 4:00 pm * ");
                        System.out.print("Dr. Mahesh Bhati         1233");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 5:00 pm - 8:00 pm * ");
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.print("Enter The Code Of The Doctor");
                        System.out.println(" You Want To Refer :");
                        choice14=sc.nextInt();
                        switch(choice14) {
                            case 1231:
                                System.out.print("Selected Category : ");
                                System.out.println("ENT");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Rajendra Prasad");
                                doctor="Dr. Rajendra Prasad";
                                break;

                            case 1232:
                                System.out.print("Selected Category : ");
                                System.out.println("ENT");                                
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Rakesh Maurya");
                                doctor="Dr. Rakesh Maurya";
                                break;

                            case 1233:
                                System.out.print("Selected Category : ");
                                System.out.println("ENT");                                
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Mahesh Bhati");
                                doctor="Dr. Mahesh Bhati";
                                break;

                            default :
                                System.out.println("-- No Such code --");
                        }
                        System.out.println("");
                        System.out.print("*Payment To Be Done By Cash ");
                        System.out.println("Only At The Counter Of The Hospital*");
                        System.out.println("Payement to be paid : Rs.900");
                        System.out.println("");
                        System.out.println("To confirm appointment--> press 1");
                        System.out.println("To cancel appointment --> press 0 ");
                        int input13=sc.nextInt();
                        if(input13==1) {
                            System.out.println("*Appointment Confirmed*");
                        }else {
                            System.out.println(" -- *  Thank You  * -- ");
                            System.exit(0);
                        }
                        break;

                    case 124:
                        System.out.print("Selected Category Is : ");
                        System.out.println("Oncologist");
                        System.out.print("Fees of all doctors under");
                        System.out.println(" this category is : 1100");
                        System.out.print("The doctors under ");
                        System.out.println("this category are: ");
                        System.out.println("");
                        department="Oncologist";
                        amount=1100;
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.println("  Doctor                 Code");
                        System.out.print("Dr. Rajeev Rajput        1241");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 8:00 am - 11:00 am * ");
                        System.out.print("Dr. Ashish Parasher      1242");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 2:00 pm - 4:00 pm * ");                        
                        System.out.print("Dr. Sheetal Anand        1243");
                        System.out.print("     ||||||     ");
                        System.out.print("Availablility Time :");
                        System.out.println(" * 5:00 pm - 8:00 pm * ");                        
                        System.out.print("------------------------------");
                        System.out.print("-------------------------------");                        
                        System.out.println("-----------------------------");
                        System.out.print("Enter The Code Of The Doctor");
                        System.out.println(" You Want To Refer :");
                        choice15=sc.nextInt();
                        switch(choice15) {
                            case 1241:
                                System.out.print("Selected Category : ");
                                System.out.println("Oncologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Rajeev Rajput");
                                doctor="Dr. Rajeev Rajput";
                                break;

                            case 1242:
                                System.out.print("Selected Category : ");
                                System.out.println("Oncologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Ashish Parasher");
                                doctor="Dr. Ashish Parasher";
                                break;

                            case 1243:
                                System.out.print("Selected Category : ");
                                System.out.println("Oncologist");
                                System.out.print("Selected Doctor Is :");
                                System.out.println(" Dr. Sheetal Anand");
                                doctor="Dr. Sheetal Anand";
                                break;

                            default :
                                System.out.println("-- No Such code --");
                        }
                        System.out.println("");
                        System.out.print("*Payment To Be Done By Cash ");
                        System.out.println("Only At The Counter Of The Hospital*");
                        System.out.println("Payement to be paid : Rs.1100");
                        System.out.println("");
                        System.out.println("To confirm appointment--> press 1");
                        System.out.println("To cancel appointment --> press 0 ");
                        int input14=sc.nextInt();
                        if(input14==1) {
                            System.out.println("*Appointment Confirmed*");
                        }else {
                            System.out.println(" -- *  Thank You  * -- ");
                            System.exit(0);
                        }
                        break;

                    default :
                        System.out.println("Wrong Code Entered.....   -_- ");
                }
                String date = (c.get(Calendar.DATE))+" / "+(c.get(Calendar.MONTH)+1)+" / "+(c.get(Calendar.YEAR)); //to store today's date
                System.out.println("");
                System.out.println("");                             // printing appointment receipt
                System.out.println("                Appointment_Receipt         ");
                System.out.print("-----------------------------");
                System.out.print("-----------------------------");
                System.out.println("-----------------------------");
                System.out.println("|  Name : "+name+"            Date : "+date);
                System.out.println("|  Age : "+age+"            ");
                System.out.println("|  Gender: "+gender+"       ");
                System.out.println("|  Address : "+address+"    ");
                System.out.println("|  Department : "+department+"      Doctor Name : " + doctor);
                System.out.println("|  FEE : "+amount);
                System.out.print("-----------------------------");
                System.out.print("-----------------------------");
                System.out.println("-----------------------------");
                System.out.println("                ****Thank_You****");
                System.out.print("-----------------------------");
                System.out.print("-----------------------------");
                System.out.println("-----------------------------");
                // printing appointment receipt
            }else if(condition ==2) {
                System.out.println("");  // displaying list of medical tests
                System.out.print("==========================");
                System.out.print("========List of Medical Tests=====");
                System.out.println("=============================");
                System.out.print("S.No.     Test            |       Cost");
                System.out.println("      SNo.   Test              |       Cost");
                System.out.print("1    X-ray                |       550");
                System.out.println("       2.   CT-scan             |       1000");
                System.out.print("3.   MRI                  |       3000");
                System.out.println("      4.   ECG                 |       200");
                System.out.print("5.   Thyroid function test|       600");
                System.out.println("       6.   Cholesterol test    |       400");
                System.out.print("7.   Blood sugar test     |       500");
                System.out.println("       8.   Complete Blood count|       350");
                System.out.print("9.   Liver function test  |       780");
                System.out.println("       10.  Echocardiogram      |       1800");
                System.out.print("11.  Kidney function test |       740");
                System.out.println("       12.  Serology            |       1000");
                System.out.print("13.  Lipid profile        |       950");
                System.out.println("       14.  HIV test            |       540");
                System.out.print("15.  Creatinine test      |       180");
                System.out.println("       16.  Vitamin-D test      |       650");
                System.out.print("17.  Urea test            |       150");
                System.out.println("       18.  Ultrasound          |       700");
                System.out.print("===============================");
                System.out.print("==============================");
                System.out.println("=============================");
                System.out.println("");
                System.out.println("Enter SNo. of test of your choice :-");
                choice16 = sc.nextInt();
                switch(choice16)
                {
                    case 1:
                        test ="X-ray";                    
                        amt = 300;
                        break;
                    case 2:
                        test ="CT-scan";                  
                        amt = 1000;  
                        break;
                    case 3:
                        test ="MRI(Magnetic resonance imaging)";
                        amt = 3000;
                        break;
                    case 4:
                        test ="ECG(Electrocardiograpgy)";  
                        amt =200;        
                        break;
                    case 5:
                        test ="Thyroid function test";    
                        amt = 600;        
                        break;
                    case 6:
                        test ="Cholesterol  test";        
                        amt = 400;      
                        break;
                    case 7:
                        test ="Blood sugar test";        
                        amt = 500;      
                        break;
                    case 8:
                        test ="Complete Blood count";    
                        amt = 350;    
                        break;
                    case 9:
                        test ="Liver function test";      
                        amt = 780;    
                        break;
                    case 10:
                        test ="Echocardiogram";            
                        amt =1800;    
                        break;
                    case 11:
                        test ="Kidney function test";      
                        amt = 740;    
                        break;
                    case 12:
                        test ="Serology";                  
                        amt = 1000;  
                        break;
                    case 13:
                        test ="Lipid profile";            
                        amt = 950;    
                        break;  
                    case 14:
                        test ="HIV test";                  
                        amt = 540;      
                        break;
                    case 15:
                        test ="Creatinine test";            
                        amt = 180;    
                        break;
                    case 16:
                        test ="Vitamin-D test";          
                        amt = 650;      
                        break;
                    case 17:
                        test ="Urea test ";                
                        amt = 150;      
                        break;
                    case 18:
                        test ="Ultasound";                
                        amt = 700;        
                        break;
                    default :
                        System.out.println("You Have Entered The Wrong No. ......-_-");
                }
                String date = (c.get(Calendar.DATE))+" / "+(c.get(Calendar.MONTH)+1)+" / "+(c.get(Calendar.YEAR));
                System.out.println("Your test is booked......");
                System.out.println("");
                System.out.println("");       // printing medical test receipt
                System.out.println("                  MEDICAL_TEST_RECEIPT     ");
                System.out.print("------------------------------");
                System.out.print("----------------------------");
                System.out.println("-----------------------------");
                System.out.println("|    Name : "+name+"                Date : "+date);
                System.out.println("|    Age : "+age+"            ");
                System.out.println("|    Gender: "+gender+"       ");
                System.out.println("|    Address : "+address+"    ");
                System.out.println("|    Test name : "+test+"     ");
                System.out.println("|    AMOUNT to be paid : "+amt);
                System.out.print("------------------------------");
                System.out.print("----------------------------");
                System.out.println("-----------------------------");
                System.out.println("                    **Thank_You**");
                System.out.print("------------------------------");
                System.out.print("----------------------------");
                System.out.println("-----------------------------");
            }else {
                System.out.println("****Wrong Input****");
            }
            input15=5;
            while(input15>1) {
            System.out.println("");
            System.out.print("If You Want To Again Book An ");
            System.out.print("Appointment Or To Perform Any Test");
            System.out.println(" Press 1, Else Press 0");
            input15=sc.nextInt();
            sc.nextLine();  
            /*giving choice to user/patientif he/she
             * again want to book appointment or medical test*/
            if(input15==0) {
                flag=false;
                System.out.print("Exiting...");
                System.out.println("     **|Bye Bye|**");
            }else if(input15==1){
                flag=true;
            }else{
                System.out.print("Wrong Choice Entered....");
                System.out.println("   (Re-Enter Your Choice)  ");
            }
            }
        }
        while(flag==true);
        sc.close();

        
    }
}
