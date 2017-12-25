package entity;

import javax.persistence.*;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table( name = "Place" )
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @Column
    public String  title;

    @Column
    public Place place_ref_list;

    @Column
    public  String name;

    @Column
    public String alt_names;

    @Column
    public String place_type;

    @Column
    public String code;

    @Column
    public MediaRef media_list;

    @Column
    public  NoteRef note_list;

    @Column




            `name` VARCHAR,
            `alt_names` VARCHAR,
            `place_type` VARCHAR,
            `code` VARCHAR,
            `media_list` REFERENCES MediaRef (uid),
    `note_list` REFERENCES NoteRef(uid),
    `change` VARCHAR


}
