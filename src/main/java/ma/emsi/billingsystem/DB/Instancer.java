package ma.emsi.billingsystem.DB;


import ma.emsi.billingsystem.DB.Dao.ClientDao;
public class Instancer {


        private Connector conn = new Connector();
        public ClientDao client = new ClientDao(conn.getConn());
    }
