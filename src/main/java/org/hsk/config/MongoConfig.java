package org.hsk.config;

import com.mongodb.Mongo;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * Created by cartman on 11.12.16.
 */
public class MongoConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
      return "sampleDB";
    }

    @Override
    public Mongo mongo() throws Exception {
      return new Mongo();
    }

    @Override
    protected String getMappingBasePackage() {
      return "org.hsk.model.mongo";
    }
  }

