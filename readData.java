package org.example;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.util.List;

public class readData {
    String filePath="UserData.csv";
    private List<String[]> readedData;

    List<String[]> readFile(){
        try{
            CSVReader reader=new CSVReader(new FileReader(new File(filePath)));
            readedData=reader.readAll();
            reader.close();
        }catch(Exception e){
            System.out.println("Error in ReadFile");
        }
        return readedData;
    }
    int rowSize(){
        return readFile().size();
    }
    int readLoginData(String accountNo ,String password){
        int index=-1;
        String[] readedLine=null;
        int i=0;
        for(i=0;i<rowSize();i++){
            readedLine=readedData.get(i);

            if(readedLine[6].equals(accountNo)){
                System.out.println(readedLine[6]);
                System.out.println(readedLine[5]);
                if(readedLine[5].equals(password)){
                    index=i;
                    return index;
                }
                else{
                    return index;
                }
            }
        }
        return index;
    }
    String accountNo(){
       return "BNO000"+(5555+rowSize()); 
    }
}
