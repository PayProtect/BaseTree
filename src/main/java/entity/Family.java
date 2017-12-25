package entity;

import javax.persistence.*;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table( name = "Family" )
public class Family {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;


    @Column
    public NoteRef note_list;

    @Column
     public MediaRef media_list;

    @Column
    public String change;

    @Column
    public  Person father_handle;

    @Column
    public  Person mother_handle;

    @Column
    public ChildRef child_ref_list;

    @Column EventRef event_ref_list;


}
