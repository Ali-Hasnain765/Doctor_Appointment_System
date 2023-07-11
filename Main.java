import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {


            Scanner sc = new Scanner(System.in);
            System.out.println("1.Menu");
            System.out.println("2.Helpline");
            System.out.println("3.Exit");
            System.out.println("Enter Choice Option?");
            int c = sc.nextInt();
            if (c == 1) {
                Menu();
            } else if (c == 2) Helpline();
            else if (c == 3) {
                break;

            } else {
                System.out.println("Invalid Choice");
            }
        }
    }


    static void Helpline() {
        System.out.println("HELP Line Number : 01913609500 \n Telephone Number:2563363 ");
    }
    static void Menu()
    {
        System.out.println("1.Doctor List: ");
        System.out.println("2.Patient Appointment: ");
        System.out.println("3.Exit: ");
        System.out.println("Enter Your Choice: ");
        //Class&Obj
        Doctor dc = new Doctor( "Dr.Shakil Hasan", "Pediatrician");
        Doctor dc1 = new Doctor("Dr.Mustahid Hasan Rifat", "Dermatologist");
        Doctor dc2 = new Doctor("Dr.Mithun Kumer Das","Ophthalmologist");
        Doctor dc3 = new Doctor("Dr.Susmoy Kormokar","Neurologist");
        Doctor dc4 = new Doctor("Dr.Ustho paul","Psychiatrist");

        dc.setVisitamount(500);
        dc1.setVisitamount(1000);
        dc2.setVisitamount(2000);
        dc3.setVisitamount(1500);
        dc4.setVisitamount(600);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 1) {
            System.out.println("Doctor Information: ");
            dc.Doctordisplay();
            dc1.Doctordisplay();
            dc2.Doctordisplay();
            dc3.Doctordisplay();
            dc4.Doctordisplay();
            Menu();

        } else if(a==2) {
            String x1 = null;

            System.out.println("Enter the Patient Name: ");
            Scanner pc = new Scanner(System.in);
            String na = pc.nextLine();
            System.out.println("Enter the Patient Age: ");
            int ag  =pc.nextInt();
            System.out.println("Enter the patient Address: ");
            String ad = pc.next();
            System.out.println("Enter the blood Group: ");
            String b =pc.next();
            while(true) {
                System.out.println("Select Doctor Type?");
                System.out.println("1.Pediatrician\n 2.Dermatologist\n 3.Ophthalmologist\n 4.Neurologist\n 5.Psychiatrist");
                int c = sc.nextInt();
                if (c > 0 && c < 6) {
                    if (c == 1) {
                        x1 = "Pediatrician";
                        System.out.println("Congratulation,Your appointment information submitted successfully");

                    } else if (c == 2) {
                        x1 = "Dermatologist";
                        System.out.println("Congratulation,Your appointment information submitted successfully");

                    } else if (c == 3) {
                        x1 = "Ophthalmologist";
                        System.out.println("Congratulation,Your appointment information submitted successfully");

                    } else if (c == 4) {
                        x1 = "Neurologist";
                        System.out.println("Congratulation,Your appointment information submitted successfully");

                    } else if (c == 5) {
                        x1 = "Psychiatrist";
                        System.out.println("Congratulation,Your appointment information submitted successfully");

                    }

                    System.out.println("1.View Appointment");
                    System.out.println("2.Exit");
                    int m = pc.nextInt();
                    if (m == 1) {

                        System.out.println("_____________Appointment Details_______________");
                        int i = 1;
                        System.out.println("1.Serial Number: " + i);
                        i++;
                        System.out.println("Appointment Time:24 Dec 2022 12.30pm");



                        System.out.println("_________________Patient Information________________");
                        System.out.println("Name Of Patient: " + na);
                        System.out.println("Age: " + ag);
                        System.out.println("Address: " + ad);
                        System.out.println("Blood: " + b);
                        System.out.println("Doctor Type: " + x1);

                        System.out.println("__________________Thank You________________");
                        Menu();


                    } else {

                           break;

                            }
                        }

                    }
                }

                else {
                    System.out.println("Invalid Choice");
                }
            }


        }





