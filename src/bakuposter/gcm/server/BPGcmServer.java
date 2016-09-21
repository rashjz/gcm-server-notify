/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakuposter.gcm.server;

/**
 *
 * @author Rashad Javadov
 */
public class BPGcmServer {

    public static final String DEVELOPER_API_KEY = "AXsaxyxj-xxxxxxxxxxx-xxxxxxxxxxxxx"; 

    public static void main(String[] args) {
        System.out.println("Sending POST to GCM");
        Content content = new Content();
        content.addRegId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-xxxxxxxxxxxxxxxx-xxxxxxxxxxxxxxxxxxxx"); 
        content.createData("TEST", "Test Notification");

        POST2GCMessage.post(DEVELOPER_API_KEY, content);
    } 
}
