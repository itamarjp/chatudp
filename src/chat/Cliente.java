package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Cliente{

    public static void main(String[] args) throws IOException {
    DatagramSocket s = new DatagramSocket();
    InetAddress sender = InetAddress.getByName("localhost");
    String envio;
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    do {
        System.out.print("> ");
        envio = teclado.readLine();
        byte[] buffer = envio.getBytes();
        DatagramPacket pergunta = new DatagramPacket(buffer,buffer.length, sender, 4545);
        s.send(pergunta);  
    } while(!envio.equalsIgnoreCase(""));
   }
}

