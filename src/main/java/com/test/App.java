package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.test.db.tables.records.MergePersonRecord;
import com.test.db.Routines;
import com.test.db.udt.records.DressingRecord;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/test", "test", "test")) {
            DSLContext create = DSL.using(conn, SQLDialect.POSTGRES);
            DressingRecord[] records = new DressingRecord[] {
                    new DressingRecord(null, "John", 2, "costume1"),
                    new DressingRecord(null, "Mary", 4, "costume2") };
            // org.jooq.exception.DataAccessException: SQL [select
            // "merge_person"."merge_person" from "public"."merge_person"(cast(? as
            // "public"."dressing"[]))]; ERROR: column merge_person.merge_person does not
            // exist
            // Result<MergePersonRecord> result =
            // create.selectFrom(Routines.mergePerson(records)).fetch();
            Result<Record> result = create.select(DSL.asterisk()).from(Routines.mergePerson(records))
                    .fetch();
            System.out.println(result);
        }
    }
}
