/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AhmedWard
 */
public class ChatServer {

    /**
     * @param args the command line arguments
     */
    
    
    ServerSocket serverSocket;
    
    
    
    public ChatServer(){
        try {
            serverSocket = new ServerSocket(5005);
            while(true){
                Socket s = serverSocket.accept();
                new ChatHandler(s);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        new ChatServer();
        
    }
    
    
}
