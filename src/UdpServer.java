

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {

    public static void main(String[] args) throws SocketException, IOException {
       
    DatagramSocket s = new DatagramSocket(4545);
    System.out.println("Servidor esperando conexão.......");
    String envio;
    DatagramPacket recebe = new DatagramPacket(new byte[512], 512);
    while(true){
        s.receive(recebe);
        System.out.print("Mensagem recebida: ");
        String received = new String(recebe.getData(), 0, recebe.getLength());
        System.out.println(received); 
     }
  }
}

    