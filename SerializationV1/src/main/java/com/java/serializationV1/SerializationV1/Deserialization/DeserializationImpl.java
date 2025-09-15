package com.java.serializationV1.SerializationV1.Deserialization;

import com.java.serializationV1.SerializationV1.model.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationImpl {
    public static void main(String[] args) {
        String filename="D:\\JavaV1\\TextFile.txt";
        try {
            FileInputStream fis=new FileInputStream(filename);
            ObjectInputStream ois=new ObjectInputStream(fis);
            User obj=(User)ois.readObject();
            System.out.println(obj.getUsername());
            System.out.println(obj.getUserID());
            System.out.println(obj.getPassword());
            System.out.println(obj.getDob());
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
