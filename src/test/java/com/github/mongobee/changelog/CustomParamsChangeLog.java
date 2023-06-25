package com.github.mongobee.changelog;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import com.mongodb.client.MongoClient;
import org.bson.Document;

@ChangeLog(order = "1")
public class CustomParamsChangeLog {

  @ChangeSet(author = "testUser", id = "id1", order = "01")
  public void changeSet1(Document document, MongoClient mongoClient) {
    System.out.println("document + mongoClient");
  }

  @ChangeSet(author = "testUser", id = "id2", order = "02")
  public void changeSet2(MongoClient mongoClient, Document document) {
    System.out.println("mongoClient + document");
  }

}
