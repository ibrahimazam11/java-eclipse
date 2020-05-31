package moiz;

import java.net.*;
import java.io.*;
import java.util.Scanner;
public class SimpleClient 
{
 public static void main(String[] args) throws IOException
    {
      Scanner in=new Scanner(System.in);
      while(true){
      Socket clientsocket = new Socket("localhost",1254);
      InputStream clientIN = clientsocket.getInputStream();
      DataInputStream clientdis = new DataInputStream(clientIN);
      String st = new String(clientdis.readUTF());
      System.out.println(st);
      
      OutputStream clientOUT = clientsocket.getOutputStream();
       DataOutputStream clientdos = new DataOutputStream(clientOUT);
       
       System.out.print("Ibrahim: ");
       String input= in.next();
       clientdos.writeUTF("Ibrahim: " + input);
       
      clientdis.close();
      clientIN.close();
      
       clientdos.close();
      clientOUT.close();
      
     clientsocket.close();
      }
    }   
}

