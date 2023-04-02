package ma.emsi.billingsystem.Models;

public class Client {

        private String idClient = "";
        private String email = "";
        private String password = "";
        private int numeroTel = 0;

        public Client(String email, String password, int numeroTel) {
            setEmail(email);
            setPassword(password);
            setNumeroTel(numeroTel);
        }

        public String getIdClient() {
            return idClient;
        }

        public void setIdClient(String idClient) {
            this.idClient= idClient;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getNumeroTel() {
            return numeroTel;
        }

        public void setNumeroTel(int numeroTel) {
            this.numeroTel = numeroTel;
        }
    }
