package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class WriteData {
    String filePath="UserData.csv";
    void readFile(){
        try{
            CSVReader reader=new CSVReader(new FileReader(new File(filePath)));
            reader.readAll();
        }catch(Exception e){
            System.out.println("Error in ReadFile");
        }
    }
    void userData(String fullName,String age,String emailId,String PhoneNo,String address,String password,String accountNo){
        try {
            String[] userData={fullName,age,emailId,PhoneNo,address,password,accountNo,"1000"};
            CSVWriter writer=new CSVWriter(new FileWriter(new File(filePath),true));
            writer.writeNext(userData);
            writer.close();
        } catch (Exception e) {
            System.out.println("Error in UserData");
        }
    }
    void writeAmount(int amount, int searchId){
        try{
            amount=1000;
            CSVReader csvReader=new CSVReader(new FileReader(new File(filePath)));
            List<String[]> readandWrite=csvReader.readAll();
            int Amount=amount+Integer.parseInt(readandWrite.get(searchId)[7]);
            readandWrite.get(searchId)[7]=Integer.toString(Amount);
            CSVWriter csvWriter=new CSVWriter(new FileWriter(new File(filePath),true));
            csvWriter.writeAll(readandWrite);
            csvWriter.close();
        }catch(Exception e){
            System.out.println("Error in WriteAmount");
        }
        
    }
}
