# **Serialization**

It is a mechanisam of Converting the state on an Object into Byte Stream.

# Example

        FileOutputStream fos=new FileOutputStream(filename);
        ObjectOutputStream os=new ObjectOutputStream(fos);
        os.writeObject(user1);
        os.close();
        fos.close();

# **De-serialization**

It is a mechanisam of Converting the Byte Stream into an Object.

#Example

    FileInputStream fis=new FileInputStream(filename);
                ObjectInputStream ois=new ObjectInputStream(fis);
                User obj=(User)ois.readObject();
                System.out.println(obj.getUsername());
                System.out.println(obj.getUserID());
                System.out.println(obj.getPassword());
                System.out.println(obj.getDob());
                ois.close();
                fis.close();
