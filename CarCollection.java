import java.util.*;

interface Showroom {
    void welCome();

}

public class CarCollection implements Showroom {
    public void welCome() {
        System.out.println("      : Welcome to CARCLUB :");
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        CarCollection cl = new CarCollection();
        cl.welCome();

        String type;
        String brand;
        int budget;

        System.out.println("  Which type of car you want\n1.Sedan 2.Suv 3.Hatchback\n Enter type:-");

        type = sc.nextLine();

        switch (type) {
            // CASE 1 SUV SONALI BANSAL !
            case "suv":
                System.out.println("Your Choice is SUV !\nSUV cars known for POWER");
                System.out.println(
                        "We have several top brands of SUV like : \nMarutiSuzuki, Hyundai, Tata, Mahindra and Toyota ");
                System.out.println("Enter the brand : ");
                brand = sc.nextLine();
                if(brand.equals("tata")||brand.equals("marutisuzuki")||brand.equals("hyundai")||brand.equals("mahindra")||brand.equals("toyota")){
                    System.out.println("Enter your budget  for suv car:-");
                    budget=sc.nextInt();
                
                if (budget < 400000) {
                    System.out.println("NO CARS AVAILABLE AT THIS PRICE\n SORRY :");
                    break;
                }
                if (budget < 1500000) {
                    System.out.println(
                            "At this price we have Sedan and Hatchback cars.\n SUV cars not available at this price!\n Change your type to Sedan OR Hatchback");
                } else {
                    if (brand.equals("tata")) {
                        if ((budget >= 1500000 && budget <= 3000000) || (budget > 3000000)) {
                            System.out.println("Harrier\nPrice: 1600000");
                        }
                        if (budget > 3000000) {
                            System.out.println("Safari\nPrice: 3200000\nNexon\nPrice: 3970000");
                        }
                    }
                    if (brand.equals("hyundai")) {
                        if ((budget >= 1500000 && budget <= 3000000) || (budget > 3000000)) {
                            System.out.println("Creta\nPrice: 3000000\nAlcazar\nPrice: 2100000");
                        }
                        if (budget > 3000000) {
                            System.out.println("Venue\nPrice: 4000000");
                        }
                    }
                    if (brand.equals("marutisuzuki")) {
                        if ((budget >= 1500000 && budget <= 3000000) || (budget > 3000000)) {
                            System.out.println("Vitara Brezza\nPrice: 2050000\nGrand Vitara\nPrice: 2830000");
                        }
                        if (budget > 3000000) {
                            System.out.println("S-Cross\nPrice: 3200000");
                        }
                    }
                    if (brand.equals("mahindra")) {
                        if ((budget >= 1500000 && budget <= 3000000) || (budget > 3000000)) {
                            System.out.println(
                                    "Bolero\nPrice: 1540000\nScorpion Clasic\nPrice: 1600000\nThar\nPrice: 1860000\nXUV 700\nPrice: 2370000\n");
                        }
                        if (budget > 3000000) {
                            System.out.println("Scorpio N\nPrice: 3145000");
                        }
                    }
                    if (brand.equals("toyota")) {
                        if ((budget >= 1500000 && budget <= 3000000) || (budget > 3000000)) {
                            System.out.println("Toyota Urban Cruiser\nPrice: 1560000");
                        }
                        if (budget >= 3500000) {
                            System.out.println("Toyota Fortuner\nPrice: 4060300");
                        }
                    }
                }}
                break;
            // CASE 2 NAVIN JOSHI SEDAN !

            case "sedan":
                System.out.println("\nYour choice is Sedan !\n(Sedan cars is known for comfort)\n");
                System.out.println(
                        "We have several top brands of Sedan like :- Hyundai, MarutiSuzuki, Tata, Honda");
                System.out.println("\nEnter the Brand :-");
                brand = sc.nextLine();
                if(brand.equals("tata")||brand.equals("marutisuzuki")||brand.equals("hyundai")||brand.equals("honda")){
                    
                System.out.println("Enter your budget  for sedan car:-");
                budget = sc.nextInt();
                if (budget < 400000) {
                    System.out.println("NO CARS AVAILABLE AT THIS PRICE\n SORRY :");
                    break;
                }
                if (budget < 900000) {
                    System.out.println(
                            "At this price we have Hatchback cars.\n Sedan cars not available at this price!\n Change your type to Hatchback ");
                }

                else {
                    if (brand.equals("hyundai")) {
                        if ((budget >= 900000 && budget <= 1200000) || (budget > 1200000)) {
                            System.out.println("~ i20  price-:980500/-\n~ Aura  price-:1135000/-");
                        }
                        if (budget > 1200000) {
                            System.out.println(
                                    "~ Verna  price-:1500000/-\n~ Texan  price-:1358000/-\n~ Elantra  price-: 1238700/-");
                        }

                    }
                    if (brand.equals("marutisuzuki")) {
                        if ((budget >= 900000 && budget <= 1200000) || (budget > 1200000)) {
                            System.out.println("~ Dzire  price-:1000500/-\n~ Swift  price-:1180000/-");
                        }
                        if (budget > 1200000) {
                            System.out.println("~ Ciaz  price-:1450000/-\n~ Baleno  price-:1258000/-");
                        }
                    }
                    if (brand.equals("tata")) {
                        if ((budget >= 900000 && budget <= 1200000) || (budget > 1200000)) {
                            System.out.println("~ Tigor classic  price-:1100500/-\n~ Sierra  price-:985000/-");
                        }
                    }
                    if (brand.equals("honda")) {
                        if (budget >= 900000) {
                            System.out.println(
                                    "~ City  price-:1300500/-\n~ Amaze  price-:1480000/-\n~ HR-V price-:1200000");
                        }

                    }
                    if (budget > 1500000) {
                        System.out.println("Your budget is prefer to buy SUVs so please cheack our SUV cars!");

                    }
                    break;
                }}
                // CASE 3 HIMANSHU HATCBACK!
            case "hatchback":
                System.out.println("Your choice is hatchback\n hatchhback car's are known as famliy cars");

                System.out
                        .println("We have several top  brands of Hatchback like\n: Hyundai,MarutiSuzuki,Tata,Honda: ");

                System.out.println("Enter which brand do you prefer. \nHyundai OR MarutiSuzuki OR Tata OR Honda: - \n");
                brand = sc.nextLine();
                if(brand.equals("tata")||brand.equals("marutisuzuki")||brand.equals("hyundai")||brand.equals("honda")){
                    
                    System.out.println("Enter your budget  for hatchback car:-");
                    budget = sc.nextInt();
              

                if (brand.equals("hyundai")) {
                    if (budget < 400000) {
                        System.out.println("NO CARS AVAILABLE AT THIS PRICE\n SORRY :");
                    }

                    if ((budget >= 400000 && budget <= 900000) || (budget >= 400000 && budget >= 900000)) {
                        System.out.println("Hyundai SANTRO \n Price :₹ 489700");
                        System.out.println("Hyundai Grand i 10 Nios\nPrice: ₹ 543000");
                        System.out.println("Hyundai Grand i 10 Nios\nPrice: ₹ 543000");
                        System.out.println("Hyundai  i 20 \n Price : ₹ 707000");
                        System.out.println("Hyundai  i 20 N LINE \nPrice : ₹ 900000");
                    }

                    if (budget >= 1000000) {
                        System.out.println(
                                " In this budget you can also buy Sedan cars So please check our Sedan OR SUV cars !");
                        break;
                    }
                }
                if (brand.equals("tata")) {
                    if (budget < 400000) {
                        System.out.println("NO CARS AVAILABLE AT THIS PRICE\n SORRY :");
                    }
                    if ((budget >= 400000 && budget <= 900000) || (budget >= 400000 && budget >= 900000)) {
                        System.out.println("Tata Tiago \nPrice :- 600000");
                        System.out.println("TATA Altroz\n Price :- 660000");
                    }
                    if (budget >= 1000000) {
                        System.out.println(
                                " In this budget you can also buy Sedan cars So please check our Sedan cars !");
                    }

                }
                if (brand.equals("honda")) {
                    if (budget < 400000) {
                        System.out.println("NO CARS AVAILABLE AT THIS PRICE\n SORRY :");
                    }
                    if ((budget >= 400000 && budget <= 900000) || (budget >= 400000 && budget >= 900000)) {
                        System.out.println("Honda Amaze \n Price:-650000 ");
                        System.out.println("Honda JAZZ V \n Price:-800000");
                    }
                    if (budget >= 1000000) {
                        System.out.println(
                                " In this budget you can also buy Sedan cars So please check our Sedan cars !");
                    }

                }
                if (brand.equals("marutisuzuki")) {
                    if (budget < 400000) {
                        System.out.println("NO CARS AVAILABLE AT THIS PRICE\n SORRY :");
                    }
                    if ((budget >= 400000 && budget <= 900000) || (budget >= 400000 && budget >= 900000)) {
                        System.out.println("MarutiSuzuki Swift\nPrice:-800000");
                        System.out.println("MarutiSuzuki Baleno\nPrice:-850000");
                        System.out.println("MarutiSuzuki Alto 800\n Price:-500000");
                        System.out.println("MarutiSuzuki S Presso\nPrice:-600000");
                        System.out.println("MarutiSuzuki ignis\nPrice:-500000 ");
                    }
                    if (budget >= 1000000) {
                        System.out.println(
                                " In this budget you can also buy Sedan cars So please check our Sedan cars !");
                    }

                    break;
                    
                }}
                default:
                System.out.println("invalid type");

                sc.close();
        }
    }
}
