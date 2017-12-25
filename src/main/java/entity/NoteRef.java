package entity;

import javax.persistence.*;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table( name = "NoteRef" )
public class NoteRef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @Column
    public NoteRef note_list;


/*`ref_to_media` REFERENCES Media(uid),

  */

}
