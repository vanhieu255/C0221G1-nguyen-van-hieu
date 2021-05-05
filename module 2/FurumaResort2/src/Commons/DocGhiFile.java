package Commons;

import Models.*;

import javax.xml.ws.Service;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    public static final String PATH = "src/data/";

    public static void ghiFlie(String path, List<Services> serviceList, boolean status) {
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(PATH + path);
            fileWriter = new FileWriter(file, status);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Services services1 : serviceList) {
               bufferedWriter.write(services1.toString());
               bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static List<Services> docFile(String path) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";
        String[] str = null;
        List<Services> servicesList=new ArrayList<>();
        try {
            file = new File(path);
            fileReader = new FileReader(PATH + path);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                str = line.split(",");
                if (path.equals("villa.csv")){
                    Services villa= new Villa(str[0],Double.parseDouble(str[1]),Double.parseDouble(str[2]),Integer.parseInt(str[3]),str[4],str[5],str[6],Double.parseDouble(str[7]),Integer.parseInt(str[8]));
                    servicesList.add(villa);
                }else if(path.equals("house.csv")){
                    Services house= new House(str[0],Double.parseDouble(str[1]),Double.parseDouble(str[2]),Integer.parseInt(str[3]),str[4],str[5],str[6],Integer.parseInt(str[7]));
                    servicesList.add(house);
                }else if(path.equals("room.csv")){
                    Services room=new Room(str[0],Double.parseDouble(str[1]),Double.parseDouble(str[2]),Integer.parseInt(str[3]),str[4],new DichVuDiKem(str[5],Double.parseDouble(str[6]),Double.parseDouble(str[7])));
                    servicesList.add(room);
                }else if(path.equals("Customer.CSV")){
                    Services customer= new Customer(str[0],str[1],str[2],Integer.parseInt(str[3]),Integer.parseInt(str[4]),str[5],str[6],str[7]);
                    servicesList.add(customer);
                }else if(path.equals("Booking.CSV ")){
                    Services
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return servicesList;

    }
}
