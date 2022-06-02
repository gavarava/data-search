CREATE TYPE public.e_customer_membership AS ENUM (
    'Gold',
    'Platinum',
    'Standard');

CREATE TABLE public.names
(
    id              uuid         NOT NULL,
    creationDate    timestamptz  NOT NULL,
    name    varchar(200) NOT NULL,
    CONSTRAINT names_pkey PRIMARY KEY (id)
);

/* Generate Names Database from names.csv
insert into public.names (id, creationDate, name)
select gen_random_uuid(),
       current_timestamp,
       pg_read_file('names.csv', 0, 10000000)
from generate_series(1, 46445) s(i);
   TODO
 */