package com.stoyanov5;

import com.stoyanov5.FacadeSubSystems.MongoDBHelper;
import com.stoyanov5.FacadeSubSystems.MySqlHelper;

import java.sql.Connection;

/**
 * Created by Krasimir Stoyanov on 31-Dec-16.
 */
public class HelperFacade {

    public enum DBTypes {
        MYSQL, MongoDB;
    }

    public enum ReportTypes {
        HTML, PDF;
    }

    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Connection connection = null;

        switch (dbType) {
            case MYSQL:
                connection = MySqlHelper.getMySqlConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();

                switch (reportType) {
                    case HTML:
                        mySqlHelper.generateMySqlHTMLReport(tableName, connection);
                        break;
                    case PDF:
                        mySqlHelper.generateMySqlPDFReport(tableName, connection);
                        break;
                }
                break;
            case MongoDB:
                connection = MongoDBHelper.getMongoDBConnection();
                MongoDBHelper mongoDBHelper = new MongoDBHelper();

                switch (reportType) {
                    case HTML:
                        mongoDBHelper.generateMongoDBHTMLReport(tableName, connection);
                        break;
                    case PDF:
                        mongoDBHelper.generateMongoDBPDFReport(tableName, connection);
                        break;
                }
                break;
        }

    }
}
