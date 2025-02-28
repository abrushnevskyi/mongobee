package com.github.mongobat.changelog.environments;

import com.github.mongobat.changeset.ChangeLog;
import com.github.mongobat.changeset.ChangeSet;
import com.github.mongobat.utils.ChangeSetExecutionChecker;
import com.github.mongobat.utils.Environment;

@ChangeLog(order = "2")
public class EnvironmentsChangeLog {

  @ChangeSet(author = "testUser", id = "id1", order = "01", description = "", environment = Environment.DEV)
  public void changeSet1(ChangeSetExecutionChecker executionChecker) {
    executionChecker.execute(Environment.DEV);
  }

  @ChangeSet(author = "testUser", id = "id2", order = "02", description = "", environment = Environment.TEST)
  public void changeSet2(ChangeSetExecutionChecker executionChecker) {
    executionChecker.execute(Environment.TEST);
  }

  @ChangeSet(author = "testUser", id = "id3", order = "03", description = "", environment = Environment.STAGE)
  public void changeSet3(ChangeSetExecutionChecker executionChecker) {
    executionChecker.execute(Environment.STAGE);
  }

  @ChangeSet(author = "testUser", id = "id4", order = "04", description = "", environment = Environment.PROD)
  public void changeSet4(ChangeSetExecutionChecker executionChecker) {
    executionChecker.execute(Environment.PROD);
  }

  @ChangeSet(author = "testUser", id = "id5", order = "05", description = "")
  public void changeSet5(ChangeSetExecutionChecker executionChecker) {
    executionChecker.execute(Environment.ANY);
  }

}
