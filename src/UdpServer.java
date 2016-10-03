

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

public class UdpServer {


    
    public static void main(String[] args) throws SocketException, IOException {
    List<Clientes> Lista = new ArrayList();
    DatagramSocket s = new DatagramSocket(4545);
    System.out.println("Servidor esperando conexão.......");
    String envio;
    DatagramPacket recebe = new DatagramPacket(new byte[512], 512);
    while(true){
        s.receive(recebe);
        Clientes temp = new Clientes();
        InetAddress IPAddress = recebe.getAddress();
        temp.setNome(IPAddress.toString());
        temp.setIP(IPAddress.toString());
        temp.setPorta(Integer.toString(recebe.getPort()));
        Lista.add(temp);
        System.out.print("Mensagem recebida: ");
        String received = new String(recebe.getData(), 0, recebe.getLength());
        System.out.println(received); 
        for (Clientes element : Lista) {
            System.out.println(element);
        }
     }
  }
}

    