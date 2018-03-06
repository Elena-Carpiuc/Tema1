/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpclient;

import java.net.Socket;
import java.io.*;

/**
 *
 * @author madlungu
 */
public class TCPClient {

    
    public static void main(String []args){
        try{
        Socket clientSocket = new Socket("localhost",9999);
        
        PrintStream pr =new PrintStream(clientSocket.getOutputStream());
    
        System.out.print("Enter something: ");
        
        InputStreamReader rd = new InputStreamReader(System.in);
        BufferedReader ed = new BufferedReader(rd);
        
        String sentance = ed.readLine();
        
        pr.println(sentance);
        
        BufferedReader gt = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        
        String tm = gt.readLine();
        System.out.print(tm);
    }
    catch(Exception ex)
    {
        
    }
}
}