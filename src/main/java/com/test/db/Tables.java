/*
 * This file is generated by jOOQ.
 */
package com.test.db;


import com.test.db.tables.MergePerson;
import com.test.db.tables.Person;
import com.test.db.udt.records.DressingRecord;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;


/**
 * Convenience access to all tables in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Tables {

    /**
     * The table <code>public.merge_person</code>.
     */
    public static final MergePerson MERGE_PERSON = MergePerson.MERGE_PERSON;

    /**
     * Call <code>public.merge_person</code>.
     */
    public static Result<DressingRecord> MERGE_PERSON(
          Configuration configuration
        , DressingRecord[] arr
    ) {
        return configuration.dsl().selectFrom(com.test.db.tables.MergePerson.MERGE_PERSON.call(
              arr
        )).fetch();
    }

    /**
     * Get <code>public.merge_person</code> as a table.
     */
    public static MergePerson MERGE_PERSON(
          DressingRecord[] arr
    ) {
        return com.test.db.tables.MergePerson.MERGE_PERSON.call(
            arr
        );
    }

    /**
     * Get <code>public.merge_person</code> as a table.
     */
    public static MergePerson MERGE_PERSON(
          Field<DressingRecord[]> arr
    ) {
        return com.test.db.tables.MergePerson.MERGE_PERSON.call(
            arr
        );
    }

    /**
     * The table <code>public.person</code>.
     */
    public static final Person PERSON = Person.PERSON;
}
