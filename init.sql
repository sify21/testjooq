create table person (
    id bigint primary key generated by default as identity,
    name varchar(50) not null,
    age int not null,
    unique(name)
);

create type dressing as (
    id bigint,
    name varchar(50),
    age int,
    costume varchar(50)
);

CREATE OR REPLACE FUNCTION merge_person(arr dressing[]) RETURNS SETOF dressing LANGUAGE plpgsql AS
$$
DECLARE x dressing;
BEGIN
    FOREACH x IN ARRAY arr LOOP
        return query insert into person(name, age) values (x.name, x.age) on conflict (name) do update set age=x.age returning id,name,age,x.costume;
    END LOOP;
    RETURN;
END;
$$;
