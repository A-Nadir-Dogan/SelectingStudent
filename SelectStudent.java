/*
        Project: Determining the students to be selected for the sports course
        Write an application.

        course requirements:
        men: height: 1.60 and up
                  weight:70-90kg
        girls: height: 1.50 and up
                weight: 50-70 kg

        the number of students from the user and each student
        Enter name, gender, weight and height information for
        please ask.
        */

import java.util.Scanner;

public class SelectStudent {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Hello, please fill the form.");
        System.out.print("Enter the number of students: ");
        int numStd=scan.nextInt();

        String[] students=new String[numStd];
        String[] gender=new String[numStd];
        double[] height=new double[numStd];
        double[] weight=new double[numStd];

        boolean isSuccess=true;
        do {
            isSuccess=true;
            for(int i=0;i<numStd;i++){
                System.out.print("Nane: ");
                students[i]=scan.next();

                System.out.print("gender: ");
                String gen=scan.next().toUpperCase().substring(0,1);
                if(gen.equals("K") || gen.equals("E")){
                    gender[i]=gen;
                }else {
                    System.out.println("incorrect entry!");
                    isSuccess=false;
                    break;
                }

                System.out.print("height: ");
                height[i]=scan.nextDouble();

                System.out.print("weight: ");
                weight[i]=scan.nextDouble();
            }
        }while(!isSuccess);
        int counter=0;
        System.out.println("*** students selected for the course. ***");
        for(int i=0;i<numStd; i++) {
            if(gender[i].equals("K") && height[i]>=1.50 && weight[i]>=50 && weight[i]<=70){
                System.out.println("Name: "+students[i]+" gender: "+gender[i]+" height "+height[i]+ " weight: "+weight[i]);
                counter++;
            }else if(gender[i].equals("E") && height[i]>=1.60 && weight[i]>=70 && weight[i]<=90){
                System.out.println("Name: "+students[i]+" gender: "+gender[i]+" height: "+height[i]+ " weight: "+weight[i]);
                counter++;
            }
        }
        if(counter==0){
            System.out.println("Unfortunately, no students who meet the course requirements were found.");


        }

    }
}
