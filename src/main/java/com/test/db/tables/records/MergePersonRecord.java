/*
 * This file is generated by jOOQ.
 */
package com.test.db.tables.records;


import com.test.db.tables.MergePerson;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class MergePersonRecord extends TableRecordImpl<MergePersonRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setMergePerson(Object value) {
        set(0, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getMergePerson() {
        return get(0);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MergePersonRecord
     */
    public MergePersonRecord() {
        super(MergePerson.MERGE_PERSON);
    }

    /**
     * Create a detached, initialised MergePersonRecord
     */
    public MergePersonRecord(Object mergePerson) {
        super(MergePerson.MERGE_PERSON);

        setMergePerson(mergePerson);
        resetChangedOnNotNull();
    }
}
