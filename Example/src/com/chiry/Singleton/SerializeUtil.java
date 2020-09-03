package com.chiry.Singleton;

import java.io.*;

public class SerializeUtil {
    public static void serialize(Object obj){
        try(
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("obj")));
                )
        {
            objectOutputStream.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Object unserialize() throws ClassNotFoundException {

        Object o=null;
        try(
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("obj")));
        )
        {

         o= ois.readObject();


        } catch (IOException e) {
            e.printStackTrace();
        }
        return o;

    }
}
