import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        AssetManager manager = new AssetManager();



        manager.addAsset(
            new Asset(
                101,
                "Dell Latitude Laptop",
                "Laptop"
            )
        );


        manager.addAsset(
            new Asset(
                102,
                "HP Desktop",
                "Computer"
            )
        );


        manager.addAsset(
            new Asset(
                103,
                "Cisco Network Switch",
                "Network Equipment"
            )
        );



        while(true) {


            System.out.println("\n💻 IT Asset Management System");

            System.out.println("1. View Assets");
            System.out.println("2. Assign Asset");
            System.out.println("3. Exit");


            System.out.print("Choose option: ");

            int choice = scanner.nextInt();



            if(choice == 1) {


                manager.displayAssets();


            } else if(choice == 2) {


                System.out.print(
                    "Enter Asset ID: "
                );

                int id = scanner.nextInt();

                scanner.nextLine();


                System.out.print(
                    "Employee Name: "
                );

                String employee = scanner.nextLine();


                manager.assignAsset(
                    id,
                    employee
                );


            } else if(choice == 3) {


                System.out.println(
                    "Closing system..."
                );

                break;


            } else {


                System.out.println(
                    "Invalid choice."
                );

            }

        }


        scanner.close();

    }

}
