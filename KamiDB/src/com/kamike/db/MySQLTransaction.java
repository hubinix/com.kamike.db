 
package com.kamike.db;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * 
 * @author brin
 *  hubinix@gmail.com
 */
public class MySQLTransaction extends Transaction {

    public MySQLTransaction() {
        super();
        init();
    }

    @Override
    protected final void init() {
        this.rollback = false;
        try {
            con = SysDbInst.getInstance().getDatabase().getSingleConnection();

            con.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(MySQLTransaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
