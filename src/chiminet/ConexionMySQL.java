/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chiminet;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Sistemas
 * 
 * 
 */
// creamos una clase extendida de la clase plaindocument y declaramos dos variables privadas
public class ConexionMySQL extends PlainDocument {

    private JTextField Editor;
    private int Num;

    // creamos un constructor
    public ConexionMySQL(JTextField Edi, int num) {
        this.Editor = Edi;
        this.Num = num;
    }

    // creamos un metodo para que haga la comprobacion que no se pase del limite
    public void insertString(int arg0, String arg1, AttributeSet arg2) throws BadLocationException {
        if ((Editor.getText().length() + arg1.length()) > this.Num) {
            return;
        }
        super.insertString(arg0, arg1, arg2);
    }

    public String db = "sql10267884";
    //public String url = "jdbc:mysql://localhost/" + db;
    public String url = "jdbc:mysql://sql10.freemysqlhosting.net/" + db;
    public String user = "sql10267884";
    public String pass = "ZHNjKrzlTx";

    public ConexionMySQL() {

    }

    public Connection Conectar() {
        Connection link = null;
            try{
               Class.forName("org.gjt.mm.mysql.Driver");
               link=(Connection) DriverManager.getConnection(this.url,this.user,this.pass);
            }
            catch(ClassNotFoundException|SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            return link;
    }
    
}
