/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author madlungu
 */
public class TCPServer {

    public static void main(String[]args) {
        
        try{
           ServerSocket ourFirstSocket = new ServerSocket(9999);
    
            Socket connectionSocket=ourFirstSocket.accept();
            BufferedReader messagesFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            
            String clientSentence = messagesFromClient.readLine();
            
            System.out.println("Received: " + clientSentence);
            PrintStream pr = new PrintStream(connectionSocket.getOutputStream());
            
            String clientSentenceRespons = "Yes, I got it!!";
            pr.println(clientSentenceRespons);
           
        }
      catch(Exception ex) {
              
              }
    }
     
}
