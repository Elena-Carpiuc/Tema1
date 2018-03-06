/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author madlungu
 */
public class ConnectionServer {

    public static void main(String[] args) {
       try{
           int serverListenPortNum = Integer.parseInt(args[0]);
           ServerSocket connectionSocket = new ServerSocket(serverListenPortNum);
           
           Socket dataSocket = connectionSocket.accept();
           
           BufferedReader br = new BufferedReader(new InputStreamReader(dataSocket.getInputStream()));
           int num1 = Integer.parseInt(br.readLine());
           int num2 = Integer.parseInt(br.readLine());
         
           System.out.println(num1+ " + " + num2 + " = " + (num1 + num2));
           
           dataSocket.close();
           connectionSocket.close();
        
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }
    
}
