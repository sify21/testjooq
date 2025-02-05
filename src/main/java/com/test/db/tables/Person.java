/*
 * This file is generated by jOOQ.
 */
package com.test.db.tables;


import com.test.Address;
import com.test.db.Keys;
import com.test.db.Public;
import com.test.db.tables.records.PersonRecord;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.jackson.extensions.converters.JSONBtoJacksonConverter;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Person extends TableImpl<PersonRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.person</code>
     */
    public static final Person PERSON = new Person();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PersonRecord> getRecordType() {
        return PersonRecord.class;
    }

    /**
     * The column <code>public.person.id</code>.
     */
    public final TableField<PersonRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.person.name</code>.
     */
    public final TableField<PersonRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.person.age</code>.
     */
    public final TableField<PersonRecord, Integer> AGE = createField(DSL.name("age"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.person.address</code>.
     */
    public final TableField<PersonRecord, List<Address>> ADDRESS = createField(DSL.name("address"), SQLDataType.JSONB, this, "", new JSONBtoJacksonConverter<List<Address>>((Class<List<Address>>) (Class) List.class));

    private Person(Name alias, Table<PersonRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Person(Name alias, Table<PersonRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.person</code> table reference
     */
    public Person(String alias) {
        this(DSL.name(alias), PERSON);
    }

    /**
     * Create an aliased <code>public.person</code> table reference
     */
    public Person(Name alias) {
        this(alias, PERSON);
    }

    /**
     * Create a <code>public.person</code> table reference
     */
    public Person() {
        this(DSL.name("person"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<PersonRecord, Long> getIdentity() {
        return (Identity<PersonRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PersonRecord> getPrimaryKey() {
        return Keys.PERSON_PKEY;
    }

    @Override
    public List<UniqueKey<PersonRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PERSON_NAME_KEY);
    }

    @Override
    public Person as(String alias) {
        return new Person(DSL.name(alias), this);
    }

    @Override
    public Person as(Name alias) {
        return new Person(alias, this);
    }

    @Override
    public Person as(Table<?> alias) {
        return new Person(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Person rename(String name) {
        return new Person(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Person rename(Name name) {
        return new Person(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Person rename(Table<?> name) {
        return new Person(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Person where(Condition condition) {
        return new Person(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Person where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Person where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Person where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Person where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Person where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Person where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Person where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Person whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Person whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
