/*Aim:Client server communication using Socket – TCP/IP
java Server side code:*/
import java.net.*; 
import java.io.*;
class TCPServer
 {
  public static void main(String args[])throws Exception
  {
   String msg;
   ServerSocket ss=new ServerSocket(1095);
  Socket s=ss.accept();
  System.out.println(" is connected"+s.isConnected());
  System.out.println(" s="+s.getInetAddress());
  System.out.println(" port"+s.getPort());
  DataOutputStream dos =new DataOutputStream(s.getOutputStream());
  DataInputStream in=new DataInputStream(System.in);
  System.out.println(" Enter a message for client");
  while(true)
  { 
   String str=in.readLine();
   if ((str==null || str.equals("end")))
    {
     break;
    }
   else {
    dos.writeUTF(str);
     } 
  s.close();
 }
}


/*java client side code:
import java.net.*;
import java.io.*;
class Client
{
  public static void main(String args[])throws Exception
   {
     String msg;
    Socket sk=new Socket(InetAddress.getLocalHost(),1095);
    System.out.println(" client is connected"+sk.isConnected());
    System.out.println(" port"+sk.getPort());
    System.out.println(" Local port"+sk.getLocalPort());
    System.out.println(" Message from server ");
    String servermsg;
    DataInputStream dis=new DataInputStream(sk.getInputStream());
   while(true)
    {
       servermsg=new String(dis.readUTF());
       System.out.println(servermsg);
    } 
  }
}
}
*/
