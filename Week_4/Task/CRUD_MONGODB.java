package ojt.crud_mongodb;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

public class CRUD_MONGODB {
    private static final String CONNECTION_STRING = "mongodb://localhost:27017";
    private static final String DATABASE_NAME = "nsti";
    private static final String COLLECTION_NAME = "users";
    
    public static void createStud(String studid, String studname, String studemail) {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);

            Document stud = new Document("studid", studid)
                    .append("studname", studname)
                    .append("studemail", studemail);

            col.insertOne(stud);
            System.out.println("Student details created: " + stud.toJson());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readStud() {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);

            FindIterable<Document> studs = col.find();
            System.out.println("Stud details: ");
            for (Document obj : studs) {
                System.out.println(obj.toJson());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateStud(String studid, String studname) {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);

            col.updateOne(Filters.eq("studid", studid), Updates.set("studname", studname));
            System.out.println("Student ID updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteStud(String studname) {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);

            col.deleteOne(Filters.eq("studname", studname));
            System.out.println("Student details deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // System.out.println("Hello World!");
         //createStud("5","Alice","Java");

        readStud();

        updateStud("5", "Manjima");
        readStud();
    }
}
