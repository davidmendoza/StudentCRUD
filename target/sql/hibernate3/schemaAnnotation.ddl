
    alter table Student 
        drop 
        foreign key FKF3371A1BD9E15D52;

    alter table Student_Teacher 
        drop 
        foreign key FKFCAED99E316B2E92;

    alter table Student_Teacher 
        drop 
        foreign key FKFCAED99E20CFE3F2;

    alter table Teacher 
        drop 
        foreign key FKD6A63C2D9E15D52;

    drop table if exists Address;

    drop table if exists Grades;

    drop table if exists Student;

    drop table if exists Student_Teacher;

    drop table if exists Teacher;

    create table Address (
        id bigint not null auto_increment unique,
        area varchar(255),
        city varchar(255),
        primary key (id)
    );

    create table Grades (
        student_id bigint not null,
        english integer,
        math integer,
        science integer,
        primary key (student_id)
    );

    create table Student (
        id bigint not null auto_increment unique,
        first_name varchar(255),
        gender varchar(255),
        last_name varchar(255),
        level integer,
        address_id bigint,
        primary key (id)
    );

    create table Student_Teacher (
        student_id bigint not null,
        teacher_id bigint not null,
        primary key (student_id, teacher_id)
    );

    create table Teacher (
        id bigint not null auto_increment unique,
        first_name varchar(255),
        gender varchar(255),
        last_name varchar(255),
        address_id bigint,
        primary key (id)
    );

    alter table Student 
        add index FKF3371A1BD9E15D52 (address_id), 
        add constraint FKF3371A1BD9E15D52 
        foreign key (address_id) 
        references Address (id);

    alter table Student_Teacher 
        add index FKFCAED99E316B2E92 (teacher_id), 
        add constraint FKFCAED99E316B2E92 
        foreign key (teacher_id) 
        references Teacher (id);

    alter table Student_Teacher 
        add index FKFCAED99E20CFE3F2 (student_id), 
        add constraint FKFCAED99E20CFE3F2 
        foreign key (student_id) 
        references Student (id);

    alter table Teacher 
        add index FKD6A63C2D9E15D52 (address_id), 
        add constraint FKD6A63C2D9E15D52 
        foreign key (address_id) 
        references Address (id);
