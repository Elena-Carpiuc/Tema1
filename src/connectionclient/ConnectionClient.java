/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionclient;

import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author madlungu
 */
public class ConnectionClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
           InetAddress serverHost = InetAddress.getByName(args[0]);
           int serverPortNum = Integer.parseInt(args[1]);
           
           Socket clientSocket = new Socket(serverHost, serverPortNum);
           
           PrintStream ps = new PrintStream(clientSocket.getOutputStream());
           ps.print(2);
           ps.flush();
           ps.println(3);
           ps.flush();
           
           clientSocket.close();
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }
    
}
