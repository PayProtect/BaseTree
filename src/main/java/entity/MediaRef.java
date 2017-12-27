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

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public MediaRef getMedia_ref() {
        return media_ref;
    }

    public void setMedia_ref(MediaRef media_ref) {
        this.media_ref = media_ref;
    }

    public NoteRef getNote_list() {
        return note_list;
    }

    public void setNote_list(NoteRef note_list) {
        this.note_list = note_list;
    }
}
