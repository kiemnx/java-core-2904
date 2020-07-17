package fileio.writer;

import java.io.*;

public class ObjectOutputStreamEx {
    public static void main(String[] args) {
        Student st = new Student("kiemnx", "0979155813");

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("/home/kiemnx/project/plus/java-core-2904/write.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(st);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream("/home/kiemnx/project/plus/java-core-2904/write.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);

            Student out = (Student) objectInputStream.readObject();

            System.out.println(out.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}


class Student implements Serializable {
    private String name;
    private String phone;

    public Student(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
