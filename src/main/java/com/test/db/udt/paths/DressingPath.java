/*
 * This file is generated by jOOQ.
 */
package com.test.db.udt.paths;


import com.test.db.udt.Dressing;
import com.test.db.udt.records.DressingRecord;

import org.jooq.Binding;
import org.jooq.Comment;
import org.jooq.DataType;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.RecordQualifier;
import org.jooq.UDTField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.UDTPathTableFieldImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class DressingPath<R extends Record, T> extends UDTPathTableFieldImpl<R, DressingRecord, T> {

    private static final long serialVersionUID = 1L;

    /**
     * The attribute <code>public.dressing.id</code>.
     */
    public final UDTField<DressingRecord, Long> ID = Internal.createUDTPathField(DSL.name("id"), SQLDataType.BIGINT, this, "", UDTField.class);

    /**
     * The attribute <code>public.dressing.name</code>.
     */
    public final UDTField<DressingRecord, String> NAME = Internal.createUDTPathField(DSL.name("name"), SQLDataType.VARCHAR(50), this, "", UDTField.class);

    /**
     * The attribute <code>public.dressing.age</code>.
     */
    public final UDTField<DressingRecord, Integer> AGE = Internal.createUDTPathField(DSL.name("age"), SQLDataType.INTEGER, this, "", UDTField.class);

    /**
     * The attribute <code>public.dressing.costume</code>.
     */
    public final UDTField<DressingRecord, String> COSTUME = Internal.createUDTPathField(DSL.name("costume"), SQLDataType.VARCHAR(50), this, "", UDTField.class);

    public DressingPath(Name name, DataType<T> type, RecordQualifier<R> qualifier, Comment comment, Binding<?, T> binding) {
        super(name, type, qualifier, Dressing.DRESSING, comment, binding);
    }
}
