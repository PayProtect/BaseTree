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

//  `ref_to_media` REFERENCES Media(uid),
//    `note_list` REFERENCES NoteRef(uid)

}
