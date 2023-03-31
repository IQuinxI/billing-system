package ma.emsi.DataBase;

import ma.emsi.CRUD.PersonCRUD;

public class Instancer {
    private Connector conn = new Connector();
    public PersonCRUD person = new PersonCRUD(conn.getConn());
}
