/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.eba.world.login;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Label;
import javax.swing.JOptionPane;
import tr.gov.eba.check.Checker;
import tr.gov.eba.helper.HttpProcess;
import tr.gov.eba.log.KeyValue;
import tr.gov.eba.result.Result;


/**
 *
 * @author Ots-Mustafa
 */
public class Login extends javax.swing.JPanel {

        Label errorMsgLabel = new Label("");
    
    
   
   public void CONNECT() {                                               
         //Login with portal credentials
         Long tckn = Checker.checkTckn("18055830572");
         String ebaPassword = new String("1234567");

         if (tckn == null) {
             errorMsgLabel.setText("Geçersiz TCKN");
             return;
         }
         if (ebaPassword.isEmpty()) {
             errorMsgLabel.setText("geçersiz pasword");
             return;
         }

         String authPoint = "http://giris.eba.gov.tr/EBA_GIRIS/JsonAuth";
         List<KeyValue> parameters = new ArrayList<KeyValue>(4);
         parameters.add(new KeyValue("kod", "EBA_SNF")); //Sınıfım uygulaması için kullanılan kod
         parameters.add(new KeyValue("ip", GearBox.detectIpAddress())); // bkz. https://git.eba.gov.tr/ebadongle_lib/snippets/2
         parameters.add(new KeyValue("username", tckn.toString()));
         parameters.add(new KeyValue("password", ebaPassword));

         Result result = new HttpProcess().sendPostRequest(authPoint, parameters, Result.class);
         if (result != null && result.checkResult(Result.SUCCESS)) {
             System.out.println("BAŞARILI BİR GİRİŞ");
//             if (Login.theLogin == null) {
//                 Login.theLogin = new Login();
//             }
            String authCode = (String) result.getContent();
            System.out.println("Auth Code:"+authCode);
//             Login.theLogin.setAuthCode(authCode);
//             Login.theLogin.setTckn(tckn);
         } else {
             //unsuccessful login attempt
             errorMsgLabel.setText("Wrong Autharitazion");
             System.err.println("Wrong Autharitazion");
           
         }


     }
    
   public static void main (String a[]){
       
       new Login().CONNECT();
   }
 
   
}