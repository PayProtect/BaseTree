package entity;

import javax.persistence.*;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */

@Entity
@Table( name = "MediaRef" )
public class MediaRef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @Column
    public MediaRef media_ref;

    @Column
    public NoteRef note_list;


}
