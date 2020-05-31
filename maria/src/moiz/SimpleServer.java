package moiz;

import java.net.*;
import java.io.*;
import java.util.Scanner;
public class SimpleServer 
{
public static void main(String args[]) throws IOException 
{
Scanner in=new Scanner(System.in);
ServerSocket server = new ServerSocket(1254);
while(true){
Socket serversocket=server.accept(); 

OutputStream serverOUT = serversocket.getOutputStream();
       DataOutputStream serverdos = new DataOutputStream(serverOUT);
       
       System.out.print("moiz: ");
       String input= in.next();
       serverdos.writeUTF("moiz: " + input);

InputStream serverIN = serversocket.getInputStream();
      DataInputStream serverdis = new DataInputStream(serverIN);
      String st = new String(serverdis.readUTF());
      System.out.println(st);
      
      serverdis.close();
      serverIN.close();
      
       serverdos.close();
      serverOUT.close();
serversocket.close();
}
}
}
