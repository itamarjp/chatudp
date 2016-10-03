
import java.util.Objects;

public class Clientes {
    private String Nome;
    private String IP;
    private String Porta;   

    public Clientes() {
    }

    public Clientes(String Nome, String IP, String Porta) {
        this.Nome = Nome;
        this.IP = IP;
        this.Porta = Porta;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getPorta() {
        return Porta;
    }

    public void setPorta(String Porta) {
        this.Porta = Porta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.Nome);
        hash = 37 * hash + Objects.hashCode(this.IP);
        hash = 37 * hash + Objects.hashCode(this.Porta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clientes other = (Clientes) obj;
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        if (!Objects.equals(this.IP, other.IP)) {
            return false;
        }
        if (!Objects.equals(this.Porta, other.Porta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clientes{" + "Nome=" + Nome + ", IP=" + IP + ", Porta=" + Porta + '}';
    }
    
    
    
}


