package ma.emsi.billingsystem.DB.Dao;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

    public interface IDao<T> {

        // returns true if the insertion was successful
        // false if the insertion failed
        public boolean insert(T object) throws SQLException;

        // returns a ResultSet of the selected Item(s)
        // e.g result.getString("CNE"); selects the column CNE
        // you should adapt getString to getInt, getFloat etc depending on the
        // column's type

        public ResultSet selectAll() throws SQLException;


    }


