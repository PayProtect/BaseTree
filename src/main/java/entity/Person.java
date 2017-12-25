package entity;


import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Date;


/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table( name = "Person" )
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @Column
    public String gender;

    @Column
    public String primary_name;

    @Column
    public String alternate_names;

    @Column
    public Date death_date;

    @Column
    public Date birth_date;

    @Column
    public EventRef event_ref_list;

    @Column
    public Family parent_family_list;

    @Column
    public MediaRef media_list;

    @Column
    public AddressRef address_list;

    @Column
    public Person person_ref_list;

    @Column
    public String note_list;


    @Column
    public String urls;

    @Column
    public String change;




}
