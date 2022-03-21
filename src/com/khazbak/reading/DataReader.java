package com.khazbak.reading;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataReader implements IDataReader{

    @Override
    public List<String> readFileData(File file) {
        List<String> lines=new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            while((line=reader.readLine())!=null){
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  lines;
    }
}
