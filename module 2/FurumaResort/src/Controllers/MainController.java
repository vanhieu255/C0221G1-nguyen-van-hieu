package Controllers;

import Commons.FileUtils;
import Commons.StringUtils;
import Commons.Validators;
import Models.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isExit = false;
    private static String VILLA = "villa";
    private static String HOUSE = "house";
    private static String ROOM = "room";
    private static boolean isBackToMenu = false;

    public static void main(String[] args) {
        MainController.displayMainMenu();
    }

    public static void displayMainMenu() {
        int choose = 0;
        do {
            System.out.println("1.\t Add New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n");
            System.out.println("Please choose (1-6):");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationOfCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInformationOfEmployee();
                    break;
                case 7:
                    isExit = true;
                    break;
            }
            if (isExit == true) {
                break;
            }
        } while (choose >= 1 && choose <= 7);


    }

    private static void showInformationOfEmployee() {
    }

    private static void addNewBooking() {
    }

    private static void showInformationOfCustomer() {
    }

    private static void addNewCustomer() {
    }

    private static void showServices() {
        int choose = 0;
        do {
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            System.out.println("Please choose services");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    showAllService(VILLA);
                    isBackToMenu = false;

                    break;
                case 2:
                    showAllService(HOUSE);
                    isBackToMenu = false;
                    break;
                case 3:
                    showAllService(ROOM);
                    isBackToMenu = false;
                    break;
                case 4:
                    showAllServiceNotDup(VILLA);
                    isBackToMenu = true;
                    break;
                case 5:
                    showAllServiceNotDup(HOUSE);
                    isBackToMenu = true;
                    break;
                case 6:
                    showAllServiceNotDup(ROOM);
                    isBackToMenu = true;
                    break;
                case 7:
                    isBackToMenu = true;
                    break;
                case 8:
                    isExit = true;
                    break;
            }
            if (isBackToMenu || isExit) {
                return;

            }
        } while (choose >= 1 && choose <= 8);


    }

    public static List<Services> readAllServices(String fileName) {
        FileUtils.setFullPathFile(fileName);
        List<String> propertiesService = FileUtils.readFile();
        List<Services> listOfServices = new ArrayList<>();
        String[] propertiesElement = null;
        Services services = null;
        ExtraService extraService = null;
        for (String properties : propertiesService) {
            propertiesElement = properties.split(StringUtils.COMMA);
            if (fileName.equals(VILLA)) {
                services = new Villa();

                ((Villa) services).setStandarRoom(propertiesElement[6]);
                ((Villa) services).setOrtherDescripton(propertiesElement[7]);
                ((Villa) services).setAreaPool(Double.parseDouble(propertiesElement[8]));
                ((Villa) services).setNumberOfFloor(Integer.parseInt(propertiesElement[9]));

            } else if (fileName.equals(HOUSE)) {
                services = new House();

                ((House) services).setStandarRoom(propertiesElement[6]);
                ((House) services).setOrtherDescripton(propertiesElement[7]);
                ((House) services).setNumberOfFloor(Integer.parseInt(propertiesElement[8]));

            } else if (fileName.equals(ROOM)) {
                extraService = new ExtraService(propertiesElement[6], propertiesElement[7], Double.parseDouble(propertiesElement[8]));
                services = new Room();
                ((Room) services).setExtraService(extraService);

            }
            services.setId(propertiesElement[0]);
            services.setServiceName(propertiesElement[1]);
            services.setAreUse(Double.parseDouble(propertiesElement[2]));
            services.setRentCost(Double.parseDouble(propertiesElement[3]));
            services.setNumberOfPeoples(Integer.parseInt(propertiesElement[4]));
            services.setTypeRent(propertiesElement[5]);
            listOfServices.add(services);
        }
        return listOfServices;
    }


    private static void showAllServiceNotDup(String fileName) {
        Set<String> setOfServices = new TreeSet<>();
        System.out.println("--------------------------------");
        System.out.println("List service not duplicate name :");
        for (Services services : readAllServices(fileName)) {
            setOfServices.add(services.getServiceName());
        }
        for (String services : setOfServices) {
            System.out.println(services);
        }
    }

    private static void showAllService(String fileName) {
        System.out.println("--------------------------------");
        System.out.println("List service :");
        for (Services services : readAllServices(fileName)) {
            services.showInfor();

        }

    }


    private static void addNewServices() {
        int choose = 0;
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            System.out.println("Please choose services");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    addNewService(VILLA);
                    break;
                case 2:
                    addNewService(HOUSE);
                    break;
                case 3:
                    addNewService(ROOM);
                    break;
                case 4:
                    isBackToMenu = true;
                    break;
                case 5:
                    isExit = true;
                    break;
            }
            if (isBackToMenu || isExit) {
                return;

            }
        } while (choose >= 1 && choose <= 5);


    }

    private static void addNewService(String fileName) {
        String id = null;

        do {
            System.out.println("plese input services id :");
            id = scanner.nextLine();
        } while (!(Validators.isValidService(id, Validators.SERVICE_CODE_REGEX)));

        String serviceName = null;
        do {
            System.out.println("plese input services name :");
            serviceName = scanner.nextLine();
        } while (!(Validators.isValidService(serviceName, Validators.SERVICE_NAME_REGEX)));


        double areUse = 0;
        do {
            System.out.println("plese input area use :");
            areUse = Double.parseDouble(scanner.nextLine());
        } while (!(Validators.isMoreThan(areUse, 30)));

        double rentCost = 0;
        do {
            System.out.println("plese input rent Cost :");
            rentCost = Double.parseDouble(scanner.nextLine());
        } while (!(Validators.isMoreThan(rentCost, 0)));

        int numberOfPeoples = 0;
        do {
            System.out.println("plese input number Of Peoples :");
            numberOfPeoples = Integer.parseInt(scanner.nextLine());
        } while (Validators.isMoreThan(numberOfPeoples, 0, 20));


        System.out.println("plese input Type Rent :");
        String typeRent = scanner.nextLine();

        FileUtils.setFullPathFile(fileName);
        if (fileName.equals(VILLA)) {
            System.out.println("Please input standarRoom");
            String standarRoom = scanner.nextLine();
            System.out.println("Please input ortherDescripton");
            String ortherDescripton = scanner.nextLine();


            double areaPool = 0;
            do {
                System.out.println("Please input areaPool");
                areaPool = Double.parseDouble(scanner.nextLine());
            } while (!(Validators.isMoreThan(areaPool, 30)));

            int numberOfFloor = 0;
            do {
                System.out.println("Please input numberOfFloor");
                 numberOfFloor = Integer.parseInt(scanner.nextLine());
            } while (!(Validators.isMoreThan(numberOfFloor, 0)));

            FileUtils.writeFile(new String[]{id, serviceName, String.valueOf(areUse), String.valueOf(rentCost), String.valueOf(numberOfPeoples), typeRent,
                    standarRoom, ortherDescripton, String.valueOf(areaPool), String.valueOf(numberOfFloor)});
        } else if (fileName.equals(HOUSE)) {
            System.out.println("Please input standarRoom");
            String standarRoom = scanner.nextLine();
            System.out.println("Please input ortherDescripton");
            String ortherDescripton = scanner.nextLine();

            int numberOfFloor = 0;
            do {
                System.out.println("Please input numberOfFloor");
                numberOfFloor = Integer.parseInt(scanner.nextLine());
            } while (!(Validators.isMoreThan(numberOfFloor, 0)));


            FileUtils.writeFile(new String[]{id, serviceName, String.valueOf(areUse), String.valueOf(rentCost), String.valueOf(numberOfPeoples), typeRent,
                    standarRoom, ortherDescripton, String.valueOf(numberOfFloor)});

        } else if (fileName.equals(ROOM)) {

            String extraServiceName = null;
            do {
                System.out.println("please input extraServiceName");
                extraServiceName = scanner.nextLine();
            } while (!(Validators.isValidExtraServiceName(extraServiceName)));

            System.out.println("please input unit");
            String unit = scanner.nextLine();
            System.out.println("please input money");
            double money = Double.parseDouble(scanner.nextLine());
            FileUtils.writeFile(new String[]{id, serviceName, String.valueOf(areUse), String.valueOf(rentCost), String.valueOf(numberOfPeoples), typeRent,
                    extraServiceName, unit, String.valueOf(money)});

        }
    }

}
