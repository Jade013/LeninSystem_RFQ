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
import com.mongodb.client.MongoDatabase;





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
}
    
    

