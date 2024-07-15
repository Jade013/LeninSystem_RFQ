/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_connection;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;
import org.bson.Document;





/**
 *
 * @author predator 300
 */
public class db_config {
    
    private static final String URI = "mongodb+srv://LeninSystem:LeninSystem@leninsystem.mta9tsj.mongodb.net/?retryWrites=true&w=majority&appName=LeninSystem";
    private static final String DATABASE_NAME = "LeninSystem";
    
    private MongoClient mongoClient;
    private MongoDatabase database;
    
    public db_config() {
        ConnectionString connectionString = new ConnectionString(URI);
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        this.mongoClient = MongoClients.create(settings);
        this.database = mongoClient.getDatabase(DATABASE_NAME);
    }
    
     public MongoDatabase getDatabase() {
        return this.database;
    }
    
    public void close() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
    
    public void insertRequest(String clientName, String contactNo, String projAddress, String clientEmail, String requestFrom, String sendTo, String stockAvailability) {
        String requestApp = "pending";

        Document document = new Document("client_name", clientName)
                .append("proj_location", projAddress)
                .append("contact_no", contactNo)
                .append("client_email", clientEmail)
                .append("request_from", requestFrom)
                .append("send_to", sendTo)
                .append("request_app", requestApp)
                .append("stock_availability", stockAvailability);

        try {
            MongoDatabase database = getDatabase();
            MongoCollection<Document> collection = database.getCollection("RFQ");
            collection.insertOne(document);
            JOptionPane.showMessageDialog(null, "Request submitted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            close();
        }
    }
}
    
    

