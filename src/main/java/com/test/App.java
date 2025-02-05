package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.test.db.Routines;
import com.test.db.udt.Dressing;
import com.test.db.udt.records.DressingRecord;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/test", "test", "test")) {
            DSLContext create = DSL.using(conn, SQLDialect.POSTGRES);
            DressingRecord d1 = new DressingRecord();
            d1.setName("John");
            d1.setAge(2);
            d1.setAddress(Arrays.asList(new Address("John's state1", "John's street1"),
                    new Address("John's state2", "John's street2")));
            d1.setCostume("John's costume");
            DressingRecord d2 = new DressingRecord();
            d2.setName("Anna");
            d2.setAge(5);
            d2.setAddress(Arrays.asList(new Address("Anna's state1", "Anna's street1"),
                    new Address("Anna's state2", "Anna's street2")));
            d2.setCostume("Anna's costume");
            DressingRecord[] records = new DressingRecord[] { d1, d2 };
            Result<DressingRecord> result = create.selectFrom(Routines.mergePerson(records)).fetch();
            System.out.println(result);
            System.out.println("This is ok: ");
            for (DressingRecord d : result) {
                System.out.println(d.get(Dressing.ADDRESS, (Class<List<Address>>) (Class<?>) List.class));
            }
            System.out.println("This errors: ");
            for (DressingRecord d : result) {
                System.out.println(d.getAddress());
            }
        }
    }
}
