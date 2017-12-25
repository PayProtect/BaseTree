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
    /* `event_ref_list` REFERENCES EventRef(uid),*
    `   family_list` Type,
    `parent_family_list` REFERENCES Family(uid),
     `media_list` REFERENCES MediaRef(uid),
    `address_list` REFERENCES AddressRef(uid),
    `person_ref_list` Type
          `note_list` REFERENCES NoteRef(uid),
     */

    @Column
    public String urls;

    @Column
    public String change;




}
