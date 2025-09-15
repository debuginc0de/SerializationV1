package com.java.serializationV1.SerializationV1.Serialization;

import com.java.serializationV1.SerializationV1.model.User;

import java.io.*;
import java.time.Instant;
import org.apache.commons.lang3.RandomStringUtils;


public class SerializationImpl {
    public static void main(String[] args) {
        User user1=new User("Rahul",10020, RandomStringUtils.randomAlphanumeric (10), Instant.now ());
        String filename="D:\\JavaV1\\TextFile.txt";

        try{
            FileOutputStream fos=new FileOutputStream(filename);
            ObjectOutputStream os=new ObjectOutputStream(fos);
            os.writeObject(user1);
            os.close();
            fos.close();

            System.out.println("Object saved in file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
