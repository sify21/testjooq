/*
 * This file is generated by jOOQ.
 */
package com.test.db.udt.records;


import com.test.db.udt.Dressing;

import org.jooq.impl.UDTRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DressingRecord extends UDTRecordImpl<DressingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.dressing.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.dressing.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.dressing.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.dressing.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.dressing.age</code>.
     */
    public void setAge(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.dressing.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.dressing.costume</code>.
     */
    public void setCostume(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.dressing.costume</code>.
     */
    public String getCostume() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DressingRecord
     */
    public DressingRecord() {
        super(Dressing.DRESSING);
    }

    /**
     * Create a detached, initialised DressingRecord
     */
    public DressingRecord(Long id, String name, Integer age, String costume) {
        super(Dressing.DRESSING);

        setId(id);
        setName(name);
        setAge(age);
        setCostume(costume);
        resetChangedOnNotNull();
    }
}
