package DB;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class dbConnection {
    static MongoDatabase database ;
    public static void connect() {
        String url = "mongodb+srv://admin:dola769@cluster0-wwtw4.mongodb.net/test?retryWrites=true&w=majority";
        try {
            MongoClientURI uri = new MongoClientURI(url);
            MongoClient mongoClient = new MongoClient(uri);
            database = mongoClient.getDatabase("LibraryApp");

            System.out.println("Connection done");
        }catch (Exception ex){
            System.out.println("Connection failed");
        }
    }
    public static void test(){
        try {
            MongoCollection collection = database.getCollection("mCollec");
            Document doc = new Document("name", "dola");
            doc.append("phone", "010");
            collection.insertOne(doc);
        }catch (Exception ex){
            System.out.println("Document failed");
        }
    }
}
