package org.hsk.config;

import java.io.File;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "liquibase", ignoreUnknownFields = false)
public class LiquibaseProperties {

  /**
   * Change log configuration path.
   */
  @NotNull
  private String changeLog = "classpath:/db/changelog/db.changelog-master.yaml";

  /**
   * Check the change log location exists.
   */
  private boolean checkChangeLogLocation = true;

  /**
   * Comma-separated list of runtime contexts to use.
   */
  private String contexts;

  /**
   * Default database schema.
   */
  private String defaultSchema;

  /**
   * Drop the database schema first.
   */
  private boolean dropFirst;

  /**
   * Enable liquibase support.
   */
  private boolean enabled = true;

  /**
   * Login user of the database to migrate.
   */
  private String user;

  /**
   * Login password of the database to migrate.
   */
  private String password;

  /**
   * JDBC url of the database to migrate. If not set, the primary configured data source
   * is used.
   */
  private String url;

  /**
   * Comma-separated list of runtime labels to use.
   */
  private String labels;

  /**
   * Change log parameters.
   */
  private Map<String, String> parameters;

  /**
   * File to which rollback SQL will be written when an update is performed.
   */
  private File rollbackFile;

  public String getChangeLog() {
    return this.changeLog;
  }

  public void setChangeLog(String changeLog) {
    this.changeLog = changeLog;
  }

  public boolean isCheckChangeLogLocation() {
    return this.checkChangeLogLocation;
  }

  public void setCheckChangeLogLocation(boolean checkChangeLogLocation) {
    this.checkChangeLogLocation = checkChangeLogLocation;
  }

  public String getContexts() {
    return this.contexts;
  }

  public void setContexts(String contexts) {
    this.contexts = contexts;
  }

  public String getDefaultSchema() {
    return this.defaultSchema;
  }

  public void setDefaultSchema(String defaultSchema) {
    this.defaultSchema = defaultSchema;
  }

  public boolean isDropFirst() {
    return this.dropFirst;
  }

  public void setDropFirst(boolean dropFirst) {
    this.dropFirst = dropFirst;
  }

  public boolean isEnabled() {
    return this.enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  public String getUser() {
    return this.user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getLabels() {
    return this.labels;
  }

  public void setLabels(String labels) {
    this.labels = labels;
  }

  public Map<String, String> getParameters() {
    return this.parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }

  public File getRollbackFile() {
    return this.rollbackFile;
  }

  public void setRollbackFile(File rollbackFile) {
    this.rollbackFile = rollbackFile;
  }

}


